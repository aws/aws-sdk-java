/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StackSetOperationPreferences StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StackSetOperationPreferencesStaxUnmarshaller implements Unmarshaller<StackSetOperationPreferences, StaxUnmarshallerContext> {

    public StackSetOperationPreferences unmarshall(StaxUnmarshallerContext context) throws Exception {
        StackSetOperationPreferences stackSetOperationPreferences = new StackSetOperationPreferences();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return stackSetOperationPreferences;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("RegionOrder", targetDepth)) {
                    stackSetOperationPreferences.withRegionOrder(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("RegionOrder/member", targetDepth)) {
                    stackSetOperationPreferences.withRegionOrder(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("FailureToleranceCount", targetDepth)) {
                    stackSetOperationPreferences.setFailureToleranceCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("FailureTolerancePercentage", targetDepth)) {
                    stackSetOperationPreferences.setFailureTolerancePercentage(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MaxConcurrentCount", targetDepth)) {
                    stackSetOperationPreferences.setMaxConcurrentCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MaxConcurrentPercentage", targetDepth)) {
                    stackSetOperationPreferences.setMaxConcurrentPercentage(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return stackSetOperationPreferences;
                }
            }
        }
    }

    private static StackSetOperationPreferencesStaxUnmarshaller instance;

    public static StackSetOperationPreferencesStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new StackSetOperationPreferencesStaxUnmarshaller();
        return instance;
    }
}
