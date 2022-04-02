package com.example.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val contactObjects = mutableListOf<MyContacts>()
        contactObjects.add(MyContacts("Ali Haider","03081195231"))
        contactObjects.add(MyContacts("Mohsin Hassan","03467381231"))
        contactObjects.add(MyContacts("Waseem Attari","03415715231"))
        contactObjects.add(MyContacts("Talha Attari","03086745234"))
        contactObjects.add(MyContacts("Nasir","03447740035"))
        contactObjects.add(MyContacts("Ali Asghar","03467381231"))
        contactObjects.add(MyContacts("Ali Akbar","03447740035"))
        contactObjects.add(MyContacts("Hassan Ali","03456789098"))
        contactObjects.add(MyContacts("Bilal","03467381231"))
        contactObjects.add(MyContacts("Yasir","03456789098"))

        //val contactName = listOf<String>("Ali Haider","Mohsin Hassan","Waseem Attari","Talha Attari","Nasir","Ali Asghar","Ali Akbar","Hassan Ali","Yasir","Bilal")
      //  val contactNumber = listOf<String>("03081195231","03467381231","03415715231","03086745234","03447740035","03456745354","03456789098","03467773962","03455234243","03097519456")
        contactList.adapter = MyAdapter(contactObjects)
        contactList.layoutManager = LinearLayoutManager(this)
    }
}