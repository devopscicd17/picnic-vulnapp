#!/usr/bin/env bash

set -e -o pipefail

IMAGE_NAME=$(<NAME)
VERSION=$(<VERSION)

TAG="${VERSION}"

echo "Building ${IMAGE_NAME}:${TAG}..."

docker build -t "${IMAGE_NAME}:${TAG}" .