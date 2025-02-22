package com.wipro.Employee_service.controller;

import com.wipro.Employee_service.client.FullResponse;
import com.wipro.Employee_service.client.Project;
import com.wipro.Employee_service.entity.Employee;
import com.wipro.Employee_service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee)
    {
        return employeeService.createEmployee(employee);
    }

    @GetMapping("withProject/{pid}")
    public FullResponse findEmployeeByPid(@PathVariable("pid") int pid)
    {
        return employeeService.findEmployeeByPid(pid);
    }

}
