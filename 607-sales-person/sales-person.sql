SELECT s.name FROM SalesPerson  AS s
WHERE s.sales_id  NOT IN (
    SELECT s2.sales_id FROM SalesPerson s2
    JOIN Orders o ON s2.sales_id = o.sales_id
    JOIN Company c ON o.com_id = c.com_id
    WHERE c.name = "RED"
)