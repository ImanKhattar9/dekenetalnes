package com.iman.dekenetalnes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast


class Login : Fragment() {


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            arguments?.let {

            }
        }

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_login, container, false)
        }

        fun onMatch(view :View) {
            //2nd, id and password matching function
            val textId = view.findViewById<EditText>(R.id.editTextUserName)
            val textPass = view.findViewById<EditText>(R.id.editTextNumberPassword)

            if (textId.text.toString() == "admin" && textPass.text.toString() == "12345") {
           //     Toast.makeText(this, "Login Successfully." , Toast.LENGTH_LONG).show()
            }  else {
         //       Toast.makeText(this, "Login Failed" , Toast.LENGTH_LONG).show()
            }
        }
    }