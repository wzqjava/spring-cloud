package com.wzq.servicea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@RestController
public class TestController {
    @Autowired
    ResourceLoader resourceLoader;

    @Value("${server.port}")
    private String port;
    String json = "{\n" +
            "    \"email\": \"1210911104@qq.com\",\n" +
            "    \"id\": 20,\n" +
            "    \"password\": \"Howl\"\n" +
            "}";

    @RequestMapping("/hello")
    public String hello() {
        return "hello world" + "端口: " + port;
    }

    @RequestMapping("/getJson")
    public String getJson() {
        return json;
    }

    @RequestMapping("/getJsonFile")
    public String getJsonFile() {
        try {
            InputStream inputStream = resourceLoader.getResource("classpath:json_file/user.json").getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder stringBuilder = new StringBuilder();
            String temp;
            while (((temp = bufferedReader.readLine()) != null)) {
                stringBuilder.append(temp);
            }

            return stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "读取失败";
    }

    @GetMapping("/getTest")
    public String getTest() {
        return "getTest";
    }


}
