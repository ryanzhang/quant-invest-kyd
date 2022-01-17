package com.cgc.horizon0.account.domain;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "fund_day", schema = "stock")
public class FundDay extends PanacheEntity {
    @Column(name = "sec_id") public String secID; //	通联编制的证券编码，可使用DataAPI.SecIDGet获取
    @Column(name = "ticker") public String ticker; //	通用交易代码
    @Column(name = "exchange_cd") public String exchangeCD; //	通联编制的交易市场编码
    @Column(name = "sec_short_name") public String secShortName; //	证券简称
    @Column(name = "trade_date") @Temporal(TemporalType.DATE) public Date tradeDate; //	交易日期
    @Column(name = "pre_close_price") public Float preClosePrice;  //	昨收盘
    @Column(name = "open_price") public Float openPrice;  //	今开盘
    @Column(name = "highest_price") public Float highestPrice;  //	最高价
    @Column(name = "lowest_price") public Float lowestPrice;  //	最低价
    @Column(name = "close_price") public Float closePrice;  //	收盘价
    @Column(name = "chg") public Float CHG;  //	涨跌，收盘价-昨收盘价
    @Column(name = "chg_pct") public Float CHGPct;  //	涨跌幅，收盘价/昨收盘价-1
    @Column(name = "turnover_vol") public Float turnoverVol;  //	成交量
    @Column(name = "turnover_value") public Float turnoverValue;  //	成交金额
    @Column(name = "discount") public Float discount;  //	贴水，净值-收盘价
    @Column(name = "discount_ratio") public Float discountRatio;  //	贴水率，(净值-收盘)/净值
    @Column(name = "circulation_shares") public Float circulationShares;  //	流通份额
    @Column(name = "accum_adj_factor") public Float accumAdjFactor;  //	累积后复权因子

}
