/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ScheduledActionFilter StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledActionFilterStaxUnmarshaller implements Unmarshaller<ScheduledActionFilter, StaxUnmarshallerContext> {

    public ScheduledActionFilter unmarshall(StaxUnmarshallerContext context) throws Exception {
        ScheduledActionFilter scheduledActionFilter = new ScheduledActionFilter();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return scheduledActionFilter;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Name", targetDepth)) {
                    scheduledActionFilter.setName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Values", targetDepth)) {
                    scheduledActionFilter.withValues(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("Values/item", targetDepth)) {
                    scheduledActionFilter.withValues(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return scheduledActionFilter;
                }
            }
        }
    }

    private static ScheduledActionFilterStaxUnmarshaller instance;

    public static ScheduledActionFilterStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScheduledActionFilterStaxUnmarshaller();
        return instance;
    }
}
