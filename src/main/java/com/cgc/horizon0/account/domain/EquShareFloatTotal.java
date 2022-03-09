
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
public class EquShareFloatTotal extends PanacheEntity {
    @Column(name = "ticker") public String ticker;  //. 指数代码
    @Column(name = "sec_short_name") public String secShortName;  //. 指数简称
    @Column(name = "float_date") @Temporal(TemporalType.DATE) public Date floatDate;  //. 流通日期
    @Column(name = "new_marketable_shares") public Float newMarketableShares; // 本次解禁（万股）
    @Column(name = "propotion_new_old") public Float propotionNewOld; // 占解禁前流通股比例
    @Column(name = "propotion_new_accu") public Float propotionNewAccu; // 占解禁后流通股比例
    @Column(name = "propotion_new_total") public Float propotionNewTotal; // 占总股本比例
    @Column(name = "share_source") public String shareSource; // 上市股份类型
    @Column(name = "non_marketable_shares") public Float nonMarketableShares; //	剩余限售股数（万股）
    @Column(name = "float_value") public Float floatValue; //流通市值
    @Column(name = "update_time") public Date updateTime; //	更新时间    

}
