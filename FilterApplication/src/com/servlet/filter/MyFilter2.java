package com.servlet.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class MyFilter2 implements Filter {

	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("Filter2 initilized");
	}

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {

		PrintWriter out = resp.getWriter();
		out.print("filter2 is invoked before\n");

		chain.doFilter(req, resp);// sends request to next resource

		out.print("filter2 is invoked after\n");
	}

	public void destroy() {
		System.out.println("Filter2 destroyed");
	}
}