
package com.cgc.horizon0.account.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "mkt_idx_day", schema = "stock")
public class MktIdxDay extends PanacheEntity {
    @Column(name = "index_id") public String indexID;  //通联编制的证券编码
    @Column(name = "ticker") public String ticker;  //指数通用代码
    @Column(name = "porg_full_name") public String porgFullName;  //发布机构全称
    @Column(name = "sec_short_name") public String secShortName;  //指数的证券简称
    @Column(name = "exchange_cd") public String exchangeCD;  //通联编制的交易市场编码
    @Column(name = "trade_date") @Temporal(TemporalType.DATE)  public Date tradeDate;  //交易日期
    @Column(name = "pre_close_index") public Float preCloseIndex;  //	昨收盘点位
    @Column(name = "open_index") public Float openIndex;  //	开盘点位
    @Column(name = "lowest_index") public Float lowestIndex;  //	最低点位
    @Column(name = "highest_index") public Float highestIndex;  //	最高点位
    @Column(name = "closee_index") public Float closeIndex;  //	收盘点位
    @Column(name = "turnover_vol") public Float turnoverVol;  //	成交量
    @Column(name = "turnover_value") public Float turnoverValue;  //	成交金额，对于南华指数，该字段存储持仓量
    @Column(name = "chg") public Float CHG;  //	涨跌，收盘-昨收盘
    @Column(name = "chg_pct") public Float CHGPct;  //	涨跌幅，收盘/昨收盘-1
}
