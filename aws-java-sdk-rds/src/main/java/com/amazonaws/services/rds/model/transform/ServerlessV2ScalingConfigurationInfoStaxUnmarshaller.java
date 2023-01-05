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
package com.amazonaws.services.rds.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ServerlessV2ScalingConfigurationInfo StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerlessV2ScalingConfigurationInfoStaxUnmarshaller implements Unmarshaller<ServerlessV2ScalingConfigurationInfo, StaxUnmarshallerContext> {

    public ServerlessV2ScalingConfigurationInfo unmarshall(StaxUnmarshallerContext context) throws Exception {
        ServerlessV2ScalingConfigurationInfo serverlessV2ScalingConfigurationInfo = new ServerlessV2ScalingConfigurationInfo();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return serverlessV2ScalingConfigurationInfo;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("MinCapacity", targetDepth)) {
                    serverlessV2ScalingConfigurationInfo.setMinCapacity(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MaxCapacity", targetDepth)) {
                    serverlessV2ScalingConfigurationInfo.setMaxCapacity(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return serverlessV2ScalingConfigurationInfo;
                }
            }
        }
    }

    private static ServerlessV2ScalingConfigurationInfoStaxUnmarshaller instance;

    public static ServerlessV2ScalingConfigurationInfoStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServerlessV2ScalingConfigurationInfoStaxUnmarshaller();
        return instance;
    }
}
