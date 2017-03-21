package ww.com.wqlin.act;

import android.widget.ImageView;

import butterknife.Bind;
import ww.com.wqlin.BaseActivity;
import ww.com.wqlin.R;
import ww.com.wqlin.util.bitmap.BitmapUtils;

public class MainActivity extends BaseActivity {

    @Bind(R.id.imageView1)
    ImageView iv1;
    @Bind(R.id.imageView2)
    ImageView iv2;
    @Bind(R.id.imageView3)
    ImageView iv3;
    @Override
    protected void init() {
        setTitle("ImageLoader");
        BitmapUtils.getInstance(this).loadSampleImage("https://file.msh.chcts.com.cn/goods/cover/2016/12/06/upload_58466ee20cd70.jpg",iv1);
        BitmapUtils.getInstance(this).loadCircleImage("https://file.msh.chcts.com.cn/goods/cover/2016/12/06/upload_58466ee20cd70.jpg",iv2);
        BitmapUtils.getInstance(this).loadRoundBorderImage("https://file.msh.chcts.com.cn/goods/cover/2016/12/06/upload_58466ee20cd70.jpg",iv3,20);
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }

}
