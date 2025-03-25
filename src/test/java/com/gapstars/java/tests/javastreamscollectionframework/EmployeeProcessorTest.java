package com.gapstars.java.tests.javastreamscollectionframework;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class EmployeeProcessorTest {
	// Case 1: Single Employee in a Department
    @Test
    public void testSingleEmployeeInDepartment() {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", 50000, "HR")
        );

        Map<String, List<String>> expected = new HashMap<>();
        expected.put("HR", Arrays.asList("Alice"));

        assertEquals(expected, EmployeeProcessor.getTopEarnersByDepartment(employees));
    }

    // Case 2: All Employees in a Department Have the Same Salary
    @Test
    public void testAllEmployeesWithSameSalary() {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", 70000, "IT"),
            new Employee(2, "Bob", 70000, "IT"),
            new Employee(3, "Charlie", 70000, "Finance"),
            new Employee(4, "David", 70000, "Finance")
        );

        Map<String, List<String>> expected = new HashMap<>();
        expected.put("IT", Arrays.asList("Alice", "Bob"));
        expected.put("Finance", Arrays.asList("Charlie", "David"));

        assertEquals(expected, EmployeeProcessor.getTopEarnersByDepartment(employees));
    }

    // Case 3: Department Has One Clear Highest Earner
    @Test
    public void testDifferentMaxSalariesInDepartment() {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", 60000, "IT"),
            new Employee(2, "Bob", 90000, "IT"),
            new Employee(3, "Charlie", 70000, "IT")
        );

        Map<String, List<String>> expected = new HashMap<>();
        expected.put("IT", Arrays.asList("Bob")); // Bob has the highest salary

        assertEquals(expected, EmployeeProcessor.getTopEarnersByDepartment(employees));
    }

    // Case 4: Employees in Different Departments Have the Same Max Salary
    @Test
    public void testSameMaxSalariesAcrossDepartments() {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", 90000, "IT"),
            new Employee(2, "Bob", 90000, "IT"),
            new Employee(3, "Charlie", 90000, "Finance"),
            new Employee(4, "David", 90000, "Finance")
        );

        Map<String, List<String>> expected = new HashMap<>();
        expected.put("IT", Arrays.asList("Alice", "Bob"));
        expected.put("Finance", Arrays.asList("Charlie", "David"));

        assertEquals(expected, EmployeeProcessor.getTopEarnersByDepartment(employees));
    }

    // Case 5: Empty List of Employees
    @Test
    public void testEmptyList() {
        List<Employee> employees = new ArrayList<>();
        Map<String, List<String>> expected = new HashMap<>();
        assertEquals(expected, EmployeeProcessor.getTopEarnersByDepartment(employees));
    }

    // Case 6: Department Has Multiple Employees with Different Salaries
    @Test
    public void testDepartmentWithDifferentSalaries() {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", 55000, "Marketing"),
            new Employee(2, "Bob", 80000, "Marketing"),
            new Employee(3, "Charlie", 75000, "Marketing")
        );

        Map<String, List<String>> expected = new HashMap<>();
        expected.put("Marketing", Arrays.asList("Bob")); // Bob has the highest salary

        assertEquals(expected, EmployeeProcessor.getTopEarnersByDepartment(employees));
    }
}
