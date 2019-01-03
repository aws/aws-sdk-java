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
 * StackResourceDrift StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StackResourceDriftStaxUnmarshaller implements Unmarshaller<StackResourceDrift, StaxUnmarshallerContext> {

    public StackResourceDrift unmarshall(StaxUnmarshallerContext context) throws Exception {
        StackResourceDrift stackResourceDrift = new StackResourceDrift();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return stackResourceDrift;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("StackId", targetDepth)) {
                    stackResourceDrift.setStackId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LogicalResourceId", targetDepth)) {
                    stackResourceDrift.setLogicalResourceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PhysicalResourceId", targetDepth)) {
                    stackResourceDrift.setPhysicalResourceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PhysicalResourceIdContext", targetDepth)) {
                    stackResourceDrift.withPhysicalResourceIdContext(new ArrayList<PhysicalResourceIdContextKeyValuePair>());
                    continue;
                }

                if (context.testExpression("PhysicalResourceIdContext/member", targetDepth)) {
                    stackResourceDrift.withPhysicalResourceIdContext(PhysicalResourceIdContextKeyValuePairStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ResourceType", targetDepth)) {
                    stackResourceDrift.setResourceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ExpectedProperties", targetDepth)) {
                    stackResourceDrift.setExpectedProperties(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ActualProperties", targetDepth)) {
                    stackResourceDrift.setActualProperties(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PropertyDifferences", targetDepth)) {
                    stackResourceDrift.withPropertyDifferences(new ArrayList<PropertyDifference>());
                    continue;
                }

                if (context.testExpression("PropertyDifferences/member", targetDepth)) {
                    stackResourceDrift.withPropertyDifferences(PropertyDifferenceStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StackResourceDriftStatus", targetDepth)) {
                    stackResourceDrift.setStackResourceDriftStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Timestamp", targetDepth)) {
                    stackResourceDrift.setTimestamp(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return stackResourceDrift;
                }
            }
        }
    }

    private static StackResourceDriftStaxUnmarshaller instance;

    public static StackResourceDriftStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new StackResourceDriftStaxUnmarshaller();
        return instance;
    }
}
