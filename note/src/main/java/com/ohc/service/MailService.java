package com.ohc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;


/**
 * @Description:
 * @Author: SilenceOu
 * @Date: 2025/7/18 12:14
 */
@Service
public class MailService {
    @Autowired
    private JavaMailSender mailSender;

    // 发送纯文本邮件
    public void sendTextEmail(String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("silenceou@163.com");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        mailSender.send(message);
    }

    // 发送HTML邮件（支持内嵌图片/附件）
    public void sendHtmlEmail(String to, String subject, String html,
                              String attachmentPath) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
        helper.setFrom("silenceou@163.com");
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(html, true);  // true表示HTML格式

        // 添加附件（示例）
        if (attachmentPath != null) {
            FileSystemResource file = new FileSystemResource(attachmentPath);
            helper.addAttachment(new File(attachmentPath).getName(), file);
        }
        mailSender.send(message);
    }
}