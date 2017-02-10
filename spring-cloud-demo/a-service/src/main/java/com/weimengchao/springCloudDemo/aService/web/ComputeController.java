package com.weimengchao.springCloudDemo.aService.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ComputeController
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
@RequestMapping("/computes")
public class ComputeController {

    private final static Logger LOGGER = Logger.getLogger(ComputeController.class);

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    private String add(@RequestParam Integer a, @RequestParam Integer b) {
        ServiceInstance instance = client.getLocalServiceInstance();
        Integer r = a + b;
        LOGGER.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return r.toString();
    }
}
