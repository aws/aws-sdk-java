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
package com.amazonaws.services.ec2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ScheduledInstanceRecurrence StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledInstanceRecurrenceStaxUnmarshaller implements Unmarshaller<ScheduledInstanceRecurrence, StaxUnmarshallerContext> {

    public ScheduledInstanceRecurrence unmarshall(StaxUnmarshallerContext context) throws Exception {
        ScheduledInstanceRecurrence scheduledInstanceRecurrence = new ScheduledInstanceRecurrence();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return scheduledInstanceRecurrence;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("frequency", targetDepth)) {
                    scheduledInstanceRecurrence.setFrequency(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("interval", targetDepth)) {
                    scheduledInstanceRecurrence.setInterval(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("occurrenceDaySet", targetDepth)) {
                    scheduledInstanceRecurrence.withOccurrenceDaySet(new ArrayList<Integer>());
                    continue;
                }

                if (context.testExpression("occurrenceDaySet/item", targetDepth)) {
                    scheduledInstanceRecurrence.withOccurrenceDaySet(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("occurrenceRelativeToEnd", targetDepth)) {
                    scheduledInstanceRecurrence.setOccurrenceRelativeToEnd(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("occurrenceUnit", targetDepth)) {
                    scheduledInstanceRecurrence.setOccurrenceUnit(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return scheduledInstanceRecurrence;
                }
            }
        }
    }

    private static ScheduledInstanceRecurrenceStaxUnmarshaller instance;

    public static ScheduledInstanceRecurrenceStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScheduledInstanceRecurrenceStaxUnmarshaller();
        return instance;
    }
}
