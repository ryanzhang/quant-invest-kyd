# 股票基本信息 stock.equity
|名称|类型|描述|
|---	|---	|---	|
|sec_id|str|证券ID|
|ticker|str|交易代码|
|exchange_cd|str|交易市场。例如，XSHG-上海证券交易所；XSHE-深圳证券交易所；XBEI-北京证券交易所。对应data_aPI.sys_code_get.code_type_id=10002。|
|list_sector_cd|int|上市板块编码。1-主板；2-创业板；4-科创板；5-北交所。|
|list_sector|str|上市板块|
|trans_curr_cd|str|交易货币。例如，CNY-人民币元；USD-美元。对应data_aPI.sys_code_get.code_type_id=10004。|
|sec_short_name|str|证券简称|
|sec_full_name|str|证券全称|
|list_status_cd|str|上市状态。L-上市；S-暂停；DE-终止上市；UN-未上市。对应data_aPI.sys_code_get.code_type_id=10005。|
|list_date|Date|上市日期|
|delist_date|Date|摘牌日期|
|equ_type_cd|str|股票分类编码。例如，A-沪深A股；J-北证A股；B-沪深B股。|
|equ_type|str|股票类别|
|ex_country_cd|str|交易市场所属地区。例如，CHN-中国大陆；HKG-香港。对应data_aPI.sys_code_get.code_type_id=10002。|
|party_id|int|机构内部ID|
|total_shares|float|总股本(最新)|
|non_rest_float_shares|float|公司无限售流通股份合计(最新)|
|non_rest_float_a|float|无限售流通股本(最新)。如果为A股，该列为最新无限售流通A股股本数量；如果为B股，该列为最新流通B股股本数量|
|office_addr|str|办公地址|
|prime_operating|str|主营业务范围|
|end_date|Date|财务报告日期|
|TSh_equity|float|所有者权益合计|


# 公司十大流通股东 equ_float_shareholder_top10
|名称|类型|描述|
|---	|---	|---	| 
|secID|str|证券内部编码，一串流水号,可先通过DataAPI.SecIDGet获取到，如在DataAPI.SecIDGet，选择证券类型为'E',输入'000001'，可获取到ID'000001.XSHE'后，在此输入'000001.XSHE'|
|ticker|str|股票代码|
|secShortName|str|证券简称|
|exchangeCD|str|交易市场。例如，XSHG-上海证券交易所；XSHE-深圳证券交易所。对应DataAPI.SysCodeGet.codeTypeID=10002。|
|endDate|str|截止日期，输入格式“YYYYMMDD”|
|publishDate|str|发布时间|
|shNum|int|股东序号|
|shName|str|股东名称|
|holdVol|float|持无限售条件股份数量|
|holdPct|float|持股比例|
|shareType|str|股份性质|
|updateTime|str|更新时间|


# 限售股解禁 stock.equ_share_float
|名称|类型|描述|
|---	|---	|---	| 
|ticker|	str|	证券交易代码
|secShortName|	str|	股票简称
|floatingDate|	date|	解禁日期
|newMarketableShares|	float|	本次解禁（万股）
|propotionNewOld|	floaat|	占解禁前流通股比例
|propotionNewAccu|	float|	占解禁后流通股比例
|propotionNewTotal|	float|	占总股本比例
|shareSource|	float|	上市股份类型
|nonMarketableShares|	float	剩余限售股数（万股）
|floatValue|	float|	流通市值
|updateTime|	str|	更新时间

