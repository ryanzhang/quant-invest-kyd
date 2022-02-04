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

ALTER TABLE stock.mkt_equ_day RENAME COLUMN turnove_value to turnover_value;
