package com.si.controller;

import com.si.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: XiaoSi
 * @Description:
 * @Date: Created by Administrator on 2017/11/21 0021.
 * @Modified By:
 */
@Controller
public class StudentController {

    //
    //                            _ooOoo_
    //                           o8888888o
    //                           88" . "88
    //                           (| -_- |)
    //                           O\  =  /O
    //                        ____/`---'\____
    //                      .'  \\|     |//  `.
    //                     /  \\|||  :  |||//  \
    //                    /  _||||| -:- |||||-  \
    //                    |   | \\\  -  /// |   |
    //                    | \_|  ''\---/''  |   |
    //                    \  .-\__  `-`  ___/-. /
    //                  ___`. .'  /--.--\  `. . __
    //               ."" '<  `.___\_<|>_/___.'  >'"".
    //              | | :  `- \`.;`\ _ /`;.`/ - ` : | |
    //              \  \ `-.   \_ __\ /__ _/   .-` /  /
    //         ======`-.____`-.___\_____/___.-`____.-'======
    //                            `=---='
    //        ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    //                      佛祖保佑       永无BUG


    @Autowired
    private StudentService studentService;
    @RequestMapping("list")
    @ResponseBody
    public String lists(Model model){
        model.addAttribute("list",studentService.getList());
        List<Object> list = new ArrayList<Object>();
        list.equals();
        return "ok";
    }
}
