CREATE TABLE IF NOT EXISTS stock.mkt_equ_60k1 (
    id bigint NOT NULL,
    sec_id varchar(255),
    ticker varchar(255),
    exchange_cd varchar(255),
    trade_date date,
    open float,
    high float,
    low float,
    close float,
    amount float,
    adjustflag integer,
    volume float,
    trade_time timestamp,
    primary key (id)
);
CREATE TABLE IF NOT EXISTS stock.mkt_equ_60k2 (
    id bigint NOT NULL,
    sec_id varchar(255),
    ticker varchar(255),
    exchange_cd varchar(255),
    trade_date date,
    open float,
    high float,
    low float,
    close float,
    amount float,
    adjustflag integer,
    volume float,
    trade_time timestamp,
    primary key (id)
);
CREATE TABLE IF NOT EXISTS stock.mkt_equ_60k3 (
    id bigint NOT NULL,
    sec_id varchar(255),
    ticker varchar(255),
    exchange_cd varchar(255),
    trade_date date,
    open float,
    high float,
    low float,
    close float,
    amount float,
    adjustflag integer,
    volume float,
    trade_time timestamp,
    primary key (id)
);
CREATE TABLE IF NOT EXISTS stock.mkt_equ_60k4 (
    id bigint NOT NULL,
    sec_id varchar(255),
    ticker varchar(255),
    exchange_cd varchar(255),
    trade_date date,
    open float,
    high float,
    low float,
    close float,
    amount float,
    adjustflag integer,
    volume float,
    trade_time timestamp,
    primary key (id)
);
