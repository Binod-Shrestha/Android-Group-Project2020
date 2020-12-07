package org.sheridancollege.expensetracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_expenditure.*
import org.sheridancollege.expensetracker.databinding.FragmentEarningsBinding
import org.sheridancollege.expensetracker.databinding.FragmentExpenditureBinding
import org.sheridancollege.expensetracker.ui.expense.ListItem
import org.sheridancollege.expensetracker.ui.expense.MyRecyclerView

class EarningsFragment: Fragment() {

    private lateinit var binding: FragmentEarningsBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEarningsBinding.inflate(layoutInflater)
        binding.fab.setOnClickListener{ view: View ->
            view.findNavController().navigate(R.id.action_addExpense_to_expenditureFragment)
        }

        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {



        var incomeList = generateIncomeList()


        recycleView.adapter = MyRecyclerView(incomeList)
        recycleView.layoutManager = LinearLayoutManager(this.context)
        recycleView.setHasFixedSize(true)
    }

    private fun generateIncomeList(): List<ListItem> {
        val list = ArrayList<ListItem>()
        list += ListItem("2020/12/06", "Payroll", 2500.00)
        list += ListItem("2020/12/04", "Benefits", 65.78)

        return list
    }
}