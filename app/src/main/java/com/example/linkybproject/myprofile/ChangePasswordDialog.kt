package com.example.linkybproject.myprofile

import android.app.Dialog
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.linkybproject.databinding.DialogPasswordChangeBinding

class ChangePasswordDialog(private val context: AppCompatActivity) {
    private lateinit var binding: DialogPasswordChangeBinding
    private val dlg = Dialog(context)

    fun Mydlg() {
        binding = DialogPasswordChangeBinding.inflate(context.layoutInflater)
        dlg.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dlg.setContentView(binding.root)
        dlg.window!!.setLayout(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT)
        dlg.setCancelable(false)

        binding.btnClose.setOnClickListener {
            dlg.dismiss()
        }

        dlg.show()
    }

}