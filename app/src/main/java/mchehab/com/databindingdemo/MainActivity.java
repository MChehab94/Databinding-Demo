package mchehab.com.databindingdemo;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import mchehab.com.databindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        final Person person = new Person("Mohamad", "Chehab", "https://www.w3schools" +
                ".com/w3css/img_lights.jpg", 23);
        binding.setPerson(person);
    }
}