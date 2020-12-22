#!/usr/bin/env bash

set -e -o pipefail

SCRIPT_NAME=$(basename "${0}")
if [ "${#}" -ne 1 ]; then
  echo "Usage: ./${SCRIPT_NAME} <version>"
  echo "Example: ./${SCRIPT_NAME} 1.0.1"
  exit 1
fi

IMAGE_NAME="picnic-security/vuln-app"
VERSION="${1}"

TAG="${VERSION}"

echo "Building ${IMAGE_NAME}:${TAG}..."

docker build -t "${IMAGE_NAME}:${TAG}" .
