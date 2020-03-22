package com.voitheia.view.task

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.voitheia.api.model.RequestDto
import com.voitheia.databinding.OpenTaskDetailPageBinding

class OpenTaskDetailFragment(item: RequestDto) : DialogFragment() {

    private lateinit var binding: OpenTaskDetailPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = OpenTaskDetailPageBinding.inflate(inflater)
        return binding.root
    }
}
