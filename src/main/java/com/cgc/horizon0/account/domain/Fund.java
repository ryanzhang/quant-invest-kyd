
package com.cgc.horizon0.account.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "fund", schema = "stock")
public class Fund extends PanacheEntity {
    @Column(name = "sec_id") public String secID;  //. 基金内部编码 通联编制的证券编码，可在DataAPI.SecIDGet获取到。
    @Column(name = "ticker") public String ticker;  //	基金代码
    @Column(name = "sec_short_name") public String secShortName;  //	基金中文简称
    @Column(name = "trade_abbr_name") public String tradeAbbrName;  //	交易简称
    @Column(name = "category") public String category;  //	按投资对象分基金类型。E-股票型，H-混合型，B-债券型，SB-短期理财债券，M-货币型，O-其他。对应DataAPI.SysCodeGet.codeTypeID=40002。
    @Column(name = "operation_mode") public String operationMode;  //	基金运作模式，O为开放式，C为封闭式。对应DataAPI.SysCodeGet.codeTypeID=40005。
    @Column(name = "index_fund") public String indexFund;  //	基金指数型属性。I-指数型，EI-指数增强型。对应DataAPI.SysCodeGet.codeTypeID=40003。
    @Column(name = "etf_lof") public String etfLof;  //	ETF或LOF型基金。取值为ETF或LOF或为空。对应DataAPI.SysCodeGet.codeTypeID=40004。
    @Column(name = "is_qdii") public Boolean isQdii; //	是否为QDII基金，1为是，0为否。对应DataAPI.SysCodeGet.codeTypeID=10007。
    @Column(name = "is_fof") public Boolean isFof; //是否为FOF基金，1为是，0为否。对应DataAPI.SysCodeGet.codeTypeID=10007。
    @Column(name = "is_guar_fund") public Boolean isGuarFund; //	是否为保本基金，1为是，0为否。对应DataAPI.SysCodeGet.codeTypeID=10007。
    @Column(name = "guar_period") public Float guarPeriod;  //	保本周期(月)
    @Column(name = "guar_ratio") public Float guarRatio;  //	保本比例(%)
    @Column(name = "exchange_cd") public String exchangeCd;  //	通联编制的证券市场编码。例如，XSHG-上海证券交易所；XSHE-深圳证券交易所；XIBE-中国银行间市场等。可以使用DataAPI.SysCodeGet接口获取所有取值，codeTypeID=10002。对应DataAPI.SysCodeGet.codeTypeID=10002。
    @Column(name = "list_status_cd") public String listStatusCd;  //	上市状态。L-上市；S-暂停；DE-终止上市；UN-未上市。对应DataAPI.SysCodeGet.codeTypeID=10005。
    @Column(name = "manager_name") public String managerName;  //	基金经理
    @Column(name = "status") public String status;  //	基金状态。A-存续中，E-已到期，为空则未成立
    @Column(name = "establish_date") @Temporal(TemporalType.DATE) public Date establishDate;  //	基金成立日期
    @Column(name = "list_date") @Temporal(TemporalType.DATE) public Date listDate;  //	上市日期
    @Column(name = "delist_date") @Temporal(TemporalType.DATE) public Date delistDate;  //	终止上市日期
    @Column(name = "expire_date") @Temporal(TemporalType.DATE) public Date expireDate;  //	到期日
    @Column(name = "management_company") public Integer managementCompany;//	int	基金管理人编码
    @Column(name = "management_full_name") public String managementFullName;  //	基金管理人中文全称
    @Column(name = "custodian") public Integer custodian;//	int	基金托管人编码
    @Column(name = "custodian_full_name") public String custodianFullName;  //	基金托管人中文全称
    @Column(name = "invest_field") public String investField;  //	投资领域
    @Column(name = "invest_target") public String investTarget;  //	投资目标
    @Column(name = "perf_benchmark") public String perfBenchmark;  //	业绩比较基准
    @Column(name = "circulation_shares") public Float circulationShares;  //	最新流通份额
    @Column(name = "is_class") public Integer isClass;//	int	是否分级基金。1-母基金，2-子基金A，3-子基金B，0-否。对应DataAPI.SysCodeGet.codeTypeID=40036。
    @Column(name = "idx_id") public String idxID;  //	指数型基金跟踪指数，为通联内部编码
    @Column(name = "idx_ticker") public String idxTicker;  //	指数代码
    @Column(name = "idx_short_name") public String idxShortName;  //	指数简称
    @Column(name = "management_short_name") public String managementShortName;  //	基金管理人中文简称
    @Column(name = "custodian_short_name") public String custodianShortName;  //	基金托管人中文简称
    @Column(name = "sec_full_name") public String secFullName;  //	基金中文全称
    @Column(name = "class_name") public String className;  //	分级名称
}
