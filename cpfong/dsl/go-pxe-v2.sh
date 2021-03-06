#!/bin/sh
#
# version 2012/06/15 file create cpfong
# object  terminal server using dnsmasq (default not working)
# note: run as a regular user (not root)

# make tftpboot directory for TFTPD and PXE
sudo mkdir -p /tftpboot/pxelinux.cfg
sudo cp /mnt/sdb1/tce/boot/core.gz /tftpboot/
sudo cp /mnt/sdb1/tce/boot/vmlinuz /tftpboot/
sudo cp /usr/share/syslinux/pxelinux.0 /tftpboot/

#
cd /tftpboot/pxelinux.cfg
fn="default"
sudo sh -c "echo DEFAULT tinycore		> $fn"
sudo sh -c "echo TIMEOUT 300			>>$fn"
sudo sh -c "echo LABEL tinycore			>>$fn"
sudo sh -c "echo KERNEL vmlinuz			>>$fn"
sudo sh -c "echo APPEND quiet initrd=core.gz	>>$fn"
#
# non root user install this first!!
/usr/bin/tce-load -wi dnsmasq
sudo cp /usr/local/etc/dnsmasq.conf.example /etc/dnsmasq.conf

fn2="/etc/dnsmasq.conf"

sudo sh -c "echo interface=eth0 >> $fn2"
sudo sh -c "echo dhcp-range=192.168.1.50,192.168.1.150,12h >> $fn2"
sudo sh -c "echo dhcp-option=option:router,192.168.1.1 >> $fn2"
sudo sh -c "echo dhcp-boot=pxelinux.0 >> $fn2"
sudo sh -c "echo enable-tftp >> $fn2"                                                          
sudo sh -c "echo tftp-root=/tftpboot >> $fn2"
sudo sh -c "echo dhcp-leasefile=/tmp/dnsmasq.leases >> $fn2"
#
sudo /usr/local/sbin/dnsmasq start
