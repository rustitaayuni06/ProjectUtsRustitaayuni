package id.ac.polbeng.rustitaayuni.projectutsrustitaayuni.ui

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import id.ac.polbeng.rustitaayuni.projectutsrustitaayuni.ui.about.AboutFragment
import id.ac.polbeng.rustitaayuni.projectutsrustitaayuni.ui.dashboard.DashboardFragment

class SectionsPagerAdapter(activity: AppCompatActivity) :
    FragmentStateAdapter(activity) {

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> DashboardFragment()
            1 -> AboutFragment()
            else -> throw IllegalArgumentException(
                "Posisi halaman tidak valid: $position"
            )
        }
    }

    override fun getItemCount(): Int {
        return 2
    }
}