
package com.cgc.horizon0.account.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "equity", schema = "stock")
public class Equity extends PanacheEntity {

	@Column(name = "sec_id")
	public String secID;//证券ID
@Column(name = "ticker")
	public String ticker;//交易代码

	@Column(name = "exchange_cd")
	public String exchangeCD; //交易市场。例如，XSHG-上海证券交易所；XSHE-深圳证券交易所；XBEI-北京证券交易所

	@Column(name = "list_sector_cd")
	public String listSectorCD;

	@Column(name = "list_sector")
	public String listSector;

	@Column(name = "trans_curr_cd")
	public String transCurrCD;//交易货币

	@Column(name = "sec_short_name")
	public String secShortName;//证券简称
	
	@Column(name = "sec_full_name")
	public String secFullName;//证券全称
	//;  //上市状态。L-上市；S-暂停；DE-终止上市；UN-未上市。对应DataAPI.SysCodeGet.codeTypeID=10005。
	@Column(name = "list_status_cd")
	public String listStatusCD;

	@Column(name = "list_date") @Temporal(TemporalType.DATE)
	public Date listDate;	//上市日期
	
	@Column(name = "delist_date") @Temporal(TemporalType.DATE)
	public Date delistDate; //摘牌日期

	@Column(name = "equ_type_cd")
	public String equTypeCD;	//	股票分类编码。例如，A-沪深A股；J-北证A股；B-沪深B股。
	@Column(name = "equ_type") public String equType; //	股票类别 个股所属市场板块
	@Column(name = "ex_country_cd") public String exCountryCD;	//	交易市场所属地区。例如，CHN-中国大陆；HKG-香港。对应DataAPI.SysCodeGet.codeTypeID=10002。
	@Column(name = "party_id") public String partID; //机构内部ID
	@Column(name = "total_shares") public Float totalShares; //	float	总股本(最新)
	@Column(name = "non_rest_float_shares") public Float nonrestFloatShares; //	公司无限售流通股份合计(最新)
	@Column(name = "non_rest_float_A") public Float nonrestfloatA;	//	无限售流通股本(最新)。如果为A股，该列为最新无限售流通A股股本数量；如果为B股，该列为最新流通B股股本数量
	@Column(name = "office_addr") public String officeAddr;	//	办公地址
	@Column(name = "prime_operating") public String primeOperating;	//	主营业务范围
	@Column(name = "end_date") @Temporal(TemporalType.DATE)
	public Date endDate;	//	财务报告日期
	@Column(name = "tsh_equity") public Float tShEquity;	//	所有者权益合计

	public static Equity of() {
		return new Equity();
	}

}
