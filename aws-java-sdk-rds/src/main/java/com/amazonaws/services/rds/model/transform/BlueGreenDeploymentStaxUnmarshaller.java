/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * BlueGreenDeployment StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BlueGreenDeploymentStaxUnmarshaller implements Unmarshaller<BlueGreenDeployment, StaxUnmarshallerContext> {

    public BlueGreenDeployment unmarshall(StaxUnmarshallerContext context) throws Exception {
        BlueGreenDeployment blueGreenDeployment = new BlueGreenDeployment();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return blueGreenDeployment;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("BlueGreenDeploymentIdentifier", targetDepth)) {
                    blueGreenDeployment.setBlueGreenDeploymentIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BlueGreenDeploymentName", targetDepth)) {
                    blueGreenDeployment.setBlueGreenDeploymentName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Source", targetDepth)) {
                    blueGreenDeployment.setSource(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Target", targetDepth)) {
                    blueGreenDeployment.setTarget(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SwitchoverDetails", targetDepth)) {
                    blueGreenDeployment.withSwitchoverDetails(new ArrayList<SwitchoverDetail>());
                    continue;
                }

                if (context.testExpression("SwitchoverDetails/member", targetDepth)) {
                    blueGreenDeployment.withSwitchoverDetails(SwitchoverDetailStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Tasks", targetDepth)) {
                    blueGreenDeployment.withTasks(new ArrayList<BlueGreenDeploymentTask>());
                    continue;
                }

                if (context.testExpression("Tasks/member", targetDepth)) {
                    blueGreenDeployment.withTasks(BlueGreenDeploymentTaskStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    blueGreenDeployment.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StatusDetails", targetDepth)) {
                    blueGreenDeployment.setStatusDetails(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CreateTime", targetDepth)) {
                    blueGreenDeployment.setCreateTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("DeleteTime", targetDepth)) {
                    blueGreenDeployment.setDeleteTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("TagList", targetDepth)) {
                    blueGreenDeployment.withTagList(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("TagList/Tag", targetDepth)) {
                    blueGreenDeployment.withTagList(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return blueGreenDeployment;
                }
            }
        }
    }

    private static BlueGreenDeploymentStaxUnmarshaller instance;

    public static BlueGreenDeploymentStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new BlueGreenDeploymentStaxUnmarshaller();
        return instance;
    }
}
