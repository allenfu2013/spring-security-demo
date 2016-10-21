package org.allen.springsecurity.controller;

import org.allen.springsecurity.dto.ApiResonseDTO;
import org.allen.springsecurity.utils.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PingController {

    @RequestMapping(value = "ping", method = RequestMethod.GET)
    @ResponseBody
    public ApiResonseDTO ping() {
        Logger.info(this, String.format("security-web is running..."));
        ApiResonseDTO apiResonseDTO = new ApiResonseDTO();
        apiResonseDTO.setRetCode("00");
        apiResonseDTO.setRetMsg("security-web is running...");
        int i = 1/0;
        return apiResonseDTO;
    }
}
