
package com.cgc.horizon0.account.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "trade_calendar", schema = "stock")
public class TradeCalendar extends PanacheEntity {

	@Column(name = "exchange_cd")  public String exchangeCD;  //	证券交易所
	@Column(name = "calendar_date") @Temporal(TemporalType.DATE) public Date calendarDate;  //	日期
	@Column(name = "is_open")  public Boolean isOpen;  //日期当天是否开市。0表示否，1表示是
	@Column(name = "prev_trade_date") @Temporal(TemporalType.DATE)  public Date prevTradeDate;  //	当前日期前一交易日
	@Column(name = "is_week_end")  public Boolean isWeekEnd;  //当前日期是否当周最后交易日。0表示否，1表示是
	@Column(name = "is_month_end")  public Boolean isMonthEnd;  //当前日期是否当月最后交易日。0表示否，1表示是
	@Column(name = "is_quarter_end")  public Boolean isQuarterEnd;  //当前日期是否当季最后交易日。0表示否，1表示是
	@Column(name = "is_year_end")  public Boolean isYearEnd;  //当前日期是否当年最后交易日。0表示否，1表示是

}
