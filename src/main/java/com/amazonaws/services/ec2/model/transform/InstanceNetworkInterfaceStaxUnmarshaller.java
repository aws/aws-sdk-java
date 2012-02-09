/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.ec2.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Instance Network Interface StAX Unmarshaller
 */
public class InstanceNetworkInterfaceStaxUnmarshaller implements Unmarshaller<InstanceNetworkInterface, StaxUnmarshallerContext> {

    public InstanceNetworkInterface unmarshall(StaxUnmarshallerContext context) throws Exception {
        InstanceNetworkInterface instanceNetworkInterface = new InstanceNetworkInterface();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        
        if (context.isStartOfDocument()) targetDepth += 1;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return instanceNetworkInterface;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("networkInterfaceId", targetDepth)) {
                    instanceNetworkInterface.setNetworkInterfaceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("subnetId", targetDepth)) {
                    instanceNetworkInterface.setSubnetId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("vpcId", targetDepth)) {
                    instanceNetworkInterface.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("description", targetDepth)) {
                    instanceNetworkInterface.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ownerId", targetDepth)) {
                    instanceNetworkInterface.setOwnerId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("status", targetDepth)) {
                    instanceNetworkInterface.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("privateIpAddress", targetDepth)) {
                    instanceNetworkInterface.setPrivateIpAddress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("privateDnsName", targetDepth)) {
                    instanceNetworkInterface.setPrivateDnsName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("sourceDestCheck", targetDepth)) {
                    instanceNetworkInterface.setSourceDestCheck(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("groupSet/item", targetDepth)) {
                    instanceNetworkInterface.getGroups().add(GroupIdentifierStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("attachment", targetDepth)) {
                    instanceNetworkInterface.setAttachment(InstanceNetworkInterfaceAttachmentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("association", targetDepth)) {
                    instanceNetworkInterface.setAssociation(InstanceNetworkInterfaceAssociationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return instanceNetworkInterface;
                }
            }
        }
    }

    private static InstanceNetworkInterfaceStaxUnmarshaller instance;
    public static InstanceNetworkInterfaceStaxUnmarshaller getInstance() {
        if (instance == null) instance = new InstanceNetworkInterfaceStaxUnmarshaller();
        return instance;
    }
}
    