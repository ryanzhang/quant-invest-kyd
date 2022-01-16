
package com.cgc.horizon0.account.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "equity_industry", schema = "stock")
public class EquityIndustry extends PanacheEntity {

	@NotBlank(message = "sec_id may not be blank") 	@Column(name = "sec_id")
	public String secID;//证券ID

	@NotBlank(message = "ticker may not be blank") @Column(name = "ticker")
	public String ticker;//交易代码

	@NotBlank(message = "exchange_cd  may not be blank") @Column(name = "exchange_cd")
	public String exchangeCD; //交易市场。例如，XSHG-上海证券交易所；XSHE-深圳证券交易所；XBEI-北京证券交易所

	@Column(name = "sec_short_name")
	public String secShortName;//证券简称
	
	@Column(name = "sec_full_name")	public String secFullName;//证券全称
	@Column(name = "party_id") public String partID; //机构内部ID

	@Column(name = "industry_version_cd") public String industryVersionCD;  //	行业分类标准数字编码
	@Column(name = "industry") public String industry;  //	行业分类标准
	@Column(name = "industry_id") public String industryID;  //	行业分类编码，成分记录在最后一级行业分类下，上级行业请查看对应的一二三四级行业编码
	@Column(name = "industry_symbol") public String industrySymbol;  //	行业分类编码，行业编制机构发布的行业编码
	@Column(name = "into_date") @Temporal(TemporalType.DATE) public Date intoDate;  //	成分纳入日期
	@Column(name = "out_date") @Temporal(TemporalType.DATE) public Date outDate;  //	成分剔除日期
	@Column(name = "is_new") public boolean isNew;	//		是否最新：1-是，0-否
	@Column(name = "industry_id1") public String industryID1;  //	一级行业编码
	@Column(name = "industry_name1") public String industryName1;  //	一级行业
	@Column(name = "industry_id2") public String industryID2;  //	二级行业编码
	@Column(name = "industry_name2") public String industryName2;  //	二级行业
	@Column(name = "industry_id3") public String industryID3;  //	三级行业编码
	@Column(name = "industry_name3") public String industryName3;  //	三级行业
	@Column(name = "industry_id4") public String IndustryID4;  //	四级行业编码
	@Column(name = "industry_name4") public String IndustryName4;  //	四级行业
	@Column(name = "equ_type") public String equType;  //	个股所属市场板块
}
