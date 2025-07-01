# Write your MySQL query statement below
-- SELECT name AS "Customers"
-- FROM Customers WHERE Customers.id not in (
--     SELECT customerId FROM Orders
-- );
select name as Customers
from Customers c
left join Orders o on c.id=o.customerId
where o.id is null;