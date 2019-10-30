package com.example.aboutme

import android.content.Context
import androidx.databinding.DataBindingUtil
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    private lateinit var binding: ActivityMainBinding
    private lateinit var binding: ActivityMainBinding

    // Instance of MyName data class.
    private val myName: MyName = MyName("Small Bang Bang")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.myName = myName

//        findViewById<Button>(R.id.done_button).setOnClickListener {
////            set done button to invisible
//            addNickname(it)
//        }
        binding.doneButton.setOnClickListener{
            addNickname(it)
        }
    }

    private fun addNickname(view: View) {
//        val editText = findViewById<EditText>(R.id.nickname_edit)
//        val nicknameText = findViewById<TextView>(R.id.nickname_text)
//
//        nicknameText.text = editText.text
//        editText.visibility = View.GONE
//        view.visibility = View.GONE //view button gone
//        nicknameText.visibility = View.VISIBLE

        binding.apply{
//            nickname_text.text = binding.nicknameEdit.text
            myName?.nickname = nicknameEdit.text.toString()
            // Invalidate all binding expressions and request a new rebind to refresh UI
            invalidateAll()
            nickname_edit.visibility = View.GONE
            done_button.visibility = View.GONE //view button gone
            nickname_text.visibility = View.VISIBLE
        }

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}

data class MyName(var name: String = "", var nickname: String = "")
