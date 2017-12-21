package cn.netdisk.wospace.common.auth;


import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

/**
 * 自定义 密码验证类
 * @author wanghf
 *
 */
public class CustomCredentialsMatcher extends SimpleCredentialsMatcher {

    @Override
    public boolean doCredentialsMatch(AuthenticationToken authcToken, AuthenticationInfo info) {
        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
        String password = new String(token.getPassword());

        SimpleAuthenticationInfo authenticationInfo = (SimpleAuthenticationInfo)info;
        String authPassword = (String)authenticationInfo.getCredentials();
        return  password.equalsIgnoreCase(authPassword);
        //将密码加密与系统加密后的密码校验，内容一致就返回true,不一致就返回false
        //return PasswordHash.validatePassword(password, authPassword);
    }

}
