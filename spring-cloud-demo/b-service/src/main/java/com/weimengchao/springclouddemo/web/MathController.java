package com.weimengchao.springclouddemo.web;

import com.weimengchao.springclouddemo.client.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * MathController
 *
 * @author: weimengchao
 * @date: 2017/2/10
 * _
 * Modification History:
 * Date              Author      Version     Description
 * —————————————————————————————————
 * 2017/2/10       weimengchao    1.0       1.0 Version
 */
@RestController
@RequestMapping("maths")
public class MathController {

    @Autowired
    private ComputeClient computeClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(@RequestParam Integer a, @RequestParam Integer b) {
        return computeClient.add(a, b);
    }
}
