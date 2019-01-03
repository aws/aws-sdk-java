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
package com.amazonaws.services.rds.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DescribeDBSecurityGroupsResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBSecurityGroupsResultStaxUnmarshaller implements Unmarshaller<DescribeDBSecurityGroupsResult, StaxUnmarshallerContext> {

    public DescribeDBSecurityGroupsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeDBSecurityGroupsResult describeDBSecurityGroupsResult = new DescribeDBSecurityGroupsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeDBSecurityGroupsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Marker", targetDepth)) {
                    describeDBSecurityGroupsResult.setMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBSecurityGroups", targetDepth)) {
                    describeDBSecurityGroupsResult.withDBSecurityGroups(new ArrayList<DBSecurityGroup>());
                    continue;
                }

                if (context.testExpression("DBSecurityGroups/DBSecurityGroup", targetDepth)) {
                    describeDBSecurityGroupsResult.withDBSecurityGroups(DBSecurityGroupStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeDBSecurityGroupsResult;
                }
            }
        }
    }

    private static DescribeDBSecurityGroupsResultStaxUnmarshaller instance;

    public static DescribeDBSecurityGroupsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeDBSecurityGroupsResultStaxUnmarshaller();
        return instance;
    }
}
