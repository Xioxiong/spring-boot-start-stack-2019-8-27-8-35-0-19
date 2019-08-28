package com.tw.apistackbase.controller;

import com.tw.apistackbase.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private static List<Employee> list = new ArrayList<Employee>(){{
        add(new Employee(1,"张三",18,"女"));
        add(new Employee(2,"李四",19,"男"));
        add(new Employee(3,"王五",20,"女"));
        add(new Employee(4,"王二麻子",21,"女"));
        add(new Employee(5,"老吴",22,"女"));
    }};

    @GetMapping
    public ResponseEntity<List<Employee>> getEmployees() {

        return ResponseEntity.ok(list);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int id) {

        Employee employee;
        for(Employee e:list){
            if(e.getId() == id){
                return ResponseEntity.ok(e);
            }
        }
        return ResponseEntity.ok(null);
    }
    @GetMapping("/name")
    public ResponseEntity<List<Employee>> getEmployeeByNmae(@RequestParam("name") String  name) {
        List<Employee> retList = new ArrayList<>();
        for(Employee e:list){
            if(e.getName().indexOf(name)!=-1){
                retList.add(e);
            }
        }
        return ResponseEntity.ok(retList);
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity<List<Employee>> addEmployee(@RequestBody Employee employee) {
        list.add(employee);
        return ResponseEntity.created(null).build();
    }
    @PutMapping(consumes = "application/json")
    public ResponseEntity<List<Employee>> updateEmployee(@RequestBody Employee employee) {
        list.add(5,employee);
        return ResponseEntity.ok(list);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<Employee>> updateEmployee(@PathVariable int id) {
        Employee employee = null;
        for(Employee e:list){
            if(e.getId() == id){
                employee = e;
            }
        }
        list.remove(employee);
        return ResponseEntity.ok(list);
    }
}
