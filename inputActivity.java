package org.androidtown.project;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class inputActivity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(false);

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }


    //모유 뷰
    public static class BreastmilkFragment extends Fragment {

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.breastmilk_input, container, false);
            TextView time = (TextView) view.findViewById(R.id.BMtime);
            time.setText(MainActivity.getTime());
            final EditText minute = (EditText)view.findViewById(R.id.BMminuteEdit);
            Button m5 = (Button)view.findViewById(R.id.BMm5);
            Button m1 = (Button)view.findViewById(R.id.BMm1);
            Button p5= (Button)view.findViewById(R.id.BMp5);
            Button p1= (Button)view.findViewById(R.id.BMp1);
            Button close = (Button)view.findViewById(R.id.BMclose);
            Button save = (Button)view.findViewById(R.id.BMsave);
            p5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(minute.getText().toString());
                    minute.setText(Integer.toString(m+5));
                }
            });
            p1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(minute.getText().toString());
                    minute.setText(Integer.toString(m+1));
                }
            });
            m5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(minute.getText().toString());
                    minute.setText(Integer.toString(m-5));
                }
            });
            m1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(minute.getText().toString());
                    minute.setText(Integer.toString(m-1));
                }
            });
            close.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //뒤로가기
            }
            });
            save.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //디비 저장
                }
            });

            return view;
        }

    }
    //분유 뷰
    public static class DrymilkFragment extends Fragment{
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.dry_input,container,false);
            TextView time = (TextView) view.findViewById(R.id.DFtime);
            time.setText(MainActivity.getTime());
            final EditText ml = (EditText)view.findViewById(R.id.DFmlEdit);
            Button m5 = (Button)view.findViewById(R.id.DFm5);
            Button m10 = (Button)view.findViewById(R.id.DFm10);
            Button m20 = (Button)view.findViewById(R.id.DFm20);
            Button p5 = (Button)view.findViewById(R.id.DFp5);
            Button p10 = (Button)view.findViewById(R.id.DFp10);
            Button p20 = (Button)view.findViewById(R.id.DFp20);
            Button close = (Button)view.findViewById(R.id.DFclose);
            Button save = (Button)view.findViewById(R.id.DFsave);

            p5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(ml.getText().toString());
                    ml.setText(Integer.toString(m+5));
                }
            });
            p10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(ml.getText().toString());
                    ml.setText(Integer.toString(m+10));
                }
            });
            p20.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(ml.getText().toString());
                    ml.setText(Integer.toString(m+20));
                }
            });
            m5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(ml.getText().toString());
                    ml.setText(Integer.toString(m-5));
                }
            });
            m10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(ml.getText().toString());
                    ml.setText(Integer.toString(m-10));
                }
            });
            m20.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(ml.getText().toString());
                    ml.setText(Integer.toString(m-20));
                }
            });
            close.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //뒤로가기
                }
            });
            save.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //디비 연동
                }
            });
            return view;
        }
    }
    //이유식 뷰
    public static class BabyfoodFragment extends Fragment{
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.babyfood_input,container,false);
            TextView time = (TextView) view.findViewById(R.id.BFtime);
            time.setText(MainActivity.getTime());
            final EditText ml = (EditText)view.findViewById(R.id.BFmlEdit);
            Button m5 = (Button)view.findViewById(R.id.BFm5);
            Button m10 = (Button)view.findViewById(R.id.BFm10);
            Button m20 = (Button)view.findViewById(R.id.BFm20);
            Button p5 = (Button)view.findViewById(R.id.BFp5);
            Button p10 = (Button)view.findViewById(R.id.BFp10);
            Button p20 = (Button)view.findViewById(R.id.BFp20);
            Button close = (Button)view.findViewById(R.id.BFclose);
            Button save = (Button)view.findViewById(R.id.BFsave);

            p5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(ml.getText().toString());
                    ml.setText(Integer.toString(m+5));
                }
            });
            p10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(ml.getText().toString());
                    ml.setText(Integer.toString(m+10));
                }
            });
            p20.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(ml.getText().toString());
                    ml.setText(Integer.toString(m+20));
                }
            });
            m5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(ml.getText().toString());
                    ml.setText(Integer.toString(m-5));
                }
            });
            m10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(ml.getText().toString());
                    ml.setText(Integer.toString(m-10));
                }
            });
            m20.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(ml.getText().toString());
                    ml.setText(Integer.toString(m-20));
                }
            });
            close.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //뒤로가기
                }
            });
            save.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //디비연동
                }
            });
            return view;
        }
    }
    //기저귀 뷰
    public static class DiaperFragment extends Fragment{
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            final View view = inflater.inflate(R.layout.diaper_input,container,false);
            TextView time = (TextView) view.findViewById(R.id.DPtime);
            time.setText(MainActivity.getTime());
            final RadioGroup rg = (RadioGroup)view.findViewById(R.id.DPrg);
            Button close = (Button)view.findViewById(R.id.DPclose);
            Button save = (Button)view.findViewById(R.id.DPsave);

            save.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    RadioButton rb = (RadioButton)view.findViewById(rg.getCheckedRadioButtonId());
                    String DPtype = rb.getText().toString();

                    /*디비 연동
                    ...
                    */
                    Toast.makeText(getContext(),DPtype,Toast.LENGTH_SHORT).show();
                }
            });
            close.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //뒤로가기
                }
            });

            return view;
        }
    }
    //수면 뷰
    public static class SleepFragment extends Fragment{
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.sleep_input,container,false);
            TextView time = (TextView) view.findViewById(R.id.Stime);
            time.setText(MainActivity.getTime());
            final EditText ml = (EditText)view.findViewById(R.id.SminuteEdit);
            Button m1 = (Button)view.findViewById(R.id.Sm1);
            Button m5 = (Button)view.findViewById(R.id.Sm5);
            Button m30 = (Button)view.findViewById(R.id.Sm30);
            Button p1 = (Button)view.findViewById(R.id.Sp1);
            Button p5 = (Button)view.findViewById(R.id.Sp5);
            Button p30 = (Button)view.findViewById(R.id.Sp30);
            Button close = (Button)view.findViewById(R.id.Sclose);
            Button save = (Button)view.findViewById(R.id.Ssave);

            p1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(ml.getText().toString());
                    ml.setText(Integer.toString(m+1));
                }
            });
            p5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(ml.getText().toString());
                    ml.setText(Integer.toString(m+5));
                }
            });
            p30.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(ml.getText().toString());
                    ml.setText(Integer.toString(m+30));
                }
            });
            m1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(ml.getText().toString());
                    ml.setText(Integer.toString(m-1));
                }
            });
            m5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(ml.getText().toString());
                    ml.setText(Integer.toString(m-5));
                }
            });
            m30.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(ml.getText().toString());
                    ml.setText(Integer.toString(m-30));
                }
            });
            close.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //뒤로가기
                }
            });
            save.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //디비연동
                }
            });
            return view;
        }
    }
    //유축수유 뷰
    public static class PumpMlikFragment extends Fragment{
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.pumpmilk_input,container,false);
            TextView time = (TextView) view.findViewById(R.id.PMtime);
            time.setText(MainActivity.getTime());
            final EditText ml = (EditText)view.findViewById(R.id.PMmlEdit);
            Button m5 = (Button)view.findViewById(R.id.PMm5);
            Button m10 = (Button)view.findViewById(R.id.PMm10);
            Button m20 = (Button)view.findViewById(R.id.PMm20);
            Button p5 = (Button)view.findViewById(R.id.PMp5);
            Button p10 = (Button)view.findViewById(R.id.PMp10);
            Button p20 = (Button)view.findViewById(R.id.PMp20);
            Button close = (Button)view.findViewById(R.id.Sclose);
            Button save = (Button)view.findViewById(R.id.Ssave);

            p5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(ml.getText().toString());
                    ml.setText(Integer.toString(m+5));
                }
            });
            p10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(ml.getText().toString());
                    ml.setText(Integer.toString(m+10));
                }
            });
            p20.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(ml.getText().toString());
                    ml.setText(Integer.toString(m+20));
                }
            });
            m5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(ml.getText().toString());
                    ml.setText(Integer.toString(m-5));
                }
            });
            m10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(ml.getText().toString());
                    ml.setText(Integer.toString(m-10));
                }
            });
            m20.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(ml.getText().toString());
                    ml.setText(Integer.toString(m-20));
                }
            });
            close.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //뒤로가기
                }
            });
            save.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //디비연동
                }
            });
            return view;
        }
    }
    // 유축 뷰
    public static class BreastpumpFragment extends Fragment{
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.breastpump_input,container,false);
            TextView time = (TextView) view.findViewById(R.id.BPtime);
            time.setText(MainActivity.getTime());
            final EditText ml = (EditText)view.findViewById(R.id.BPmlEdit);
            Button m5 = (Button)view.findViewById(R.id.BPm5);
            Button m10 = (Button)view.findViewById(R.id.BPm10);
            Button m20 = (Button)view.findViewById(R.id.BPm20);
            Button p5 = (Button)view.findViewById(R.id.BPp5);
            Button p10 = (Button)view.findViewById(R.id.BPp10);
            Button p20 = (Button)view.findViewById(R.id.BPp20);
            Button close = (Button)view.findViewById(R.id.Sclose);
            Button save = (Button)view.findViewById(R.id.Ssave);

            p5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(ml.getText().toString());
                    ml.setText(Integer.toString(m+5));
                }
            });
            p10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(ml.getText().toString());
                    ml.setText(Integer.toString(m+10));
                }
            });
            p20.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(ml.getText().toString());
                    ml.setText(Integer.toString(m+20));
                }
            });
            m5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(ml.getText().toString());
                    ml.setText(Integer.toString(m-5));
                }
            });
            m10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(ml.getText().toString());
                    ml.setText(Integer.toString(m-10));
                }
            });
            m20.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int m = Integer.parseInt(ml.getText().toString());
                    ml.setText(Integer.toString(m-20));
                }
            });
            close.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //뒤로가기
                }
            });
            save.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //디비연동
                }
            });
            return view;
        }
    }
    //목욕 뷰
    public static class BathFragment extends Fragment{
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.bath_input,container,false);
            TextView time = (TextView) view.findViewById(R.id.Btime);
            time.setText(MainActivity.getTime());
            return view;
        }
    }
    // 예방접종 뷰
    public static class VaccinFragment extends Fragment{
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.vaccin_input,container,false);
            TextView time = (TextView) view.findViewById(R.id.VacTime);
            time.setText(MainActivity.getTime());
            EditText edit = (EditText)view.findViewById(R.id.VacMEdit);
            return view;
        }
    }
    //기타 뷰
    public static class EctFragment extends Fragment{
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.ect_input,container,false);
            TextView time = (TextView) view.findViewById(R.id.ECTtime);
            time.setText(MainActivity.getTime());
            return view;
        }
    }


    //페이저 어댑터
    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            if(position==0)
                return new BreastmilkFragment();
            else if(position==1)
                return new DrymilkFragment();
            else if(position==2)
                return new BabyfoodFragment();
            else if(position==3)
                return new DiaperFragment();
            else if(position==4)
                return new SleepFragment();
            else if(position==5)
                return new PumpMlikFragment();
            else if(position==6)
                return  new BreastpumpFragment();
            else if(position==7)
                return new BathFragment();
            else if(position==8)
                return new VaccinFragment();
            else
                return new EctFragment();
        }

        @Override
        public int getCount() {
            return 10;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "모유";
                case 1:
                    return "분유";
                case 2:
                    return "이유식";
                case 3:
                    return "기저귀";
                case 4:
                    return "수면";
                case 5:
                    return "유축수유";
                case 6:
                    return "유축";
                case 7:
                    return "목욕";
                case 8:
                    return "예방접종";
                case 9:
                    return "기타";
            }
            return null;
        }
    }
}
