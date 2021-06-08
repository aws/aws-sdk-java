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
package com.amazonaws.services.ec2.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ClientConnectResponseOptions StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClientConnectResponseOptionsStaxUnmarshaller implements Unmarshaller<ClientConnectResponseOptions, StaxUnmarshallerContext> {

    public ClientConnectResponseOptions unmarshall(StaxUnmarshallerContext context) throws Exception {
        ClientConnectResponseOptions clientConnectResponseOptions = new ClientConnectResponseOptions();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return clientConnectResponseOptions;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("enabled", targetDepth)) {
                    clientConnectResponseOptions.setEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("lambdaFunctionArn", targetDepth)) {
                    clientConnectResponseOptions.setLambdaFunctionArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("status", targetDepth)) {
                    clientConnectResponseOptions.setStatus(ClientVpnEndpointAttributeStatusStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return clientConnectResponseOptions;
                }
            }
        }
    }

    private static ClientConnectResponseOptionsStaxUnmarshaller instance;

    public static ClientConnectResponseOptionsStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClientConnectResponseOptionsStaxUnmarshaller();
        return instance;
    }
}
