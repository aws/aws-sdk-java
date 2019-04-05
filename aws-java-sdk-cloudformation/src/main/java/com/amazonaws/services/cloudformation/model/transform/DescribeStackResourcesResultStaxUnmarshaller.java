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
 * DescribeStackResourcesResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStackResourcesResultStaxUnmarshaller implements Unmarshaller<DescribeStackResourcesResult, StaxUnmarshallerContext> {

    public DescribeStackResourcesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeStackResourcesResult describeStackResourcesResult = new DescribeStackResourcesResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeStackResourcesResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("StackResources", targetDepth)) {
                    describeStackResourcesResult.withStackResources(new ArrayList<StackResource>());
                    continue;
                }

                if (context.testExpression("StackResources/member", targetDepth)) {
                    describeStackResourcesResult.withStackResources(StackResourceStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeStackResourcesResult;
                }
            }
        }
    }

    private static DescribeStackResourcesResultStaxUnmarshaller instance;

    public static DescribeStackResourcesResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeStackResourcesResultStaxUnmarshaller();
        return instance;
    }
}
