# Part 1 - Instalasi

Sebelum kita terjun bebas, siapin dulu parasutnya cuuy.. Pemrograman `Java` juga seperti itu looh. Sebelum kita memulai menjadi seorang java programmer, kita memerlukan tools atau alat yang di perlukan untuk menjalankan program `Java` itu sendiri. Tools yang di perlukan adalah :

- [JDK (Java Development Kit)](#jdk)
- [IDE (Integrated Development Environment)](#ide)


## JDK (Java Development Kit)<a name="jdk"></a>
JDK adalah Tools yang digunakan untuk mengembangkan dan menjalankan aplikasi `Java` pada sistem operasi Windows/Linux. Tanpa JDK, kita tidak bisa menjalankan (mengkompilasi) aplikasi `Java` dikomputer kita.

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


## IDE (Integrated Development Environment)<a name="ide"></a>
IDE adalah sebuah software untuk memudahkan programmer dalam menulis/membuat program. Seperti halnya kamu membutuhkan libre/office untuk menusun dokumen, kamu akan membutuhkan IDE ini untuk membuat program.

*Kenapa ga pakai notepad aja atau microsoft office aja?*

Banyak fitur yang disediakan oleh IDE, seperti `highlight` yang membuat kode kamu jadi lebih mudah dibaca, `debuging` memudahkan kamu mencari error, `auto complete` mempercepat kamu menulis kode, dll. 

Di luar sana ada banyak sekali IDE `Java` yang tersedia dari yang gratis hingga yang berbayar. Tapi disini kami merekomendasikan yang gratis aja yaa..
1. [Eclipse](https://www.eclipse.org/)
2. [Netbean](https://netbeans.org/)
3. [IntelliJ IDEA](https://www.jetbrains.com/idea/)
4. [Visual Studio Code](https://code.visualstudio.com/)

Kamu bisa pilih **salah satu** dari IDE di atas yang menurut kamu nyaman. Jika sudah di install IDE nya, **Mari kita berperaaaang..**

## Program JAVA **`#pertama`**
JDK nya sudah kalian install, berikutnya yuk kita mulai ngoding java.
1. Buka text editor pada komputer kamu, notepad(windows) / gedit(linux)
2. Tulis kode seperti dibawah, dan simpan dengan nama `Hello.java`
```java
class Hello{
  public static void main(String[] args) {
    System.out.println("Hello World")
  }
}
```
3. Buka terminal atau command promt, pindah ke direktori file java yang tadi kamu simpan
4. Compile program java yang tadi kamu buat
```
javac Hello.java
```
5. Jalankan program hasil compile yang tadi
```
java Hello
```
6. Jika berhasil, tampilannya akan seperti ini
```
Hello World
```

Selamat kamu sudah menjadi programmer java yeeeeeaaaaaay :smile: