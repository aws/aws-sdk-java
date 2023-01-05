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

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * InstanceEventWindowAssociationRequest StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceEventWindowAssociationRequestStaxUnmarshaller implements Unmarshaller<InstanceEventWindowAssociationRequest, StaxUnmarshallerContext> {

    public InstanceEventWindowAssociationRequest unmarshall(StaxUnmarshallerContext context) throws Exception {
        InstanceEventWindowAssociationRequest instanceEventWindowAssociationRequest = new InstanceEventWindowAssociationRequest();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return instanceEventWindowAssociationRequest;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("InstanceId", targetDepth)) {
                    instanceEventWindowAssociationRequest.withInstanceIds(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("InstanceId/item", targetDepth)) {
                    instanceEventWindowAssociationRequest.withInstanceIds(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("InstanceTag", targetDepth)) {
                    instanceEventWindowAssociationRequest.withInstanceTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("InstanceTag/item", targetDepth)) {
                    instanceEventWindowAssociationRequest.withInstanceTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DedicatedHostId", targetDepth)) {
                    instanceEventWindowAssociationRequest.withDedicatedHostIds(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("DedicatedHostId/item", targetDepth)) {
                    instanceEventWindowAssociationRequest.withDedicatedHostIds(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return instanceEventWindowAssociationRequest;
                }
            }
        }
    }

    private static InstanceEventWindowAssociationRequestStaxUnmarshaller instance;

    public static InstanceEventWindowAssociationRequestStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceEventWindowAssociationRequestStaxUnmarshaller();
        return instance;
    }
}