# 财务指标—每股 (Point in time)
|名称|类型|描述|
|---	|---	|---	| 
|secID|str|证券编码
|partyID|str|机构编码
|ticker|str|证券交易代码
|secShortName|str|证券简称
|exchangeCD|str|通联编制的证券市场编码。例如，XSHG-上海证券交易所；XSHE-深圳证券交易所等。对应DataAPI.SysCodeGet.codeTypeID=10002。
|publishDate|date|证券交易所披露的信息发布日期
|endDate|date|截止日期
|actPubtime|datetime|实际披露时间
|EPS|float|每股收益(期末摊薄,元/股), 报告期的利润除以期末的股份数 （国内2006年新会计制度后废弃）
|basicEPS|float|基本每股收益, 归属于普通股股东的当期净利润除以发行在外普通股的加权平均数
|dilutedEPS|float|稀释每股收益, 即假设公司存在的上述可能转化为上市公司股权的工具都在当期全部转换为普通股股份后计算的每股收益. 我国企业发行的潜在普通股主要有可转换公司债券、认股权证、股份期权等。潜在普通股通常对每股收益具有稀释的可能性。比如，可转换公司债券是一种潜在普通股，具有稀释每股收益的可能性，不是在实际转换时，而是在其存在期间具有稀释的可能性。等到实际转换时，就变为对基本每股收益的影响，而不是对稀释每股收益的影响
|nAssetPS|float|每股净资产(元/股)
|tRevPS|float|每股营业总收入(元/股)
|revPS|float|每股营业收入(元/股)
|opPS|float|每股营业利润(元/股)
|EBITPS|float|每股息税前利润(元/股)
|cReserPS|float|每股资本公积(元/股)
|sReserPS|float|每股盈余公积(元/股)
|reserPS|float|每股公积金(元/股) 每股公积金分为资本公积金和盈余公积金。资本公积金：溢价发行债券的差额和无偿捐赠资金实物作为资本公积金。盈余公积金：从偿还债务后的税后利润中提取10%作为盈余公积金。
|rePS|float|每股未分配利润(元/股)
|tRePS|float|每股留存收益(元/股)
|nCfOperAPS|float|每股经营活动产生的现金流量净额(元/股)
|nCInCashPS|float|每股现金流量净额(元/股)
|FCFFPS|float|每股企业自由现金流量(元/股) https://xueqiu.com/6217652971/199799351
|FCFEPS|float|每股股东自由现金流量(元/股)

# 沪深股票日行情 stock.mkt_equ_day
|名称|类型|描述|
|---	|---	|---	|
|sec_id|str|通联编制的证券编码，可使用data_aPI.sec_idGet获取|
|ticker|str|通用交易代码|
|sec_short_name|str|证券简称|
|exchange_cd|str|通联编制的交易市场编码|
|trade_date|Date|交易日期|
|pre_close_price|float|昨收盘(前复权)|
|act_pre_close_price|float|实际昨收盘价(未复权)|
|open_price|float|开盘价|
|highest_price|float|最高价|
|lowest_price|float|最低价|
|close_price|float|收盘价|
|turnover_vol|float|成交量, 股数为单位|
|turnover_value|float|成交金额，A股单位为元，B股单位为美元或港币|
|deal_amount|int|成交笔数|
|turnover_rate|float|日换手率，成交量/无限售流通股数|
|accum_adj_bf_factor|float|累积前复权因子，前复权价=未复权价*累积前复权因子。前复权是对历史行情进行调整，除权除息当日的行情无需调整。最近一次除权除息日至最新交易日期间的价格也无需调整，该期间前复权因子等于1。|
|neg_market_value|float|流通市值，收盘价*无限售流通股数|
|market_value|float|总市值，收盘价*总股本数|
|chg_pct|float|涨跌幅，收盘价/昨收盘价-1|
|pe|float|滚动市盈率，即市盈率TTM，总市值/归属于母公司所有者的净利润TTM, Earning Per Share, TTM = Trailig Twelve Month, 使用过去的12个月的盈利作为参考 |
|pe1|float|动态市盈率，总市值/归属于母公司所有者的净利润（最新一期财报年化）动态市盈率=股票现价÷未来每股收益的预测值, 动态市盈率是指还没有真正实现的下一年度的预测利润的市盈率。即Forward PE, FPE更能表示未来股价期望，因为TTM的盈利能力已经表现在股价上面|
|pb|float|市净率，总市值/归属于母公司所有者权益合计, b表示总资产-总负债|
|is_open|int|股票今日是否开盘标记：0-未开盘，1-交易日|
|vwap|float|VWAP，成交金额/成交量|
|accum_adj_af_factor|float| 后复权因子|

