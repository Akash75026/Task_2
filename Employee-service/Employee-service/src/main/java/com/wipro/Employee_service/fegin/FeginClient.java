package com.wipro.Employee_service.fegin;

import com.wipro.Employee_service.client.Project;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="Project-service",url="http://localhost:9098/project")
public interface FeginClient {
    @GetMapping("employee/{pid}")
    List<Project> findProjectByPid(@PathVariable("pid") int pid);


}
