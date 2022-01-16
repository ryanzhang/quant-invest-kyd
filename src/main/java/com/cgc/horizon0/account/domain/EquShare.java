
package com.cgc.horizon0.account.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "equ_share", schema = "stock")
public class EquShare extends PanacheEntity {

	@Column(name = "sec_id") public String secID;//证券ID

	@Column(name = "ticker") public String ticker;//交易代码

	@Column(name = "sec_short_name") public String secShortName; //	证券简称

	@Column(name = "exchange_cd") public String exchangeCD; //交易市场。例如，XSHG-上海证券交易所；XSHE-深圳证券交易所；XBEI-北京证券交易所
	@Column(name = "party_id") public String partID; //机构内部ID

	@Column(name = "change_date") @Temporal(TemporalType.DATE)  public Date changeDate;  //变更日期
	@Column(name = "total_shares")  public Float totalShares;  //总股本
	@Column(name = "shares_a")  public Float sharesA;  //A股
	@Column(name = "shares_b")  public Float sharesB;  //B股
	@Column(name = "float_a")  public Float floatA;  //流通A股
	@Column(name = "nonrest_float_a")  public Float nonrestfloatA;  //无限售流通A股
	@Column(name = "float_b")  public Float floatB;  //流通B股
	@Column(name = "rest_shares")  public Float restShares;  //有限售条件股份合计
	@Column(name = "nonrest_float_shares")  public Float nonrestFloatShares;  //无限售流通股份合计

}
