package kim.hyunwoo.doyouknowcs;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ViewPager pager;
    TabLayout tabLayout;
    MyPagerAdapter adapter;
    ArrayList<Fragment> list;

    int[] tabIcons = {
            R.drawable.ic_dashboard_black_24dp,
            R.drawable.ic_home_black_24dp,
            R.drawable.ic_launcher_background
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);
        pager = findViewById(R.id.pager);
        adapter = new MyPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        pager.setAdapter(adapter);
        tabLayout.setupWithViewPager(pager);

        setupTabIcons();

        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            tabLayout.getTabAt(i).setIcon(R.drawable.ic_dashboard_black_24dp);
        }
    }

    void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
    }

    class MyPagerAdapter extends FragmentPagerAdapter {
        String[] titles = new String[]{"오늘의 급식", "캘린더", "알레르기 유발식품"};

        public MyPagerAdapter(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
            list = new ArrayList<Fragment>();
            list.add(new FirstFragment());
            list.add(new SecondFragment());
            list.add(new ThirdFragment());
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return list.get(position);
        }

        @Override
        public int getCount() {
            return list.size();
        }
    }
}
