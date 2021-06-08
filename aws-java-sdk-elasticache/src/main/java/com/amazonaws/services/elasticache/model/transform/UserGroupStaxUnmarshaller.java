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
package com.amazonaws.services.elasticache.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * UserGroup StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserGroupStaxUnmarshaller implements Unmarshaller<UserGroup, StaxUnmarshallerContext> {

    public UserGroup unmarshall(StaxUnmarshallerContext context) throws Exception {
        UserGroup userGroup = new UserGroup();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return userGroup;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("UserGroupId", targetDepth)) {
                    userGroup.setUserGroupId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    userGroup.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Engine", targetDepth)) {
                    userGroup.setEngine(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UserIds", targetDepth)) {
                    userGroup.withUserIds(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("UserIds/member", targetDepth)) {
                    userGroup.withUserIds(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PendingChanges", targetDepth)) {
                    userGroup.setPendingChanges(UserGroupPendingChangesStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ReplicationGroups", targetDepth)) {
                    userGroup.withReplicationGroups(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("ReplicationGroups/member", targetDepth)) {
                    userGroup.withReplicationGroups(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ARN", targetDepth)) {
                    userGroup.setARN(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return userGroup;
                }
            }
        }
    }

    private static UserGroupStaxUnmarshaller instance;

    public static UserGroupStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new UserGroupStaxUnmarshaller();
        return instance;
    }
}
