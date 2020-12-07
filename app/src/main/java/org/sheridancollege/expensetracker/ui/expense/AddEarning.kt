package org.sheridancollege.expensetracker.ui.expense

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.sheridancollege.expensetracker.databinding.FragmentAddEarningBinding

class AddEarning : Fragment() {

    private lateinit var binding: FragmentAddEarningBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddEarningBinding.inflate(layoutInflater)


        setHasOptionsMenu(true)
        return binding.root
    }
}