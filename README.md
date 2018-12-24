# 1hadoop实战App数据处理分析


## 1.1 项目背景

---
网站、app的运营者需要知道自己的产品或服务的运营状况，就需要对使用自己产品的用户进行各种角度的数据分析，比如：用户数量  、新增用户 、留存用户 、活跃用户 、地域分析 、渠道分析 .......

要做这样的分析，数据来源应该是用户的产品使用的行为日志，行为日志是由app或者网站的页面获取用户相关信息后，发送给后台服务器记录下来的。

---
  


## 1.2 需求

---

需求：
1. 检查每条日志的必选字段是否完整，不完整的日志应该滤除
2. 为每条日志添加一个用户唯一标识字段：user_id
3. 将event字段抛弃，将header中的各字段解析成普通文本行

---

### 注意

1.  多路输出器
	
*   MultipleOutputs<Text, NullWritable> mos = new MultipleOutputs<>(context);
*   // 防止多路输出输出空文件TextOutputFormat等有数据输出，避免生成默认的part-m-000等文件
        LazyOutputFormat.setOutputFormatClass(job, TextOutputFormat.class);
 
    








