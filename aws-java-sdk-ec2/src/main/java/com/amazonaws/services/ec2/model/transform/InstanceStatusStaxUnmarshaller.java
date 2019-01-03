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
 * InstanceStatus StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceStatusStaxUnmarshaller implements Unmarshaller<InstanceStatus, StaxUnmarshallerContext> {

    public InstanceStatus unmarshall(StaxUnmarshallerContext context) throws Exception {
        InstanceStatus instanceStatus = new InstanceStatus();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return instanceStatus;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("availabilityZone", targetDepth)) {
                    instanceStatus.setAvailabilityZone(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("eventsSet", targetDepth)) {
                    instanceStatus.withEvents(new ArrayList<InstanceStatusEvent>());
                    continue;
                }

                if (context.testExpression("eventsSet/item", targetDepth)) {
                    instanceStatus.withEvents(InstanceStatusEventStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceId", targetDepth)) {
                    instanceStatus.setInstanceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceState", targetDepth)) {
                    instanceStatus.setInstanceState(InstanceStateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceStatus", targetDepth)) {
                    instanceStatus.setInstanceStatus(InstanceStatusSummaryStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("systemStatus", targetDepth)) {
                    instanceStatus.setSystemStatus(InstanceStatusSummaryStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return instanceStatus;
                }
            }
        }
    }

    private static InstanceStatusStaxUnmarshaller instance;

    public static InstanceStatusStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceStatusStaxUnmarshaller();
        return instance;
    }
}
