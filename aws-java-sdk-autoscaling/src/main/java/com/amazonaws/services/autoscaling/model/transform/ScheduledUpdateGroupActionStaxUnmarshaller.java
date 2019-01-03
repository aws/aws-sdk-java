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
package com.amazonaws.services.autoscaling.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ScheduledUpdateGroupAction StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledUpdateGroupActionStaxUnmarshaller implements Unmarshaller<ScheduledUpdateGroupAction, StaxUnmarshallerContext> {

    public ScheduledUpdateGroupAction unmarshall(StaxUnmarshallerContext context) throws Exception {
        ScheduledUpdateGroupAction scheduledUpdateGroupAction = new ScheduledUpdateGroupAction();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return scheduledUpdateGroupAction;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("AutoScalingGroupName", targetDepth)) {
                    scheduledUpdateGroupAction.setAutoScalingGroupName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ScheduledActionName", targetDepth)) {
                    scheduledUpdateGroupAction.setScheduledActionName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ScheduledActionARN", targetDepth)) {
                    scheduledUpdateGroupAction.setScheduledActionARN(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Time", targetDepth)) {
                    scheduledUpdateGroupAction.setTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("StartTime", targetDepth)) {
                    scheduledUpdateGroupAction.setStartTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("EndTime", targetDepth)) {
                    scheduledUpdateGroupAction.setEndTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("Recurrence", targetDepth)) {
                    scheduledUpdateGroupAction.setRecurrence(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MinSize", targetDepth)) {
                    scheduledUpdateGroupAction.setMinSize(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MaxSize", targetDepth)) {
                    scheduledUpdateGroupAction.setMaxSize(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DesiredCapacity", targetDepth)) {
                    scheduledUpdateGroupAction.setDesiredCapacity(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return scheduledUpdateGroupAction;
                }
            }
        }
    }

    private static ScheduledUpdateGroupActionStaxUnmarshaller instance;

    public static ScheduledUpdateGroupActionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScheduledUpdateGroupActionStaxUnmarshaller();
        return instance;
    }
}
