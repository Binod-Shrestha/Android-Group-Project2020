package org.sheridancollege.expensetracker.ui.expense

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.expense_item.*
import kotlinx.android.synthetic.main.expense_item.view.*
import kotlinx.android.synthetic.main.fragment_expenditure.*
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {



        var expenseList = generateExpensesList()


        recycleView.adapter = MyRecyclerView(expenseList)
        recycleView.layoutManager = LinearLayoutManager(this.context)
        recycleView.setHasFixedSize(true)
    }

    private fun generateExpensesList(): List<ListItem> {
        val list = ArrayList<ListItem>()
        list += ListItem("2020/12/06", "Grocery", 156.55)
        list += ListItem("2020/12/04", "Stationery", 45.99)

        return list
    }
}