package ar.com.code24101.filters;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

@WebFilter(urlPatterns = { "/api/private/*" })
public class JwtTokenFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        
        //token enviado desde front
		String token = ((HttpServletRequest) request).getHeader("token");

		//token es valido?
		//https://medium.com/somos-pragma/gu%C3%ADa-de-implementaci%C3%B3n-jwt-para-la-autenticaci%C3%B3n-en-java-db47b04eda54
        
        chain.doFilter(request, response);
    }
}
