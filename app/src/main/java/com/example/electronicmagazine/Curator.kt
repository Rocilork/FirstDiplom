package com.example.electronicmagazine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import io.github.jan.supabase.gotrue.gotrue
import io.github.jan.supabase.gotrue.providers.builtin.Email
import kotlinx.coroutines.launch
import java.lang.Exception

class Curator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_curator)

        val button: Button = findViewById(R.id.buttonEnter)
        val log: EditText = findViewById(R.id.login)
        val pass: EditText = findViewById(R.id.password)
        val grup: EditText = findViewById(R.id.nameGrup)
        val pred: EditText = findViewById(R.id.namePred)

        button.setOnClickListener {
            val logA = log.text.toString()
            val passA = pass.text.toString()
            val grupA = grup.text.toString()
            val predA = pred.text.toString()
            val intent = Intent(this, CuratorMagazine::class.java)

            //Обработка на ошибку
            try {
                //Проверка на наличие симвоволов
                if(logA == "" || passA == "" || grupA == "" || predA == ""){
                    Toast.makeText(applicationContext, "Поля не все заполнены!", Toast.LENGTH_SHORT).show()
                } else if(logA.toBoolean() == logA.isEmailValid()){
                    Toast.makeText(applicationContext, "Почта некорректна!", Toast.LENGTH_SHORT).show()
                } //else if(passA == )
                else{
                    //Корутина
                    lifecycleScope.launch {
                        //Подключаем объект для запоминания сеанса пользователя после авторизации
                        SB.getClient().gotrue.loginWith(Email) {
                            email = logA
                            password = passA
                        }

                        val user = SB.getClient().gotrue.retrieveUserForCurrentSession(updateSession = true).id

                        Toast.makeText(applicationContext, "Преподаватель авторизован!", Toast.LENGTH_SHORT).show()
                        startActivity(intent)
                    }
                }
                //Если произошла ошибка
            } catch (e: Exception) {
                Log.e("!!!", e.message.toString())
            }
        }
    }
    //Функция для проверки на корректность введённой электронной почты
    fun String.isEmailValid(): Boolean {
        return !TextUtils.isEmpty(this) && android.util.Patterns.EMAIL_ADDRESS.matcher(this).matches()
    }
    fun onBack (view: View){
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}