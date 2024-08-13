package prac08_22001816

object Q1 {

  val alphabet = 'A' to 'Z'

  def encrypt(shift: Int, text: String): String = {
    text.map { char =>
      if (char.isLetter) {
        val shiftedChar = alphabet((alphabet.indexOf(char.toUpper) + shift) % alphabet.size)
        if (char.isLower) shiftedChar.toLower else shiftedChar
      } else {
        char
      }
    }
  }

  def decrypt(shift: Int, text: String): String = {
    text.map { char =>
      if (char.isLetter) {
        val shiftedChar = alphabet((alphabet.indexOf(char.toUpper) - shift + alphabet.size) % alphabet.size)
        if (char.isLower) shiftedChar.toLower else shiftedChar
      } else {
        char
      }
    }
  }

  def cipher(func: (Int, String) => String, shift: Int, text: String): String = {
    func(shift, text)
  }

  def main(args: Array[String]): Unit = {
    val plaintext = "Hello, World!"
    val shift = 3

    val encryptedText = cipher(encrypt, shift, plaintext)
    println(s"Encrypted: $encryptedText")

    val decryptedText = cipher(decrypt, shift, encryptedText)
    println(s"Decrypted: $decryptedText")
  }
}

