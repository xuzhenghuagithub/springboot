package com.example.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@RestController
public class MailController {
    @Autowired
    private JavaMailSender javaMailSender;

    @RequestMapping("/mail")
    public String sendMail(){
        SimpleMailMessage message = new SimpleMailMessage();
        //发件人
        message.setFrom("291493459@qq.com");
        //收件人
        message.setTo("291493459@qq.com");
        message.setSubject("邮件标题");
        message.setText("邮件内容");
        javaMailSender.send(message);
        return "邮件发送成功!";
    }

    @RequestMapping("/mail2")
    public String sendMail2() throws MessagingException {
        //需要创建一个MimeMessageHelper对象，相关参数和简单邮件类似
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setFrom("291493459@qq.com");
        helper.setTo("xuzhenghua@cnpc.com.cn");
        helper.setSubject("邮件标题");
        //将邮件内容设置为html格式
        helper.setText("<html><body><h1>hello world</h1></body></html>",true);
        //定义文件，这是java.main.resources也就是classpach路径下的文件abc.png
        ClassPathResource file = new ClassPathResource("/static/班车.jpg");
        //添加附件文件， 设置文件名为abc.png
        helper.addAttachment("班车.jpg", file);
        javaMailSender.send(mimeMessage);
        return "附件发送成功!";
    }
}
