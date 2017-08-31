package choongyul.android.com.swipecardstack;

import android.net.Uri;

import java.net.URI;
import java.net.URL;

/**
 * Created by myPC on 2017-03-22.
 */

public class Data {
    private String text;
    private Uri imageUrl;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Uri getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Uri imageUrl) {
        this.imageUrl = imageUrl;
    }
}
