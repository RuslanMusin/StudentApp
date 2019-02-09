package com.example.studentapp.ui.test.ui

import android.os.Bundle
import android.R.attr.fragment
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.example.studentapp.R
import com.example.studentapp.ui.test.structure.presenter.MyPresenter
import javax.inject.Inject
import com.example.studentapp.ui.test.structure.presenter.MyView
import com.example.studentapp.ui.base.BaseFragment


class MyFragment : BaseFragment(), MyView {
    override fun onResult(result: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    /* @Inject
     lateinit var presenter: MyPresenter

     private var text: TextView? = null

     var someId: Int = 0

     override fun onCreate(savedInstanceState: Bundle?) {
         someId = arguments!!.getInt(ID_KEY)
         super.onCreate(savedInstanceState)
     }


     override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
         return inflater.inflate(R.layout.fragment, container, false)

     }

     override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
         super.onViewCreated(view, savedInstanceState)
         text = view.findViewById(R.id.text)
         presenter!!.doSometing()

     }

     override fun onResult(result: String) {
         text!!.text = result
     }

     companion object {
         private val ID_KEY = "ID"


         fun create(id: Int): MyFragment {
             val myFragment = MyFragment()
             val args = Bundle()
             args.putInt(ID_KEY, id)
             myFragment.arguments = args
             return myFragment
         }
     }*/
}