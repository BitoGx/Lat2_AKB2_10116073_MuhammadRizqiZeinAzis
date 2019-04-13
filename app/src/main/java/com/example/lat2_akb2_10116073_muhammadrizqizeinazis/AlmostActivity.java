package com.example.lat2_akb2_10116073_muhammadrizqizeinazis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AlmostActivity extends AppCompatActivity
{
  
  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_almost);
  }
  
  public void AlmostChangeActivity(View view)
  {
    Intent Start = new Intent(this, VerifyActivity.class);
    startActivity(Start);
  }
}
