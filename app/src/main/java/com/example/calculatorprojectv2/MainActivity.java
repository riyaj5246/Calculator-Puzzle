package com.example.calculatorprojectv2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button mainButton, nextButton;
    TextView instructionsLabel;
    private int stage = 0;

    private final String[] stageLabels = {
            "You're bored in class one day, so you take our your calculator",
            "But you notice something's a little off about it...",
            "YOUR CALCULATOR IS BROKEN!",
            "But since you are the civilized person that you are",
            "Instead of panicking, you decide to take this opportunity to cure your boredom!",
            "Your goal is to get to the target button while staying under the button click limit.",
            "Press the Play Button to start!"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainButton = (Button) findViewById(R.id.mainButton);
        nextButton = (Button) findViewById(R.id.nextButton);

        instructionsLabel = (TextView) findViewById(R.id.instructionLabelOne);

        mainButton.setOnClickListener(view -> openLevelOne());

        nextButton.setOnClickListener(view -> {
            instructionsLabel.setText(stageLabels[stage]);
            if (stage == stageLabels.length - 1) {
                nextButton.setVisibility(View.GONE);
                mainButton.setVisibility(View.VISIBLE);
            }
            stage++;
        });
    }

    public void openLevelOne(){
        Intent intent = new Intent(this, LevelOneActivity.class);
        startActivity(intent);
    }

    //FIX CODE TO READ DATA TMRW!!!

//    private void handleLoadPrevScores(ActionEvent event) {
//        try{
//            FileReader reader = new FileReader("src/main/res/user_scores.txt");
//            Scanner in = new Scanner(reader);
//            while(in.hasNextLine())
//            {
//                String temp = in.nextLine();
//            }
//        } catch (FileNotFoundException ex) {
//            System.out.println("SOMETHING HAS GONE HORRIBLY WRONG WE'RE ALL GONNA DIE!");
//        }
//    }
//
//    private void handleSaveNewScore(ActionEvent event){
//        String outFile = "src/main/res/user_scores.txt";
//        try {
//            PrintWriter out = new PrintWriter(outFile);
//            out.close();
//
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("Something went wrong!");
//        }
//    }
}
