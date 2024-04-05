package za.ac.iie.imadproject1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val search = findViewById<Button>(R.id.search)
        val infoText = findViewById<TextView>(R.id.infoText)
        val edAge = findViewById<EditText>(R.id.edAge)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            edAge.text.clear()
            infoText.text = ""
        }

        search.setOnClickListener {

            //Initialize message with a default value
            var message: String = ""

            var text : Int = edAge.text.toString().toInt()

            if (text in 20..46){
            message = "Freddie Mercury, born Farrokh Bulsara was a British singer songwriter who achieved worldwide fame as the lead vocalist and pianist of the rock band queen."

        } else if (text in 50..53){
            message ="Napoleon Bonaparte, born Napoleone di Buonaparte was a French emperor and military commander who rose to prominence during the French Revolution."

        } else if (text in 54..56){
            message ="Ken Block, was an American professional rally driver with the Hoonigan Racing Division, formerly known as the Monster World Rally Team."

        } else if (text in 57..60){
            message ="Diego Maradona, was an Argentine professional football player and manager, widely regarded as one of the greatest players of all time."

        } else if (text in 61..67){
            message ="Leonardo da Vinci, was an Italian polymath of the High Renaissance who was active as a painter, draughtsman, engineer, scientist, theorist, sculptor and architect."

        } else if (text in 68..74){
            message ="Muhammad Ali, was American professional boxer and activist, he was regarded as the one of the greatest boxers of the 20th century."

        } else if (text in 75..77){
            message ="Ferruccio Lamborghini, was an Italian automobile designer, soldier, inventor, mechanic,engineer, winemaker, industrialist, and businessman who created Lamborghini Trattori in 1948 and the Automobile Lamborghini in 1963."

        } else if (text in 78..85){
            message ="Thomas Edison, was an American inventor and businessman, he developed many devices in fields such as electric power generation, mass communication, sound recording and motion pictures."

        } else if (text in 86..87){
            message ="Nikola Tesla, was a Serbian-American inventor, electric engineer, mechanical engineer, and futurist."

        } else if (text in 88..100) {
            message ="Enzo Ferrari, was an Italian motor racing driver and entrepreneur, the founder of the Scuderia Ferrari Grand Prix motor racing team."
        } else {
            infoText.text = "Age is invalid."
            }
        }

         }
        }





        





