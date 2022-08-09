package com.storythings.sample.common.annotation;

import org.springframework.core.annotation.AliasFor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@RequestMapping
public @interface Req {

    /**
     * @desc
     *  模块名称
     * @return
     */
    String module() default "";

    /**
     * @desc
     *  方法名称
     * @return
     */
    String name() default "";

    /**
     * @desc
     *  方法编码
     * @return
     */
    String code() default "";

    /**
     * @desc
     *  请求链接
     *  默认参数
     * @return
     */
    @AliasFor(value = "value", annotation = RequestMapping.class)
    String value() default "";

    /**
     * @desc
     *  请求链接
     * @return
     */
    @AliasFor(value = "value", annotation = RequestMapping.class)
    String url() default "";

    /**
     * @desc
     *  请求方法，默认POST
     * @return
     */
    @AliasFor(annotation = RequestMapping.class)
    RequestMethod[] method() default {RequestMethod.POST};

    /**
     * @desc
     *  是否需要携带token
     * @return
     */
    boolean token() default true;

    /**
     * @desc
     *  是否需要登录
     * @return
     */
    boolean login() default false;

    /**
     * @desc
     *  是否限制权限
     * @return
     */
    boolean permission() default false;

    /**
     * @desc
     *  是否限制ip
     * @return
     */
    boolean ip() default false;

}
