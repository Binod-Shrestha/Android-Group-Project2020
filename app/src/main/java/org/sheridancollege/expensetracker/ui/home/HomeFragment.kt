package org.sheridancollege.expensetracker.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import org.sheridancollege.expensetracker.R
import org.sheridancollege.expensetracker.databinding.ActivityMainBinding
import org.sheridancollege.expensetracker.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

binding = FragmentHomeBinding.inflate(layoutInflater)

        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)


        binding.btnExpense.setOnClickListener{ view: View ->
            view.findNavController().navigate(R.id.action_nav_home_to_expenditureFragment)

        }
        binding.btnViewIncome.setOnClickListener{ view: View ->
            view.findNavController().navigate(R.id.action_nav_home_to_earningsFragment)

        }
        binding.btnViewSummary.setOnClickListener{ view: View ->
            view.findNavController().navigate(R.id.action_nav_home_to_summaryFragment)

        }
        setHasOptionsMenu(true)
        return binding.root
    }
}