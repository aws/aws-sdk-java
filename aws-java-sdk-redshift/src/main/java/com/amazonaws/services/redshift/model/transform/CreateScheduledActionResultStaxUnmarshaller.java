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
 * CreateScheduledActionResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateScheduledActionResultStaxUnmarshaller implements Unmarshaller<CreateScheduledActionResult, StaxUnmarshallerContext> {

    public CreateScheduledActionResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        CreateScheduledActionResult createScheduledActionResult = new CreateScheduledActionResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return createScheduledActionResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ScheduledActionName", targetDepth)) {
                    createScheduledActionResult.setScheduledActionName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TargetAction", targetDepth)) {
                    createScheduledActionResult.setTargetAction(ScheduledActionTypeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Schedule", targetDepth)) {
                    createScheduledActionResult.setSchedule(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IamRole", targetDepth)) {
                    createScheduledActionResult.setIamRole(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ScheduledActionDescription", targetDepth)) {
                    createScheduledActionResult.setScheduledActionDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("State", targetDepth)) {
                    createScheduledActionResult.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NextInvocations", targetDepth)) {
                    createScheduledActionResult.withNextInvocations(new ArrayList<java.util.Date>());
                    continue;
                }

                if (context.testExpression("NextInvocations/ScheduledActionTime", targetDepth)) {
                    createScheduledActionResult.withNextInvocations(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("StartTime", targetDepth)) {
                    createScheduledActionResult.setStartTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("EndTime", targetDepth)) {
                    createScheduledActionResult.setEndTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return createScheduledActionResult;
                }
            }
        }
    }

    private static CreateScheduledActionResultStaxUnmarshaller instance;

    public static CreateScheduledActionResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateScheduledActionResultStaxUnmarshaller();
        return instance;
    }
}
