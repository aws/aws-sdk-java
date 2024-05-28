/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * InboundIntegration StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InboundIntegrationStaxUnmarshaller implements Unmarshaller<InboundIntegration, StaxUnmarshallerContext> {

    public InboundIntegration unmarshall(StaxUnmarshallerContext context) throws Exception {
        InboundIntegration inboundIntegration = new InboundIntegration();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return inboundIntegration;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("IntegrationArn", targetDepth)) {
                    inboundIntegration.setIntegrationArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SourceArn", targetDepth)) {
                    inboundIntegration.setSourceArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TargetArn", targetDepth)) {
                    inboundIntegration.setTargetArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    inboundIntegration.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Errors", targetDepth)) {
                    inboundIntegration.withErrors(new ArrayList<IntegrationError>());
                    continue;
                }

                if (context.testExpression("Errors/IntegrationError", targetDepth)) {
                    inboundIntegration.withErrors(IntegrationErrorStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CreateTime", targetDepth)) {
                    inboundIntegration.setCreateTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return inboundIntegration;
                }
            }
        }
    }

    private static InboundIntegrationStaxUnmarshaller instance;

    public static InboundIntegrationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new InboundIntegrationStaxUnmarshaller();
        return instance;
    }
}
