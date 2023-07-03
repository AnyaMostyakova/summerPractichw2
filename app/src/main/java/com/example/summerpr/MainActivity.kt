package com.example.summerpr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var bottomNavigationView: BottomNavigationView
    val homeFragment = HomeFragment()
    val messageFragment = MessageFragment()
    val contactsFragment = ContactsFragment()
    val settingFragment = SettingFragment()
    val alarmFragment = AlarmFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottom_navigation)

        supportFragmentManager.beginTransaction().replace(R.id.container, HomeFragment())

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, homeFragment)
                    true
                }
                R.id.contacts -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, contactsFragment)
                    true
                }
                R.id.alarm -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, alarmFragment)
                    true
                }
                R.id.settings -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, settingFragment)
                    true
                }
                R.id.message -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, messageFragment)
                    true
                }

                else -> false
            }
        }
    }
}