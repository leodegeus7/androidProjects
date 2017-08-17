package whatsapp.cursoandroid.com.whatsapp.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import whatsapp.cursoandroid.com.whatsapp.R;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference referenceFirebase = FirebaseDatabase.getInstance().getReference();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        referenceFirebase.child("pontos").setValue(100);
    }
}