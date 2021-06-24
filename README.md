# Spring Boot Soap Web Service Example
> Spring Boot Soap Web Service Example
>
<img src="https://github.com/susimsek/spring-boot-soap-ws-example/blob/main/images/spring-boot-soap-ws-example.png" alt="Spring Boot Soap Web Service Example" width="100%" height="100%"/> 

## Prerequisites

* Java 11
* Maven 3.3+
* Docker 19.03+
* Docker Compose 1.25+

## Installation


```sh
./mvnw compile jib:dockerBuild
```


```sh
docker-compose up -d 
```

## Installation Using Vagrant

<img src="https://github.com/susimsek/spring-boot-soap-ws-example/blob/main/images/vagrant-installation.png" alt="Spring Boot Vagrant Installation" width="100%" height="100%"/> 

### Prerequisites

* Vagrant 2.2+
* Virtualbox or Hyperv

```sh
vagrant up
```

```sh
vagrant ssh
```

```sh
cd vagrant/setup
```

```sh
sudo chmod u+x *.sh
```

```sh
./install-prereqs.sh
```

```sh
exit
```

```sh
vagrant ssh
```

```sh
./mvnw compile jib:dockerBuild
```

```sh
docker-compose up -d
```

You can access the Wsdl from the following url.

http://localhost:9090/service/studentDetailsWsdl.wsdl



## Used Technologies

* Spring Boot 2.5.1
* Spring Boot Web Services
* Wsdl4j
* Jaxb Runtime
* Lombok
* Spring Boot Test

## Wsdl

You can access the Wsdl from the following url.

http://localhost:9090/service/studentDetailsWsdl.wsdl 

<img src="https://github.com/susimsek/spring-boot-soap-ws-example/blob/main/images/wsdl.png" alt="Soap Wsdl" width="100%" height="100%"/>




