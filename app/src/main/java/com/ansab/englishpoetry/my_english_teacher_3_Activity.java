package com.ansab.englishpoetry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;

public class my_english_teacher_3_Activity extends AppCompatActivity {

    private final String TAG = my_english_teacher_3_Activity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_english_teacher_3_);

        fb_banner_ad();
    }


    private void fb_banner_ad() {

        AudienceNetworkAds.initialize(this);

        final AdView adView = new AdView(my_english_teacher_3_Activity.this, this.getString
                (R.string.banner_ad), AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);
        adContainer.addView(adView);
        adView.loadAd();

        AdListener adListener = new AdListener() {
            @Override
            public void onError(Ad ad, AdError adError) {
                Log.e(TAG, "Fb failed :: " + adError.toString());
                adView.loadAd();
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.e(TAG, "onAdLoaded: ");

            }

            @Override
            public void onAdClicked(Ad ad) {

            }

            @Override
            public void onLoggingImpression(Ad ad) {

            }
        };


        AdView.AdViewLoadConfig loadAdConfig = adView.buildLoadAdConfig()
                .withAdListener(adListener)
                .build();
        adView.loadAd(loadAdConfig);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {


            case R.id.share_btn:





                String shereBoday = "Your Boday Here";

                Intent myintent = new Intent(Intent.ACTION_SEND);
                myintent.setType("text/plan");

                myintent.putExtra(Intent.EXTRA_SUBJECT, shereBoday);
                myintent.putExtra(Intent.EXTRA_TEXT,"  My English Teacher\n    " +
                        "          Poet: Mahin\n\n  "+




                                "How lucky we were to start our day,\n\n" +
                                "With laughs, love, and a lot of grace,\n\n" +
                                "She is modest, wise, honest, And brave,\n\n" +
                                "She will cheer you up when you just need a break\n\n" +

                                "Even when you have a bad day,\n\n" +
                                "She will pick you up and slap your face,\n\n" +
                                "Remind you of all the good things ahead,\n\n" +
                                "That your life is perfect in every aspect\n\n\n" +

                                "Her happiness is contagious,\n\n" +
                                "Her charisma is blinding,\n\n" +
                                "She is the best at advising\n\n" +
                                "No matter how much I struggled within,\n\n" +
                                "She taught me to keep on going,\n\n" +
                                "That life will always be this way,\n\n" +
                                "So you should just smile everyday\n\n" +
                                "With her we learnt,\n\n" +
                                "Like books, memories can not be burnt,\n\n" +
                                "You will not find a scaffold for them,\n\n" +
                                "So, it is better to learn to deal with them\n\n" +
                                "I will let you in on a secret to know,\n\n" +
                                "If you stay with her you will not be bored,\n\n" +
                                "Mess with her and you will not be cured,\n\n" +
                                "Together we have had so much fun,\n\n" +
                                "If you insult someone, get ready to run\n\n" +

                                "Now when we grow old (but not ill of course),\n\n" +
                                "We can still look back and feel you close,\n\n" +
                                "And remember all those inside jokes,\n\n" +
                                "with Chips, heroes, and the modern prose\n\n" +

                                "I have learnt to be humble,\n\n" +
                                "For in a universe so humongous,\n\n" +
                                "That could fit billions of stars,\n\n" +
                                "We are part of nothing but a single dot,\n\n" +

                                "She is got a lot to give,\n\n" +
                                "She is the teacher who inspired me to live\n\n");





                startActivity(Intent.createChooser(myintent, "Share Using"));

                break;
        }


        return super.onOptionsItemSelected(item);
    }

}
