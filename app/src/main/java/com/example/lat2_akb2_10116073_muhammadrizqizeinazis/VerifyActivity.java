package com.example.lat2_akb2_10116073_muhammadrizqizeinazis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

/**
 *Created By
 *NIM   : 10116073
 *Nama  : Muhammad Rizqi Zein Azis
 *Kelas : IF-2 / AKB-2
 *CHANGELOG April 13, 2019 11:15 AM
 * - Membuat Login Activity
 * - Memasukkan Asset ke Resource
 * - Mengambil bahan Rounded,Border XML dari project sebelumnya Lat1
 * - Meenghilangkan Title Bar
 * - Membuat Fungsi pindah Activity ke RegisterActivity
 *
 *CHANGELOG April 13, 2019 02:15 PM
 * - Rename activity_main.xml -> activity_login.xml
 * - Pendesainan Halaman Register
 * - Mengedit mengubah fungsi pindah activity
 * - Membuat border rndbuttonblue dan merename rndbutton - > rndbuttonwhite
 * - Membuat Fungsi RegisterChageActivity ke halaman Almost There
 * - Pendesainan halam Almost Activity
 * - Membuat Fungsi AlmostChangeActivity untuk pindah ke halaman Verify
 *
 *CHANGELOG April 13, 2019 06:12 PM
 * - Mengubah Checkbox menjadi Plaintext dan menambahkan drawableleft
 * - Radio button tidak diubah karena masih sama dengan yang digambar
 *
 *CHANGELOG April 13, 2019 06:32 PM
 * - Pendesainan halaman Verify
 * - Memperbaiki ukuran font di halaman Almost There
 * - Mengubah Id Button di halaman Verify
 * - Membuat Fungsi VerifyChangeActify untuk pindah ke halaman Home
 * - Memperbaiki Halaman Almost there untuk resolusi OPPO F1
 *
 *CHANGELOG April 15, 2019 09:45 AM
 * - Memberikan shadow di halaman register
 * - Mendesain halaman Home bagian atas
 *
 *CHANGELOG April 16. 2019 08:45 AM
 * - Mendesain Halaman Login bagian bawah
 * - Memberikan Scrollview untuk menu dibawah unuk resolusi OPPO F1
 * - Menyalin semua CHANGELOG ke .java yang lain
 *
 */

public class VerifyActivity extends AppCompatActivity
{
  
  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_verify);
  
    final Intent start = new Intent(this, RegisterActivity.class);
  
    TextView textView = findViewById(R.id.VerifyTxtResendActivity);
    String editedtext = "doesn't get the code ? Resend";
  
    SpannableString text   = new SpannableString(editedtext);
  
    text.setSpan(new android.text.style.StyleSpan(android.graphics.Typeface.BOLD),23,29, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
  
    textView.setText(text);
    textView.setMovementMethod(LinkMovementMethod.getInstance());
  }
  
  public void VerifyChangeActivity(View view)
  {
    Intent Start = new Intent(this, HomeActivity.class);
    startActivity(Start);
  }
  
}
