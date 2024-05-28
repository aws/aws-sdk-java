/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * StackInstanceResourceDriftsSummary StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StackInstanceResourceDriftsSummaryStaxUnmarshaller implements Unmarshaller<StackInstanceResourceDriftsSummary, StaxUnmarshallerContext> {

    public StackInstanceResourceDriftsSummary unmarshall(StaxUnmarshallerContext context) throws Exception {
        StackInstanceResourceDriftsSummary stackInstanceResourceDriftsSummary = new StackInstanceResourceDriftsSummary();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return stackInstanceResourceDriftsSummary;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("StackId", targetDepth)) {
                    stackInstanceResourceDriftsSummary.setStackId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LogicalResourceId", targetDepth)) {
                    stackInstanceResourceDriftsSummary.setLogicalResourceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PhysicalResourceId", targetDepth)) {
                    stackInstanceResourceDriftsSummary.setPhysicalResourceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PhysicalResourceIdContext", targetDepth)) {
                    stackInstanceResourceDriftsSummary.withPhysicalResourceIdContext(new ArrayList<PhysicalResourceIdContextKeyValuePair>());
                    continue;
                }

                if (context.testExpression("PhysicalResourceIdContext/member", targetDepth)) {
                    stackInstanceResourceDriftsSummary.withPhysicalResourceIdContext(PhysicalResourceIdContextKeyValuePairStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("ResourceType", targetDepth)) {
                    stackInstanceResourceDriftsSummary.setResourceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PropertyDifferences", targetDepth)) {
                    stackInstanceResourceDriftsSummary.withPropertyDifferences(new ArrayList<PropertyDifference>());
                    continue;
                }

                if (context.testExpression("PropertyDifferences/member", targetDepth)) {
                    stackInstanceResourceDriftsSummary.withPropertyDifferences(PropertyDifferenceStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StackResourceDriftStatus", targetDepth)) {
                    stackInstanceResourceDriftsSummary.setStackResourceDriftStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Timestamp", targetDepth)) {
                    stackInstanceResourceDriftsSummary.setTimestamp(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return stackInstanceResourceDriftsSummary;
                }
            }
        }
    }

    private static StackInstanceResourceDriftsSummaryStaxUnmarshaller instance;

    public static StackInstanceResourceDriftsSummaryStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new StackInstanceResourceDriftsSummaryStaxUnmarshaller();
        return instance;
    }
}
