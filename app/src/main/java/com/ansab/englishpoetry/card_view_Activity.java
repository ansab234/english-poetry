package com.ansab.englishpoetry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;

import static com.facebook.ads.CacheFlag.ALL;


public class card_view_Activity extends AppCompatActivity {
    private final String TAG = card_view_Activity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view_);


    }

    private void fb_inter_ad() {
        AudienceNetworkAds.initialize(this);


        final InterstitialAd interstitialAd = new InterstitialAd
                (card_view_Activity.this, this.getString(R.string.inter_ad));

        interstitialAd.loadAd();

        InterstitialAdListener interstitialAdListener = new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {

            }

            @Override
            public void onInterstitialDismissed(Ad ad) {

            }

            @Override
            public void onError(Ad ad, AdError adError) {
                Log.e(TAG, "Fb failed :: " + adError.toString());
                interstitialAd.loadAd();
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.e(TAG, "onAdLoaded: ");
                interstitialAd.show();
            }

            @Override
            public void onAdClicked(Ad ad) {

            }

            @Override
            public void onLoggingImpression(Ad ad) {

            }
        };


        interstitialAd.loadAd(interstitialAd.buildLoadAdConfig()
                .withAdListener(interstitialAdListener)
                .withCacheFlags(ALL)
                .build());

    }


    public void sometimes(View view) {


        Intent i = new Intent(card_view_Activity.this, sometimes_1_Activity.class);
        startActivity(i);
        fb_inter_ad();

    }

    public void world(View view) {

        Intent i = new Intent(card_view_Activity.this, world_2_Activity.class);
        startActivity(i);


    }


    public void the_english_teacher(View view) {


        Intent i = new Intent(card_view_Activity.this, my_english_teacher_3_Activity.class);
        startActivity(i);
        fb_inter_ad();
    }

    public void deeds(View view) {

        Intent i = new Intent(card_view_Activity.this, deeds_4_Activity.class);
        startActivity(i);

    }

    public void peace(View view) {

        Intent i = new Intent(card_view_Activity.this, peace_5_Activity.class);
        startActivity(i);

    }

    public void mydearwoman(View view) {

        Intent i = new Intent(card_view_Activity.this, my_dear_women_6_Activity.class);
        startActivity(i);


    }

    public void the_beauty_of_life(View view) {

        Intent i = new Intent(card_view_Activity.this, the_beauty_of_life_7_Activity.class);
        startActivity(i);

        fb_inter_ad();

    }

    public void in_my_life(View view) {


        Intent i = new Intent(card_view_Activity.this, im_my_life_8_Activity.class);
        startActivity(i);

    }

    public void ifeeleachtime(View view) {

        Intent i = new Intent(card_view_Activity.this, i_feel_each_time_9_Activity.class);
        startActivity(i);
        fb_inter_ad();

    }

    public void mydaughter(View view) {

        Intent i = new Intent(card_view_Activity.this, my_daughter_10_Activity.class);
        startActivity(i);

    }

    public void areuokay(View view) {

        Intent i = new Intent(card_view_Activity.this, are_u_okay_10_Activity.class);
        startActivity(i);

    }

    public void feelinglost(View view) {

        Intent i = new Intent(card_view_Activity.this, feeling_lost_12_Activity.class);
        startActivity(i);

    }

    public void imnomorehere(View view) {

        Intent i = new Intent(card_view_Activity.this, i_m_no_more_here_13_Activity.class);
        startActivity(i);


    }

    public void whenever(View view) {

        Intent i = new Intent(card_view_Activity.this, whenever_14_Activity.class);
        startActivity(i);

    }

    public void whenever_u_fall_in_love(View view) {

        Intent i = new Intent(card_view_Activity.this, when_u_fall_in_love_with_someone_15_Activity.class);
        startActivity(i);
        fb_inter_ad();

    }
}
