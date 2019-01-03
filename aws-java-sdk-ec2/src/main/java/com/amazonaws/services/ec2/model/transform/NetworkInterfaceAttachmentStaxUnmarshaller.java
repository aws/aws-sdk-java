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

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * NetworkInterfaceAttachment StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkInterfaceAttachmentStaxUnmarshaller implements Unmarshaller<NetworkInterfaceAttachment, StaxUnmarshallerContext> {

    public NetworkInterfaceAttachment unmarshall(StaxUnmarshallerContext context) throws Exception {
        NetworkInterfaceAttachment networkInterfaceAttachment = new NetworkInterfaceAttachment();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return networkInterfaceAttachment;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("attachTime", targetDepth)) {
                    networkInterfaceAttachment.setAttachTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("attachmentId", targetDepth)) {
                    networkInterfaceAttachment.setAttachmentId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("deleteOnTermination", targetDepth)) {
                    networkInterfaceAttachment.setDeleteOnTermination(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("deviceIndex", targetDepth)) {
                    networkInterfaceAttachment.setDeviceIndex(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceId", targetDepth)) {
                    networkInterfaceAttachment.setInstanceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceOwnerId", targetDepth)) {
                    networkInterfaceAttachment.setInstanceOwnerId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("status", targetDepth)) {
                    networkInterfaceAttachment.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return networkInterfaceAttachment;
                }
            }
        }
    }

    private static NetworkInterfaceAttachmentStaxUnmarshaller instance;

    public static NetworkInterfaceAttachmentStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new NetworkInterfaceAttachmentStaxUnmarshaller();
        return instance;
    }
}
