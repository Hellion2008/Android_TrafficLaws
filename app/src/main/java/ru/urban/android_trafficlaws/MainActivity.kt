package ru.urban.android_trafficlaws

import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var checkBox: CheckBox

    private lateinit var infoTextView: TextView
    private lateinit var lawsTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        infoTextView = findViewById(R.id.infoViewTV)
        lawsTextView = findViewById(R.id.lawsViewTV)

        checkBox = findViewById(R.id.checkBoxCB)

        checkBox.setOnCheckedChangeListener{button, isChecked ->
            if (isChecked){
                infoTextView.text = "Правила дорожного движения"
                lawsTextView.text = TrafficLaws().laws
            } else {
                infoTextView.text = "Информация"
                lawsTextView.setText("")
            }
        }
    }
}