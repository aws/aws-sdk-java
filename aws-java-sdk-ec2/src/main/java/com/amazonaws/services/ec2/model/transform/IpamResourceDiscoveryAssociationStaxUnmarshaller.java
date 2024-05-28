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
package com.amazonaws.services.ec2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * IpamResourceDiscoveryAssociation StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpamResourceDiscoveryAssociationStaxUnmarshaller implements Unmarshaller<IpamResourceDiscoveryAssociation, StaxUnmarshallerContext> {

    public IpamResourceDiscoveryAssociation unmarshall(StaxUnmarshallerContext context) throws Exception {
        IpamResourceDiscoveryAssociation ipamResourceDiscoveryAssociation = new IpamResourceDiscoveryAssociation();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return ipamResourceDiscoveryAssociation;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ownerId", targetDepth)) {
                    ipamResourceDiscoveryAssociation.setOwnerId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipamResourceDiscoveryAssociationId", targetDepth)) {
                    ipamResourceDiscoveryAssociation.setIpamResourceDiscoveryAssociationId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipamResourceDiscoveryAssociationArn", targetDepth)) {
                    ipamResourceDiscoveryAssociation.setIpamResourceDiscoveryAssociationArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipamResourceDiscoveryId", targetDepth)) {
                    ipamResourceDiscoveryAssociation.setIpamResourceDiscoveryId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipamId", targetDepth)) {
                    ipamResourceDiscoveryAssociation.setIpamId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipamArn", targetDepth)) {
                    ipamResourceDiscoveryAssociation.setIpamArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipamRegion", targetDepth)) {
                    ipamResourceDiscoveryAssociation.setIpamRegion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("isDefault", targetDepth)) {
                    ipamResourceDiscoveryAssociation.setIsDefault(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("resourceDiscoveryStatus", targetDepth)) {
                    ipamResourceDiscoveryAssociation.setResourceDiscoveryStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("state", targetDepth)) {
                    ipamResourceDiscoveryAssociation.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    ipamResourceDiscoveryAssociation.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    ipamResourceDiscoveryAssociation.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return ipamResourceDiscoveryAssociation;
                }
            }
        }
    }

    private static IpamResourceDiscoveryAssociationStaxUnmarshaller instance;

    public static IpamResourceDiscoveryAssociationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new IpamResourceDiscoveryAssociationStaxUnmarshaller();
        return instance;
    }
}
