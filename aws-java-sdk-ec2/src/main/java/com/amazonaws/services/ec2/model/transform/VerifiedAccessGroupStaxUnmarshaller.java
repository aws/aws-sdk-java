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
 * VerifiedAccessGroup StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifiedAccessGroupStaxUnmarshaller implements Unmarshaller<VerifiedAccessGroup, StaxUnmarshallerContext> {

    public VerifiedAccessGroup unmarshall(StaxUnmarshallerContext context) throws Exception {
        VerifiedAccessGroup verifiedAccessGroup = new VerifiedAccessGroup();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return verifiedAccessGroup;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("verifiedAccessGroupId", targetDepth)) {
                    verifiedAccessGroup.setVerifiedAccessGroupId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("verifiedAccessInstanceId", targetDepth)) {
                    verifiedAccessGroup.setVerifiedAccessInstanceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("description", targetDepth)) {
                    verifiedAccessGroup.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("owner", targetDepth)) {
                    verifiedAccessGroup.setOwner(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("verifiedAccessGroupArn", targetDepth)) {
                    verifiedAccessGroup.setVerifiedAccessGroupArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("creationTime", targetDepth)) {
                    verifiedAccessGroup.setCreationTime(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("lastUpdatedTime", targetDepth)) {
                    verifiedAccessGroup.setLastUpdatedTime(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("deletionTime", targetDepth)) {
                    verifiedAccessGroup.setDeletionTime(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    verifiedAccessGroup.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    verifiedAccessGroup.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return verifiedAccessGroup;
                }
            }
        }
    }

    private static VerifiedAccessGroupStaxUnmarshaller instance;

    public static VerifiedAccessGroupStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new VerifiedAccessGroupStaxUnmarshaller();
        return instance;
    }
}
