package com.meroapps.samplegame;

import com.meroapps.framework.Screen;
import com.meroapps.framework.implementation.AndroidGame;

public class SampleGame extends AndroidGame {
    @Override
    public Screen getInitScreen() {
        return new LoadingScreen(this); 
    }
    
    @Override
    public void onBackPressed() {
    getCurrentScreen().backButton();
    }

}
