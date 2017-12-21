package cn.netdisk.wospace.dao;

import cn.netdisk.wospace.model.SessionUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SysLoginAccountMapper extends BaseMapper<SessionUser, Long> {

    @Select("select * from user where userid = #{0}")
    SessionUser selectByUserId(int userId);

    @Select("select * from user where username=#{0} limit 1")
    SessionUser selectByAccount(String account);

    @Select("select count(1) from user where username=#{0}")
    int countByAccount(String account);

   @Insert("insert into user(username, password, alias, email, indate, salt) values(#{arg0},#{arg1},#{arg2},#{arg3},#{arg4},#{arg5})")
   boolean adduser(String username, String passwd, String alias, String email, String indate, String salt);

}