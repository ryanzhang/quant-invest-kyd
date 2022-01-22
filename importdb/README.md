# 导入数据
## 导入数据到一个空数据库
需要先创建market database schema;
```
cd importdb
./import_csv_to_db.sh
```

## 先清除再导入数据
```
./import_csv_to_db.sh --reset
```
