#!/bin/sh
mkdir -p output
for file in src/*; do
  stem="${file#src/}"
  stem="${stem%.java}"
  java "$file" >"output/$stem.txt"
done
