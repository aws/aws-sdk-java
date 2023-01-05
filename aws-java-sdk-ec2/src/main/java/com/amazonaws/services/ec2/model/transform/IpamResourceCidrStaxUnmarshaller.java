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
 * IpamResourceCidr StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpamResourceCidrStaxUnmarshaller implements Unmarshaller<IpamResourceCidr, StaxUnmarshallerContext> {

    public IpamResourceCidr unmarshall(StaxUnmarshallerContext context) throws Exception {
        IpamResourceCidr ipamResourceCidr = new IpamResourceCidr();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return ipamResourceCidr;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ipamId", targetDepth)) {
                    ipamResourceCidr.setIpamId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipamScopeId", targetDepth)) {
                    ipamResourceCidr.setIpamScopeId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipamPoolId", targetDepth)) {
                    ipamResourceCidr.setIpamPoolId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("resourceRegion", targetDepth)) {
                    ipamResourceCidr.setResourceRegion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("resourceOwnerId", targetDepth)) {
                    ipamResourceCidr.setResourceOwnerId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("resourceId", targetDepth)) {
                    ipamResourceCidr.setResourceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("resourceName", targetDepth)) {
                    ipamResourceCidr.setResourceName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("resourceCidr", targetDepth)) {
                    ipamResourceCidr.setResourceCidr(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("resourceType", targetDepth)) {
                    ipamResourceCidr.setResourceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("resourceTagSet", targetDepth)) {
                    ipamResourceCidr.withResourceTags(new ArrayList<IpamResourceTag>());
                    continue;
                }

                if (context.testExpression("resourceTagSet/item", targetDepth)) {
                    ipamResourceCidr.withResourceTags(IpamResourceTagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipUsage", targetDepth)) {
                    ipamResourceCidr.setIpUsage(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("complianceStatus", targetDepth)) {
                    ipamResourceCidr.setComplianceStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("managementState", targetDepth)) {
                    ipamResourceCidr.setManagementState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("overlapStatus", targetDepth)) {
                    ipamResourceCidr.setOverlapStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("vpcId", targetDepth)) {
                    ipamResourceCidr.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return ipamResourceCidr;
                }
            }
        }
    }

    private static IpamResourceCidrStaxUnmarshaller instance;

    public static IpamResourceCidrStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new IpamResourceCidrStaxUnmarshaller();
        return instance;
    }
}
