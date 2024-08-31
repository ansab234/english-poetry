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


public class the_beauty_of_life_7_Activity extends AppCompatActivity {
    private final String TAG = the_beauty_of_life_7_Activity.class.getSimpleName();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_beauty_of_life_7_);

            fb_banner_ad();
    }


    private void fb_banner_ad() {

        AudienceNetworkAds.initialize(this);

        final AdView adView = new AdView(the_beauty_of_life_7_Activity.this, this.getString
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
                myintent.putExtra(Intent.EXTRA_TEXT,"  The Beauty of Life\n    " +
                        "          Poet: Hareem\n\n  "+


                                "The beauty of life,\n\n"+
                        "lies in the ponds and streams,\n\n"+
                        "that you walk by while you day dream.\n\n"+
                        "It is in the chirping of every bird,\n\n"+
                        " in the clouds that form above,\n\n"+
                        "in the rain that cleanses the heart,\n\n"+
                        " and the people who make you laugh\n\n\n"+

                        "It is in the rain, the thunder, and the lightning bolt\n\n"+
                        "in the warmth of the Sun, and the winter cold\n\n"+
                        "in the darkness of the night, the howling of the wind\n\n"+
                        "in the dancing daffodils and the river is steady flow\n\n"+
                        "and the people who smile at you\n\n"+
                        "when you learn to let go\n\n\n"+

                        "It is in the trees that stand so tall,\n\n"+
                        "in the childish spirit that lightens the heart,\n\n"+
                        "in the songs our mothers sing,\n\n"+
                        "and the nostalgia memories bring\n\n\n"+

                        "It is in the gentle breeze and the starry sky,\n\n"+
                        "in the loud extroverts and the introverts who are shy,\n\n"+
                        "in the tears our fathers hide,\n\n"+
                        "And the struggle before every goodbye\n\n\n");


                startActivity(Intent.createChooser(myintent, "Share Using"));

                break;
        }


        return super.onOptionsItemSelected(item);
    }

}
