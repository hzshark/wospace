package cn.netdisk.wospace.controller.home;

import cn.netdisk.wospace.controller.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/10/29.
 */
@RestController
@RequestMapping("/machine")
public class MachineController extends BaseController {

//    @Resource
//    MachineManageService machineManageService;
//
//    @RequestMapping(value = "/list",method = RequestMethod.GET)
//    @SystemControllerLog(description = "/machine/list")
//    public ListVO toMachineItem(){
//        ListVO listVO = new ListVO();
//        try {
//
//            PageInfo<MachineInfo> pageInfo = machineManageService.getMachineList(0, 10);
//            long count = 0;
//            if(pageInfo != null){
//                //分页
//                count = pageInfo.getTotal();
//                listVO.setList(pageInfo.getList());
//                listVO.setData(pageInfo.getList());
//            }
//            listVO.setRel(true);
//            listVO.setCode(0);
//            listVO.setCount(count);
//        } catch (Exception e) {
//            logger.error("获取用户列表异常",e);
//            listVO.setMsg(e.getMessage());
//        }
//        return listVO;
//    }



}