# 指数基本信息 stock.idx
|名称|类型|描述|
|---	|---	|---	|
|sec_iD|str|通联编制的证券编码，可在data_aPI.sec_iDGet获取到。|
|publish_date|Date|指数发布日期|
|sec_short_name|str|指数简称|
|ticker|str|指数代码|
|index_type_cD|str|指数类型编码|
|index_type|str|指数类型|
|pub_org_cD|int|通联编制的机构编码|
|porg_full_name|str|发布机构全称|
|base_date|Date|指数计算基准日期|
|base_point|float|指数计算基准点位|
|end_date|Date|指数停用日期|
|index_group|str|指数系列代码|
|cons_type|str|样本覆盖的证券类型编码|
|cons_mkt|str|样本覆盖的交易市场编码|
|return_type|str|指数处理收益的类型编码|
|w_method_cD|str|指数的加权方式编码|
|update_time|str|最近一次更新时间|
|pub_name|str|指数编制机构名称|
|industry_iD|str|行业指数对应的通联行业编码，对应get_industry.industry_iD|
|industry_name|str|行业分类名称|
|sort_iD|str|通联编制的指数分类编码，对应get_sec_type.type_iD|
|sort_name|str|指数分类名称|

# 指数日行情 stock.mkt_idx_day
|名称|类型|描述|
|---	|---	|---	|
|index_id|str|通联编制的证券编码|
|ticker|str|指数通用代码|
|porg_full_name|str|发布机构全称|
|sec_short_name|str|指数的证券简称|
|exchange_cd|str|通联编制的交易市场编码|
|trade_date|Date|交易日期|
|pre_close_index|float|昨收盘点位|
|open_index|float|开盘点位|
|lowest_index|float|最低点位|
|highest_index|float|最高点位|
|close_index|float|收盘点位|
|turnover_vol|float|成交量|
|turnover_value|float|成交金额，对于南华指数，该字段存储持仓量|
|chg|float|涨跌，收盘-昨收盘|
|chg_pct|float|涨跌幅，收盘/昨收盘-1|

# 基金基本信息 stock.fund
|名称|类型|描述|
|---	|---	|---	|
|sec_id|str|内部编码|
|ticker|str|基金代码|
|sec_short_name|str|基金中文简称|
|trade_abbr_name|str|交易简称|
|category|str|按投资对象分基金类型。E-股票型，H-混合型，B-债券型，SB-短期理财债券，M-货币型，O-其他。对应data_aPI.sys_code_get.code_type_id=40002。|
|operation_mode|str|基金运作模式，O为开放式，C为封闭式。对应data_aPI.sys_code_get.code_type_id=40005。|
|index_fund|str|基金指数型属性。I-指数型，EI-指数增强型。对应data_aPI.sys_code_get.code_type_id=40003。|
|etf_lof|str|ETF或LOF型基金。取值为ETF或LOF或为空。对应data_aPI.sys_code_get.code_type_id=40004。|
|is_qdii|int|是否为QDII基金，1为是，0为否。对应data_aPI.sys_code_get.code_type_id=10007。|
|is_fof|int|是否为FOF基金，1为是，0为否。对应data_aPI.sys_code_get.code_type_id=10007。|
|is_guar_fund|int|是否为保本基金，1为是，0为否。对应data_aPI.sys_code_get.code_type_id=10007。|
|guar_period|float|保本周期(月)|
|guar_ratio|float|保本比例(%)|
|exchange_cd|str|通联编制的证券市场编码。例如，XSHG-上海证券交易所；XSHE-深圳证券交易所；XIBE-中国银行间市场等。可以使用data_aPI.sys_code_get接口获取所有取值，code_type_id=10002。对应data_aPI.sys_code_get.code_type_id=10002。|
|list_status_cd|str|上市状态。L-上市；S-暂停；DE-终止上市；UN-未上市。对应data_aPI.sys_code_get.code_type_id=10005。|
|manager_name|str|基金经理|
|status|str|基金状态。A-存续中，E-已到期，为空则未成立|
|establish_date|Date|基金成立日期|
|list_date|Date|上市日期|
|delist_date|Date|终止上市日期|
|expire_date|Date|到期日|
|management_company|int|基金管理人编码|
|management_full_name|str|基金管理人中文全称|
|custodian|int|基金托管人编码|
|custodian_full_name|str|基金托管人中文全称|
|invest_field|str|投资领域|
|invest_target|str|投资目标|
|perf_benchmark|str|业绩比较基准|
|circulation_shares|float|最新流通份额|
|is_class|int|是否分级基金。1-母基金，2-子基金A，3-子基金B，0-否。对应data_aPI.sys_code_get.code_type_id=40036。|
|idx_id|str|指数型基金跟踪指数，为通联内部编码|
|idx_ticker|str|指数代码|
|idx_short_name|str|指数简称|
|management_short_name|str|基金管理人中文简称|
|custodian_short_name|str|基金托管人中文简称|
|sec_full_name|str|基金中文全称|
|class_name|str|分级名称|

