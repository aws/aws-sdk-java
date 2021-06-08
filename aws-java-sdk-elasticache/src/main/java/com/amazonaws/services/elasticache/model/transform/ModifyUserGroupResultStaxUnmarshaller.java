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
 * ModifyUserGroupResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyUserGroupResultStaxUnmarshaller implements Unmarshaller<ModifyUserGroupResult, StaxUnmarshallerContext> {

    public ModifyUserGroupResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ModifyUserGroupResult modifyUserGroupResult = new ModifyUserGroupResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return modifyUserGroupResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("UserGroupId", targetDepth)) {
                    modifyUserGroupResult.setUserGroupId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    modifyUserGroupResult.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Engine", targetDepth)) {
                    modifyUserGroupResult.setEngine(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UserIds", targetDepth)) {
                    modifyUserGroupResult.withUserIds(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("UserIds/member", targetDepth)) {
                    modifyUserGroupResult.withUserIds(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PendingChanges", targetDepth)) {
                    modifyUserGroupResult.setPendingChanges(UserGroupPendingChangesStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ReplicationGroups", targetDepth)) {
                    modifyUserGroupResult.withReplicationGroups(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("ReplicationGroups/member", targetDepth)) {
                    modifyUserGroupResult.withReplicationGroups(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ARN", targetDepth)) {
                    modifyUserGroupResult.setARN(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return modifyUserGroupResult;
                }
            }
        }
    }

    private static ModifyUserGroupResultStaxUnmarshaller instance;

    public static ModifyUserGroupResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModifyUserGroupResultStaxUnmarshaller();
        return instance;
    }
}
