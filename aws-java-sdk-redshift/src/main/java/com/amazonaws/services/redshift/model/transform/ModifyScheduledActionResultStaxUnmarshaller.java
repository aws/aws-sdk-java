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
 * ModifyScheduledActionResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyScheduledActionResultStaxUnmarshaller implements Unmarshaller<ModifyScheduledActionResult, StaxUnmarshallerContext> {

    public ModifyScheduledActionResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ModifyScheduledActionResult modifyScheduledActionResult = new ModifyScheduledActionResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return modifyScheduledActionResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ScheduledActionName", targetDepth)) {
                    modifyScheduledActionResult.setScheduledActionName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TargetAction", targetDepth)) {
                    modifyScheduledActionResult.setTargetAction(ScheduledActionTypeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Schedule", targetDepth)) {
                    modifyScheduledActionResult.setSchedule(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IamRole", targetDepth)) {
                    modifyScheduledActionResult.setIamRole(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ScheduledActionDescription", targetDepth)) {
                    modifyScheduledActionResult.setScheduledActionDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("State", targetDepth)) {
                    modifyScheduledActionResult.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NextInvocations", targetDepth)) {
                    modifyScheduledActionResult.withNextInvocations(new ArrayList<java.util.Date>());
                    continue;
                }

                if (context.testExpression("NextInvocations/ScheduledActionTime", targetDepth)) {
                    modifyScheduledActionResult.withNextInvocations(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("StartTime", targetDepth)) {
                    modifyScheduledActionResult.setStartTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("EndTime", targetDepth)) {
                    modifyScheduledActionResult.setEndTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return modifyScheduledActionResult;
                }
            }
        }
    }

    private static ModifyScheduledActionResultStaxUnmarshaller instance;

    public static ModifyScheduledActionResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModifyScheduledActionResultStaxUnmarshaller();
        return instance;
    }
}
