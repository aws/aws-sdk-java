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
package com.amazonaws.services.redshift.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ClusterSubnetGroup StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterSubnetGroupStaxUnmarshaller implements Unmarshaller<ClusterSubnetGroup, StaxUnmarshallerContext> {

    public ClusterSubnetGroup unmarshall(StaxUnmarshallerContext context) throws Exception {
        ClusterSubnetGroup clusterSubnetGroup = new ClusterSubnetGroup();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 3;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return clusterSubnetGroup;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ClusterSubnetGroupName", targetDepth)) {
                    clusterSubnetGroup.setClusterSubnetGroupName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Description", targetDepth)) {
                    clusterSubnetGroup.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("VpcId", targetDepth)) {
                    clusterSubnetGroup.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SubnetGroupStatus", targetDepth)) {
                    clusterSubnetGroup.setSubnetGroupStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Subnets", targetDepth)) {
                    clusterSubnetGroup.withSubnets(new ArrayList<Subnet>());
                    continue;
                }

                if (context.testExpression("Subnets/Subnet", targetDepth)) {
                    clusterSubnetGroup.withSubnets(SubnetStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Tags", targetDepth)) {
                    clusterSubnetGroup.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("Tags/Tag", targetDepth)) {
                    clusterSubnetGroup.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return clusterSubnetGroup;
                }
            }
        }
    }

    private static ClusterSubnetGroupStaxUnmarshaller instance;

    public static ClusterSubnetGroupStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClusterSubnetGroupStaxUnmarshaller();
        return instance;
    }
}
