package com.voitheia.view.task

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.voitheia.api.model.RequestDto
import com.voitheia.databinding.MyTaskDetailPageBinding
import com.voitheia.domain.task.RemoveMyTask

class MyTaskDetailFragment(val item: RequestDto) : DialogFragment() {

    private lateinit var binding: MyTaskDetailPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MyTaskDetailPageBinding.inflate(inflater)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        activity?.getPreferences(Context.MODE_PRIVATE)
        binding.myTaskTitleLabel.text = "Einkaufen für ${item.firstName}"
        binding.myTaskNameField.text = "${item.firstName} ${item.lastName}"
        binding.myTaskStreetField.text = "${item.street}"
        binding.myTaskDescriptionField.text = "${item.description}"

        binding.myTaskCloseTaskButton.setOnClickListener {
            RemoveMyTask().execute(item.id!!).subscribe()
        }
    }
}
