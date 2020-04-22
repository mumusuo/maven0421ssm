package org.hzl.controllter.developer;

import org.hzl.pojo.AppCategory;
import org.hzl.pojo.DataDictionary;
import org.hzl.pojo.DevUser;
import org.hzl.service.developer.AppCategoryService;
import org.hzl.service.developer.AppSearchlService;
import org.hzl.service.developer.DevUserService;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/DevUser")
public class DevControllter {
    @Resource
    private DevUserService devUserService;
    @Resource
    private AppSearchlService appSearchlService;
    @Resource
    private AppCategoryService appCategoryService;
    @RequestMapping("/login")
    public String login(ModelMap modelMap, String devCode, String devPassword){
        System.out.println("登录"+devCode);
        System.out.println("登录"+devPassword);
        DevUser devUser=devUserService.findByCode(devCode);
        System.out.println(devUser);
        if (devUser.getDevPassword().equals(devPassword)){
            modelMap.addAttribute("devUser",devUser);
            return "jsp/developer/main";
        }else {
            return "jsp/devlogin";
        }
    }
    @RequestMapping("/logout")
    public String login(ModelMap modelMap){
        DevUser devUser= (DevUser) modelMap.get("devUser");
        System.out.println(devUser);
        modelMap.remove("delUser");
        return "jsp/index";
    }
    @RequestMapping("appinfolist")
    public String appinfolist(ModelMap modelMap){
        List<DataDictionary> appstatus=appSearchlService.appStatus();
        List<DataDictionary> appflatform=appSearchlService.appFlatform();
        List<AppCategory> appCategories=appCategoryService.firstLevel();
        System.out.println(appstatus.size());
        System.out.println(appflatform.size());
        System.out.println(appCategories.size());
        modelMap.addAttribute("statusList",appstatus);
        modelMap.addAttribute("flatFormList",appflatform);
        modelMap.addAttribute("categoryLevel1List",appCategories);
        return "jsp/developer/appinfolist";
    }
}
