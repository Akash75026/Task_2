package com.wipro.Employee_service.service;

import com.wipro.Employee_service.client.FullResponse;
import com.wipro.Employee_service.client.Project;
import com.wipro.Employee_service.entity.Employee;
import com.wipro.Employee_service.fegin.FeginClient;
import com.wipro.Employee_service.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private FeginClient client;

    public Employee createEmployee(Employee employee)
    {
        return employeeRepository.save(employee);
    }

    public FullResponse findEmployeeByPid(int pid) {
        Employee employee = employeeRepository.findByPid(pid).orElse(null);
        List<Project> list= client.findProjectByPid(pid);
        FullResponse  res=new FullResponse();
        res.setEname(employee.ename);
        res.setLocation(employee.location);
        res.setProjectList(list);
        return res;





    }

}

