/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticache.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DescribeGlobalReplicationGroupsResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGlobalReplicationGroupsResultStaxUnmarshaller implements Unmarshaller<DescribeGlobalReplicationGroupsResult, StaxUnmarshallerContext> {

    public DescribeGlobalReplicationGroupsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeGlobalReplicationGroupsResult describeGlobalReplicationGroupsResult = new DescribeGlobalReplicationGroupsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeGlobalReplicationGroupsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Marker", targetDepth)) {
                    describeGlobalReplicationGroupsResult.setMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("GlobalReplicationGroups", targetDepth)) {
                    describeGlobalReplicationGroupsResult.withGlobalReplicationGroups(new ArrayList<GlobalReplicationGroup>());
                    continue;
                }

                if (context.testExpression("GlobalReplicationGroups/GlobalReplicationGroup", targetDepth)) {
                    describeGlobalReplicationGroupsResult.withGlobalReplicationGroups(GlobalReplicationGroupStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeGlobalReplicationGroupsResult;
                }
            }
        }
    }

    private static DescribeGlobalReplicationGroupsResultStaxUnmarshaller instance;

    public static DescribeGlobalReplicationGroupsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeGlobalReplicationGroupsResultStaxUnmarshaller();
        return instance;
    }
}
