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
package com.amazonaws.services.cloudfront.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * SessionStickinessConfig StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SessionStickinessConfigStaxUnmarshaller implements Unmarshaller<SessionStickinessConfig, StaxUnmarshallerContext> {

    public SessionStickinessConfig unmarshall(StaxUnmarshallerContext context) throws Exception {
        SessionStickinessConfig sessionStickinessConfig = new SessionStickinessConfig();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return sessionStickinessConfig;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("IdleTTL", targetDepth)) {
                    sessionStickinessConfig.setIdleTTL(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MaximumTTL", targetDepth)) {
                    sessionStickinessConfig.setMaximumTTL(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return sessionStickinessConfig;
                }
            }
        }
    }

    private static SessionStickinessConfigStaxUnmarshaller instance;

    public static SessionStickinessConfigStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new SessionStickinessConfigStaxUnmarshaller();
        return instance;
    }
}
