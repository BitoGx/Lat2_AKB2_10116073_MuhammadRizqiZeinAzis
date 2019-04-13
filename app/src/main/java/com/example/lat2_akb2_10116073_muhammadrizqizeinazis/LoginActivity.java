package com.example.lat2_akb2_10116073_muhammadrizqizeinazis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 *Created By
 *NIM   : 10116073
 *Nama  : Muhammad Rizqi Zein Azis
 *Kelas : IF-2 / AKB-2
 *CHANGELOG April 13, 2019
 * - Membuat Login Activity
 * - Memasukkan Asset ke Resource
 * - Mengambil bahan Rounded,Border XML dari project sebelumnya Lat1
 * - Meenghilangkan Title Bar
 * - Membuat Fungsi pindah Activity ke RegisterActivity
 */

public class LoginActivity extends AppCompatActivity
{
  
  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    TextView textView = findViewById(R.id.LoginTxtRegisterActivity);
    String editedtext = "doesn't have account ? <b>Register</b>";
    textView.setText(Html.fromHtml(editedtext));
  }
  
  public void SendLogin(View view)
  {
    Intent start = new Intent(this, RegisterActivity.class);
    startActivity(start);
  }
  
}
