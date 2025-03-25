# Java Streams & Collection Framework - Coding Challenge

## **Question: Get Top Earners by Department**
**Difficulty:** Hard  
**Estimated Time:** 15 minutes  

### **Description**
You are given a list of `Employee` objects. Each employee has the following attributes:

- `id` (Integer) - Unique Employee ID  
- `name` (String) - Employee Name  
- `salary` (Double) - Employee Salary  
- `department` (String) - Department the employee belongs to  

### **Task**
Implement a method **`getTopEarnersByDepartment`** that does the following using **Java Streams**:  
1. **Groups employees** by **department**.  
2. **Finds the highest salary** in each department.  
3. **Returns** a `Map<String, List<String>>`, where:
   - The key is the **department name**.
   - The value is a **list of employee names** who have the highest salary in that department.
   - The names should be **sorted lexicographically**.

### **Example Input**
```java
List<Employee> employees = Arrays.asList(
    new Employee(1, "Alice", 60000, "IT"),
    new Employee(2, "Bob", 75000, "IT"),
    new Employee(3, "Charlie", 75000, "IT"),
    new Employee(4, "David", 80000, "HR"),
    new Employee(5, "Eve", 90000, "Finance"),
    new Employee(6, "Frank", 90000, "Finance"),
    new Employee(7, "Grace", 50000, "HR")
);
```
### **Expected Output**
```java
{
  "IT": ["Bob", "Charlie"],
  "HR": ["David"],
  "Finance": ["Eve", "Frank"]
}
```

---

## **Code Template**
A template has been provided in `EmployeeProcessor.java` with an incomplete implementation. You need to complete the method:

```java
public class EmployeeProcessor {
    public static Map<String, List<String>> getTopEarnersByDepartment(List<Employee> employees) {
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }
}
```

---

## **Evaluation Criteria**
Your solution will be evaluated based on the following criteria:

| **Criteria** | **Evaluation** |
|-------------|---------------|
| Uses Java Streams to process data | ✅ |
| Groups employees by department | ✅ |
| Finds the highest salary in each department | ✅ |
| Collects names of employees with that salary | ✅ |
| Ensures output names are sorted lexicographically | ✅ |
| Handles edge cases correctly (single employee, all same salaries, empty list, etc.) | ✅ |

---

## **Test Cases and Scenarios**

| **Test Case** | **Description** |
|--------------|----------------|
| **testSingleEmployeeInDepartment** | Ensures that a single employee in a department is correctly returned as the highest earner. |
| **testAllEmployeesWithSameSalary** | Ensures that if all employees in a department have the same salary, all are returned (sorted lexicographically). |
| **testDifferentMaxSalariesInDepartment** | Ensures that the single highest-earning employee in a department is selected correctly. |
| **testSameMaxSalariesAcrossDepartments** | Ensures correct grouping when multiple departments have employees with the same maximum salary. |
| **testEmptyList** | Ensures that an empty list returns an empty map without errors. |
| **testDepartmentWithDifferentSalaries** | Ensures that only the highest-paid employees per department are returned. |

---

## **How to Run**
### **1. Clone the Repository**
```sh
git clone https://github.com/your-repo/java-streams-top-earners.git
cd java-streams-top-earners
```

### **2. Run Tests**
```sh
mvn test  
```

---

## **Submission Instructions**
1. Fork the repository  
2. Implement the method in `EmployeeProcessor.java`  
3. Ensure all **JUnit tests pass**  
4. Commit and push your changes  
5. Create a **Pull Request (PR)**  

---

## **Good Luck & Happy Coding! 🚀**
# java-streams-collection-framework-live-coding-main
