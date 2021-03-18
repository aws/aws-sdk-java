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
 * VpcEndpoint StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcEndpointStaxUnmarshaller implements Unmarshaller<VpcEndpoint, StaxUnmarshallerContext> {

    public VpcEndpoint unmarshall(StaxUnmarshallerContext context) throws Exception {
        VpcEndpoint vpcEndpoint = new VpcEndpoint();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return vpcEndpoint;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("VpcEndpointId", targetDepth)) {
                    vpcEndpoint.setVpcEndpointId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("VpcId", targetDepth)) {
                    vpcEndpoint.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NetworkInterfaces", targetDepth)) {
                    vpcEndpoint.withNetworkInterfaces(new ArrayList<NetworkInterface>());
                    continue;
                }

                if (context.testExpression("NetworkInterfaces/NetworkInterface", targetDepth)) {
                    vpcEndpoint.withNetworkInterfaces(NetworkInterfaceStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return vpcEndpoint;
                }
            }
        }
    }

    private static VpcEndpointStaxUnmarshaller instance;

    public static VpcEndpointStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new VpcEndpointStaxUnmarshaller();
        return instance;
    }
}
