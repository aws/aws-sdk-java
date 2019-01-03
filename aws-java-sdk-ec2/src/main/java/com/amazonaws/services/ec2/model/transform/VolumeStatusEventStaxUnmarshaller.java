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
package com.amazonaws.services.ec2.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * VolumeStatusEvent StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VolumeStatusEventStaxUnmarshaller implements Unmarshaller<VolumeStatusEvent, StaxUnmarshallerContext> {

    public VolumeStatusEvent unmarshall(StaxUnmarshallerContext context) throws Exception {
        VolumeStatusEvent volumeStatusEvent = new VolumeStatusEvent();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return volumeStatusEvent;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("description", targetDepth)) {
                    volumeStatusEvent.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("eventId", targetDepth)) {
                    volumeStatusEvent.setEventId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("eventType", targetDepth)) {
                    volumeStatusEvent.setEventType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("notAfter", targetDepth)) {
                    volumeStatusEvent.setNotAfter(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("notBefore", targetDepth)) {
                    volumeStatusEvent.setNotBefore(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return volumeStatusEvent;
                }
            }
        }
    }

    private static VolumeStatusEventStaxUnmarshaller instance;

    public static VolumeStatusEventStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new VolumeStatusEventStaxUnmarshaller();
        return instance;
    }
}
