CREATE TABLE stock.equ_share_float_total (
    id bigint NOT NULL,
    ticker varchar(255),
    sec_short_name varchar(255),
    float_date date,
    new_marketable_shares float,
    propotion_new_old float,
    propotion_new_accu float,
    propotion_new_total float,
    share_source varchar(32),
    non_marketable_shares float,
    float_value float,
    update_time timestamp,
    PRIMARY KEY (id)
);
CREATE SEQUENCE IF NOT EXISTS stock.equ_share_float_id_seq START WITH 42227 INCREMENT BY 1;
