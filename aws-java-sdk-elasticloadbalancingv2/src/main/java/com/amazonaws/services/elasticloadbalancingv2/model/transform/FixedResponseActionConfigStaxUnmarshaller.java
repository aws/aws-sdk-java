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
package com.amazonaws.services.elasticloadbalancingv2.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticloadbalancingv2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * FixedResponseActionConfig StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FixedResponseActionConfigStaxUnmarshaller implements Unmarshaller<FixedResponseActionConfig, StaxUnmarshallerContext> {

    public FixedResponseActionConfig unmarshall(StaxUnmarshallerContext context) throws Exception {
        FixedResponseActionConfig fixedResponseActionConfig = new FixedResponseActionConfig();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return fixedResponseActionConfig;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("MessageBody", targetDepth)) {
                    fixedResponseActionConfig.setMessageBody(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StatusCode", targetDepth)) {
                    fixedResponseActionConfig.setStatusCode(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ContentType", targetDepth)) {
                    fixedResponseActionConfig.setContentType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return fixedResponseActionConfig;
                }
            }
        }
    }

    private static FixedResponseActionConfigStaxUnmarshaller instance;

    public static FixedResponseActionConfigStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new FixedResponseActionConfigStaxUnmarshaller();
        return instance;
    }
}
