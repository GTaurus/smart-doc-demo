package com.demo.smartdoc.api;

/**
 * <p>actual request</p>
 *
 * @author gtaurus
 * @since 2022-02-10 17:45
 */
public class TwoLevelRequest extends MidRequest<MainRequestModel> {
    @Override
    String getMethod() {
        return "method";
    }
}
