ALTER TABLE stock.fund ALTER COLUMN invest_field TYPE varchar(3072);
ALTER TABLE stock.fund ALTER COLUMN invest_target TYPE varchar(2048);
ALTER TABLE stock.idx ALTER COLUMN publish_date TYPE date USING(publish_date::date);
