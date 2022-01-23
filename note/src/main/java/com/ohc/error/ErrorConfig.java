package com.ohc.error;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: SilenceOu
 * @Date: 2022/1/22 22:40
 */
@Component
public class ErrorConfig implements ErrorPageRegistrar {

    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
        ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/index.html");
        registry.addErrorPages(error404Page);
    }

}

