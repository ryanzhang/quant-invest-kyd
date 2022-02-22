
package com.cgc.horizon0.account.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "equ_share_float", schema = "stock")
public class EquShareFloat extends PanacheEntity {
    @Column(name = "sec_id") public String secID;  //. 通联编制的证券编码，可在DataAPI.SecIDGet获取到。
    @Column(name = "publish_date") @Temporal(TemporalType.DATE) public Date publishDate;  //. 指数发布日期
    @Column(name = "sec_short_name") public String secShortName;  //. 指数简称
    @Column(name = "ticker") public String ticker;  //. 指数代码
	@Column(name = "exchange_cd") public String exchangeCD; //交易市场。例如，XSHG-上海证券交易所；XSHE-深圳证券交易所；XBEI-北京证券交易所
    @Column(name = "float_date") @Temporal(TemporalType.DATE) public Date floatDate;  //. 流通日期
    @Column(name = "float_num") public Float floatNum; //	float	流通数量
    @Column(name = "share_property") public String shareProperty;  //.限售流通股份性质。 
}
