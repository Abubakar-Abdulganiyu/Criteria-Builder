package com.example.dataspec.specification;

import com.example.dataspec.model.Employee;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
public class EmployeeSpecification {
    public static Specification<Employee> hasFirstName(String firstname){
        return ((root, criteriaQuery, criteriaBuilder) -> {
            return criteriaBuilder.equal(root.get("firstname"), firstname);
        });
    }

    public static Specification<Employee> containsLastName(String lastname){
        return ((root, criteriaQuery, criteriaBuilder) -> {
            return criteriaBuilder.like(root.get("lastname"),"%" +  lastname + "%");
        });
    }
    public static Specification<Employee> hasDepartment(String department){
        return ((root, criteriaQuery, criteriaBuilder) -> {
            return criteriaBuilder.equal(root.get("firstname"), department);
        });
    }
}
