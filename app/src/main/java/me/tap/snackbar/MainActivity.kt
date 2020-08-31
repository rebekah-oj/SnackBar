package me.tap.snackbar

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showButton.setOnClickListener {
            val snackbar =
                Snackbar.make(rootLayout, "Welcome to android", Snackbar.LENGTH_INDEFINITE)
            snackbar.setAction("close", View.OnClickListener {
                snackbar.dismiss()
            })
            snackbar.setActionTextColor(ContextCompat.getColor(this, R.color.colorAccent))
            val view = snackbar.view
            val text = view.findViewById<TextView>(com.google.android.material.R.id.snackbar_text)
            text.setText(ContextCompat.getColor(this, R.color.colorPrimary))
            snackbar.show()
        }
    }
}