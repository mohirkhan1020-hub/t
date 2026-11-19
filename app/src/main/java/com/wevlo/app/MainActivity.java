package com.wevlo.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Default Wevlo Java Activity
 * Use this structure to understand how Java connects with Gradle & AndroidManifest.xml
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);

        TextView title = new TextView(this);
        title.setText("Hello Android from Wevlo!");
        title.setTextSize(20f);

        Button btn = new Button(this);
        btn.setText("Test Action");
        btn.setOnClickListener(v ->
            Toast.makeText(this, "Build & Java Code Working!", Toast.LENGTH_SHORT).show()
        );

        layout.addView(title);
        layout.addView(btn);
        setContentView(layout);
    }
}