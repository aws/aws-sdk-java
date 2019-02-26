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

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DescribeLifecycleHooksResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLifecycleHooksResultStaxUnmarshaller implements Unmarshaller<DescribeLifecycleHooksResult, StaxUnmarshallerContext> {

    public DescribeLifecycleHooksResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeLifecycleHooksResult describeLifecycleHooksResult = new DescribeLifecycleHooksResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeLifecycleHooksResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("LifecycleHooks", targetDepth)) {
                    describeLifecycleHooksResult.withLifecycleHooks(new ArrayList<LifecycleHook>());
                    continue;
                }

                if (context.testExpression("LifecycleHooks/member", targetDepth)) {
                    describeLifecycleHooksResult.withLifecycleHooks(LifecycleHookStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeLifecycleHooksResult;
                }
            }
        }
    }

    private static DescribeLifecycleHooksResultStaxUnmarshaller instance;

    public static DescribeLifecycleHooksResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeLifecycleHooksResultStaxUnmarshaller();
        return instance;
    }
}
