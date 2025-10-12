Windows+R / cmd

server:	www.ifong.org 
port: 8080

connect: ssh -p 8080 yourID@www.ifong.org
upload: scp -P 8080 file.zip yourID@www.ifong.org:~/dir/

remove files: rm -fr Dir_or_fileName
make a new_dir: mkdir new_dir
check file: ls file
