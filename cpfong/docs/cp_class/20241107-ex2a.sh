#!/usr/bin/env sh

d=20241107ex2

mkdir $d
mkdir -p ./$d/prog/hw1 
mkdir -p ./$d/prog/hw2
mkdir -p ./$d/doc
mkdir -p ./$d/txt

for i in 1 2 3
do
 touch ./$d/doc/$i.doc
 touch ./$d/txt/$i.txt
 touch ./$d/prog/hw1/$i.sh
done

touch ./$d/prog/hw1/txt-1.bmp
touch ./$d/prog/hw1/txt-2.txt
