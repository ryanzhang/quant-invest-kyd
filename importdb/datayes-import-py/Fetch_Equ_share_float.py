df_idx=DataAPI.EquGet(ticker=u"",equTypeCD=u"A",listStatusCD=u"",exchangeCD="",ListSectorCD=u"",field=u"",pandas="1")

count=1
sizeCount=0
need_header=True
#reset needHeader
# need_header=False
is_exist=True

output_filename="equ_share_float_" + str(count) + ".csv"

for i in df_idx.index : 
    ticker = df_idx['ticker'][i]
    # indexTypeCD = df_idx['indexTypeCD'][i]
#    if  indexTypeCD == '02':        
#        continue
        
    # if ticker=="000804.ZICN":
    #     is_exist=False
    # if is_exist:
    #     continue        
    df=DataAPI.RbShafltTotalGet(ticker=ticker,beginDate=u"",endDate=u"",field=u"",pandas="1")

    
    if sizeCount==0:
        print ("Write to new file "+ output_filename + ", Start ticker:" + ticker +"")
        
    sizeCount=sizeCount+df.size
       
    if sizeCount >14400000:
        print ("Size reached , Start to new file since ticker: " + ticker)
        break

    df.to_csv(output_filename, mode='a', header=need_header,encoding="gbk")
    need_header=False
print "End"
