
package com.cgc.horizon0.account.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "idx", schema = "stock")
public class Idx extends PanacheEntity {
    @Column(name = "sec_id") public String secID;  //. 通联编制的证券编码，可在DataAPI.SecIDGet获取到。
    @Column(name = "publish_date") @Temporal(TemporalType.DATE) public String publishDate;  //. 指数发布日期
    @Column(name = "sec_short_name") public String secShortName;  //. 指数简称
    @Column(name = "ticker") public String ticker;  //. 指数代码
    @Column(name = "index_type_cd") public String indexTypeCD;  //. 指数类型编码
    @Column(name = "index_type") public String indexType;  //. 指数类型
    @Column(name = "pub_org_cd") public Integer pubOrgCD; //	int	通联编制的机构编码
    @Column(name = "porg_full_name") public String porgFullName;  //. 发布机构全称
    @Column(name = "base_date") @Temporal(TemporalType.DATE) public Date baseDate;  //. 指数计算基准日期
    @Column(name = "base_point") public Float basePoint; //	float	指数计算基准点位
    @Column(name = "end_date") @Temporal(TemporalType.DATE) public Date endDate;  //. 指数停用日期
    @Column(name = "index_group") public String indexGroup;  //. 指数系列代码
    @Column(name = "cons_type") public String consType;  //. 样本覆盖的证券类型编码
    @Column(name = "cons_mkt") public String consMkt;  //. 样本覆盖的交易市场编码
    @Column(name = "return_type") public String returnType;  //. 指数处理收益的类型编码
    @Column(name = "w_method_cd") public String wMethodCD;  //. 指数的加权方式编码
    @Column(name = "update_time") @Temporal(TemporalType.DATE) public Date updateTime;  //. 最近一次更新时间
    @Column(name = "pub_name") public String pubName;  //. 指数编制机构名称
    @Column(name = "industry_id") public String industryID;  //. 行业指数对应的通联行业编码，对应getIndustry.industryID
    @Column(name = "industry_name") public String industryName;  //. 行业分类名称
    @Column(name = "sort_id") public String sortID;  //. 通联编制的指数分类编码，对应getSecType.typeID
    @Column(name = "sort_name") public String sortName;  //. 指数分类名称
}
