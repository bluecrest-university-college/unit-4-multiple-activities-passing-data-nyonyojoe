package eyrastudios.net.emailvalidator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class homeactivity extends AppCompatActivity {

    private EditText email;
    private TextView valid;
    private Button enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeactivity);

        email = findViewById(R.id.emailID);
        valid = findViewById(R.id.validID);
        enter = findViewById(R.id.enterID);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(email.getText().toString());
            }
        });

    }

    private void validate(String Email){
        Email = email.getText().toString();

            if(Email.contains("@")){
                valid.setText("Email is Valid");
            }else{
                valid.setText("Email in Invalid");
            }
        }
    }

