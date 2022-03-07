package com.cc_cs.demo.controller;

import com.cc_cs.demo.common.CallModule;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModuleTestController {
    CallModule callModule = new CallModule("D:\\ChenGe\\Codefiles\\srtp\\TabCS-master\\Hu_TabCS\\keras\\module_for_calling.py");
    @RequestMapping("/module/{query}/{num}")
    public String callModule(@PathVariable("query") String query, @PathVariable("num") int num, Model model) {
        String result = String.valueOf(callModule.call(query, num));
//        String result = "This is a sample result";
        model.addAttribute("result", result);
        return "moduleTestPage";
    }
}
