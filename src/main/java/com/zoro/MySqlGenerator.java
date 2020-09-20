package com.zoro;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class MySqlGenerator {
    public static void main(String[] args) {

        // =============================全局配置===============================
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig// 定义输出目录
                .setFileOverride(true).setOutputDir("D:\\project\\distribution\\MyBatisPlusApply\\src\\main\\java")
                // 主键生成策略 生成BaseResultMap
                .setIdType(IdType.AUTO).setBaseResultMap(true)
                .setBaseColumnList(true)
                // 指定作者
                .setAuthor("zoro")
                // 设置Controller、Service、ServiceImpl、Dao、Mapper文件名称，%s是依据表名转换来的
                .setControllerName("%sController").setServiceName("%sService").setServiceImplName("%sServiceImpl").setMapperName("%sDao").setXmlName("%sMapper");
        // ================================数据源配置============================
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig
                // 用户名、密码、驱动、url
                .setUsername("root").setPassword("root")
                .setDbType(DbType.MYSQL).setDriverName("com.mysql.cj.jdbc.Driver")
                .setUrl("jdbc:mysql://localhost:3308/sysuser?useUnicode=true&amp&useSSL=false&amp&characterEncoding=UTF-8&amp&serverTimezone=GMT%2B8")
        ;
        // ===============================包名配置：父包.模块.controller===============================
        PackageConfig packageConfig = new PackageConfig();
        packageConfig
                // 父包名 模块名
                .setParent("com.zoro").setModuleName("products")
                // 分层包名
                .setController("controller").setService("service").setServiceImpl("service.impl").setEntity("domain").setMapper("mapper");
        // =====================================策略配置==================================
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
                // 命名策略：实体的类名和属性名按照表字段生成驼峰规则
                .setNaming(NamingStrategy.underline_to_camel)
                // controller生成@RestCcontroller
                .setRestControllerStyle(true);
        AutoGenerator autoGenerator = new AutoGenerator();
        autoGenerator.setGlobalConfig(globalConfig)
                .setDataSource(dataSourceConfig)
                .setPackageInfo(packageConfig)
                .setStrategy(strategyConfig);


        // 执行生成
        autoGenerator.execute();

    }
}
