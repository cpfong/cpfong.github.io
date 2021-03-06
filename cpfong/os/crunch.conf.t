#
# $FreeBSD: src/release/picobsd/net/crunch.conf,v 1.1.2.2 2001/05/08 08:03:16 luigi Exp $
#
# NOTE: the string "/usr/src" will be automatically replaced with the
# correct value set in 'build' script - you should change it there

# Default build options.
buildopts -DNOPAM -DRELEASE_CRUNCH -DNOSECURE -DNOCRYPT -DNONETGRAPH -DNOIPSEC

# other sources
srcdirs /usr/src/bin
srcdirs /usr/src/sbin/i386
srcdirs /usr/src/sbin
srcdirs /usr/src/usr.bin
srcdirs /usr/src/gnu/usr.bin
srcdirs /usr/src/usr.sbin
srcdirs /usr/src/libexec
# sources for ns & vm
srcdirs /usr/src/release/picobsd/tinyware

progs sh test echo hostname ln login getty stty
#progs reboot
#progs inetd telnetd w msg kget reboot
progs init ifconfig df sps ns vm cat
progs cp rm mknod chmod chown mkdir ls syslogd
progs sysctl route pwd_mkdb dev_mkdb
progs mount mount_msdos umount
progs kill mount_std natd
#progs kill 

progs pwd telnet
progs pwd telnet less
ln less more
progs passwd date
#progs mount_cd9660 mount_nfs ping traceroute routed ipfw

#progs ppp
#special ppp buildopts -DNOKLDLOAD -DNOINET6 -DNONAT -DNOATM -DNOSUID -DHAVE_DES -DNORADIUS -DNOI4B

progs ee

progs minigzip
ln minigzip gzip
#ln mount_cd9660 cd9660
#ln mount_nfs nfs
ln test [
ln sh -sh
ln mount_msdos msdos
ln mount_std procfs
ln mount_std mount_procfs
ln sps ps
ln msg dmesg
ln ns netstat
ln chown chgrp

libs -lncurses -lmytinfo -lipx -lz -lpcap -lalias -lwrap
libs -ledit -lutil -lmd -lcrypt -lmp -lgmp -lm -lkvm
libs -lgnuregex -ltelnet
