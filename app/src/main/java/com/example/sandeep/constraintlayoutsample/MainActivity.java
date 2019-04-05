package com.example.sandeep.constraintlayoutsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.horizontal_vertical_constraint_layout);

        //app:layout_constrainedWidth="true" with width = wrap content working fine
       // else make width= 0dp
        //        app:layout_constraintWidth_percent=".5" works with width=0dp
        //we can define dimension of widget to ratio of other constraineddimesion ratio = 0-1
        // condition - one or both view dimension to 0dp
        //2)opp. side of widget needs to be constrained
        //Guideline is helper view that is used to align with other views
        //vertical gl width- 0dp, hgl - height = 0dp
        // to add a view to % of view put it in between two guideline
    }
}
