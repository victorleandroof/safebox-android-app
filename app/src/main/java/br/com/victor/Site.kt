package br.com.victor


import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import kotlinx.android.synthetic.main.activity_site.*

class Site : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater!!.inflate(R.layout.activity_site, container,false)
        var listView = view.findViewById<View>(R.id.listview) as ListView
        var inflater = LayoutInflater.from(activity)
        val customAdptor = CustomAdptor(inflater)
        listView.adapter=customAdptor
        var fcbBtn = view.findViewById<FloatingActionButton>(R.id.fcb)
        fcbBtn.setOnClickListener{
            val intent = Intent(context, NewSite::class.java)
            // start your next activity
            startActivity(intent)
        }
        return view
    }
}



class CustomAdptor(private val inflater: LayoutInflater): BaseAdapter() {
    //Array of fruits names
    var names = arrayOf("Facebook", "Twitter", "Facebook", "Youtube","Brazzers","ABCD")
    //Array of fruits desc
    var desc = arrayOf("samuellv010@hotmail.com", "samuellv010@hotmail.com", "caa@aa.com", "aaa@com.br","aa@aa.com","aa@aa.com")
    //Array of fruits images
    var image = intArrayOf(R.drawable.ic_key_yellow, R.drawable.ic_key_yellow, R.drawable.ic_key_yellow, R.drawable.ic_key_yellow, R.drawable.ic_key_yellow, R.drawable.ic_key_yellow)
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view1: View = inflater!!.inflate(R.layout.row_data,null)
        val fimage = view1.findViewById<View>(R.id.fImage) as ImageView
        var fName = view1.findViewById<View>(R.id.fname) as TextView
        var fDesc = view1.findViewById<View>(R.id.fdesc) as TextView
        fimage.setImageResource(image[p0])
        fName.setText(names[p0])
        fDesc.setText(desc[p0])
        return view1
    }

    override fun getItem(p0: Int): Any {
        return image[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return image.size
    }

}

