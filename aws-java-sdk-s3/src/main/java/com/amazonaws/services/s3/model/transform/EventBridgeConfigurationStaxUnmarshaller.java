/*
 * Copyright 2021-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.s3.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.s3.model.EventBridgeConfiguration;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

class EventBridgeConfigurationStaxUnmarshaller implements
        Unmarshaller<EventBridgeConfiguration, StaxUnmarshallerContext> {

    private static final EventBridgeConfigurationStaxUnmarshaller instance = new EventBridgeConfigurationStaxUnmarshaller();

    public static EventBridgeConfigurationStaxUnmarshaller getInstance() {
        return instance;
    }

    private EventBridgeConfigurationStaxUnmarshaller() {
    }

    @Override
    public EventBridgeConfiguration unmarshall(StaxUnmarshallerContext context) throws Exception {
        int originalDepth = context.getCurrentDepth();

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument() || (xmlEvent.isEndElement() && context.getCurrentDepth() < originalDepth)) {
                return new EventBridgeConfiguration();
            }
        }
    }
}
