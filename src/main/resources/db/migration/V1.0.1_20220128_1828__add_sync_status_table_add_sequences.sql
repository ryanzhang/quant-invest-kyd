CREATE TABLE IF NOT EXISTS stock.sync_status  (
    id BIGINT NOT NULL,
    table_name VARCHAR(255),
    rc boolean,
    update_time TIMESTAMP,
    comment VARCHAR(255),
    PRIMARY KEY (id)
);

INSERT INTO stock.sync_status(id, table_name) VALUES(1, 'equity');
INSERT INTO stock.sync_status(id, table_name) VALUES(2, 'equity_industry');
INSERT INTO stock.sync_status(id, table_name) VALUES(3, 'equ_share');
INSERT INTO stock.sync_status(id, table_name) VALUES(4, 'fund');
INSERT INTO stock.sync_status(id, table_name) VALUES(5, 'fund_day');
INSERT INTO stock.sync_status(id, table_name) VALUES(6, 'idx');
INSERT INTO stock.sync_status(id, table_name) VALUES(7, 'mkt_equ_day');
INSERT INTO stock.sync_status(id, table_name) VALUES(8, 'mkt_idx_day');
INSERT INTO stock.sync_status(id, table_name) VALUES(9, 'trade_calendar');

DROP SEQUENCE IF EXISTS hibernate_sequence; 
CREATE SEQUENCE IF NOT EXISTS stock.equity_id_seq START WITH 5667 INCREMENT BY 1;
CREATE SEQUENCE IF NOT EXISTS stock.equ_share_id_seq START WITH 187368 INCREMENT BY 1;
CREATE SEQUENCE IF NOT EXISTS stock.fund_id_seq START WITH 20043 INCREMENT BY 1;
CREATE SEQUENCE IF NOT EXISTS stock.fund_day_id_seq START WITH 466777 INCREMENT BY 1;
CREATE SEQUENCE IF NOT EXISTS stock.idx_id_seq START WITH 12936 INCREMENT BY 1;
CREATE SEQUENCE IF NOT EXISTS stock.mkt_equ_day_id_seq START WITH 12776609 INCREMENT BY 1;
CREATE SEQUENCE IF NOT EXISTS stock.mkt_idx_day_id_seq START WITH 5834855 INCREMENT BY 1;
CREATE SEQUENCE IF NOT EXISTS stock.trade_calendar_id_seq START WITH 22540 INCREMENT BY 1;

CREATE UNIQUE INDEX IF NOT EXISTS equity_idx ON stock.equity( ticker);
CREATE UNIQUE INDEX IF NOT EXISTS mkt_equ_day_idx ON stock.mkt_equ_day(trade_date, ticker);
CREATE UNIQUE INDEX IF NOT EXISTS stockindex_idx ON stock.idx(sec_id);
CREATE UNIQUE INDEX IF NOT EXISTS mkt_idx_day_idx ON stock.mkt_idx_day(trade_date, index_id);
CREATE UNIQUE INDEX IF NOT EXISTS fund_idx ON stock.fund(sec_id);
CREATE UNIQUE INDEX IF NOT EXISTS fund_day_idx ON stock.fund_day(trade_date, ticker);
CREATE UNIQUE INDEX IF NOT EXISTS sync_status_idx ON stock.sync_status(table_name);
CREATE UNIQUE INDEX IF NOT EXISTS trade_calendar_id_seq ON stock.trade_calendar(exchange_cd, calendar_date);

ALTER TABLE stock.mkt_equ_day RENAME COLUMN turnove_value to turnover_value;
