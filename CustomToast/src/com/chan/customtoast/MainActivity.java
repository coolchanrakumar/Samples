package com.chan.customtoast;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.chan.customtoast.views.CToast;

public class MainActivity extends Activity
{
    private Button clickBtn = null;
    
    private View.OnClickListener clickListener = new View.OnClickListener()
    {
        
        @Override
        public void onClick(View v)
        {
            showMessage();
        }
    };
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickBtn = (Button) findViewById(R.id.click);
        clickBtn.setOnClickListener(clickListener);
    }
    
    private void showMessage()
    {
        CToast cToast = new CToast(CApplication.applicationContext);
        cToast.show("From Activity");
        /*Toast toast = new Toast(getApplicationContext());
        LayoutInflater inflater = (LayoutInflater) CApplication.applicationContext.getSystemService(LAYOUT_INFLATER_SERVICE);
        //LayoutInflater inflater = getLayoutInflater();
        ViewGroup toastLayout = (ViewGroup) inflater.inflate(R.layout.toast_layout, null);

        TextView messageTxt = (TextView) toastLayout.findViewById(R.id.text);
        messageTxt.setText("Root Null");
        toast.setView(toastLayout);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();*/
        
    }

}
