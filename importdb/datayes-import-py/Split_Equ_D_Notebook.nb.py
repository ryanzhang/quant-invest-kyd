df_idx=DataAPI.EquGet(ticker=u"",equTypeCD=u"A",listStatusCD=u"",exchangeCD="",ListSectorCD=u"",field=u"",pandas="1")

count=1
sizeCount=0
need_header=True
is_exist=True

output_filename="mkt_equd_20220117_0312" + str(count) + ".csv"
for i in df_idx.index : 
    secID = df_idx['secID'][i]
        
    # if secID=="000804.ZICN":
    #     is_exist=False
    # if is_exist:
    #     continue        
    df=DataAPI.MktEqudGet(secID=secID,beginDate=u"20220117",endDate=u"",field=u"",pandas="1")
    
    output_filename="idx_d_" + str(count) + ".csv"
    if sizeCount==0:
        print ("Write to new file "+ output_filename + ", Start secID:" + secID +"")
        
    sizeCount=sizeCount+df.size
       
    if sizeCount==0:
        print ("Write to new file "+ output_filename + ", Start secID:" + secID +"")
        
    sizeCount=sizeCount+df.size
       
    if sizeCount >1500000:
        print ("Size reached , Start to new file since secID: " + secID)
        break

    df.to_csv(output_filename, mode='a', header=need_header,encoding="gbk")


print "End"
