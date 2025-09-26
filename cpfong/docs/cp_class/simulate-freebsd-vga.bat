qemu-system-x86_64.exe -cpu max -m 2G -smp 2 -drive file=freebsd.img,if=virtio,format=raw -device virtio-net-pci,netdev=n0 -netdev user,id=n0,hostfwd=tcp:127.0.0.1:2222-:22 -display gtk
