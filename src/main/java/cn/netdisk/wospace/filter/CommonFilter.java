package cn.netdisk.wospace.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 用来处理参数中带有空格的问题
 *
 * @author wenbo
 * @company 杭州尚尚签网络科技有限公司
 * @date 2016/9/12
 * @since 3.0
 */
public class CommonFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {

        ParameterRequestWrapper requestWrapper = new ParameterRequestWrapper((HttpServletRequest) servletRequest);
        filterChain.doFilter(requestWrapper, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
