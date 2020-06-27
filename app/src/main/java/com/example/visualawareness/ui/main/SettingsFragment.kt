package com.example.visualawareness.ui.main

import android.os.Bundle
import android.util.Log
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.SeekBarPreference
import androidx.preference.SwitchPreferenceCompat
import com.example.visualawareness.R

class SettingsFragment : PreferenceFragmentCompat(){
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences, rootKey)


        val switchColour: SwitchPreferenceCompat? = findPreference("colourblindMode")
        switchColour?.setOnPreferenceChangeListener { preference: Preference?, newValue ->
            if (newValue as Boolean) {
                Log.e("hi", "you got it on bitch")
            } else {
                Log.e("hi", "you got it off bitch")
            }
            true
        }
        val distanceAlert: SeekBarPreference? = findPreference("alertDistance")
        distanceAlert?.setOnPreferenceChangeListener { preference: Preference?, newValue ->
            distanceAlert.min = 1
            System.out.println("value is $newValue")

            true
        }
    }}


