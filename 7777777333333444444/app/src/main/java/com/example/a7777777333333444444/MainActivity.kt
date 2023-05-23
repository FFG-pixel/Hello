package com.example.a7777777333333444444

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {

    lateinit var btn: Button
    lateinit var btn2: Button
    lateinit var btn3: Button
    lateinit var btn4: Button
    lateinit var btn5: Button
    lateinit var textView: TextView

    fun showToast(answer: String) {
        if (answer == o.get(questionNo)) {
            Toast.makeText(applicationContext, "CORRECT!", Toast.LENGTH_SHORT).show()
            updateQuestion() // вызов функции из этапа 5
        } else {
            Toast.makeText(applicationContext, "WRONGO!", Toast.LENGTH_SHORT).show()
            updateQuestion() // вызов функции из этапа 5
        }
    }

    val q = listOf<String>(
        "Какой самый главный герой в STARWARS?",
        "Как звали зелёного пришельца с длинными ушами?",
        "Как звали коричневого волосатого пришельца?",
        "Как звали маленького робота?",
        "Как звали большой грозный корабль врага"
    )
    val o = listOf<String>("Люк Скайуокер", "Йода", "Чубака", "Дроид", "Звезда смерти")
    val e = listOf<String>("Котёл", "Чупакабра", "Вапрол", "Лилия", "Звезда смерти")
    val r = listOf<String>("Люк Скайуокер", "Пришелец", "Кантата", "Прол", "Вапром")
    val t = listOf<String>("Медведь","Йода" , "Чубака", "Кедр", "Смит")
    val w = listOf<String>("Лоти", "Андроид", "Дрон","Дроид" , "Фикус")
    val y = listOf<String>("Звезда смерти", "Смерть пришла", "Космодром", "Звезда", "Металлолом")
    var questionNo = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.button)
        btn2 = findViewById(R.id.button2)
        btn3 = findViewById(R.id.button3)
        btn4 = findViewById(R.id.button4)
        btn5 = findViewById(R.id.button5)
        textView = findViewById(R.id.textView)
        textView.setText(q.get(questionNo))
        btn.setText(e.get(questionNo))
        btn2.setText(r.get(questionNo))
        btn3.setText(t.get(questionNo))
        btn4.setText(w.get(questionNo))
        btn5.setText(y.get(questionNo))

        btn.setOnClickListener {
            showToast(btn.text.toString())
        }
        btn2.setOnClickListener {
            showToast(btn2.text.toString())
        }
        btn3.setOnClickListener {
            showToast(btn3.text.toString())
        }
        btn4.setOnClickListener {
            showToast(btn4.text.toString())
        }
        btn5.setOnClickListener {
            showToast(btn5.text.toString())
        }


    }

    fun updateQuestion() {
        questionNo = questionNo + 1
        textView.setText(q.get(questionNo))
        btn.setText(e.get(questionNo))
        btn2.setText(r.get(questionNo))
        btn3.setText(t.get(questionNo))
        btn4.setText(w.get(questionNo))
        btn5.setText(y.get(questionNo))

    }
}






