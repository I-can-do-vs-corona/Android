package com.voitheia.view.task.list

import android.content.Context
import android.widget.ArrayAdapter
import com.voitheia.api.model.RequestDto

class OpenTaskArrayAdapter(context: Context): ArrayAdapter<RequestDto>(context, android.R.layout.simple_list_item_1) {

}

class MyTaskArrayAdapter(context: Context): ArrayAdapter<RequestDto>(context, android.R.layout.simple_list_item_1)