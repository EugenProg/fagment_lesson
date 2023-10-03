package kz.just_code.fragmentslesson

import androidx.navigation.fragment.navArgs
import kz.just_code.fragmentslesson.base.BaseFragment
import kz.just_code.fragmentslesson.databinding.FragmentMainBinding

class SecondFragment : BaseFragment<FragmentMainBinding>(FragmentMainBinding::inflate) {
    private val args: SecondFragmentArgs by navArgs()

    override fun onBindView() {
        super.onBindView()
        binding.titleView.text = args.name
    }
}