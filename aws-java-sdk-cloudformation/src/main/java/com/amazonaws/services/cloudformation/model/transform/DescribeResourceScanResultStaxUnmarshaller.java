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
 * DescribeResourceScanResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeResourceScanResultStaxUnmarshaller implements Unmarshaller<DescribeResourceScanResult, StaxUnmarshallerContext> {

    public DescribeResourceScanResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeResourceScanResult describeResourceScanResult = new DescribeResourceScanResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeResourceScanResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ResourceScanId", targetDepth)) {
                    describeResourceScanResult.setResourceScanId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    describeResourceScanResult.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StatusReason", targetDepth)) {
                    describeResourceScanResult.setStatusReason(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StartTime", targetDepth)) {
                    describeResourceScanResult.setStartTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("EndTime", targetDepth)) {
                    describeResourceScanResult.setEndTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("PercentageCompleted", targetDepth)) {
                    describeResourceScanResult.setPercentageCompleted(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ResourceTypes", targetDepth)) {
                    describeResourceScanResult.withResourceTypes(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("ResourceTypes/member", targetDepth)) {
                    describeResourceScanResult.withResourceTypes(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ResourcesScanned", targetDepth)) {
                    describeResourceScanResult.setResourcesScanned(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ResourcesRead", targetDepth)) {
                    describeResourceScanResult.setResourcesRead(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeResourceScanResult;
                }
            }
        }
    }

    private static DescribeResourceScanResultStaxUnmarshaller instance;

    public static DescribeResourceScanResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeResourceScanResultStaxUnmarshaller();
        return instance;
    }
}
