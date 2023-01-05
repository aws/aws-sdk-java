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
 * IpamPool StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpamPoolStaxUnmarshaller implements Unmarshaller<IpamPool, StaxUnmarshallerContext> {

    public IpamPool unmarshall(StaxUnmarshallerContext context) throws Exception {
        IpamPool ipamPool = new IpamPool();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return ipamPool;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ownerId", targetDepth)) {
                    ipamPool.setOwnerId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipamPoolId", targetDepth)) {
                    ipamPool.setIpamPoolId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("sourceIpamPoolId", targetDepth)) {
                    ipamPool.setSourceIpamPoolId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipamPoolArn", targetDepth)) {
                    ipamPool.setIpamPoolArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipamScopeArn", targetDepth)) {
                    ipamPool.setIpamScopeArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipamScopeType", targetDepth)) {
                    ipamPool.setIpamScopeType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipamArn", targetDepth)) {
                    ipamPool.setIpamArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipamRegion", targetDepth)) {
                    ipamPool.setIpamRegion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("locale", targetDepth)) {
                    ipamPool.setLocale(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("poolDepth", targetDepth)) {
                    ipamPool.setPoolDepth(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("state", targetDepth)) {
                    ipamPool.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("stateMessage", targetDepth)) {
                    ipamPool.setStateMessage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("description", targetDepth)) {
                    ipamPool.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("autoImport", targetDepth)) {
                    ipamPool.setAutoImport(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("publiclyAdvertisable", targetDepth)) {
                    ipamPool.setPubliclyAdvertisable(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("addressFamily", targetDepth)) {
                    ipamPool.setAddressFamily(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("allocationMinNetmaskLength", targetDepth)) {
                    ipamPool.setAllocationMinNetmaskLength(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("allocationMaxNetmaskLength", targetDepth)) {
                    ipamPool.setAllocationMaxNetmaskLength(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("allocationDefaultNetmaskLength", targetDepth)) {
                    ipamPool.setAllocationDefaultNetmaskLength(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("allocationResourceTagSet", targetDepth)) {
                    ipamPool.withAllocationResourceTags(new ArrayList<IpamResourceTag>());
                    continue;
                }

                if (context.testExpression("allocationResourceTagSet/item", targetDepth)) {
                    ipamPool.withAllocationResourceTags(IpamResourceTagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    ipamPool.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    ipamPool.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("awsService", targetDepth)) {
                    ipamPool.setAwsService(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return ipamPool;
                }
            }
        }
    }

    private static IpamPoolStaxUnmarshaller instance;

    public static IpamPoolStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new IpamPoolStaxUnmarshaller();
        return instance;
    }
}
