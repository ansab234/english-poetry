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


public class love_poetry_card_view extends AppCompatActivity {

    private final String TAG = love_poetry_card_view.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love_poetry_card_view);


    }

    private void fb_inter_ad() {
        AudienceNetworkAds.initialize(this);


        final InterstitialAd interstitialAd = new InterstitialAd
                (love_poetry_card_view.this, this.getString(R.string.inter_ad));

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

    public void love_poetry_1(View view) {

        Intent i = new Intent(love_poetry_card_view.this, love_poetry_1.class);
        startActivity(i);
        fb_inter_ad();
    }

    public void untilwemeetagain(View view) {

        Intent i = new Intent(love_poetry_card_view.this, love_poetry_2.class);
        startActivity(i);

    }

    public void myonlylove(View view) {

        Intent i = new Intent(love_poetry_card_view.this, love_poetry_3.class);
        startActivity(i);
        fb_inter_ad();

    }

    public void aspecialworld(View view) {

        Intent i = new Intent(love_poetry_card_view.this, love_poetry_4.class);
        startActivity(i);

    }

    public void ifellinlove(View view) {

        Intent i = new Intent(love_poetry_card_view.this, love_poetry_5.class);
        startActivity(i);

    }

    public void uandme(View view) {

        Intent i = new Intent(love_poetry_card_view.this, love_poetry_6.class);
        startActivity(i);
        fb_inter_ad();

    }
}
