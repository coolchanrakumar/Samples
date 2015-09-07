package com.chan.customtoast.views;

import android.app.Activity;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.chan.customtoast.R;

public class CToast extends Toast
{

    private Context context;
    private TextView messageTxt;
    
    public CToast(Context context)
    {
        super(context);
        this.context = context;
        init();
    }
    
    private void init()
    {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        ViewGroup toastLayout = (ViewGroup) inflater.inflate(R.layout.toast_layout, null);
        //toastLayout.setLayoutParams(new LinearLayout.LayoutParams(300, LinearLayout.LayoutParams.MATCH_PARENT));
        messageTxt = (TextView) toastLayout.findViewById(R.id.text);
        messageTxt.setText("This is a custom toast");
        this.setView(toastLayout);
        this.setGravity(Gravity.FILL_HORIZONTAL | Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
        this.setDuration(Toast.LENGTH_LONG);        

    }
    
    public void show(String message)
    {
        messageTxt.setText(message);
        this.show();
    }

}
