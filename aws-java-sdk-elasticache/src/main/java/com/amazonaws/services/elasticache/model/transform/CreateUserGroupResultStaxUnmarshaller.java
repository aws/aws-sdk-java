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
 * CreateUserGroupResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUserGroupResultStaxUnmarshaller implements Unmarshaller<CreateUserGroupResult, StaxUnmarshallerContext> {

    public CreateUserGroupResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        CreateUserGroupResult createUserGroupResult = new CreateUserGroupResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return createUserGroupResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("UserGroupId", targetDepth)) {
                    createUserGroupResult.setUserGroupId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    createUserGroupResult.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Engine", targetDepth)) {
                    createUserGroupResult.setEngine(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UserIds", targetDepth)) {
                    createUserGroupResult.withUserIds(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("UserIds/member", targetDepth)) {
                    createUserGroupResult.withUserIds(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PendingChanges", targetDepth)) {
                    createUserGroupResult.setPendingChanges(UserGroupPendingChangesStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ReplicationGroups", targetDepth)) {
                    createUserGroupResult.withReplicationGroups(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("ReplicationGroups/member", targetDepth)) {
                    createUserGroupResult.withReplicationGroups(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ARN", targetDepth)) {
                    createUserGroupResult.setARN(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return createUserGroupResult;
                }
            }
        }
    }

    private static CreateUserGroupResultStaxUnmarshaller instance;

    public static CreateUserGroupResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateUserGroupResultStaxUnmarshaller();
        return instance;
    }
}
