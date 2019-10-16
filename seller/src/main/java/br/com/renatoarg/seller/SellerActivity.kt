package br.com.renatoarg.seller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.renatoarg.common.CommonClass
import kotlinx.android.synthetic.main.activity_seller.*

class SellerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seller)
        tv_seller.text = CommonClass.getGreetings()
    }
}
