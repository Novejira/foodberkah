package feature.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.accessibility.AccessibilityEventCompat.setAction
import com.berkah.food.R
import com.berkah.food.databinding.ActivityMainBinding
import feature.adapter.CategoryAdapter
import feature.model.Category

class MainActivity : AppCompatActivity() {

    private val binding:ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)

    }
    private val adapterCategory = CategoryAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setListCategory()
        setAction()
    }

    private fun setListCategory() {
        val data = listOf(
            Category(image = R.drawable.img_ic_drink, name = "Drink"),
            Category(image = R.drawable.img_ic_noodle, name = "Noodle")
        )
        binding.rvCategory.apply {
            adapter = this@MainActivity.adapterCategory
        }
        adapterCategory.submitData(data)
    }

    private fun setAction() {
        binding.layoutHeader.ivProfile.setOnClickListener {
            Toast.makeText(this@MainActivity, "Aku manusia dan sudah login ", Toast.LENGTH_SHORT)
                .show()
        }
    }
}