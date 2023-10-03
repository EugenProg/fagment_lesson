package kz.just_code.fragmentslesson

import androidx.navigation.fragment.findNavController
import kz.just_code.fragmentslesson.base.BaseFragment
import kz.just_code.fragmentslesson.databinding.FragmentMainBinding

class MainFragment : BaseFragment<FragmentMainBinding>(FragmentMainBinding::inflate) {

    override fun onBindView() {
        super.onBindView()
        binding.titleView.setOnClickListener {
            // navigate(SecondFragment().javaClass)
            findNavController().navigate(
                MainFragmentDirections
                    .actionMainFragmentToSecondFragment("Hello second fragment")
            )
        }
    }
}