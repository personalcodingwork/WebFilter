package com.servlet.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class MyFilter implements Filter {

	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("Filter initilized\n");
	}

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {

		PrintWriter out = resp.getWriter();
		out.print("filter is invoked before\n");

		chain.doFilter(req, resp);// sends request to next resource

		out.print("filter is invoked after");
	}

	public void destroy() {
		System.out.println("Filter destroyed");
	}
}