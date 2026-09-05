# Linux Concept 第一堂課簡介

這門課的目的，不只是學幾個 Linux／Unix 指令，而是實際建立一套可以運作的 Unix-like 系統，理解作業系統、網路服務與伺服器管理的基本概念。

第一階段我們會使用 **QEMU** 建立虛擬電腦，並在虛擬電腦中安裝 **FreeBSD**。雖然課名是 Linux Concept，但 FreeBSD 與 Linux 都屬於 Unix-like 系統，許多重要觀念與操作方式相通，例如檔案系統、使用者權限、Shell、網路設定及伺服器管理。

## 1. 建立虛擬電腦

- QEMU 的基本概念
- 虛擬硬碟、RAM、CPU、ISO 映像檔
- 從 FreeBSD ISO 開機與安裝

## 2. Unix 基本操作

- `pwd`, `ls`, `cd`
- `cp`, `mv`, `rm`, `mkdir`
- `cat`, `less`, `grep`
- 檔案權限：`chmod`, `chown`
- Process：`ps`, `kill`
- 文字編輯器：`vi`

## 3. 網路基本概念

- IP address
- Gateway
- DNS
- `ping`
- `ifconfig`
- `netstat`
- TCP port

## 4. 安裝與管理網路服務

- **sshd**：遠端登入
- **ftpd**：檔案傳輸
- **Apache 24**：建立 Web Server

例如安裝 Apache：

```sh
pkg install apache24
```

重點並不是只會輸入這條指令，而是要理解 Web Server 背後的運作方式：

```text
Client → TCP/IP → Port 80 → Apache → HTML file → Browser
```

同樣地，使用 SSH 時：

```sh
ssh user@192.168.1.10
```

我們也會討論這條指令背後發生了什麼事情：Client 如何找到 Server、使用哪個 TCP port、Server 上是哪一個程式接受連線，以及使用者如何完成登入。

## 這門課最重要的觀念

**不要把 Unix 當成「背指令的課」。**

真正的目標是理解：

> 一部電腦如何從一個空的虛擬硬碟，變成一台可以讓別人 SSH 登入、FTP 傳檔，甚至提供網站服務的 Server。

因此第一堂課可以先讓學生建立這個整體圖像：

```text
QEMU → FreeBSD → Unix commands → Network → SSH / FTP / Web Server
```

後面的每一個指令，其實都是逐步把這台 Server 建立起來。
