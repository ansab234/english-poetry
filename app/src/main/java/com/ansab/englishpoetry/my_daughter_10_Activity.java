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

public class my_daughter_10_Activity extends AppCompatActivity {
    private final String TAG = my_daughter_10_Activity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_daughter_10_);

        fb_banner_ad();
    }

    private void fb_banner_ad() {

        AudienceNetworkAds.initialize(this);

        final AdView adView = new AdView(my_daughter_10_Activity.this, this.getString
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
                myintent.putExtra(Intent.EXTRA_TEXT,"  My Daughter\n    " +
                        "          Poet: Dr. Shakira Nandini\n\n  "+



                                "My sweetheart, my dear\n\n"+
                        "The affection my life\n\n"+
                        "I just need you to know\n\n"+
                        "That when I am battling\n\n"+
                        "Or on the other hand managing difficulty\n\n"+
                        "To you is the place I generally go\n\n"+
                        "At the point when inconvenience is approaching\n\n"+
                        "At the point when issues move close\n\n"+
                        "Simply realize that you'll generally be\n\n"+
                "The person who I swing to\n\n"+
                "The person who I call for\n\n"+
                "The one I pull nearest to me\n\n");


                startActivity(Intent.createChooser(myintent, "Share Using"));

                break;
        }


        return super.onOptionsItemSelected(item);
    }



}
