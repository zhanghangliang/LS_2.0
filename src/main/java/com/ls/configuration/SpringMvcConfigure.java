package com.ls.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.ls.Interceptor.LoginHandlerInterceptor;

@Configuration
public class SpringMvcConfigure extends WebMvcConfigurerAdapter {
	//巨坑，一直不懂
	@Bean
	LoginHandlerInterceptor localInterceptor() {
        return new LoginHandlerInterceptor();
    }

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/jsp");
		viewResolver.setSuffix(".jsp");
		// viewResolver.setViewClass(JstlView.class); 这个属性通常并不需要手动配置，高版本的Spring会自动检测
		return viewResolver;
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(localInterceptor()).addPathPatterns("/**").excludePathPatterns("/index1",
				"/goodTime", "/loadExp", "/sysnote", "/logincheck", "/banTime", "/regischeck","css/**","font-awesome-4.4.0/**","fonts/**","images/**","js/**");
		// registry.addInterceptor(new Interceptor2()).addPathPatterns("/users").addPathPatterns("/users/**");
		super.addInterceptors(registry);
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// addResourceHandler指的是访问路径，addResourceLocations指的是文件放置的目录
		registry.addResourceHandler("css/**").addResourceLocations("/WEB-INF/css/");
		registry.addResourceHandler("font-awesome-4.4.0/**").addResourceLocations("/WEB-INF/font-awesome-4.4.0/");
		registry.addResourceHandler("fonts/**").addResourceLocations("/WEB-INF/fonts/");
		registry.addResourceHandler("images/**").addResourceLocations("/WEB-INF/images/");
		registry.addResourceHandler("js/**").addResourceLocations("/WEB-INF/js/");
	}
}