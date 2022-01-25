package com.ohc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @Description:
 * @Author: SilenceOu
 * @Date: 2022/1/22 16:56
 */
@EnableCaching
@SpringBootApplication
public class NoteApp {
    public static void main(String[] args) {
        SpringApplication.run(NoteApp.class,args);
    }
}
