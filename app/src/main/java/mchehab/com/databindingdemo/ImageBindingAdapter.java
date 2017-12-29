package mchehab.com.databindingdemo;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by muhammadchehab on 12/29/17.
 */

public class ImageBindingAdapter {
    @BindingAdapter({"bind:imageURL"})
    public static void loadImage(ImageView imageView, String url){
        Picasso.with(imageView.getContext()).load(url).into(imageView);
    }
}