package main.java;

/**
 * Created by krevsky on 23.11.2016.
 */
public class KrevBeanA {
    public Voice voice;

    public void setVoice(Voice voice) {
        this.voice = voice;
    }

    public String getKrevVoice() {
        return voice.getVoice();
    }
}
