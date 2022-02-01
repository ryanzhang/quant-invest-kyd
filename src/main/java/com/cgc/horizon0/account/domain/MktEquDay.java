
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
@Table(name = "mkt_equ_day", schema = "stock")
public class MktEquDay extends PanacheEntity {
	@Column(name = "sec_id") public String secID;  //通联编制的证券编码，可使用DataAPI.SecIDGet获取
	@Column(name = "ticker") public String ticker;	//	通用交易代码
	@Column(name = "sec_short_name") public String secShortName; //	证券简称
	@Column(name = "exchange_cd") public String exchangeCD;	//	通联编制的交易市场编码
	@Column(name = "trade_date") @Temporal(TemporalType.DATE) public Date tradeDate;  //交易日期
	@Column(name = "pre_close_price") public Float preClosePrice;  //昨收盘(前复权)
	@Column(name = "act_pre_close_price") public Float actPreClosePrice;  //实际昨收盘价(未复权)
	@Column(name = "open_price") public Float openPrice;  //开盘价
	@Column(name = "highest_price") public Float highestPrice;  //最高价
	@Column(name = "lowest_price") public Float lowestPrice;  //最低价
	@Column(name = "close_price")  public Float closePrice;  //收盘价
	@Column(name = "turnover_vol")  public Float turnoverVol;  //成交量
	@Column(name = "turnove_value")  public Float turnoverValue;  //成交金额，A股单位为元，B股单位为美元或港币
	@Column(name = "deal_amount")  public Float dealAmount;  //	成交笔数
	@Column(name = "turnover_rate")  public Float turnoverRate;  //日换手率，成交量/无限售流通股数
	@Column(name = "accum_adj_bf_factor")  public Float accumAdjBfFactor;  //累积前复权因子，前复权价=未复权价*累积前复权因子。前复权是对历史行情进行调整，除权除息当日的行情无需调整。最近一次除权除息日至最新交易日期间的价格也无需调整，该期间前复权因子等于1。
	@Column(name = "neg_market_value")  public Float negMarketValue;  //流通市值，收盘价*无限售流通股数
	@Column(name = "market_value")  public Float marketValue;  //总市值，收盘价*总股本数
	@Column(name = "chg_pct")  public Float chgPct;  //涨跌幅，收盘价/昨收盘价-1
	@Column(name = "pe")  public Float PE;  //滚动市盈率，即市盈率TTM，总市值/归属于母公司所有者的净利润TTM
	@Column(name = "pe1")  public Float PE1;  //动态市盈率，总市值/归属于母公司所有者的净利润（最新一期财报年化）
	@Column(name = "pb")  public Float PB;  //市净率，总市值/归属于母公司所有者权益合计
	@Column(name = "is_open")  public Integer isOpen; //股票今日是否开盘标记：0-未开盘，1-交易日
	@Column(name = "vwap")  public Float vwap;  //VWAP，成交金额/成交量
	@Column(name = "accum_adj_af_factor")  public Float accumAdjAfFactor;  //累积后复权因子，后复权价=未复权价*累积前复权因子。前复权是对历史行情进行调整，除权除息当日的行情无需调整。最近一次除权除息日至最新交易日期间的价格也无需调整，该期间前复权因子等于1。
}
