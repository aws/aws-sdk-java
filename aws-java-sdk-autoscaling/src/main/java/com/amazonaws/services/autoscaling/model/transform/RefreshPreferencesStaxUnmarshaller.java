/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.autoscaling.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * RefreshPreferences StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RefreshPreferencesStaxUnmarshaller implements Unmarshaller<RefreshPreferences, StaxUnmarshallerContext> {

    public RefreshPreferences unmarshall(StaxUnmarshallerContext context) throws Exception {
        RefreshPreferences refreshPreferences = new RefreshPreferences();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return refreshPreferences;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("MinHealthyPercentage", targetDepth)) {
                    refreshPreferences.setMinHealthyPercentage(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("InstanceWarmup", targetDepth)) {
                    refreshPreferences.setInstanceWarmup(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CheckpointPercentages", targetDepth)) {
                    refreshPreferences.withCheckpointPercentages(new ArrayList<Integer>());
                    continue;
                }

                if (context.testExpression("CheckpointPercentages/member", targetDepth)) {
                    refreshPreferences.withCheckpointPercentages(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CheckpointDelay", targetDepth)) {
                    refreshPreferences.setCheckpointDelay(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return refreshPreferences;
                }
            }
        }
    }

    private static RefreshPreferencesStaxUnmarshaller instance;

    public static RefreshPreferencesStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new RefreshPreferencesStaxUnmarshaller();
        return instance;
    }
}
