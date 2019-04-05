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
package com.amazonaws.services.elasticloadbalancingv2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticloadbalancingv2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DescribeAccountLimitsResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAccountLimitsResultStaxUnmarshaller implements Unmarshaller<DescribeAccountLimitsResult, StaxUnmarshallerContext> {

    public DescribeAccountLimitsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeAccountLimitsResult describeAccountLimitsResult = new DescribeAccountLimitsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeAccountLimitsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Limits", targetDepth)) {
                    describeAccountLimitsResult.withLimits(new ArrayList<Limit>());
                    continue;
                }

                if (context.testExpression("Limits/member", targetDepth)) {
                    describeAccountLimitsResult.withLimits(LimitStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NextMarker", targetDepth)) {
                    describeAccountLimitsResult.setNextMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeAccountLimitsResult;
                }
            }
        }
    }

    private static DescribeAccountLimitsResultStaxUnmarshaller instance;

    public static DescribeAccountLimitsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAccountLimitsResultStaxUnmarshaller();
        return instance;
    }
}
