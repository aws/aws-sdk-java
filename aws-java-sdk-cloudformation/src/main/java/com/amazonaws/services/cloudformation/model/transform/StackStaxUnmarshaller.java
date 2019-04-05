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
package com.amazonaws.services.cloudformation.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * Stack StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StackStaxUnmarshaller implements Unmarshaller<Stack, StaxUnmarshallerContext> {

    public Stack unmarshall(StaxUnmarshallerContext context) throws Exception {
        Stack stack = new Stack();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return stack;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("StackId", targetDepth)) {
                    stack.setStackId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StackName", targetDepth)) {
                    stack.setStackName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ChangeSetId", targetDepth)) {
                    stack.setChangeSetId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Description", targetDepth)) {
                    stack.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Parameters", targetDepth)) {
                    stack.withParameters(new ArrayList<Parameter>());
                    continue;
                }

                if (context.testExpression("Parameters/member", targetDepth)) {
                    stack.withParameters(ParameterStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CreationTime", targetDepth)) {
                    stack.setCreationTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("DeletionTime", targetDepth)) {
                    stack.setDeletionTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("LastUpdatedTime", targetDepth)) {
                    stack.setLastUpdatedTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("RollbackConfiguration", targetDepth)) {
                    stack.setRollbackConfiguration(RollbackConfigurationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StackStatus", targetDepth)) {
                    stack.setStackStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StackStatusReason", targetDepth)) {
                    stack.setStackStatusReason(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DisableRollback", targetDepth)) {
                    stack.setDisableRollback(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NotificationARNs", targetDepth)) {
                    stack.withNotificationARNs(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("NotificationARNs/member", targetDepth)) {
                    stack.withNotificationARNs(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TimeoutInMinutes", targetDepth)) {
                    stack.setTimeoutInMinutes(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Capabilities", targetDepth)) {
                    stack.withCapabilities(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("Capabilities/member", targetDepth)) {
                    stack.withCapabilities(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Outputs", targetDepth)) {
                    stack.withOutputs(new ArrayList<Output>());
                    continue;
                }

                if (context.testExpression("Outputs/member", targetDepth)) {
                    stack.withOutputs(OutputStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RoleARN", targetDepth)) {
                    stack.setRoleARN(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Tags", targetDepth)) {
                    stack.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("Tags/member", targetDepth)) {
                    stack.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EnableTerminationProtection", targetDepth)) {
                    stack.setEnableTerminationProtection(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ParentId", targetDepth)) {
                    stack.setParentId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RootId", targetDepth)) {
                    stack.setRootId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DriftInformation", targetDepth)) {
                    stack.setDriftInformation(StackDriftInformationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return stack;
                }
            }
        }
    }

    private static StackStaxUnmarshaller instance;

    public static StackStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new StackStaxUnmarshaller();
        return instance;
    }
}
