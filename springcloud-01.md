# springcloud服务注册中心
## 创建一个服务注册中心
* 创建一个服务注册中心,Eureka Server
* 启动一个服务器注册中心，只需要一个注解@EnableEurekaServer
* eureka server的配置文件appication.yml：
```yml
server:
  port: 8761
eureka:
  instance:
    hostname: localhost
  client:
    register-with-eureka: false
    fetch-registry: false
    service-url:
      defaultZone: http://${eureka.instance.hostname}
      :${server.port}/eureka/
```
* eureka server 是有界面的，启动工程,打开 `http://localhost:8761`

## 创建一个服务提供者
* 创建过程同server类似
* 通过注解@EnableEurekaClient表明自己是一个eurekaclient
* application.yml配置文件
```yml
eureka:
  client:
    serviceUrl:
      defaultZone: http://localhost:8761/eureka/
server:
  port: 8762
spring:
  application:
    name: service-hi
```
* 启动工程, 打开 `http://localhost:8761` 会发现一个服务注册在中心.