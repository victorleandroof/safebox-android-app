package br.com.victor

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import com.github.paolorotolo.appintro.AppIntro
import com.github.paolorotolo.appintro.AppIntroFragment

class IntroActivity : AppIntro() {

    override fun onCreate(savedInstanceState: Bundle?) {
        //setContentView(R.layout.activity_intro)
        super.onCreate(savedInstanceState)
        addSlide(AppIntroFragment.newInstance("Lorem ipsun!!", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque id cursus dui.", R.drawable.ic_key_yellow, Color.parseColor("#1A5CD4")))
        addSlide(AppIntroFragment.newInstance("loren ipsun!!", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque id cursus dui", R.drawable.ic_key_yellow, Color.parseColor("#3E90BE")))
        // setFadeAnimation();
        setDepthAnimation()
        //        setFadeAnimation();
        //        setZoomAnimation();
        //        setFlowAnimation();
        //        setSlideOverAnimation();
    }

    override fun onSkipPressed(currentFragment: Fragment?) {
        super.onSkipPressed(currentFragment)
        val intent = Intent(this, Login::class.java)
        // start your next activity
        startActivity(intent)
    }

    override fun onDonePressed(currentFragment: Fragment?) {
        super.onDonePressed(currentFragment)
        val intent = Intent(this, Login::class.java)
        // start your next activity
        startActivity(intent)
    }

    override fun onSlideChanged(oldFragment: Fragment?, newFragment: Fragment?) {
        super.onSlideChanged(oldFragment, newFragment)
    }
}
