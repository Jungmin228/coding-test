select I.NAME, I.DATETIME
from ANIMAL_INS I
left join ANIMAL_OUTS O on I.ANIMAL_ID = O.ANIMAL_ID
where not exists (select * from ANIMAL_OUTS O where I.ANIMAL_ID = O.ANIMAL_ID)
order by I.DATETIME asc
limit 0, 3;
