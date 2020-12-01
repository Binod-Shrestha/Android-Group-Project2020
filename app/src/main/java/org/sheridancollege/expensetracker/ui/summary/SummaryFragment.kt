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
import androidx.navigation.findNavController


class SummaryFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {


        val binding = FragmentSummaryBinding.inflate(
                inflater, container, false)
        binding.btnCancel.setOnClickListener{view: View ->
            view.findNavController().navigate(R.id.action_summaryFragment_to_nav_home)
        }
      // getDate()
        return binding.root
        }



fun getDate(){
     lateinit var dataBinding: FragmentSummaryBinding
    val cal = Calendar.getInstance()
    val datePicker = dataBinding.datePicker
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