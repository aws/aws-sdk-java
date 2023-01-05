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

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * InstanceIpv4Prefix StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceIpv4PrefixStaxUnmarshaller implements Unmarshaller<InstanceIpv4Prefix, StaxUnmarshallerContext> {

    public InstanceIpv4Prefix unmarshall(StaxUnmarshallerContext context) throws Exception {
        InstanceIpv4Prefix instanceIpv4Prefix = new InstanceIpv4Prefix();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return instanceIpv4Prefix;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ipv4Prefix", targetDepth)) {
                    instanceIpv4Prefix.setIpv4Prefix(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return instanceIpv4Prefix;
                }
            }
        }
    }

    private static InstanceIpv4PrefixStaxUnmarshaller instance;

    public static InstanceIpv4PrefixStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceIpv4PrefixStaxUnmarshaller();
        return instance;
    }
}
