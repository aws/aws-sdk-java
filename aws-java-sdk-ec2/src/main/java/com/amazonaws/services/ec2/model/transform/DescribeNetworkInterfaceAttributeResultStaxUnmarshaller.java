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
 * DescribeNetworkInterfaceAttributeResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNetworkInterfaceAttributeResultStaxUnmarshaller implements Unmarshaller<DescribeNetworkInterfaceAttributeResult, StaxUnmarshallerContext> {

    public DescribeNetworkInterfaceAttributeResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeNetworkInterfaceAttributeResult describeNetworkInterfaceAttributeResult = new DescribeNetworkInterfaceAttributeResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeNetworkInterfaceAttributeResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("attachment", targetDepth)) {
                    describeNetworkInterfaceAttributeResult.setAttachment(NetworkInterfaceAttachmentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("description/value", targetDepth)) {
                    describeNetworkInterfaceAttributeResult.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("groupSet", targetDepth)) {
                    describeNetworkInterfaceAttributeResult.withGroups(new ArrayList<GroupIdentifier>());
                    continue;
                }

                if (context.testExpression("groupSet/item", targetDepth)) {
                    describeNetworkInterfaceAttributeResult.withGroups(GroupIdentifierStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkInterfaceId", targetDepth)) {
                    describeNetworkInterfaceAttributeResult.setNetworkInterfaceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("sourceDestCheck/value", targetDepth)) {
                    describeNetworkInterfaceAttributeResult.setSourceDestCheck(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeNetworkInterfaceAttributeResult;
                }
            }
        }
    }

    private static DescribeNetworkInterfaceAttributeResultStaxUnmarshaller instance;

    public static DescribeNetworkInterfaceAttributeResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeNetworkInterfaceAttributeResultStaxUnmarshaller();
        return instance;
    }
}
