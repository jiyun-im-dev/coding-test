SELECT
    t2.ingredient_type
    , SUM(t1.total_order) AS total_order
FROM
    first_half t1
    LEFT OUTER JOIN icecream_info t2 ON t2.flavor = t1.flavor
GROUP BY
    ingredient_type
ORDER BY
    total_order ASC