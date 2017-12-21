package cn.netdisk.wospace.service;

import cn.netdisk.wospace.dao.SysLoginAccountMapper;
import cn.netdisk.wospace.model.SessionUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManageService {
    private static Logger logger = LoggerFactory.getLogger(UserManageService.class);

    @Autowired
    private SysLoginAccountMapper loginAccountDao;

    public SessionUser getUserByUserName(String userName){

        SessionUser account = loginAccountDao.selectByAccount(userName);
        return account;
    }

    public SessionUser getUserInfo(int userid){

        SessionUser account = loginAccountDao.selectByUserId(userid);
        return account;
    }

}
