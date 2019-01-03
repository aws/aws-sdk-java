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
 * NetworkAcl StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkAclStaxUnmarshaller implements Unmarshaller<NetworkAcl, StaxUnmarshallerContext> {

    public NetworkAcl unmarshall(StaxUnmarshallerContext context) throws Exception {
        NetworkAcl networkAcl = new NetworkAcl();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return networkAcl;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("associationSet", targetDepth)) {
                    networkAcl.withAssociations(new ArrayList<NetworkAclAssociation>());
                    continue;
                }

                if (context.testExpression("associationSet/item", targetDepth)) {
                    networkAcl.withAssociations(NetworkAclAssociationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("entrySet", targetDepth)) {
                    networkAcl.withEntries(new ArrayList<NetworkAclEntry>());
                    continue;
                }

                if (context.testExpression("entrySet/item", targetDepth)) {
                    networkAcl.withEntries(NetworkAclEntryStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("default", targetDepth)) {
                    networkAcl.setIsDefault(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkAclId", targetDepth)) {
                    networkAcl.setNetworkAclId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    networkAcl.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    networkAcl.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("vpcId", targetDepth)) {
                    networkAcl.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ownerId", targetDepth)) {
                    networkAcl.setOwnerId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return networkAcl;
                }
            }
        }
    }

    private static NetworkAclStaxUnmarshaller instance;

    public static NetworkAclStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new NetworkAclStaxUnmarshaller();
        return instance;
    }
}
