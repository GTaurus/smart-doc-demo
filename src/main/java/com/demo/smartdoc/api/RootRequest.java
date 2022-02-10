package com.demo.smartdoc.api;

/**
 * <p></p>
 *
 * @author gtaurus
 * @since 2022-02-10 17:43
 */
public abstract class RootRequest<T> {
    /**
     * appId
     */
    private String appId;
    private T data;

    /**
     * 请求体
     *
     * @return
     */
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    abstract String getService();
}
