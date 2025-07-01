# Write your MySQL query statement below
-- select p.firstName,p.lastName,a.city,a.state
-- from Person P
-- left join Address a on
-- p.personId=a.personId;
SELECT firstName,lastName,city,state FROM Person LEFT JOIN Address USING(personId);