# 基金日行情 stock.fund_day
|名称|类型|描述|
|---	|---	|---	|
|sec_id|str|通联编制的证券编码，可使用data_aPI.sec_idGet获取|
|ticker|str|通用交易代码|
|exchange_cd|str|通联编制的交易市场编码|
|sec_short_name|str|证券简称|
|trade_date|Date|交易日期|
|pre_close_price|float|昨收盘|
|open_price|float|今开盘|
|highest_price|float|最高价|
|lowest_price|float|最低价|
|close_price|float|收盘价|
|chg|float|涨跌，收盘价-昨收盘价|
|chg_pct|float|涨跌幅，收盘价/昨收盘价-1|
|turnover_vol|float|成交量|
|turnover_value|float|成交金额|
|discount|float|贴水，净值-收盘价|
|discount_ratio|float|贴水率，(净值-收盘)/净值|
|circulation_shares|float|流通份额|
|accum_adj_factor|float|累积后复权因子|

# 股票行业分类 stock.equ_industry
|名称|类型|描述|
|---	|---	|---	|
|sec_id|str|通联编制的证券编码，可在data_aPI.sec_idGet获取到。|
|ticker|str|通用交易代码|
|exchange_cd|str|通联编制的交易市场编码|
|sec_short_name|str|证券简称|
|sec_full_name|str|证券全称|
|party_id|int|通联编制的机构编码|
|industry_version_cd|str|行业分类标准数字编码|
|industry|str|行业分类标准|
|industry_id|str|行业分类编码，成分记录在最后一级行业分类下，上级行业请查看对应的一二三四级行业编码|
|industry_symbol|str|行业分类编码，行业编制机构发布的行业编码|
|into_date|Date|成分纳入日期|
|out_date|Date|成分剔除日期|
|is_new|int|是否最新：1-是，0-否|
|industry_id1|str|一级行业编码|
|industry_name1|str|一级行业|
|industry_id2|str|二级行业编码|
|industry_name2|str|二级行业|
|industry_id3|str|三级行业编码|
|industry_name3|str|三级行业|
|industry_id4|str|四级行业编码|
|industry_name4|str|四级行业|
|equ_type|str|个股所属市场板块|

# 交易所交易日历 stock.trade_calendar
|名称|类型|描述|
|---	|---	|---	|
|exchange_cd|str|证券交易所|
|calendar_date|Date|日期|
|is_open|bool|日期当天是否开市。0表示否，1表示是|
|prev_trade_date|Date|当前日期前一交易日|
|is_week_end|bool|当前日期是否当周最后交易日。0表示否，1表示是|
|is_month_end|bool|当前日期是否当月最后交易日。0表示否，1表示是|
|is_quarter_end|bool|当前日期是否当季最后交易日。0表示否，1表示是|
|is_year_end|bool|当前日期是否当年最后交易日。0表示否，1表示是|

# 公司股本变动 stock.equ_share
|名称|类型|描述|
|---	|---	|---	|
|sec_id|str|证券ID|
|ticker|str|交易代码|
|sec_short_name|str|证券简称|
|exchange_cd|str|交易市场。例如，XSHG-上海证券交易所；XSHE-深圳证券交易所。对应data_aPI.sys_code_get.code_type_id=10002。|
|party_id|int|机构ID|
|change_date|Date|变更日期|
|total_shares|float|总股本|
|shares_a|float|A股|
|shares_b|float|B股|
|float_a|float|流通A股|
|nonrestfloat_a|float|无限售流通A股|
|float_b|float|流通B股|
|rest_shares|float|有限售条件股份合计|
|nonrest_float_shares|float|无限售流通股份合计|


# 整库数据更新状态表 stock.sync_status
|名称|类型|描述|
|---	|---	|---	|
|table_name|str|表名称|
|rc|bool|更新是否成功|
|update_time|timestamp|更新时间|
|comment|str|更新附加信息|

