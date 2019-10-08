# Loops

Sering kita membutuhkan suatu perintah yang di lakukan secara terus menerus. Misal cetak angka 1 sampai 5
```java
System.out.println(1);
System.out.println(2);
System.out.println(3);
System.out.println(4);
System.out.println(5);
```

Mungkin kalau perintahnya hanya sedikit, kita hanya perlu copy paste saja. Tapi bagaimana jika membutuhkan 100 kali perulangan atau bahkan lebih??

Di sini lah kita membutuhkan perintah *looping*. Di java terdapat 3 struktur looping
1. `for` : kondisi di cek sebelum perulangan. Tersedia pengaturan tambahan
2. `while` : kondisi di cek sebelum perulangan
3. `do while` : Kondisi di cek setelah perulangan

## `For`
for loop menjalankan perintah mencetak 1 sampai 5
```java
for (int i = 1; i <= 5; i++){
  System.out.println(i);
}
```

| Part   |      Code      |  Explanation |
|----------|:-------------:|------:|
| begin |  i = 1 | dieksekusi sekali ketika memasuki loop |
| condition |    i <= 5   | pengecekan sebelum melakukan perulangan |
| step | i++ | dieksekusi setelah perintah di dalam body for dijalankan, tapi sebelum pengecekan condition |
| body | System.out.println(i); | dijalankan berulang-ulang selama condition is true |

## `While`
Berikut seperti ini syntax nya
```java
while (condition){
  // code
  // so-called loop body
}
```
Kita implementasikan pada kasus diatas maka akan seperti ini
```java
int i = 1;

while (i <= 5){
  System.out.println(i);
  i++;
}
```

Sebelum memasuki perulangan, kondisi akan dicek terlebih dahulu. Jika kondisinya true, maka perintah di dalam while akan di eksekusi. Perulangan akan di hentikan jika kondisinya false

## `Do While`
```java
do {
  // your code in here
} while (condition)
```

```java
int i = 1;

do {
  System.out.println(i);
  i++;
} while (i <= 5)
```