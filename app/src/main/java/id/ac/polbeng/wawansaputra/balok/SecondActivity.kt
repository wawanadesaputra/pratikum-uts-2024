package id.ac.polbeng.wawansaputra.balok

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.wawansaputra.balok.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val volume = intent.getDoubleExtra("VOLUME", 0.0)
        binding.textViewResult.text = getString(R.string.hasil) + ": $volume"

        binding.buttonKembali.setOnClickListener {
            finish()
        }
    }
}
