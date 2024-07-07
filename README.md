# gw-infra

## Build micro-services
```
./build-services.sh
```

## Run all
```
docker-compose up --build --remove-orphans --scale app1=2 --scale app2=2 --scale app3=2 -d
```

## helm

### install
```
apps=(eureka gw app1 app2 app3)
for i in ${apps[@]} ; do 
	helm install $i ./helm-gw-infra -f helm-gw-infra/values-$i.yaml
done

### delete
```
for i in ${apps[@]} ; do 
	helm deletel $i
done


```
