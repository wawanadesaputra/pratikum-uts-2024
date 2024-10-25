package id.ac.polbeng.wawansaputra.balok

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.wawansaputra.balok.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHitung.setOnClickListener {
            val panjang = binding.editTextPanjang.text.toString().toDoubleOrNull()
            val lebar = binding.editTextLebar.text.toString().toDoubleOrNull()
            val tinggi = binding.editTextTinggi.text.toString().toDoubleOrNull()

            if (panjang != null && lebar != null && tinggi != null) {
                val volume = panjang * lebar * tinggi
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VOLUME", volume)
                startActivity(intent)
            }
        }
    }
}
