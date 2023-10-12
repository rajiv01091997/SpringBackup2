package com.globallogic.feign.FeignController;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="feignDemo",url="http://localhost:8088/details")
public interface IFiegnController
{
@GetMapping("/name")
public String getName();
@GetMapping("/age")
public int getAge();
@GetMapping("/status")
public String getStatus();
}
/*fiegn client is used for running multiple microservices through same port instead of
different port.*/
