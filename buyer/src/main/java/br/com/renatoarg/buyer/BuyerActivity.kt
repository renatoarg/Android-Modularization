package br.com.renatoarg.buyer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.renatoarg.common.CommonClass
import kotlinx.android.synthetic.main.activity_buyer.*

class BuyerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buyer)

        tv_buyer.text = CommonClass.getGreetings()
    }
}
