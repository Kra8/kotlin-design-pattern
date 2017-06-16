#!/bin/bash

if [ ! $1 ]; then
    echo "Please set arguments."
    exit 1
fi

if [ -e $1 ]; then
    echo "Already exist project."
    exit 1
fi

project=$1
current=`pwd`
build_xml_example="build.xml.example"
makefile="Makefile"

mkdir -p "$1/src"
cp $makefile "$project/$makefile"
cp $build_xml_example "$project/$build_xml_example"

echo "$project initialized."
