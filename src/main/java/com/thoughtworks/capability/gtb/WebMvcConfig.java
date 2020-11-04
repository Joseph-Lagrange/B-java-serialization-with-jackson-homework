package com.thoughtworks.capability.gtb;

import com.thoughtworks.capability.gtb.utils.JacksonHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;

/**
 * Created by wudibin
 * 2020/11/5
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {

    protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);
        converters.add(new JacksonHttpMessageConverter());
    }

}
