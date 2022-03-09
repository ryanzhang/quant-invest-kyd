
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
@Table(name = "mkt_equ_60k1", schema = "stock")
public class MktEqu60K1 extends PanacheEntity {
	// date,time,code,open,high,low,close,volume,amount,adjustflag
	@Column(name = "sec_id") public String secID;  //通联编制的证券编码，可使用DataAPI.SecIDGet获取
	@Column(name = "ticker") public String ticker;	//	通用交易代码
	@Column(name = "exchange_cd") public String exchangeCD;	//	通联编制的交易市场编码
	@Column(name = "open") public Float open;  //昨收盘(前复权)
	@Column(name = "high") public Float high;  //实际昨收盘价(未复权)
	@Column(name = "low") public Float low;  //开盘价
	@Column(name = "close") public Float close;  //最高价
	@Column(name = "volume") public Float volume;  //最低价
	@Column(name = "amount")  public Float amount;  //收盘价
	@Column(name = "adjustflag")  public Integer adjustflag;  //成交量
	@Column(name = "trade_time") public Date tradeTime;  //交易日期
}
