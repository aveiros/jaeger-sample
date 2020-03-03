#### Run jaeger
```
docker run -d -p 5775:5775/udp -p 6831:6831/udp -p 6832:6832/udp -p 5778:5778 -p 16686:16686 -p 14268:14268 --name jaeger jaegertracing/all-in-one:1.17.0
```

#### Run the sample
```
mvn spring-boot:run 
```
