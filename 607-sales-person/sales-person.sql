SELECT name 
from SalesPerson  as s 
where s.sales_id NOT IN
(select o.sales_id 
from Orders as o join Company as c 
on o.com_id=c.com_id
where c.name ="RED");