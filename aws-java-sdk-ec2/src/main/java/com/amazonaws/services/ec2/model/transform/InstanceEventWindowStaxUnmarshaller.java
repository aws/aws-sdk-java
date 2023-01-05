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
package com.amazonaws.services.ec2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * InstanceEventWindow StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceEventWindowStaxUnmarshaller implements Unmarshaller<InstanceEventWindow, StaxUnmarshallerContext> {

    public InstanceEventWindow unmarshall(StaxUnmarshallerContext context) throws Exception {
        InstanceEventWindow instanceEventWindow = new InstanceEventWindow();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return instanceEventWindow;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("instanceEventWindowId", targetDepth)) {
                    instanceEventWindow.setInstanceEventWindowId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("timeRangeSet", targetDepth)) {
                    instanceEventWindow.withTimeRanges(new ArrayList<InstanceEventWindowTimeRange>());
                    continue;
                }

                if (context.testExpression("timeRangeSet/item", targetDepth)) {
                    instanceEventWindow.withTimeRanges(InstanceEventWindowTimeRangeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("name", targetDepth)) {
                    instanceEventWindow.setName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("cronExpression", targetDepth)) {
                    instanceEventWindow.setCronExpression(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("associationTarget", targetDepth)) {
                    instanceEventWindow.setAssociationTarget(InstanceEventWindowAssociationTargetStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("state", targetDepth)) {
                    instanceEventWindow.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    instanceEventWindow.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    instanceEventWindow.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return instanceEventWindow;
                }
            }
        }
    }

    private static InstanceEventWindowStaxUnmarshaller instance;

    public static InstanceEventWindowStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceEventWindowStaxUnmarshaller();
        return instance;
    }
}
