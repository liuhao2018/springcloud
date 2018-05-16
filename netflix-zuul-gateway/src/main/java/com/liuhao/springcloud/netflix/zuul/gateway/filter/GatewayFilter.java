package com.liuhao.springcloud.netflix.zuul.gateway.filter;

import com.google.gson.Gson;
import com.liuhao.springcloud.netflix.zuul.gateway.model.Authorization;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class GatewayFilter extends ZuulFilter {

    @Autowired
    public Gson gson;

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        String token = context.getRequest().getHeader("token");
        if (StringUtils.isEmpty(token)) {
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            try {
                context.getResponse().setContentType("application/json");
                context.getResponse().setCharacterEncoding("utf-8");
                context.getResponse().getWriter().write(gson.toJson(new Authorization(1001,"无访问权限")));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
