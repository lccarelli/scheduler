#!/bin/bash

# Exit immediately if a command exits with a non-zero status.
set -e

if [ "$1" == "format" ]; then
    ./gradlew spotlessApply
elif [ "$1" == "check" ]; then
    ./gradlew spotlessCheck
else
    echo "Usage: $0 {format|check}"
    exit 1
fi
