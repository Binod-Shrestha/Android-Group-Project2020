package org.sheridancollege.expensetracker.ui.summary

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import org.sheridancollege.expensetracker.R
import org.sheridancollege.expensetracker.databinding.FragmentSummaryBinding
import java.util.*
import android.widget.*
import androidx.databinding.DataBindingUtil


class SummaryFragment : Fragment() {
    private lateinit var binding: FragmentSummaryBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        //TODO:
        //setSupportActionBar(findViewById(R.id.toolbar))
       // supportActionBar?.setDisplayHomeAsUpEnabled(true)
       // binding.btnCancel.setOnClickListener { view: View ->
       //     view.findNavController().navigate(R.id.action_summaryFragment_to_nav_home)
       // }
       // return binding.root
       //getDate()
        return inflater.inflate(R.layout.fragment_summary, container, false)
        }



fun getDate(){
    val cal = Calendar.getInstance()
    val datePicker = binding.datePicker
    datePicker.init(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH))
   // val year = today.get(Calendar.YEAR)
   // val month = today.get(Calendar.MONTH)
   // val day = today.get(Calendar.DAY_OF_MONTH)
    { View, year, monthOfYear, dayOfMonth ->
        val month = monthOfYear + 1
        val msg = "Selected Date is $dayOfMonth/$month/$year"
        Toast.makeText(activity, msg, Toast.LENGTH_SHORT).show()

    }
}

}