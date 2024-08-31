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


public class peace_5_Activity extends AppCompatActivity {
    private final String TAG = peace_5_Activity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peace_5_);

        fb_banner_ad();
    }


    private void fb_banner_ad() {

        AudienceNetworkAds.initialize(this);

        final AdView adView = new AdView(peace_5_Activity.this, this.getString
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
                myintent.putExtra(Intent.EXTRA_TEXT, "  Deeds\n    " +
                        "          Poet: Mubina\n\n  " +

                        "            Give peace a chance\n\n" +
                        "    Give sanity a glance\n\n" +
                        "    Many will try to plea\n\n" +
                        "    No one will stare in glee\n\n\n" +

                        "    Give peace a chance\n\n" +
                        "    Give sanity a glance\n\n" +
                        "    Many will fight their fears\n\n" +
                        "    No one will refuse the tears\n\n\n" +

                        "    Peace should be rejoiced\n\n" +
                        "    Hate should be denounced\n\n" +
                        "    Peace should be enjoyed\n\n" +
                        "    Sanity should be announced\n\n\n" +

                        "    Give peace a chance\n\n" +
                        "    Give sanity a glance\n\n" +
                        "    Walls are meant for safety\n\n" +
                        "    Choices can not be so hasty\n\n\n" +

                        "    Give peace a chance\n\n" +
                        "    Give sanity a glance\n\n" +
                        "    Wise words enact as gold\n\n" +
                        "    Spirituality is the only mode\n\n");


                startActivity(Intent.createChooser(myintent, "Share Using"));

                break;
        }


        return super.onOptionsItemSelected(item);
    }


}
