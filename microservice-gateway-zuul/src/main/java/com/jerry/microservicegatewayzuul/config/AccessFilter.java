package com.jerry.microservicegatewayzuul.config;

import com.netflix.zuul.ZuulFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccessFilter extends ZuulFilter {
    private static Logger log = LoggerFactory.getLogger(AccessFilter.class);

    //可以在请求被路由之前调用
    @Override
    public String filterType() {
        return "pre";
    }

    //通过int值来定义过滤器的执行顺序，越小的值越优先处理。
    @Override
    public int filterOrder() {
        return 0;
    }

    //返回一个boolean类型来判断该过滤器是否要执行，所以通过此函数可实现过滤器的开关。true:总是生效，false:不生效
    @Override
    public boolean shouldFilter() {
        return true;
    }

    //过滤器的具体逻辑根据业务自行编写。
    @Override
    public Object run() {
//        RequestContext ctx = RequestContext.getCurrentContext();
//        HttpServletRequest request = ctx.getRequest();
//        String accessToken = String.valueOf(request.getParameter("Token"));
//        if(!accessToken.equals("zz")) {
//            ctx.setSendZuulResponse(false);
//            ctx.setResponseStatusCode(401);
//            return null;
//        }
        return null;
    }

}
