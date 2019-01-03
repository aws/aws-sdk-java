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
package com.amazonaws.services.autoscaling.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * LifecycleHookSpecification StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifecycleHookSpecificationStaxUnmarshaller implements Unmarshaller<LifecycleHookSpecification, StaxUnmarshallerContext> {

    public LifecycleHookSpecification unmarshall(StaxUnmarshallerContext context) throws Exception {
        LifecycleHookSpecification lifecycleHookSpecification = new LifecycleHookSpecification();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return lifecycleHookSpecification;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("LifecycleHookName", targetDepth)) {
                    lifecycleHookSpecification.setLifecycleHookName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LifecycleTransition", targetDepth)) {
                    lifecycleHookSpecification.setLifecycleTransition(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NotificationMetadata", targetDepth)) {
                    lifecycleHookSpecification.setNotificationMetadata(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("HeartbeatTimeout", targetDepth)) {
                    lifecycleHookSpecification.setHeartbeatTimeout(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DefaultResult", targetDepth)) {
                    lifecycleHookSpecification.setDefaultResult(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NotificationTargetARN", targetDepth)) {
                    lifecycleHookSpecification.setNotificationTargetARN(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RoleARN", targetDepth)) {
                    lifecycleHookSpecification.setRoleARN(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return lifecycleHookSpecification;
                }
            }
        }
    }

    private static LifecycleHookSpecificationStaxUnmarshaller instance;

    public static LifecycleHookSpecificationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new LifecycleHookSpecificationStaxUnmarshaller();
        return instance;
    }
}
