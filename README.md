# gw-infra

## Build micro-services
```
./build-services.sh
```

## Run all
```
docker-compose up --build --remove-orphans --scale app1=2 --scale app2=2 --scale app3=2 -d
```

