package com.demo.smartdoc.controller;

import com.demo.smartdoc.api.MainResponse;
import com.demo.smartdoc.api.OneLevelRequest;
import com.demo.smartdoc.api.TwoLevelRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * demo
 *
 * @author gtaurus
 * @since 2022-02-10 17:46
 */
@RequestMapping("demo")
@RestController
public class DemoController {

    /**
     * 一层继承
     *
     * @param request
     * @return
     */
    @RequestMapping("one-level")
    public MainResponse test(@RequestBody OneLevelRequest request) {
        return new MainResponse();
    }

    /**
     * 两层继承
     *
     * @param request
     * @return
     */
    @RequestMapping("two-level")
    public MainResponse test(@RequestBody TwoLevelRequest request) {
        return new MainResponse();
    }
}
