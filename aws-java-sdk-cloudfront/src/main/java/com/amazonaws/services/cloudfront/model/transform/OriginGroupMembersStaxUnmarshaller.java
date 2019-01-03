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
package com.amazonaws.services.cloudfront.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * OriginGroupMembers StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OriginGroupMembersStaxUnmarshaller implements Unmarshaller<OriginGroupMembers, StaxUnmarshallerContext> {

    public OriginGroupMembers unmarshall(StaxUnmarshallerContext context) throws Exception {
        OriginGroupMembers originGroupMembers = new OriginGroupMembers();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return originGroupMembers;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Quantity", targetDepth)) {
                    originGroupMembers.setQuantity(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Items", targetDepth)) {
                    originGroupMembers.withItems(new ArrayList<OriginGroupMember>());
                    continue;
                }

                if (context.testExpression("Items/OriginGroupMember", targetDepth)) {
                    originGroupMembers.withItems(OriginGroupMemberStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return originGroupMembers;
                }
            }
        }
    }

    private static OriginGroupMembersStaxUnmarshaller instance;

    public static OriginGroupMembersStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new OriginGroupMembersStaxUnmarshaller();
        return instance;
    }
}
