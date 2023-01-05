/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DeprovisionPublicIpv4PoolCidrResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeprovisionPublicIpv4PoolCidrResultStaxUnmarshaller implements Unmarshaller<DeprovisionPublicIpv4PoolCidrResult, StaxUnmarshallerContext> {

    public DeprovisionPublicIpv4PoolCidrResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DeprovisionPublicIpv4PoolCidrResult deprovisionPublicIpv4PoolCidrResult = new DeprovisionPublicIpv4PoolCidrResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return deprovisionPublicIpv4PoolCidrResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("poolId", targetDepth)) {
                    deprovisionPublicIpv4PoolCidrResult.setPoolId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("deprovisionedAddressSet", targetDepth)) {
                    deprovisionPublicIpv4PoolCidrResult.withDeprovisionedAddresses(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("deprovisionedAddressSet/item", targetDepth)) {
                    deprovisionPublicIpv4PoolCidrResult.withDeprovisionedAddresses(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return deprovisionPublicIpv4PoolCidrResult;
                }
            }
        }
    }

    private static DeprovisionPublicIpv4PoolCidrResultStaxUnmarshaller instance;

    public static DeprovisionPublicIpv4PoolCidrResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeprovisionPublicIpv4PoolCidrResultStaxUnmarshaller();
        return instance;
    }
}
