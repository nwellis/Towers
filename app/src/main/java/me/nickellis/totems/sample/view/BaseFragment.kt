package me.nickellis.totems.sample.view

import androidx.fragment.app.Fragment
import me.nickellis.totems.sample.BaseActivity


abstract class BaseFragment : Fragment() {

  val baseActivity: BaseActivity? get() = (activity as? BaseActivity)

}