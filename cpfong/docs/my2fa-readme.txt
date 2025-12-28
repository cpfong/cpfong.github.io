haproxy --> https://10.0.0.8/

jail www nginx.conf
--
    server {
     35         listen 80;
     36         server_name 2fa.ifong.cc;
     37
     38         location / {
     39             proxy_pass http://10.0.0.8:3000;


jail api
--
$ whoami
node

$ ifconfig
vtnet0: flags=1008843<UP,BROADCAST,RUNNING,SIMPLEX,MULTICAST,LOWER_UP> metric 0 mtu 1500
        inet 10.0.0.8 netmask 0xffffffff broadcast 10.0.0.8

$ pwd
/home/node/work/auth_2fa

$ ls
2fa.pid                 daemon.app.js.sh        my2fa-pri.txt           package-lock.json       test-2fa-1.sh
app.js                  get-6.sh                node_modules            package.json            test-2fa-2.sh

root@api:/ # service node_2fa start
Starting node_2fa
service node_2fa status
node_2fa is running as pid 83026.
root@api:~ # service node_2fa stop
root@api:~ # service node_2fa status
node_2fa is not running.

save to /usr/local/etc/rc.d/
