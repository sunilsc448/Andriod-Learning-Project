package adapters

import Utility.ViewHolderFactory
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlintutorial.R
import listeners.IClickListener
import pojos.Actor

class RecyclerViewAdapter(var mList:List<Any>?, val listener: IClickListener?):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun getItemViewType(position: Int): Int {
        if(mList == null)return -1
        return when (mList!![position]) {
            is Actor -> {
                R.layout.item_actor
            }else->{
                throw IllegalArgumentException("Layout is missing for the selection")
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val vh = ViewHolderFactory.getViewHolder(viewType, parent, listener)
        return vh
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        ViewHolderFactory.bindViewHolder(position, getItemViewType(position), holder, mList?.get(position))
    }

    override fun getItemCount() = mList?.size ?: 0

    fun updateData(list:List<Any>?){
        mList = list
    }
}