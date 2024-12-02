Merhaba herkese.
HashMap'in unicodelarını kendinizce değiştirebilirsiniz.
Eğer herhangi bir proje üzerinde çalışıyorsanız direkt olarak jar'ı library kısmından ekleyin.

``` 
import com.wupinq.Hasher

String encrypt = Hasher.EncryptString("Selam!");
String decrypted = Hasher.DecryptString(encrypted.toString());

```
