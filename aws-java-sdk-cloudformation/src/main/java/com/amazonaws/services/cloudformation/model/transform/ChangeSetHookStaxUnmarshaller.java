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
package com.amazonaws.services.cloudformation.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ChangeSetHook StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChangeSetHookStaxUnmarshaller implements Unmarshaller<ChangeSetHook, StaxUnmarshallerContext> {

    public ChangeSetHook unmarshall(StaxUnmarshallerContext context) throws Exception {
        ChangeSetHook changeSetHook = new ChangeSetHook();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return changeSetHook;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("InvocationPoint", targetDepth)) {
                    changeSetHook.setInvocationPoint(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("FailureMode", targetDepth)) {
                    changeSetHook.setFailureMode(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TypeName", targetDepth)) {
                    changeSetHook.setTypeName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TypeVersionId", targetDepth)) {
                    changeSetHook.setTypeVersionId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TypeConfigurationVersionId", targetDepth)) {
                    changeSetHook.setTypeConfigurationVersionId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TargetDetails", targetDepth)) {
                    changeSetHook.setTargetDetails(ChangeSetHookTargetDetailsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return changeSetHook;
                }
            }
        }
    }

    private static ChangeSetHookStaxUnmarshaller instance;

    public static ChangeSetHookStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ChangeSetHookStaxUnmarshaller();
        return instance;
    }
}
