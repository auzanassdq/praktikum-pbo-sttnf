# Part 1 - Instalasi

Sebelum kita terjun bebas, siapin dulu parasutnya cuuy.. sama halnya pemrograman `Java`, kita memerlukan tools atau alat yang di perlukan untuk menjalan program `Java` itu sendiri. Tools yang di perlukan adalah :

- [JDK (Java Development Kit)](#jdk)
- [IDE (Integrated Development Environment)](#ide)


## JDK (Java Development Kit)<a name="jdk"></a>
JDK adalah Tools yang digunakan untuk mengembangkan dan menjalankan aplikasi java pada sistem operasi Windows/Linux

Tanpa JDK, kita tidak bisa menjalankan (mengkompilasi) aplikasi `Java`. 

### Instalasi JDK (Linux)
1. buka terminal
2. masuk sebagai super user (sudo su)
3. Cek sistem, sudah ada JDK nya atau belum. Jika sudah, tidak perlu melanjutkan step ini

```
javac --version
```

4. Cari versi openjdk yang terdapat pada server
```
apt-cache search openjdk
```

5. Pilihlah openjdk versi terbaru, sebagai contoh saya mendapatkan versi terbaru openjdk 11
```
sudo apt-get install openjdk-11-jdk
```

6. Jika sudah, cek kembali apakah java berhasil di install
``` 
java --version
```

### Instalasi JDK (Windows)
1. Download file jdk nya **[disini](https://www.oracle.com/technetwork/java/javase/downloads/index.html)**
2. Install jdk nya seperti biasa dan pastikan file yang di install ada pada 
```
C:\Program Files\Java\jdk1.8.0_181
```
3. Masuk ke properties pada My Computer/ This PC
4. Masuk ke tab Advance
5. Lanjutkan ke Environment Variables...
6. Pada bagian system variables, cari variable PATH
7. Lalu Edit dan tambahkan direktori bin penginstallan file JDK sebelumnya 
```
C:\Program Files\Java\jdk1.8.0_181\bin
```
8. Run cmd kalian dan masukkan command untuk melihat versi dari jdk yang kalian install. Jika keluar versinya, maka step ini telah berhasil yaaay :smile:
```
javac -version
```

## IDE<a name="ide"></a>