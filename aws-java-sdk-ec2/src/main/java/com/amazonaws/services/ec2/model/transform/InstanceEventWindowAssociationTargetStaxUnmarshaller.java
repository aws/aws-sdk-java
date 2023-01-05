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
 * InstanceEventWindowAssociationTarget StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceEventWindowAssociationTargetStaxUnmarshaller implements Unmarshaller<InstanceEventWindowAssociationTarget, StaxUnmarshallerContext> {

    public InstanceEventWindowAssociationTarget unmarshall(StaxUnmarshallerContext context) throws Exception {
        InstanceEventWindowAssociationTarget instanceEventWindowAssociationTarget = new InstanceEventWindowAssociationTarget();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return instanceEventWindowAssociationTarget;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("instanceIdSet", targetDepth)) {
                    instanceEventWindowAssociationTarget.withInstanceIds(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("instanceIdSet/item", targetDepth)) {
                    instanceEventWindowAssociationTarget.withInstanceIds(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    instanceEventWindowAssociationTarget.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    instanceEventWindowAssociationTarget.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("dedicatedHostIdSet", targetDepth)) {
                    instanceEventWindowAssociationTarget.withDedicatedHostIds(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("dedicatedHostIdSet/item", targetDepth)) {
                    instanceEventWindowAssociationTarget.withDedicatedHostIds(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return instanceEventWindowAssociationTarget;
                }
            }
        }
    }

    private static InstanceEventWindowAssociationTargetStaxUnmarshaller instance;

    public static InstanceEventWindowAssociationTargetStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceEventWindowAssociationTargetStaxUnmarshaller();
        return instance;
    }
}
