package com.example.lat2_akb2_10116073_muhammadrizqizeinazis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

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
  
    text.setSpan(new android.text.style.StyleSpan(android.graphics.Typeface.BOLD),24,29, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
  
    textView.setText(text);
    textView.setMovementMethod(LinkMovementMethod.getInstance());
  }
  
  public void VerifyChangeActivity(View view)
  {
    Intent Start = new Intent(this, HomeActivity.class);
    startActivity(Start);
  }
  
}
