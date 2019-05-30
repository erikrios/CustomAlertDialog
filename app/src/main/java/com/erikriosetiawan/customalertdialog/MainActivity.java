package com.erikriosetiawan.customalertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialogAbout(View view) {
        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("Tentang");
        alertDialog.setMessage("Aplikasi ini merupakan contoh dari custom alert dialog yang dibuat menggunakan Android Studio");

        // Alert Dialog Button
        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "YA", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        alertDialog.show();
    }

    public void showDialogExit(View view) {
        AlertDialog.Builder backAlertDialog = new AlertDialog.Builder(MainActivity.this);
        backAlertDialog.setTitle("Keluar");
        backAlertDialog.setMessage("Anda yakin ingin keluar dari aplikasi ini?");

        backAlertDialog.setPositiveButton("TIDAK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        backAlertDialog.setNegativeButton("YA", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        backAlertDialog.show();
        return;
    }
}
