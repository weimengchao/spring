package com.weimengchao.springCloudDemo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @author: weimengchao
 * @date: 2017/2/9
 * _
 * Modification History:
 * Date              Author      Version     Description
 * —————————————————————————————————
 * 2017/2/9       weimengchao    1.0       1.0 Version
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("/index")
    public String index() {
        return "Hello World";
    }
}
