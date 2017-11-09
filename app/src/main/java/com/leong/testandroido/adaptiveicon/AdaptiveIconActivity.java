package com.leong.testandroido.adaptiveicon;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import com.leong.testandroido.R;

/**
 * Created by LeongAndroid on 2017/11/9.
 */

public class AdaptiveIconActivity extends AppCompatActivity {
    private static final String TAG = "AdaptiveIcon";
    private ImageView imageView = null;
    private ImageView imageView1 = null;
    String patch = "M50,0A50,50,0,0 1 100,50 L100,85 A15,15,0,0 1 85,100 L50,100 A50,50,0,0 1 50,0z";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adaptive_icon_layout);
        IconShapeOverrideHelper.apply(patch);
        imageView = (ImageView)this.findViewById(R.id.image);
        imageView1 = (ImageView)this.findViewById(R.id.image1);
        ///直接用标准接口获取图标
        Drawable drawable = IconShapeOverrideHelper.getAppIcon(getPackageManager(), "com.leong.testandroido");
        imageView.setImageDrawable(drawable);
        ///图标原始
        Bitmap bitmap = IconShapeOverrideHelper.getAppIcon2(getPackageManager(), "com.leong.testandroido");
        Log.d(TAG, "origin bitmap w = "+bitmap.getWidth()+", h = "+bitmap.getHeight());
        imageView1.setImageBitmap(bitmap);
    }

}
