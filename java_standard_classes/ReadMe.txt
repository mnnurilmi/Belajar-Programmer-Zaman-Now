Java standard Classes
*************************************************
//String Class
    -toLowerCase()
    -toUpperCase()
    -length()
    -startsWith(value)
    -endsWith(value)
    -split(value)

//String Immutable
-StringBuffer vs StringBuilder
-String Buffer bersifat thread safe:
    -dapat diakses secara bersamaan
    -digunakan saat apliaksi pararel
    -Lebih lambat
    -kata kuncri "append()", "toString()"

-String Builder:
    -tidak disarankan untuk pararel
    -lebih cepat

//String Joiner
-adalah class yang digunakan untuk membuat 
    String sequence yang dipisahkan delimiter

//String Tokenizer Class
-digunakan untuk memotong string menjadi token yang lebih kecil
-mirip split namun bersifat lazy
-lazy artinya token akan diakses setelah token sebelumnya
-sedangkan, split akan memisahkan token dari semua kalimat

//Number class
-number class NON primitif memiliki parent class yang sama
-umumnya digunakan untuk konversi tipe dapat
    byteValue()
    doubleValue()
    floatValue()
    intValue()
    longValue()
-Konversi String e Number
    "parseXxx(String)"


//Math Class
-merupakan class utilities yang berisikan 
    banyak static method untuk operasi numerik
    "cos","sin","tan","min",dsb.

//Big Number Class
-digunakan saat membutuhkan data yang besar sekali
    BigInteger
    BigDecimal

//Scanner Class
-merupakan bagian Java IO

/Date and Calendar Class
-digunakan untuk mengakses representasi waktu dan tanggal
-Class Date presisinya milli second

//System Class
    getenv(key)
    exit(status)
    currentTimeMillis()
    nanoTime()
    gc()
    dsb.

//RunTime Class
-kita bisa melihat informasi environment tempat aplikasi java berjalan
-hal ini berjalan dalam class RunTime
    availableProcessors()
    freeMemory()
    totalMemory()
    maxMemory()
    gc()

//UUID Class
-saat membuat aplikasi kadang terapat kasus data unik
-java menyediakan class untuk membuat Universally Unique Identifier


//Base 64 Class
-digunakna untuk encoding
-adalah cara untuk meng-encode binary data ke text yang aman

//Objects Class
    *.toString()
    *.hashCode();
    *.equals();


//Random Class
-digunakan untuk mengenerate random number

//Properties Class
-aplikasi java umumnya memiliki file konfigurasi dalam bentuk properti files
-adalah file yang berisi key value yang dipisahkan dnegan "="
-digunakan untuk mengambil data di properties files

//Arrays Class
-digunakan untuk memanipulasi class Arrays
    binarySearch()
    copyOf()
    equals()
    sort()
    toString(array)

//Regular Expression
-adalah cara untuk melakukan pola pencarian
-biasanya digunakan pencarian string
- Pattern Class dan Matcher Class

//


