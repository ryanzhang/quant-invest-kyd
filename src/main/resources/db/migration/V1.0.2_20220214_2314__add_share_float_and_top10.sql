CREATE TABLE IF NOT EXISTS stock.equ_share_float (
    id BIGINT NOT NULL,
    sec_id VARCHAR(255),
    ticker VARCHAR(255),
    sec_short_name VARCHAR(255),
    exchange_cd VARCHAR(255),
    publish_date DATE,
    float_date DATE,
    float_num FLOAT,
    share_property VARCHAR(255),
    PRIMARY KEY (id)
);
CREATE TABLE IF NOT EXISTS stock.equ_float_shareholder_top10 (
    id BIGINT NOT NULL,
    sec_id VARCHAR(255),
    ticker VARCHAR(255),
    sec_short_name VARCHAR(255),
    exchange_cd VARCHAR(255),
    end_date DATE,
    publish_date DATE,
    sh_num integer,
    sh_name VARCHAR(255),
    hold_vol FLOAT,
    hold_pct FLOAT,
    share_type VARCHAR(255),
    update_time TIMESTAMP,
    PRIMARY KEY (id)
);
CREATE SEQUENCE IF NOT EXISTS stock.equ_share_float_id_seq START WITH 34656 INCREMENT BY 1;
CREATE SEQUENCE IF NOT EXISTS stock.equ_float_shareholder_top10_id_seq START WITH 1797005 INCREMENT BY 1;

CREATE UNIQUE INDEX IF NOT EXISTS equity_idx ON stock.equ_share_float(ticker,publish_date);
