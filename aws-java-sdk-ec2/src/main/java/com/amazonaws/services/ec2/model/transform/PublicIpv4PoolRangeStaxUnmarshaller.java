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

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * PublicIpv4PoolRange StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublicIpv4PoolRangeStaxUnmarshaller implements Unmarshaller<PublicIpv4PoolRange, StaxUnmarshallerContext> {

    public PublicIpv4PoolRange unmarshall(StaxUnmarshallerContext context) throws Exception {
        PublicIpv4PoolRange publicIpv4PoolRange = new PublicIpv4PoolRange();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return publicIpv4PoolRange;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("firstAddress", targetDepth)) {
                    publicIpv4PoolRange.setFirstAddress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("lastAddress", targetDepth)) {
                    publicIpv4PoolRange.setLastAddress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("addressCount", targetDepth)) {
                    publicIpv4PoolRange.setAddressCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("availableAddressCount", targetDepth)) {
                    publicIpv4PoolRange.setAvailableAddressCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return publicIpv4PoolRange;
                }
            }
        }
    }

    private static PublicIpv4PoolRangeStaxUnmarshaller instance;

    public static PublicIpv4PoolRangeStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new PublicIpv4PoolRangeStaxUnmarshaller();
        return instance;
    }
}
