\encoding gbk

-- Big table first
\copy stock.mkt_equ_day from 'csv/equity/equ_d_all.csv' delimiter ',' csv header;
\copy stock.mkt_idx_day from 'csv/idx/idx_d_all.csv' delimiter ',' csv header;
-- Only contains etf基金
\copy stock.fund_day from 'csv/fund/fund_etf_d.csv' delimiter ',' csv header;

\copy stock.equ_share from 'csv/equity/equ_share.csv' delimiter ',' csv header;
\copy stock.equity from 'csv/equity/equity_all.csv' delimiter ',' csv header;
\copy stock.equity_industry from 'csv/equity/equ_industry.csv' delimiter ',' csv header;
\copy stock.fund from 'csv/fund/fund_all.csv' delimiter ',' csv header;
\copy stock.idx from 'csv/idx/idx.csv' delimiter ',' csv header;
\copy stock.sys_code from 'csv/sys_code.csv' delimiter ',' csv header;
\copy stock.trade_calendar from 'csv/trade_calendar.csv' delimiter ',' csv header;
