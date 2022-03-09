\encoding gbk

-- Big table first
\copy stock.equ_share_float from 'csv/equity/equ_share_float.csv' delimiter ',' csv header;
\copy stock.equ_share_float_total from 'csv/equity/equ_share_float_total.csv' delimiter ',' csv header;
-- \copy stock.equ_float_shareholder_top10 from 'csv/equity/equ_float_shareholder_top10.csv' delimiter ',' csv header;
