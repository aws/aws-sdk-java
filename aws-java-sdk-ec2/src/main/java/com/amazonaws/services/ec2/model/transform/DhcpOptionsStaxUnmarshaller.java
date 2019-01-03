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
 * DhcpOptions StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DhcpOptionsStaxUnmarshaller implements Unmarshaller<DhcpOptions, StaxUnmarshallerContext> {

    public DhcpOptions unmarshall(StaxUnmarshallerContext context) throws Exception {
        DhcpOptions dhcpOptions = new DhcpOptions();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return dhcpOptions;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("dhcpConfigurationSet", targetDepth)) {
                    dhcpOptions.withDhcpConfigurations(new ArrayList<DhcpConfiguration>());
                    continue;
                }

                if (context.testExpression("dhcpConfigurationSet/item", targetDepth)) {
                    dhcpOptions.withDhcpConfigurations(DhcpConfigurationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("dhcpOptionsId", targetDepth)) {
                    dhcpOptions.setDhcpOptionsId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ownerId", targetDepth)) {
                    dhcpOptions.setOwnerId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    dhcpOptions.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    dhcpOptions.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return dhcpOptions;
                }
            }
        }
    }

    private static DhcpOptionsStaxUnmarshaller instance;

    public static DhcpOptionsStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DhcpOptionsStaxUnmarshaller();
        return instance;
    }
}
