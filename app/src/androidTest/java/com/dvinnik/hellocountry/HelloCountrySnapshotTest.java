package com.dvinnik.hellocountry;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.view.LayoutInflater;
import android.view.View;

import com.facebook.testing.screenshot.Screenshot;
import com.facebook.testing.screenshot.ViewHelpers;

import org.junit.Test;

public class HelloCountrySnapshotTest {

    @Test
    public void testHelloAmerica() {
        // Handle Context
        Context targetContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        LayoutInflater inflater = LayoutInflater.from(targetContext);

        // Instantiate View
        View view = inflater.inflate(R.layout.hello_america, null, false);
        ViewHelpers.setupView(view).setExactWidthDp(300).layout();

        //Create/Compare Snapshots
        Screenshot.snap(view).record();
    }
}