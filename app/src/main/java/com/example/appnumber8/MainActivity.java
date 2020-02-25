package com.example.appnumber8;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final CheckBox chxHealthyYes = (CheckBox) findViewById(R.id.chxHealthyYes);
        final CheckBox chxHealthyNo = (CheckBox) findViewById(R.id.chxHealthyNo);
        TextView txtHealthy = (TextView) findViewById(R.id.txtHealthy);

        // True And True

        TextView txtTrueAndTrue = (TextView) findViewById(R.id.txtTrueAndTrue);
        CheckBox chxTrueAndTrueYes = (CheckBox)findViewById(R.id.chxTrueAndTrueYes);
        CheckBox chxTrueAndTrueNo = (CheckBox)findViewById(R.id.chxTrueAndTrueNo);


        // True and False

        TextView txtTrueAndFalse = (TextView)findViewById(R.id.txtTrueAndFalse);
        CheckBox chxTrueAndFalseYes = (CheckBox)findViewById(R.id.chxTrueAndFalseYes);
        CheckBox chxTrueAndFalseNo = (CheckBox)findViewById(R.id.chxTrueAndFalseNo);


        // False And True
        //CheckBox chxFalseAndTrueYes = (CheckBox)findViewById(R.id.chxFalseAndTrueYes);
        //CheckBox chxFalseAndTrueNo = (CheckBox)findViewById(R.id.chxFalseAndTrueNo);

        // False And False

        CheckBox chxFalseAndFalseYes = (CheckBox)findViewById(R.id.chxFalseAndFalseYes);
        CheckBox chxFalseAndFalseNo = (CheckBox)findViewById(R.id.chxFalseAndFalseNo);


        // True or True

        CheckBox chxTrueOrTrueYes = (CheckBox)findViewById(R.id.chxTrueOrTrueYes);
        CheckBox chxTrueOrTrueNo = (CheckBox)findViewById(R.id.chxTrueOrTrueNo);


        // True Caret True

        CheckBox cxTrueCaretTrueYes = (CheckBox)findViewById(R.id.chxTrueCaretTrueYes);
        CheckBox cxTrueCaretTrueNo = (CheckBox)findViewById(R.id.chxTrueCaretTrueNo);



        chxHealthyYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (chxHealthyYes.isChecked())
                {
                    chxHealthyNo.setChecked(false);
                }
            }
        });


        chxHealthyNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (chxHealthyNo.isChecked()){
                    chxHealthyYes.setChecked(false);
                }
            }
        });

        boolean amIhealthy = false;
        int power = 97;
        /*if (amIhealthy){
            chxHealthyYes.setChecked(true);
        } else if (!amIhealthy){
            chxHealthyNo.setChecked(true);
        }*/

       /* amIhealthy = (power > 70);
            if (amIhealthy){
                chxHealthyYes.setChecked(true);
            } else if (!amIhealthy){
                chxHealthyNo.setChecked(true);
            }*/

       /*amIhealthy = (power > 70 ? true : false);
        if (amIhealthy){ // if (amIhealthy) means by default true value!
            chxHealthyYes.setChecked(true);
        } else if (!amIhealthy){
            chxHealthyNo.setChecked(true);
        }*/
       // ((power < 90 ? true : false)) this statement is the boolean expression for boolean variable
        // another way without using if else statement we can do the same thing like this
     //  chxHealthyYes.setChecked((power > 80 ? true : false)); // : this means otherwise and it also work as Else statement!
       //chxHealthyYes.setChecked((power < 90 ? true : false));

        amIhealthy = (power > 90);

       // in this line of code 75 the value of amIhealthy is true and it checked the check box while running the application!

        chxHealthyYes.setChecked(amIhealthy ? true : false);

        // In line 78 the user says that you are saying wrong ( not true) so the compiler gives the answer false ( not checked the box) b/c its a true value that power is grater than 90!
        chxHealthyNo.setChecked(!amIhealthy ? true : false);

        // TRUE AND TRUE
        //AND means multiplication ,  ek bhi value false tou false
        //OR gate means Addition , ek bhi value true tou true

        boolean trueAndTrue = (true && true);
        /*if (trueAndTrue){
            chxTrueAndTrueYes.setChecked(true);
        }
        else if (!trueAndTrue){ // Agar trueAndTrue variable ki value false hojaye tou yeh kaam karna!
            chxTrueAndTrueNo.setChecked(true);
        }*/

        // Another way of doing the above thing (If else)
        /*chxTrueAndTrueYes.setChecked((trueAndTrue ? true : false));
        chxTrueAndTrueNo.setChecked((!trueAndTrue ? true :false)); */

        // TRUE AND FALSE

        boolean trueAndFalse = (true && false);
        if (trueAndFalse){
            chxTrueAndFalseYes.setChecked(true);
        }
        else if (!trueAndFalse){
            chxTrueAndFalseNo.setChecked(true);
        }

        // FALSE AND TRUE

       /* boolean falseAndTrue = (false && true);
        if (falseAndTrue){
            chxFalseAndTrueYes.setChecked(true);
        }
        else if (!falseAndTrue){
            chxFalseAndTrueNo.setChecked(true);
        }*/

       //False And False

        boolean falseAndFalse  = (false && false);
        /*if (falseAndFalse){
            chxFalseAndFalseYes.setChecked(true);
        }
        else if (!falseAndFalse){
            chxFalseAndFalseNo.setChecked(true);
        }*/


        // Another way of declaring! or If else statement
        chxFalseAndFalseYes.setChecked(falseAndFalse ? true : false);
        chxFalseAndFalseNo.setChecked(!falseAndFalse ? true : false);


        // True Or True  // OR operator means (+) addition and the AND operator means (*) multiplication

        boolean trueOrTrue = (true || true);
        if (trueOrTrue){
            chxTrueOrTrueYes.setChecked(true);
        }
        else if (!trueOrTrue){
            chxTrueOrTrueNo.setChecked(true);
        }

        // Just like true or true the teacher done true or false , false or true , false or false!
        // They same to same nothing is change except the variable name!


        // True Caret True

        boolean trueCaretTrue = (true ^ true);
        if (trueCaretTrue){
            cxTrueCaretTrueYes.setChecked(true);
        }
        else if (!trueCaretTrue){
            cxTrueCaretTrueNo.setChecked(true);
        }



    }


}
