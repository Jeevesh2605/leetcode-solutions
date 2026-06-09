# Write your MySQL query statement below
SELECT e.name as Employee from employee e JOIN employee m on e.managerId = m.id where e.salary > m.salary;