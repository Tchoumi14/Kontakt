package e.brice.kontakt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myBtn = findViewById<Button>(R.id.myBtn)
        val myTxt = findViewById<TextView>(R.id.myTextView)

        val myBtn1 = findViewById<Button>(R.id.myBtn1)
        val myBtn2 = findViewById<Button>(R.id.myBtn2)


        myBtn.setOnClickListener{
            //display Toast
            Toast.makeText(this,"Button is cliked", Toast.LENGTH_LONG).show();
            // change text of textview
            //  myTxt.text = "Text is changed on button click... "
            val intent = Intent(this, Main3Activity::class.java)
            startActivity(intent)
        }

        myBtn1.setOnClickListener{
            val intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)

        }
        myBtn2.setOnClickListener {
            val intent = Intent(this, Main4Activity::class.java)
            startActivity(intent)
        }
    }
}
