package org.allen.springsecurity.handler;

import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import org.allen.springsecurity.utils.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Component
public class ExceptionHandler implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request,
                                         HttpServletResponse response,
                                         Object o,
                                         Exception e) {
        Logger.error(this, String.format("request:%s, e:%s", request.getRequestURI(), e.getClass()), null);
        ModelAndView modelAndView = new ModelAndView();
        FastJsonJsonView view = new FastJsonJsonView();
        Map<String, Object> responseAttributes = new HashMap<>();
        responseAttributes.put("retCode", "99");
        responseAttributes.put("retMsg", "SystemError");
        view.setAttributesMap(responseAttributes);
        modelAndView.setView(view);
        return modelAndView;
    }
}
