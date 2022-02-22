
package com.cgc.horizon0.account.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "equ_float_shareholder_top10", schema = "stock")
public class EquFloatShareHolderTop10 extends PanacheEntity {
    @Column(name = "sec_id") public String secID;  //. 通联编制的证券编码，可在DataAPI.SecIDGet获取到。
    @Column(name = "publish_date") @Temporal(TemporalType.DATE) public Date publishDate;  //. 指数发布日期
    @Column(name = "sec_short_name") public String secShortName;  //. 指数简称
    @Column(name = "ticker") public String ticker;  //. 指数代码
	@Column(name = "exchange_cd") public String exchangeCD; //交易市场。例如，XSHG-上海证券交易所；XSHE-深圳证券交易所；XBEI-北京证券交易所
    @Column(name = "end_date") @Temporal(TemporalType.DATE) public Date endDate;  //. 截止日期

    @Column(name = "sh_num") public Integer shNum;  //. 股东序号
    @Column(name = "sh_name") public String shName;  //. 股东名字
    @Column(name = "hold_vol") public Float holdVol; //	float	持无限售条件股份数量
    @Column(name = "hold_pct") public Float holdPct;  //. 持股比例
    @Column(name = "share_type") public String shType;  //. 股份性质
    @Column(name = "update_time") public Date updateTime;  //. 更新时间
}
