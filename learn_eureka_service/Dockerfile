# Dockerfile example
FROM java:8
LABEL maintainer="it_zhangwei@163.com"

VOLUME /tmp

# 端口环境定义
ENV PORT_TO_EXPOSE=8710

ADD ./target/*.jar /eureka-service.jar


#RUN bash -c 'touch /eureka-service.jar'


# 开发端口，读区 ENV中配置的变量
EXPOSE $PORT_TO_EXPOSE

#ENTRYPOINT ["java","-Xms1g","-Xmx2g","-Djava.security.egd=file:/dev/./urandom","-jar","/eureka-service.jar"]
