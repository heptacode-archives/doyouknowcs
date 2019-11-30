package kim.hyunwoo.doyouknowcs;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ThirdFragment extends Fragment {
    TextView allergyInfo;

    public ThirdFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_third, container, false);
        allergyInfo = view.findViewById(R.id.allergyInfo);
        allergyInfo.setText("1. 난류\n2. 우유\n3. 메밀\n4. 땅콩\n5. 대두\n6. 밀\n7. 고등어\n8. 게\n9. 새우\n10. 돼지고기\n11. 복숭아\n12. 토마토\n13. 아황산염\n14. 호두\n15. 닭고기\n16. 쇠고기\n17. 오징어\n18. 조개류");
        return view;
    }

}
