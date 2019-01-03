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
 * DescribePublicIpv4PoolsResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePublicIpv4PoolsResultStaxUnmarshaller implements Unmarshaller<DescribePublicIpv4PoolsResult, StaxUnmarshallerContext> {

    public DescribePublicIpv4PoolsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribePublicIpv4PoolsResult describePublicIpv4PoolsResult = new DescribePublicIpv4PoolsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describePublicIpv4PoolsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("publicIpv4PoolSet", targetDepth)) {
                    describePublicIpv4PoolsResult.withPublicIpv4Pools(new ArrayList<PublicIpv4Pool>());
                    continue;
                }

                if (context.testExpression("publicIpv4PoolSet/item", targetDepth)) {
                    describePublicIpv4PoolsResult.withPublicIpv4Pools(PublicIpv4PoolStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("nextToken", targetDepth)) {
                    describePublicIpv4PoolsResult.setNextToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describePublicIpv4PoolsResult;
                }
            }
        }
    }

    private static DescribePublicIpv4PoolsResultStaxUnmarshaller instance;

    public static DescribePublicIpv4PoolsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribePublicIpv4PoolsResultStaxUnmarshaller();
        return instance;
    }
}
