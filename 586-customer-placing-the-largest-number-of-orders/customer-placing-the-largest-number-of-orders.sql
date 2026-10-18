SELECT customer_number
FROM Orders
GROUP BY customer_number
ORDER BY COUNT(Order_number) DESC
LIMIT 1