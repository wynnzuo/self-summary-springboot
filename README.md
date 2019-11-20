# self-summary-springboot
__springboot使用过程中的一些功能自我总结__  
* springboot版本 : 1.5.9.RELEASE  
* jdk版本 : 1.8
## mybatis-generate项目
__使用mybatis-generator插件配合tk.mabatis逆向工程生成mapper和pojo__
* 本地mysql数据库 : mysql 8.0.12  
## 注意
1.由于使用mysql 8.*版本
* 所以驱动为
```
jdbc.driver=com.mysql.cj.jdbc.Driver
```
而不是
```
jdbc.driver=com.mysql.jdbc.Driver
```
* nullCatalogMeansCurrent=true为了防止插件去匹配information_schema库的表
* serverTimezone=GMT%2B8 设置时区，东八区
```
jdbc.url=jdbc:mysql://127.0.0.1:3306/wynn_zuo?serverTimezone=GMT%2B8&nullCatalogMeansCurrent=true
```
2.generatorConfig.xml若想让${settings.localRepository}生效，需在pom配合设置resources插件和resources配置filtering=true  
路径使用/或\都可以生效
```
<!--数据库驱动-->
<classPathEntry
        location="${settings.localRepository}/mysql\mysql-connector-java\${mysql.version}\mysql-connector-java-${mysql.version}.jar"/>
```
```
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-resources-plugin</artifactId>
    <version>2.5</version>
    <configuration>
        <useDefaultDelimiters>true</useDefaultDelimiters>
        <encoding>UTF-8</encoding>
    </configuration>
</plugin>
<resource>
    <directory>src/main/resources</directory>
    <includes>
        <include>**/*.properties</include>
        <include>**/*.xml</include>
    </includes>
    <filtering>true</filtering>
</resource>
```


