package com.example.mydls

import android.content.Context
import android.widget.Toast

class MyGDNToast {

  fun showMessage(context: Context) {
    Toast.makeText(context, "This is a message", Toast.LENGTH_SHORT).show()
  }

  fun showAnotherMessageWithText(message: String, context: Context) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
  }
}