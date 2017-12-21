package cn.netdisk.wospace.common.util;

import cn.netdisk.wospace.model.SessionUser;
import cn.netdisk.wospace.vo.ListVO;
import cn.netdisk.wospace.vo.ResultVO;

public class AuthUtil {

    public static SessionUser verfiy(ResultVO resultVO, Object session)
    {
        SessionUser user=null;
        if (session ==null || !(session  instanceof SessionUser))
        {
            resultVO.setFailRepmsg(" login first");
            return user;
        }
        user=(SessionUser) session;
        return user;
    }

    public static SessionUser verfiy(ListVO resultVO, Object session)
    {
        SessionUser user=null;
        if (session ==null || !(session  instanceof SessionUser))
        {
            resultVO.setErrorMsg(" login first");
            return user;
        }
        user=(SessionUser) session;
        return user;
    }

}
