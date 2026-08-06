SELECT name from SalesPerson where sales_id NOT IN
(select sales_id from Orders where com_id IN
(select com_id from Company where name ="RED"));