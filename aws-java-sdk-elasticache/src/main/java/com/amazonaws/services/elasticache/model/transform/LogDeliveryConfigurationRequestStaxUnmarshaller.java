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

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * LogDeliveryConfigurationRequest StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogDeliveryConfigurationRequestStaxUnmarshaller implements Unmarshaller<LogDeliveryConfigurationRequest, StaxUnmarshallerContext> {

    public LogDeliveryConfigurationRequest unmarshall(StaxUnmarshallerContext context) throws Exception {
        LogDeliveryConfigurationRequest logDeliveryConfigurationRequest = new LogDeliveryConfigurationRequest();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return logDeliveryConfigurationRequest;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("LogType", targetDepth)) {
                    logDeliveryConfigurationRequest.setLogType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DestinationType", targetDepth)) {
                    logDeliveryConfigurationRequest.setDestinationType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DestinationDetails", targetDepth)) {
                    logDeliveryConfigurationRequest.setDestinationDetails(DestinationDetailsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LogFormat", targetDepth)) {
                    logDeliveryConfigurationRequest.setLogFormat(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Enabled", targetDepth)) {
                    logDeliveryConfigurationRequest.setEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return logDeliveryConfigurationRequest;
                }
            }
        }
    }

    private static LogDeliveryConfigurationRequestStaxUnmarshaller instance;

    public static LogDeliveryConfigurationRequestStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new LogDeliveryConfigurationRequestStaxUnmarshaller();
        return instance;
    }
}
