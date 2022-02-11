# 问题描述
> 在请求对象带有泛型时，只有在一层继承的情况下可以解析泛型对象的内容，二层继承无法解析。

# 举例
## 请求类
* RootRequest**一个父虚类**
```java
public abstract class RootRequest<T> {
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
```
* MidRequest**中间虚类，继承父类
```java
public abstract class MidRequest<T> extends RootRequest<T> {
    @Override
    String getService() {
        return "service." + getMethod();
    }
    abstract String getMethod();
}
```
* OneLevelRequest**一个一层继承的请求体，直接继承父类**
```java
public class OneLevelRequest extends RootRequest<MainRequestModel> {
    @Override
    String getService() {
        return "service.method";
    }
}
```

* TwoLevelRequest**一个两层继承的请求体，继承中间类**
```java
public class TwoLevelRequest extends MidRequest<MainRequestModel> {
    @Override
    String getMethod() {
        return "method";
    }
}
```
## Controller
```java
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
```

##