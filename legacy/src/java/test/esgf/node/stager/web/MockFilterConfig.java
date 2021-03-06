package esgf.node.stager.web;

import java.util.Enumeration;
import java.util.Properties;

import javax.servlet.FilterConfig;

public class MockFilterConfig implements FilterConfig {
    private Properties props;
    private String filterName;
    private MockServletContext context;

    public MockFilterConfig() {
        props = new Properties();
        filterName = "MockFilter";
        context = new MockServletContext();
        context.setInit(props);
    }

    public String getFilterName() {
        return filterName;
    }


    public String getInitParameter(String arg0) {
        return (String)props.get(arg0);
    }


    public Enumeration<?> getInitParameterNames() {
        return props.propertyNames();
    }

    public MockServletContext getServletContext() {
        return context;
    }

    /**
     * @param props the props to set
     */
    public void setProps(Properties props) {
        this.props = props;
    }

    /**
     * @param filterName the filterName to set
     */
    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

    /**
     * @return the props
     */
    public Properties getProps() {
        return props;
    }


}
