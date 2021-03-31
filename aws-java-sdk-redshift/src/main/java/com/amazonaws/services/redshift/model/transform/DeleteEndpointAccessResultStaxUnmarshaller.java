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
 * DeleteEndpointAccessResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteEndpointAccessResultStaxUnmarshaller implements Unmarshaller<DeleteEndpointAccessResult, StaxUnmarshallerContext> {

    public DeleteEndpointAccessResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DeleteEndpointAccessResult deleteEndpointAccessResult = new DeleteEndpointAccessResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return deleteEndpointAccessResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ClusterIdentifier", targetDepth)) {
                    deleteEndpointAccessResult.setClusterIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ResourceOwner", targetDepth)) {
                    deleteEndpointAccessResult.setResourceOwner(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SubnetGroupName", targetDepth)) {
                    deleteEndpointAccessResult.setSubnetGroupName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EndpointStatus", targetDepth)) {
                    deleteEndpointAccessResult.setEndpointStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EndpointName", targetDepth)) {
                    deleteEndpointAccessResult.setEndpointName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EndpointCreateTime", targetDepth)) {
                    deleteEndpointAccessResult.setEndpointCreateTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("Port", targetDepth)) {
                    deleteEndpointAccessResult.setPort(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Address", targetDepth)) {
                    deleteEndpointAccessResult.setAddress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("VpcSecurityGroups", targetDepth)) {
                    deleteEndpointAccessResult.withVpcSecurityGroups(new ArrayList<VpcSecurityGroupMembership>());
                    continue;
                }

                if (context.testExpression("VpcSecurityGroups/VpcSecurityGroup", targetDepth)) {
                    deleteEndpointAccessResult.withVpcSecurityGroups(VpcSecurityGroupMembershipStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("VpcEndpoint", targetDepth)) {
                    deleteEndpointAccessResult.setVpcEndpoint(VpcEndpointStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return deleteEndpointAccessResult;
                }
            }
        }
    }

    private static DeleteEndpointAccessResultStaxUnmarshaller instance;

    public static DeleteEndpointAccessResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteEndpointAccessResultStaxUnmarshaller();
        return instance;
    }
}
