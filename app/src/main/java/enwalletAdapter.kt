import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.enwallet.R

class enwalletAdapter(var transactionsactivity:List<ExpenditureOverView>): RecyclerView.Adapter<ActivityViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActivityViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.transactions,parent, false)
        return ActivityViewHolder(itemView)
        
    }

    override fun onBindViewHolder(holder: ActivityViewHolder, position: Int) {
        val blog = transactionsactivity[position]
        holder.tvSalary.text = blog.activity
        holder.tvDate.text = blog.date
        holder.tvAmount.text  = blog.amount

    }

    override fun getItemCount(): Int {
        return transactionsactivity.size
    }
}




class ActivityViewHolder(itemView: android.view.View) :RecyclerView.ViewHolder(itemView){
    val tvSalary: TextView = itemView.findViewById<TextView>(R.id.tvSalary)
    val tvDate: TextView = itemView.findViewById<TextView>(R.id.tvDate)
    val tvAmount: TextView = itemView.findViewById<TextView>(R.id.tvTotal)


}