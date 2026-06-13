# Write your MySQL query statement below
SELECT D.NAME AS DEPARTMENT,
E.NAME AS EMPLOYEE, E.SALARY AS SALARY FROM EMPLOYEE E JOIN DEPARTMENT D ON E.departmentId = D.id WHERE (E.departmentId, e.salary) IN (SELECT departmentId, MAX(SALARY) FROM EMPLOYEE GROUP BY departmentId);