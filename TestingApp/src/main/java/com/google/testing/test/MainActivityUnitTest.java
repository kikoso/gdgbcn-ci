package com.google.testing.test;

import android.content.Intent;
import android.widget.Button;

import com.google.testing.R;
import com.google.testing.activities.MainActivity;

/**
 * Created by Enrique López-Mañas on 08/03/14.
 */

public class MainActivityUnitTest extends
        android.test.ActivityUnitTestCase<MainActivity> {

    private int buttonId;
    private MainActivity activity;

    public MainActivityUnitTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        Intent intent = new Intent(getInstrumentation().getTargetContext(),
                MainActivity.class);
        startActivity(intent, null, null);
        activity = getActivity();
    }

    public void testLayout() {
        buttonId = R.id.buttonId;
        assertNotNull(activity.findViewById(buttonId));
        Button view = (Button) activity.findViewById(buttonId);
        assertEquals("Incorrect label of the button", "New Button", view.getText());
    }

    public void testIntentTriggerViaOnClick() {
        buttonId = R.id.buttonId;
        Button view = (Button) activity.findViewById(buttonId);
        assertNotNull("Button not allowed to be null", view);

        view.performClick();

        // TouchUtils cannot be used, only allowed in
        // InstrumentationTestCase or ActivityInstrumentationTestCase2

        // Check the intent which was started
        Intent triggeredIntent = getStartedActivityIntent();
        assertNotNull("Intent was null", triggeredIntent);
        String data = triggeredIntent.getExtras().getString("URL");

        assertEquals("Incorrect data passed via the intent",
                "http://www.lopez-manas.com", data);
    }

}