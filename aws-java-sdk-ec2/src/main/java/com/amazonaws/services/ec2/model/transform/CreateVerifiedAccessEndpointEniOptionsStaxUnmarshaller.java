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
package com.amazonaws.services.ec2.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * CreateVerifiedAccessEndpointEniOptions StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVerifiedAccessEndpointEniOptionsStaxUnmarshaller implements Unmarshaller<CreateVerifiedAccessEndpointEniOptions, StaxUnmarshallerContext> {

    public CreateVerifiedAccessEndpointEniOptions unmarshall(StaxUnmarshallerContext context) throws Exception {
        CreateVerifiedAccessEndpointEniOptions createVerifiedAccessEndpointEniOptions = new CreateVerifiedAccessEndpointEniOptions();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return createVerifiedAccessEndpointEniOptions;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("NetworkInterfaceId", targetDepth)) {
                    createVerifiedAccessEndpointEniOptions.setNetworkInterfaceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Protocol", targetDepth)) {
                    createVerifiedAccessEndpointEniOptions.setProtocol(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Port", targetDepth)) {
                    createVerifiedAccessEndpointEniOptions.setPort(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return createVerifiedAccessEndpointEniOptions;
                }
            }
        }
    }

    private static CreateVerifiedAccessEndpointEniOptionsStaxUnmarshaller instance;

    public static CreateVerifiedAccessEndpointEniOptionsStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateVerifiedAccessEndpointEniOptionsStaxUnmarshaller();
        return instance;
    }
}
