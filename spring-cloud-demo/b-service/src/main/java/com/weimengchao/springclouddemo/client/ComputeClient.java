package com.weimengchao.springclouddemo.client;

import com.weimengchao.springclouddemo.client.hystrix.ComputeClientHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ComputeClient
 *
 * @author: weimengchao
 * @date: 2017/2/10
 * _
 * Modification History:
 * Date              Author      Version     Description
 * —————————————————————————————————
 * 2017/2/10       weimengchao    1.0       1.0 Version
 */
@FeignClient(value = "a-service", fallback = ComputeClientHystrix.class)
public interface ComputeClient {

    @RequestMapping(value = "/computes/add", method = RequestMethod.GET)
    String add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);

}
