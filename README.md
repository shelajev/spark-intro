# spark-intro
This is a small application to test sparkjava web framework


# build instructions 
Clone, run something like this: 
``` 
gradle shadowJar
docker-machine start default
eval $(docker-machine env default)
docker-compose up
```

It should probably get up at http://docker-machine-IP:4567/hello

