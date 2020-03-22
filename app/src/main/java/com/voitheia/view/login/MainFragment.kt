package com.voitheia.view.login

import android.annotation.SuppressLint
import android.content.Context.LOCATION_SERVICE
import android.location.LocationManager
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import com.voitheia.MainActivity
import com.voitheia.databinding.MainPageBinding
import com.voitheia.domain.task.GetAllOpenTasks
import com.voitheia.domain.task.GetMyTasks
import com.voitheia.view.task.CreateTaskFromFragment
import com.voitheia.view.task.MyTaskDetailFragment
import com.voitheia.view.task.OpenTaskDetailFragment
import com.voitheia.view.task.list.MyTaskArrayAdapter
import com.voitheia.view.task.list.OpenTaskArrayAdapter
import java.util.logging.Logger

class MainFragment : Fragment() {

    private val logger = Logger.getGlobal()

    private lateinit var binding: MainPageBinding
    private lateinit var openTaskArrayListAdapter: OpenTaskArrayAdapter
    private lateinit var myTaskArrayListAdapter: MyTaskArrayAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MainPageBinding.inflate(inflater)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        showActionBar()
        configMyTaskListView()
        configOpenTaskListView()
        binding.mainCreateNewTaskButton.setOnClickListener {
            CreateTaskFromFragment().show((activity as? MainActivity)?.supportFragmentManager, null)
        }
    }

    fun configMyTaskListView() {
        myTaskArrayListAdapter = MyTaskArrayAdapter(context!!)
        binding.mainMyTasksList.adapter = myTaskArrayListAdapter
        GetMyTasks().execute().subscribe {
            myTaskArrayListAdapter.addAll(it.toList())
            myTaskArrayListAdapter.notifyDataSetChanged()
        }
        binding.mainMyTasksListRefresher.setOnRefreshListener {
            GetMyTasks().execute().subscribe {
                myTaskArrayListAdapter.clear()
                myTaskArrayListAdapter.addAll(it.toList())
                myTaskArrayListAdapter.notifyDataSetChanged()
                binding.mainMyTasksListRefresher.isRefreshing = false
            }
        }
        val onNewClickListener = object:AdapterView.OnItemClickListener {
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                MyTaskDetailFragment(myTaskArrayListAdapter.getItem(position)!!).show((activity as? MainActivity)?.supportFragmentManager, null)
            }
        }
        binding.mainMyTasksList.onItemClickListener = onNewClickListener
    }

    @SuppressLint("ServiceCast")
    fun configOpenTaskListView() {
        openTaskArrayListAdapter = OpenTaskArrayAdapter(context!!)
        binding.mainOpenTasksList.adapter = myTaskArrayListAdapter
        GetAllOpenTasks().execute(context!!.getSystemService(LOCATION_SERVICE) as LocationManager).subscribe { value ->
            openTaskArrayListAdapter.clear()
            openTaskArrayListAdapter.addAll(value.toList())
            openTaskArrayListAdapter.notifyDataSetChanged()
        }
        binding.mainOpenTasksListRefresher.setOnRefreshListener {
            GetAllOpenTasks().execute(context!!.getSystemService(LOCATION_SERVICE) as LocationManager).subscribe { value ->
            openTaskArrayListAdapter.clear()
                openTaskArrayListAdapter.addAll(value.toList())
                openTaskArrayListAdapter.notifyDataSetChanged()
                binding.mainOpenTasksListRefresher.isRefreshing = false
            }
        }
        val onNewClickListener = object:AdapterView.OnItemClickListener {
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                OpenTaskDetailFragment(myTaskArrayListAdapter.getItem(position)!!).show((activity as? MainActivity)?.supportFragmentManager, null)
            }
        }
        binding.mainOpenTasksList.onItemClickListener = onNewClickListener
    }

    fun hideActionBar() {
        (activity as? MainActivity)?.supportActionBar?.hide()
    }

    fun showActionBar() {
        (activity as? MainActivity)?.supportActionBar?.show()
    }
}
