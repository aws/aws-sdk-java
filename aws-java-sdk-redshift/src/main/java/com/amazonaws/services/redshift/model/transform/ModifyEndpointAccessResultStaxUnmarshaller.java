/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ModifyEndpointAccessResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyEndpointAccessResultStaxUnmarshaller implements Unmarshaller<ModifyEndpointAccessResult, StaxUnmarshallerContext> {

    public ModifyEndpointAccessResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ModifyEndpointAccessResult modifyEndpointAccessResult = new ModifyEndpointAccessResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return modifyEndpointAccessResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ClusterIdentifier", targetDepth)) {
                    modifyEndpointAccessResult.setClusterIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ResourceOwner", targetDepth)) {
                    modifyEndpointAccessResult.setResourceOwner(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SubnetGroupName", targetDepth)) {
                    modifyEndpointAccessResult.setSubnetGroupName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EndpointStatus", targetDepth)) {
                    modifyEndpointAccessResult.setEndpointStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EndpointName", targetDepth)) {
                    modifyEndpointAccessResult.setEndpointName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EndpointCreateTime", targetDepth)) {
                    modifyEndpointAccessResult.setEndpointCreateTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("Port", targetDepth)) {
                    modifyEndpointAccessResult.setPort(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Address", targetDepth)) {
                    modifyEndpointAccessResult.setAddress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("VpcSecurityGroups", targetDepth)) {
                    modifyEndpointAccessResult.withVpcSecurityGroups(new ArrayList<VpcSecurityGroupMembership>());
                    continue;
                }

                if (context.testExpression("VpcSecurityGroups/VpcSecurityGroup", targetDepth)) {
                    modifyEndpointAccessResult.withVpcSecurityGroups(VpcSecurityGroupMembershipStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("VpcEndpoint", targetDepth)) {
                    modifyEndpointAccessResult.setVpcEndpoint(VpcEndpointStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return modifyEndpointAccessResult;
                }
            }
        }
    }

    private static ModifyEndpointAccessResultStaxUnmarshaller instance;

    public static ModifyEndpointAccessResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModifyEndpointAccessResultStaxUnmarshaller();
        return instance;
    }
}
