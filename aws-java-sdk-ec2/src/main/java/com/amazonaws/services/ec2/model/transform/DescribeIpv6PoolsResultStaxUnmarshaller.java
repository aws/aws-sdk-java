/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DescribeIpv6PoolsResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeIpv6PoolsResultStaxUnmarshaller implements Unmarshaller<DescribeIpv6PoolsResult, StaxUnmarshallerContext> {

    public DescribeIpv6PoolsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeIpv6PoolsResult describeIpv6PoolsResult = new DescribeIpv6PoolsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeIpv6PoolsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ipv6PoolSet", targetDepth)) {
                    describeIpv6PoolsResult.withIpv6Pools(new ArrayList<Ipv6Pool>());
                    continue;
                }

                if (context.testExpression("ipv6PoolSet/item", targetDepth)) {
                    describeIpv6PoolsResult.withIpv6Pools(Ipv6PoolStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("nextToken", targetDepth)) {
                    describeIpv6PoolsResult.setNextToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeIpv6PoolsResult;
                }
            }
        }
    }

    private static DescribeIpv6PoolsResultStaxUnmarshaller instance;

    public static DescribeIpv6PoolsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeIpv6PoolsResultStaxUnmarshaller();
        return instance;
    }
}
