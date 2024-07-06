#!/usr/bin/env bash

# Array of service directories
services=("eureka" "gw" "app")

# Loop through each service directory and run Gradle build
for service in "${services[@]}"
do
  echo "Building $service..."
  (cd $service && ../gradlew build)
done

echo "All services have been built successfully!"
