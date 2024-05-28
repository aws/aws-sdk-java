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
package com.amazonaws.services.redshift.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * SecondaryClusterInfo StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecondaryClusterInfoStaxUnmarshaller implements Unmarshaller<SecondaryClusterInfo, StaxUnmarshallerContext> {

    public SecondaryClusterInfo unmarshall(StaxUnmarshallerContext context) throws Exception {
        SecondaryClusterInfo secondaryClusterInfo = new SecondaryClusterInfo();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return secondaryClusterInfo;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    secondaryClusterInfo.setAvailabilityZone(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ClusterNodes", targetDepth)) {
                    secondaryClusterInfo.withClusterNodes(new ArrayList<ClusterNode>());
                    continue;
                }

                if (context.testExpression("ClusterNodes/member", targetDepth)) {
                    secondaryClusterInfo.withClusterNodes(ClusterNodeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return secondaryClusterInfo;
                }
            }
        }
    }

    private static SecondaryClusterInfoStaxUnmarshaller instance;

    public static SecondaryClusterInfoStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new SecondaryClusterInfoStaxUnmarshaller();
        return instance;
    }
}
