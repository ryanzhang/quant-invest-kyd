df_idx=DataAPI.EquGet(ticker=u"",equTypeCD=u"A",listStatusCD=u"",exchangeCD="",ListSectorCD=u"",field=u"",pandas="1")

count=6
sizeCount=0
need_header=False
#reset needHeader
# need_header=False
is_exist=True

output_filename="mkt_equd_limit_" + str(count) + ".csv"

for i in df_idx.index : 
    secID = df_idx['secID'][i]

        
    if secID=="600289.XSHE":
        is_exist=False
    if is_exist:
        continue        
    df=DataAPI.MktLimitGet(secID=secID,tradeDate=u"",exchangeCD=u"",beginDate=u"",endDate=u"",field=u"",pandas="1")   
    if sizeCount==0:
        print ("Write to new file "+ output_filename + ", Start secID:" + secID +"")
        
    sizeCount=sizeCount+df.size
       
    if sizeCount >13200000:
        print ("Size reached , Start to new file since secID: " + secID)
        break

    df.to_csv(output_filename, mode='a', header=need_header,encoding="gbk")

print "End"

