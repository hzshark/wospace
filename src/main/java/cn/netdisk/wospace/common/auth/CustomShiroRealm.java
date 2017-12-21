package cn.netdisk.wospace.common.auth;

import cn.netdisk.wospace.model.SessionUser;
import cn.netdisk.wospace.service.UserManageService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


//@Resource
public class CustomShiroRealm extends AuthorizingRealm {

    private static final Logger logger = LoggerFactory.getLogger(CustomShiroRealm.class);

    @Autowired
    private UserManageService userManageService;

    /**
     * 登录认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken authenticationToken) throws AuthenticationException {
        //UsernamePasswordToken对象用来存放提交的登录信息
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();
        logger.info("验证当前Subject时获取到username=" + username);

        //查出是否有此用户
        SessionUser sessionUser = userManageService.getUserByUserName(username);

        if(sessionUser == null){
            throw new UnknownAccountException("用户名"+username+"不存在");
        }

        //认证成功,根据userId生成token，作为后续的数据交换凭证
        //int userId= sessionUser.getUserId();
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(sessionUser, sessionUser.getPassword(), getName());
        return authenticationInfo;
    }


    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }
}