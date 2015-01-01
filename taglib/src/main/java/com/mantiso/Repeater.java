package com.mantiso;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by Terry on 01/01/15.
 */
public class Repeater extends SimpleTagSupport {

    private int repeat;
    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    @Override
    public void doTag() throws JspException, IOException {
        for (int i = 0; i < repeat; i++) {
            // execute the body of tag
            // getJspBody returns the body data encapsulating by this tag.
            // invoke null will write out that data to the current output stream.
            getJspBody().invoke(null);
        }
    }
}
