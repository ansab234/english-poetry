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

public class my_dear_women_6_Activity extends AppCompatActivity {
    private final String TAG = my_dear_women_6_Activity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_dear_women_6_);

        fb_banner_ad();
    }


    private void fb_banner_ad() {

        AudienceNetworkAds.initialize(this);

        final AdView adView = new AdView(my_dear_women_6_Activity.this, this.getString
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
                myintent.putExtra(Intent.EXTRA_TEXT, "  My Dear Woman\n    " +
                        "          Poet: Asma Tariq\n\n  " +

                        "Oh ,Dear woman\n\n" +
                        "You are precious\n\n" +
                        "More than the water,\n\n\n" +

                        "Your are younger\n\n" +
                        "More than the years\n\n\n" +

                        "You are beautiful\n\n" +
                        "More than the models,\n\n\n" +

                        "Your are brighter\n\n" +
                        "More than the Stars\n\n\n" +

                        "You are stronger\n\n" +
                        "More than the iron\n\n\n" +

                        "It is not your colour,\n\n" +
                        "Your skin, your complection\n\n" +
                        "Which makes you beautiful\n\n" +
                        "But your compassion and\n\n" +
                        "Gratitude with which you\n\n" +
                        "Deal with the world .\n\n\n" +

                        "It is not the dressing\n\n" +
                        "Not the jewels\n\n" +
                        "Not the diamonds\n\n" +
                        "Which makes you\n\n\n" +
                        "Powerful\n\n" +
                        "But your perseverance\n\n" +
                        "With which you tackle\n\n" +
                        "The situations of life ,\n\n\n" +

                        "Your are more than jewels\n\n" +
                        "You are more than complections\n\n" +
                        "Your are much beautiful\n\n" +
                        "With all imperfections\n\n" +
                        "You do not need to be perfect\n\n" +
                        "You are Okay,\n\n" +
                        "The way you are.\n\n\n" +

                        "And the people who finds\n\n" +
                        "You in skin, in dresses\n\n" +
                        "In jewels , In perfection\n\n" +
                        "Are not the true lovers\n\n" +
                        "But the disturbance of\n\n" +
                        "Your life ,\n\n" +
                        "Who are continually\n\n" +
                        "Creating mess in\n\n" +
                        "Your life.\n\n\n" +

                        "Your smile is more than\n\n" +
                        "The brightness of moon\n\n" +
                        "You are more colourful\n\n" +
                        "Than the flowers of Garden\n\n\n" +

                        "This World is nothing\n\n" +
                        "Without you\n\n" +
                        "You are more than\n\n" +
                        "The life.\n\n" +
                        "You are more than Diva\n\n");


                startActivity(Intent.createChooser(myintent, "Share Using"));

                break;
        }


        return super.onOptionsItemSelected(item);
    }


}
