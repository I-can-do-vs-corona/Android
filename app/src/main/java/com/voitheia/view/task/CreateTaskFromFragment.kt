package com.voitheia.view.task

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import com.voitheia.MainActivity
import com.voitheia.R
import com.voitheia.api.model.CreateRequestDto
import com.voitheia.api.model.RequestType
import com.voitheia.databinding.CreateTaskFormPageBinding
import com.voitheia.domain.task.CreateTask
import com.voitheia.domain.task.TaskTyp

/**
 * A simple [Fragment] subclass.
 * Use the [CreateTaskFromFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CreateTaskFromFragment : DialogFragment() {

    private lateinit var binding: CreateTaskFormPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = CreateTaskFormPageBinding.inflate(inflater)
        val arrayAdapter = ArrayAdapter<TaskTyp>(context!!, android.R.layout.simple_spinner_item)
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        arrayAdapter.addAll(TaskTyp.values().toList())
        binding.createTaskDropDown.adapter = arrayAdapter
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        val mapper = CreateRequestDtoMapper()
        binding.createTaskSendButton.setOnClickListener {
            CreateTask().execute(mapper.transform(getSelectedItemFromDropDown(), binding.createTaskDescriptionField.text.toString()))
                .subscribe {
                    dismiss()
                }
        }
    }

    private fun getSelectedItemFromDropDown(): TaskTyp {
        return TaskTyp.values()[binding.createTaskDropDown.selectedItemPosition]
    }
}

private class CreateRequestDtoMapper {

    fun transform(taskTyp: TaskTyp, description: String): CreateRequestDto {
        return CreateRequestDto(mapTaskTyp(taskTyp), "Müller", "Peter", "IvsCorona@jambit.com", "asdf", "Klostergasse 3", "04109", "Leipzig", description)
    }

    private fun mapTaskTyp(taskTyp: TaskTyp): RequestType {
        return when(taskTyp) {
            TaskTyp.Childcare -> RequestType.childcare
            TaskTyp.Medical -> RequestType.medical
            TaskTyp.Other -> RequestType.other
            TaskTyp.Petcare -> RequestType.petcare
            TaskTyp.Shopping -> RequestType.shopping
        }
    }
}
