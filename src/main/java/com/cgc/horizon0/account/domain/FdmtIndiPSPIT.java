
package com.cgc.horizon0.account.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "fdmt_indi_ps_pit", schema = "stock")
public class FdmtIndiPSPIT extends PanacheEntity {


	@Column(name = "sec_id")
	public String secID;//证券ID
	@Column(name = "party_id") public String partID; //机构内部ID

	@Column(name = "ticker")
	public String ticker;//交易代码


	@Column(name = "exchange_cd")
	public String exchangeCD; //交易市场。例如，XSHG-上海证券交易所；XSHE-深圳证券交易所；XBEI-北京证券交易所
	
	@Column(name = "sec_short_name")
	public String secShortName;//证券简称

	@Column(name = "publish_date") @Temporal(TemporalType.DATE) public Date publishDate; // str	证券交易所披露的信息发布日期
	@Column(name = "end_date") @Temporal(TemporalType.DATE) public Date endDate; // str	截止日期
	@Column(name = "act_pubtime") public Date actPubtime; // str	实际披露时间
	@Column(name = "eps") public Float EPS; // float每股收益(期末摊薄,元/股)
	@Column(name = "basic_eps") public Float basicEPS; // float基本每股收益
	@Column(name = "diluted_eps") public Float dilutedEPS; // float稀释每股收益
	@Column(name = "n_asset_ps") public Float nAssetPS; // float每股净资产(元/股)
	@Column(name = "t_rev_ps") public Float tRevPS; // float每股营业总收入(元/股)
	@Column(name = "rev_ps") public Float revPS; // float每股营业收入(元/股)
	@Column(name = "op_ps") public Float opPS; // float每股营业利润(元/股)
	@Column(name = "ebi_tps") public Float EBITPS; // float每股息税前利润(元/股)
	@Column(name = "c_reser_ps") public Float cReserPS; // float每股资本公积(元/股)
	@Column(name = "s_reser_ps") public Float sReserPS; // float每股盈余公积(元/股)
	@Column(name = "reser_Ps") public Float reserPS; // float每股公积金(元/股)
	@Column(name = "re_ps") public Float rePS; // float每股未分配利润(元/股)
	@Column(name = "t_re_ps") public Float tRePS; // float每股留存收益(元/股)
	@Column(name = "n_cf_oper_aps") public Float nCfOperAPS; // float每股经营活动产生的现金流量净额(元/股)
	@Column(name = "n_cin_cash_ps") public Float nCInCashPS; // float每股现金流量净额(元/股)
	@Column(name = "fcf_fps") public Float FCFFPS; // float每股企业自由现金流量(元/股)
	@Column(name = "fcf_eps") public Float FCFEPS; // float每股股东自由现金流量(元/股)

}
