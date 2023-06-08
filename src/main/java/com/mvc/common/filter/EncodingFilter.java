package com.mvc.common.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class EncodingFilter implements Filter {

    private String encodingType;

    public void destroy() {}

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest hrequest = (HttpServletRequest) request;
        if("POST".equals(hrequest.getMethod())) {
            request.setCharacterEncoding(encodingType);
            System.out.println("변경된 인코딩 타입 : " + request.getCharacterEncoding());
        }

        chain.doFilter(request, response);
    }

    public void init(FilterConfig fConfig) throws ServletException {
        encodingType = fConfig.getInitParameter("encoding-type");
    }

}