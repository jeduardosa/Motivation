package learn.project.motivation.ui

import android.graphics.Color
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import learn.project.motivation.infra.MotivationConstants
import learn.project.motivation.R
import learn.project.motivation.infra.SecurityPreferences
import learn.project.motivation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    private var categoryId = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Esconde barra de navegação
           supportActionBar?.hide()
           handUserName()
            handleFilter(R.id.image_all)

        //Eventos
        binding.buttonNewPhrase.setOnClickListener(this)
        binding.imageAll.setOnClickListener(this)
        binding.imageHappy.setOnClickListener(this)
        binding.imageSunny.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        if (view!!.id == R.id.button_new_phrase){
            var s = ""
        } else if (view.id in listOf(R.id.image_all, R.id.image_happy, R.id.image_sunny)){
            handleFilter(view.id)
        }
    }

    private fun handleFilter(id: Int) {
        binding.imageAll.setColorFilter(R.color.dark_purple, PorterDuff.Mode.SRC_IN)
        binding.imageHappy.setColorFilter(R.color.dark_purple, PorterDuff.Mode.SRC_IN)
        binding.imageSunny.setColorFilter(R.color.dark_purple, PorterDuff.Mode.SRC_IN)



        when (id) {
            R.id.image_all -> {
                binding.imageAll.setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_IN)
                categoryId = MotivationConstants.FILTER.ALL
            }
            R.id.image_happy -> {
                binding.imageHappy.setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_IN)
                categoryId = MotivationConstants.FILTER.HAPPY
            }
            R.id.image_sunny -> {
                binding.imageSunny.setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_IN)
                categoryId = MotivationConstants.FILTER.SUNNY
            }
        }
    }

    private fun handUserName() {
        val name = SecurityPreferences(this).getString(MotivationConstants.KEY.USER_NAME)
        binding.textUserName.text = "Olá, $name!"
    }
}