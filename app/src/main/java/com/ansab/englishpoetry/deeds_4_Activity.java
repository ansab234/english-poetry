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

public class deeds_4_Activity extends AppCompatActivity {
    private final String TAG = deeds_4_Activity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deeds_4_);

        fb_banner_ad();
    }

    private void fb_banner_ad() {

        AudienceNetworkAds.initialize(this);

        final AdView adView = new AdView(deeds_4_Activity.this, this.getString
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
                myintent.putExtra(Intent.EXTRA_TEXT,"  Deeds\n    " +
"          Poet: Hareem\n\n"+

    "             These people we try to please,\n\n"+
    "             These grades we try to achieve,\n\n"+
    "             With those dreams we sleep.\n\n"+
    "             Trying so hard to believe,\n\n"+
                        "        in the heroes we want to be.\n\n\n"+

                        "        These things will never satisfy you,\n\n"+
                        "        No matter how hard you try,\n\n"+
                        "        It will all leave.\n\n"+
                        "        Nothing good lasts forever.\n\n"+
                        "        Is not that what you believe?\n\n\n"+

                        "        What makes you happy,\n\n"+
                        "        Could it be the clapping?\n\n"+
                        "        Could it be the cheers?\n\n"+
                        "        Could it be the whooting?\n\n"+
                        "        Or the compliments you hear?\n\n\n"+

                        "         Will all those in the grave,\n\n"+
                        "         save you from your fate?\n\n"+
                        "         This desire to be successful,\n\n"+
                        "         that you hold on to for so long,\n\n"+
                        "         will it be there when this world is gone?\n\n\n"+

                        "     Patience.\n\n"+
                        "       Nothing matters my dear,\n\n"+
                        "       So do not waste your precious tears,\n\n"+
                        "       for the ending that you fear.\n\n\n"+

                        "       Nothing matters but your deeds,\n\n"+
                        "       That is what you should believe.\n\n");


                startActivity(Intent.createChooser(myintent, "Share Using"));

                break;
        }


        return super.onOptionsItemSelected(item);
    }



}
