select c1.CART_ID
from CART_PRODUCTS c1
inner join CART_PRODUCTS c2 on c1.CART_ID = c2.CART_ID
where c1.NAME = 'Milk' and c2.NAME = 'Yogurt';
