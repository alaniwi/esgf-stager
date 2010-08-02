package esgf.node.stager.web;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class MockServletContext implements ServletContext {

	private Properties attrib = new Properties();
	private Properties init = new Properties();
	private String contextPath = ".";
	private int majorVersion;
	private String mimeType;

	@Override
	public Object getAttribute(String arg0) {
		return attrib .get(arg0);
	}

	@Override
	public Enumeration<?> getAttributeNames() {
		return attrib.propertyNames();
	}

	@Override
	public ServletContext getContext(String arg0) {
		//we only implement this one
		return this;
	}

	@Override
	public String getContextPath() {
		return contextPath ;
	}

	@Override
	public String getInitParameter(String arg0) {
		return (String)init.getProperty(arg0);
	}

	@Override
	public Enumeration<?> getInitParameterNames() {
		return init.propertyNames();
	}

	@Override
	public int getMajorVersion() {
		return majorVersion;
	}

	@Override
	public String getMimeType(String arg0) {
		return mimeType;
	}

	@Override
	public int getMinorVersion() {
		return 0;
	}

	@Override
	public RequestDispatcher getNamedDispatcher(String arg0) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getRealPath(String arg0) {
		return contextPath + "/" + arg0;
	}

	@Override
	public RequestDispatcher getRequestDispatcher(String arg0) {
		throw new UnsupportedOperationException();
	}

	@Override
	public URL getResource(String arg0) throws MalformedURLException {
		throw new UnsupportedOperationException();
	}

	@Override
	public InputStream getResourceAsStream(String arg0) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Set getResourcePaths(String arg0) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getServerInfo() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Servlet getServlet(String arg0) throws ServletException {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getServletContextName() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Enumeration getServletNames() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Enumeration getServlets() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void log(String arg0) {
		throw new UnsupportedOperationException();

	}

	@Override
	public void log(Exception arg0, String arg1) {
		throw new UnsupportedOperationException();

	}

	@Override
	public void log(String arg0, Throwable arg1) {
		throw new UnsupportedOperationException();

	}

	@Override
	public void removeAttribute(String arg0) {
		throw new UnsupportedOperationException();

	}

	@Override
	public void setAttribute(String arg0, Object arg1) {
		throw new UnsupportedOperationException();

	}

	/**
	 * @param attrib the attrib to set
	 */
	public void setAttrib(Properties attrib) {
		this.attrib = attrib;
	}

	/**
	 * @param init the init to set
	 */
	public void setInit(Properties init) {
		this.init = init;
	}

	/**
	 * @param contextPath the contextPath to set
	 */
	public void setContextPath(String contextPath) {
		this.contextPath = contextPath;
	}

	/**
	 * @param majorVersion the majorVersion to set
	 */
	public void setMajorVersion(int majorVersion) {
		this.majorVersion = majorVersion;
	}

	/**
	 * @param mimeType the mimeType to set
	 */
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	
}
