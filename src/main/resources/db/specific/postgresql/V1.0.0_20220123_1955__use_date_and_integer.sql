ALTER TABLE stock.trade_calendar ALTER COLUMN calendar_date TYPE date USING(calendar_date::date);
ALTER TABLE stock.trade_calendar ALTER COLUMN prev_trade_date TYPE date USING(prev_trade_date::date);
ALTER TABLE stock.idx ALTER COLUMN base_date TYPE date USING(base_date::date);
ALTER TABLE stock.mkt_equ_day ALTER COLUMN is_open TYPE integer USING(is_open::integer);
