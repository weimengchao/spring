package com.weimengchao.springclouddemo.client.hystrix;

import com.weimengchao.springclouddemo.client.ComputeClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wmc on 2017/2/19.
 */
@Service
public class ComputeClientHystrix implements ComputeClient {
    @Override
    public String add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return "error";
    }
}
