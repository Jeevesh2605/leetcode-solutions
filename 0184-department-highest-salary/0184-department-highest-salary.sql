# Write your MySQL query statement below
-- SELECT D.NAME AS DEPARTMENT,
-- E.NAME AS EMPLOYEE, E.SALARY AS SALARY FROM EMPLOYEE E JOIN DEPARTMENT D ON E.departmentId = D.id WHERE (E.departmentId, e.salary) IN (SELECT departmentId, MAX(SALARY) FROM EMPLOYEE GROUP BY departmentId);

SELECT d.name AS Department,
       e.name AS Employee,
       e.salary AS Salary
FROM Employee e
JOIN Department d ON e.departmentId = d.id
JOIN (
    SELECT departmentId, MAX(salary) as maxSalary
    FROM Employee
    GROUP BY departmentId
) AS maxTable 
ON e.departmentId = maxTable.departmentId 
AND e.salary = maxTable.maxSalary;