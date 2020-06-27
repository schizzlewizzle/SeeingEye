package com.example.visualawareness.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.visualawareness.R




class SectionsPagerAdapter(fm: FragmentManager, private var tabCount: Int) :
    FragmentPagerAdapter(fm) {
    override fun getPageTitle(position: Int): CharSequence? {
        return when (position){
            0 -> "Home"
            1 -> "Settings"
            else -> {return "home"
            }
        }
    }

    override fun getItem(position: Int): Fragment {

        when (position) {
            0 -> return mainFragment()
            1 -> return SettingsFragment()
            else -> return mainFragment()
        }

    }

    override fun getCount(): Int {
        return tabCount
    }
}