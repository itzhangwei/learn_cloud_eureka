# 从阿里云docker的registry中构建
FROM registry.cn-shanghai.aliyuncs.com/qianjiu_docker/openjdk:8-jdk-alpine

LABEL maintainer="it_zhangwei@163.com"

VOLUME /tmp

# 端口环境定义
ENV PORT_TO_EXPOSE=8710

ADD ./target/*.jar /learn-eureka-service.jar


RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone



# 开发端口，读区 ENV中配置的变量
EXPOSE $PORT_TO_EXPOSE

ENTRYPOINT ["java","-Xms1g","-Xmx2g","-Djava.security.egd=file:/dev/./urandom","-jar","/learn-eureka-service.jar"]
