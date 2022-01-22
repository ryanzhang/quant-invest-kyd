#!/bin/bash
 
#REM scheduled task point to .bat files
#REM besides we need to make sure we have system variables in place
 
#REM export a password for use with the system (no quotes)
export PGHOST=pg-quant-invest
export PGDATABASE=market
export PGUSER=postgres
export PGPASSWORD=password

if [ "$1" == "--reset" ];then
    read -p "危险！是否清空当前数据库 $PGHOST:$PGDATABASE, Run Y or N?" -n 1 -r
    if [[ $REPLY =~ ^[nN]$ ]];then
        exit 0;
    fi
    psql -X --variable=ON_ERROR_STOP= -1 -w -f cleanup.sql

elif [ "$1" == "-h" ] || [ "$1" == "--help" ];then
    echo -e """直接导入数据到空数据库，运行 $0 
【危险】先清空数据库，然后导入数据到，运行 $0 --reset
"""
    exit 0
fi

#REM execute psql by file, even though echo is off, errors will still show
psql -X --variable=ON_ERROR_STOP= -1 -w -f import.sql
