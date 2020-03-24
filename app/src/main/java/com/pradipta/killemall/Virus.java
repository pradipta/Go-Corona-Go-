package com.pradipta.killemall;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;

import static com.pradipta.killemall.GameView.screenRatioX;
import static com.pradipta.killemall.GameView.screenRatioY;

public class Virus {
    public int speed = 20;
    public boolean wasShot = true;
    int x = 0, y, width, height, virusCounter = 1;
    Bitmap virus1, virus2, virus3, virus4;

    Virus(Resources res) {

        virus1 = BitmapFactory.decodeResource(res, R.drawable.virus1);
        virus2 = BitmapFactory.decodeResource(res, R.drawable.virus2);
        virus3 = BitmapFactory.decodeResource(res, R.drawable.virus3);
        virus4 = BitmapFactory.decodeResource(res, R.drawable.virus4);

        width = virus1.getWidth();
        height = virus1.getHeight();

        width /= 6;
        height /= 6;

        width = (int) (width * screenRatioX);
        height = (int) (height * screenRatioY);

        virus1 = Bitmap.createScaledBitmap(virus1, width, height, false);
        virus2 = Bitmap.createScaledBitmap(virus2, width, height, false);
        virus3 = Bitmap.createScaledBitmap(virus3, width, height, false);
        virus4 = Bitmap.createScaledBitmap(virus4, width, height, false);

        y = -height;
    }

    Bitmap getvirus () {

        if (virusCounter == 1) {
            virusCounter++;
            return virus1;
        }

        if (virusCounter == 2) {
            virusCounter++;
            return virus2;
        }

        if (virusCounter == 3) {
            virusCounter++;
            return virus3;
        }

        virusCounter = 1;

        return virus4;
    }

    Rect getCollisionShape () {
        return new Rect(x, y, x + width, y + height);
    }
}
