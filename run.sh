#!/usr/bin/env bash

set -e -o pipefail

IMAGE_NAME=$(<NAME)
VERSION=$(<VERSION)

echo "Running Image $IMAGE_NAME:$VERSION ..."
docker run -d -p 127.0.0.1:8080:8080/tcp -p 127.0.0.1:20:20/tcp -p 127.0.0.1:21:21/tcp -p 127.0.0.1:139:139/tcp -p 127.0.0.1:445:445/tcp -p 127.0.0.1:6200:6200/tcp -p 127.0.0.1:137:137/udp -p 127.0.0.1:138:138/udp $NAME:$VERSION