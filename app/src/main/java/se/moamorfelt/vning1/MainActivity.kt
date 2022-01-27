package se.moamorfelt.vning1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var minadapter = RowAdapter()
    var newrow = "Rad "
    var newnumber = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rowRecView = findViewById<RecyclerView>(R.id.rowRV)

        rowRecView.layoutManager = LinearLayoutManager(this)
        rowRecView.adapter = minadapter


        findViewById<Button>(R.id.rowButton).setOnClickListener {
            newnumber ++
            minadapter.nyrad.add(newrow + newnumber)

            minadapter.notifyDataSetChanged()
        }
    }
}