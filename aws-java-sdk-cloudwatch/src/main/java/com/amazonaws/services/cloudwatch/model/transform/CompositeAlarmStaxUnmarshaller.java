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
package com.amazonaws.services.cloudwatch.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * CompositeAlarm StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompositeAlarmStaxUnmarshaller implements Unmarshaller<CompositeAlarm, StaxUnmarshallerContext> {

    public CompositeAlarm unmarshall(StaxUnmarshallerContext context) throws Exception {
        CompositeAlarm compositeAlarm = new CompositeAlarm();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return compositeAlarm;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ActionsEnabled", targetDepth)) {
                    compositeAlarm.setActionsEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AlarmActions", targetDepth)) {
                    compositeAlarm.withAlarmActions(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("AlarmActions/member", targetDepth)) {
                    compositeAlarm.withAlarmActions(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AlarmArn", targetDepth)) {
                    compositeAlarm.setAlarmArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AlarmConfigurationUpdatedTimestamp", targetDepth)) {
                    compositeAlarm.setAlarmConfigurationUpdatedTimestamp(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("AlarmDescription", targetDepth)) {
                    compositeAlarm.setAlarmDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AlarmName", targetDepth)) {
                    compositeAlarm.setAlarmName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AlarmRule", targetDepth)) {
                    compositeAlarm.setAlarmRule(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("InsufficientDataActions", targetDepth)) {
                    compositeAlarm.withInsufficientDataActions(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("InsufficientDataActions/member", targetDepth)) {
                    compositeAlarm.withInsufficientDataActions(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OKActions", targetDepth)) {
                    compositeAlarm.withOKActions(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("OKActions/member", targetDepth)) {
                    compositeAlarm.withOKActions(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StateReason", targetDepth)) {
                    compositeAlarm.setStateReason(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StateReasonData", targetDepth)) {
                    compositeAlarm.setStateReasonData(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StateUpdatedTimestamp", targetDepth)) {
                    compositeAlarm.setStateUpdatedTimestamp(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("StateValue", targetDepth)) {
                    compositeAlarm.setStateValue(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return compositeAlarm;
                }
            }
        }
    }

    private static CompositeAlarmStaxUnmarshaller instance;

    public static CompositeAlarmStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CompositeAlarmStaxUnmarshaller();
        return instance;
    }
}
