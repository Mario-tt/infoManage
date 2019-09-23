package com.hunau.test;

/**
 * @param $params$
 * @Description:
 * @Return: $returns$
 * @Author: 赵文静
 * @单位：湖南农业大学物联网工程专业
 * @Date: $date$ $time$
 * 开发版本：综合练习V0.1
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "赵文静，学号201841882207！";
    }
}
