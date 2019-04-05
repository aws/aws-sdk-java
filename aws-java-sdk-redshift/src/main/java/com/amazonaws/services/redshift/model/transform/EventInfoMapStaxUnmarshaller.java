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
package com.amazonaws.services.redshift.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * EventInfoMap StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventInfoMapStaxUnmarshaller implements Unmarshaller<EventInfoMap, StaxUnmarshallerContext> {

    public EventInfoMap unmarshall(StaxUnmarshallerContext context) throws Exception {
        EventInfoMap eventInfoMap = new EventInfoMap();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 3;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return eventInfoMap;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("EventId", targetDepth)) {
                    eventInfoMap.setEventId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EventCategories", targetDepth)) {
                    eventInfoMap.withEventCategories(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("EventCategories/EventCategory", targetDepth)) {
                    eventInfoMap.withEventCategories(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EventDescription", targetDepth)) {
                    eventInfoMap.setEventDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Severity", targetDepth)) {
                    eventInfoMap.setSeverity(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return eventInfoMap;
                }
            }
        }
    }

    private static EventInfoMapStaxUnmarshaller instance;

    public static EventInfoMapStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new EventInfoMapStaxUnmarshaller();
        return instance;
    }
}
