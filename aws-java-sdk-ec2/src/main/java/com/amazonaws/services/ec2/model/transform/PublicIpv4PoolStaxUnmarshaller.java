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
 * PublicIpv4Pool StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublicIpv4PoolStaxUnmarshaller implements Unmarshaller<PublicIpv4Pool, StaxUnmarshallerContext> {

    public PublicIpv4Pool unmarshall(StaxUnmarshallerContext context) throws Exception {
        PublicIpv4Pool publicIpv4Pool = new PublicIpv4Pool();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return publicIpv4Pool;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("poolId", targetDepth)) {
                    publicIpv4Pool.setPoolId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("description", targetDepth)) {
                    publicIpv4Pool.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("poolAddressRangeSet", targetDepth)) {
                    publicIpv4Pool.withPoolAddressRanges(new ArrayList<PublicIpv4PoolRange>());
                    continue;
                }

                if (context.testExpression("poolAddressRangeSet/item", targetDepth)) {
                    publicIpv4Pool.withPoolAddressRanges(PublicIpv4PoolRangeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("totalAddressCount", targetDepth)) {
                    publicIpv4Pool.setTotalAddressCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("totalAvailableAddressCount", targetDepth)) {
                    publicIpv4Pool.setTotalAvailableAddressCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return publicIpv4Pool;
                }
            }
        }
    }

    private static PublicIpv4PoolStaxUnmarshaller instance;

    public static PublicIpv4PoolStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new PublicIpv4PoolStaxUnmarshaller();
        return instance;
    }
}
