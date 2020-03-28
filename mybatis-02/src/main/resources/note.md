### 笔记

**mybatis**可以配置成适应多种环境
**每个sqlSessionFactory只能选择一种环境
mybatis默认的事务管理器是jdbc，连接池是Pooled

sqlSessionFactory 相当于线程池
sqlSession 相当于每一条事务
mapper 代表每一条具体业务