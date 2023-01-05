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

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DescribeChangeSetHooksResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeChangeSetHooksResultStaxUnmarshaller implements Unmarshaller<DescribeChangeSetHooksResult, StaxUnmarshallerContext> {

    public DescribeChangeSetHooksResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeChangeSetHooksResult describeChangeSetHooksResult = new DescribeChangeSetHooksResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeChangeSetHooksResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ChangeSetId", targetDepth)) {
                    describeChangeSetHooksResult.setChangeSetId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ChangeSetName", targetDepth)) {
                    describeChangeSetHooksResult.setChangeSetName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Hooks", targetDepth)) {
                    describeChangeSetHooksResult.withHooks(new ArrayList<ChangeSetHook>());
                    continue;
                }

                if (context.testExpression("Hooks/member", targetDepth)) {
                    describeChangeSetHooksResult.withHooks(ChangeSetHookStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    describeChangeSetHooksResult.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NextToken", targetDepth)) {
                    describeChangeSetHooksResult.setNextToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StackId", targetDepth)) {
                    describeChangeSetHooksResult.setStackId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StackName", targetDepth)) {
                    describeChangeSetHooksResult.setStackName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeChangeSetHooksResult;
                }
            }
        }
    }

    private static DescribeChangeSetHooksResultStaxUnmarshaller instance;

    public static DescribeChangeSetHooksResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeChangeSetHooksResultStaxUnmarshaller();
        return instance;
    }
}
