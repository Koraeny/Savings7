package com.example.saving5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SavingsActivity extends AppCompatActivity {

    private EditText goalInput, currentSavingsInput;
    private Button updateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savings);

        // Initialize views
        goalInput = findViewById(R.id.savings_goal_input);
        currentSavingsInput = findViewById(R.id.current_savings_input);
        updateButton = findViewById(R.id.update_savings_button);

        // Set up button click listener
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String goal = goalInput.getText().toString();
                String currentSavings = currentSavingsInput.getText().toString();

                if (!goal.isEmpty() && !currentSavings.isEmpty()) {
                    double goalAmount = Double.parseDouble(goal);
                    double currentAmount = Double.parseDouble(currentSavings);
                    // Logic to save data or calculate progress can be added here
                }
            }
        });
    }
}
