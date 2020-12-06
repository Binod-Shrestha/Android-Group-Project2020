package org.sheridancollege.expensetracker.ui.expense

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import org.sheridancollege.expensetracker.R
import org.sheridancollege.expensetracker.databinding.FragmentExpenditureBinding

class ExpenditureFragment : Fragment() {

    private lateinit var binding: FragmentExpenditureBinding
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentExpenditureBinding.inflate(layoutInflater)
        binding.fab.setOnClickListener{ view: View ->
            view.findNavController().navigate(R.id.action_expenditureFragment_to_addExpense)
        }

        setHasOptionsMenu(true)
        return binding.root
    }
}