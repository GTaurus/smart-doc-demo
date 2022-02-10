package com.demo.smartdoc.api;

/**
 * <p></p>
 *
 * @author gtaurus
 * @since 2022-02-10 17:44
 */
public abstract class MidRequest<T> extends RootRequest<T> {

    @Override
    String getService() {
        return "service." + getMethod();
    }

    abstract String getMethod();
}
