1,drl文件名不要求大小写，文件里第一行 package xxxx 可以自定义，但最好与包名保持一致。
2，以rule开始，以end结尾。LHS:when 与 then之间的部分；RHS：then后面的部分，只有LHS为true时才会执行RHS。




# drools-spring-boot

规则引擎Drools与SpringBoot的使用

## SpringBoot与Drools

#### SpringBoot项目
    略
#### Drools
- 依赖
```
        <drools.version>6.5.0.Final</drools.version>
        <!--Drools-->
        <dependency>
            <groupId>org.kie</groupId>
            <artifactId>kie-api</artifactId>
            <version>${drools.version}</version>
        </dependency>
        <dependency>
            <groupId>org.drools</groupId>
            <artifactId>drools-core</artifactId>
            <version>${drools.version}</version>
        </dependency>
        <dependency>
            <groupId>org.drools</groupId>
            <artifactId>drools-compiler</artifactId>
            <version>${drools.version}</version>
        </dependency>
        <dependency>
            <groupId>org.drools</groupId>
            <artifactId>drools-decisiontables</artifactId>
            <version>${drools.version}</version>
        </dependency>
        <dependency>
            <groupId>org.drools</groupId>
            <artifactId>drools-templates</artifactId>
            <version>${drools.version}</version>
        </dependency>
```


## Drools

   - 规则
   [Drools-Language](https://github.com/MyHerux/drools-springboot/blob/master/Drools-Language.md)

   - Rule示例
   [Drools-Example](https://github.com/MyHerux/drools-springboot/blob/master/Drools-Example.md)
   
   - Drools动态规则与决策表
   [Drools-Use](https://github.com/MyHerux/drools-springboot/blob/master/Drools-Use.md)

   - Drools解决复杂逻辑问题
   [Drools-ComplexProblem](https://github.com/MyHerux/drools-springboot/blob/master/Drools-ComplexProblem.md)
