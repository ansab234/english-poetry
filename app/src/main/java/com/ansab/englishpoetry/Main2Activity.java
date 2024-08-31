package com.ansab.englishpoetry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;

import static com.facebook.ads.CacheFlag.ALL;

public class Main2Activity extends AppCompatActivity {

    private final String TAG = Main2Activity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        fb_banner_ad();

    }

    private void fb_banner_ad() {

        AudienceNetworkAds.initialize(this);

        final AdView adView = new AdView(Main2Activity.this, this.getString
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

    private void fb_inter_ad() {
        AudienceNetworkAds.initialize(this);


        final InterstitialAd interstitialAd = new InterstitialAd
                (Main2Activity.this, this.getString(R.string.inter_ad));

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


    public void mix_poetry(View view) {
        Intent i = new Intent(Main2Activity.this, card_view_Activity.class);
        startActivity(i);
        fb_inter_ad();


    }

    public void love_poetry(View view) {

        Intent i = new Intent(Main2Activity.this, love_poetry_card_view.class);
        startActivity(i);
        fb_inter_ad();


    }

    public void sad_poetry(View view) {

        Intent i = new Intent(Main2Activity.this, sad_poetry_card_view.class);
        startActivity(i);
        fb_inter_ad();

    }

}