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
package com.amazonaws.services.simpleemail.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * Destination StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DestinationStaxUnmarshaller implements Unmarshaller<Destination, StaxUnmarshallerContext> {

    public Destination unmarshall(StaxUnmarshallerContext context) throws Exception {
        Destination destination = new Destination();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return destination;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ToAddresses", targetDepth)) {
                    destination.withToAddresses(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("ToAddresses/member", targetDepth)) {
                    destination.withToAddresses(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CcAddresses", targetDepth)) {
                    destination.withCcAddresses(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("CcAddresses/member", targetDepth)) {
                    destination.withCcAddresses(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BccAddresses", targetDepth)) {
                    destination.withBccAddresses(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("BccAddresses/member", targetDepth)) {
                    destination.withBccAddresses(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return destination;
                }
            }
        }
    }

    private static DestinationStaxUnmarshaller instance;

    public static DestinationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DestinationStaxUnmarshaller();
        return instance;
    }
}
