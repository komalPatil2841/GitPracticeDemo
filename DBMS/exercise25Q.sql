-- 1 from  the items_ordered table, select a list of all items purchased for customerid 10449. Display the customerid, item, and price for this customer

select customerid, item,price from  items_ordered where customerid=10449;

-- 2select all columns from  the items_ordered table for whoever purchased a Tent.

select * from  items_ordered where item = 'Tent';

-- 3 select the customerid, order_date, and item values from  the items_ordered table for any items in the item column that start with the letter "S".

select customerid, order_date, item from  items_ordered where item LIKE 's%';

-- 4. select the distinct items in the items_ordered table. In other words, display a listing of each of the unique items from  the items_ordered table.
select DISTINCT item from  items_ordered;

-- 5. Make up your own select statements and submit them.
select min(price) from  items_ordered where item = 'Umbrella ';

-- 6. select the maximum price of any item ordered in the items_ordered table. Hint: select the maximum price only.
select max(price) from  items_ordered;

-- 7. select the average price of all of the items ordered that were purchased in the month of Dec.
select avg(price) from  items_ordered where order_date LIKE '%Dec%';

-- 8. What are the total number of rows in the items_ordered table?
select count(*) from  items_ordered;

-- 9. For all of the tents that were ordered in the items_ordered table, what is the price of the lowest tent? Hint: Your query should return the price only.
select min(price) from  items_ordered where item = 'Tent';

-- 10. How many people are in each unique state in the customers table? select the state and display the number of people in each. Hint: count is used to
-- count rows in a column, sum works on numeric data only.
select state, count(state) from  customers GROUP BY state;

-- 11. from  the items_ordered table, select the item, maximum price, and  minimum price for each specific item in the table. Hint: The items will need to
-- be broken up into separate groups.
select item, max(price), min(price) from items_ordered GROUP BY item;

-- 12. How many orders did each customer make? Use the items_ordered table. select the customerid, number of orders they made, and the sum of their orders. 
-- Click the Group By answers link below if you have any problems.

-- select customerid, 

-- 13. How many people are in each unique state in the customers table that
-- have more than one person in the state? select the state and display the
-- number of how many people are in each if it's greater than 1.

-- 14. from  the items_ordered table, select the item, maximum price, and
-- minimum price for each specific item in the table. Only display the results if the
-- maximum price for one of the items is greater than 190.00.

-- 15. How many orders did each customer make? Use the items_ordered table.
-- select the customerid, number of orders they made, and the sum of their
-- orders if they purchased more than 1 item.

-- 16. select the lastname, firstname, and city for all customers in the customers table. Display the results in Ascending Order based on the lastname.
select the lastname, firstname, city from customers ORDER BY lastname;

-- 17. Same thing as exercise #1, but display the results in Descending order.
select customerid, item,price from  items_ordered where customerid=10449 order by item desc;

-- 18. select the item and price for all of the items in the items_ordered table  that the price is greater than 10.00. Display the results in Ascending order
-- based on the price.
SELECT item, price FROM items_ordered WHERE price > 10 ORDER BY price ;


-- 19. select the customerid, order_date, and item from  the items_ordered table for all items unless they are 'Snow Shoes' or if they are 'Ear Muffs'. Display the
-- rows as long as they are not either of these two items.
   
   select the customerid, order_date, item from items_ordered  where item not in ('Snow Shoes', 'Ear Muffs');
    
    
    
    
-- 20. select the item and price of all items that start with the letters 'S', 'P', or 'F'.

    SELECT item,price FROM items_ordered WHERE (item LIKE 'S%') OR (item LIKE 'P%') OR (item LIKE 'F%');

-- 21. select the date, item, and price from  the items_ordered table for all of the rows that have a price value ranging from  10.00 to 80.00.
  SELECT order_date, item,price FROM items_ordered WHERE pirce  BETWEEN 10.00 AND 80.00;
  
-- 22. select the firstname, city, and state from  the customers table for all of the rows where the state value is either: Arizona, Washington, Oklahoma,
-- Colorado, or Hawaii.
select the firstname, city, state from  customers WHERE state IN ('Arizona', 'Washington', 'Oklahoma', 'Colorado', 'Hawaii');


-- 23. select the item and per unit price for each item in the items_ordered table. Hint: Divide the price by the quantity.

-- 24. Write a query using a join to determine which items were ordered by each of the customers in the customers table. select the customerid, firstname,
-- lastname, order_date, item, and price for everything each customer purchased in the items_ordered table.
select customers.customerid, customers.firstname, customers.lastname, items_ordered.order_date, items_ordered.item, items_ordered.price   FROM customers, items_ordered
WHERE customers.customerid = items_ordered.customerid;

-- 25. Repeat exercise #1, however display the results sorted by state in descending order.
select customerid, item,price from  items_ordered where customerid=10449 order by state desc;