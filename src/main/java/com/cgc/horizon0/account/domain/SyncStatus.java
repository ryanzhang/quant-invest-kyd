
package com.cgc.horizon0.account.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "sync_status", schema = "stock")
public class SyncStatus extends PanacheEntity {
    @Column(name = "table_name") public String tableName;  //. 基金内部编码 通联编制的证券编码，可在DataAPI.SecIDGet获取到。
    @Column(name = "lastest_date") @Temporal(TemporalType.DATE)  public Date lastestDate;  //	基金代码
    @Column(name = "update_time") public Date updateTime;  //	基金中文简称
    @Column(name = "integrity_cd") public int integrityCd;  //	交易简称
    @Column(name = "integrity_status") public String integrityStatus;  //	按投资对象分基金类型。E-股票型，H-混合型，B-债券型，SB-短期理财债券，M-货币型，O-其他。对应DataAPI.SysCodeGet.codeTypeID=40002。
    @Column(name = "integrity_checktime") public Date integrityChecktime;  //	基金运作模式，O为开放式，C为封闭式。对应DataAPI.SysCodeGet.codeTypeID=40005。
}
