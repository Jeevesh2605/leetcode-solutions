# Write your MySQL query statement below
Select ifnull ((Select max(salary) from employee where salary<(select max(salary) from employee)), NULL)as SecondHighestSalary;