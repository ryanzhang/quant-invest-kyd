df_idx=DataAPI.EquGet(ticker=u"",equTypeCD=u"A",listStatusCD=u"",exchangeCD="",ListSectorCD=u"",field=u"",pandas="1")

count=2
sizeCount=0
need_header=False
#reset needHeader
# need_header=False
is_exist=True

output_filename="equ_fdmt_bs" + str(count) + ".csv"

for i in df_idx.index : 
    secID = df_idx['secID'][i]
    # indexTypeCD = df_idx['indexTypeCD'][i]
#    if  indexTypeCD == '02':        
#        continue
        
    if secID=="002670.XSH":
        is_exist=False
    if is_exist:
        continue        
    df=DataAPI.FdmtBSGet(secID=secId,reportType=u"",endDate=u"",beginDate=u"",publishDateEnd=u"",publishDateBegin=u"",endDateRep="",beginDateRep="",beginYear="",endYear="",fiscalPeriod="",field=u"",pandas="1")
    # df=DataAPI.FdmtCFGet(secID=secID,reportType=u"",endDate=u"",beginDate=u"",publishDateEnd=u"",publishDateBegin=u"",endDateRep="",beginDateRep="",beginYear="",endYear="",fiscalPeriod="",field=u"",pandas="1")

    
    if sizeCount==0:
        print ("Write to new file "+ output_filename + ", Start secID:" + secID +"")
        
    sizeCount=sizeCount+df.size
       
    if sizeCount >16000000:
        print ("Size reached , Start to new file since secID: " + secID)
        break

    df.to_csv(output_filename, mode='a', header=need_header,encoding="gbk")

print "End"
