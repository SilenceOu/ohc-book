package com.ohc.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;

/**
 * @Description:
 * @Author: SilenceOu
 * @Date: 2025/7/18 17:27
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MailServiceTest {
    @Autowired
    private MailService mailService;

    @Test
    public void sendTextMail() {
        mailService.sendTextEmail("silenceou@qq.com", "测试主题", "纯文本内容");
    }

    @Test
    public void sendHtmlMail() {
        String html = "<h1>HTML邮件</h1><p style='color:red'>测试内容</p>";
        String attachmentPath = "D:\\IMG_3035.JPG";
        try {
            mailService.sendHtmlEmail("945331657@qq.com", "HTML测试", html, attachmentPath);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}