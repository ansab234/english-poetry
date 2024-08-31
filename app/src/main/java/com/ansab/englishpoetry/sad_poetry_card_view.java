package com.ansab.englishpoetry;

import androidx.annotation.NonNull;
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

public class sad_poetry_card_view extends AppCompatActivity {

    private final String TAG = sad_poetry_card_view.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sad_poetry_card_view);

    }

    private void fb_inter_ad() {
        AudienceNetworkAds.initialize(this);


        final InterstitialAd interstitialAd = new InterstitialAd
                (sad_poetry_card_view.this, this.getString(R.string.inter_ad));

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


    public void lonelyinthecrowd(View view) {

        Intent i = new Intent(sad_poetry_card_view.this,sad_poetry_1.class);
        startActivity(i);
        fb_inter_ad();
    }

    public void notforme(View view) {

        Intent i = new Intent(sad_poetry_card_view.this,sad_poetry_2.class);
        startActivity(i);

    }

    public void doesanyonecare(View view) {

        Intent i = new Intent(sad_poetry_card_view.this,sad_poetry_3.class);
        startActivity(i);

    }

    public void tenreasonstome(View view) {
        Intent i = new Intent(sad_poetry_card_view.this,sad_poetry_4.class);
        startActivity(i);
        fb_inter_ad();

    }

    public void untilwemeetagainn(View view) {
        Intent i = new Intent(sad_poetry_card_view.this,sad_poetry_5.class);
        startActivity(i);


    }
}
