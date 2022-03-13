\encoding gbk

-- Big table first
\copy stock.mkt_equ_day from 'csv/equity/mkt_equd_20220117_0312.csv' delimiter ',' csv header;
