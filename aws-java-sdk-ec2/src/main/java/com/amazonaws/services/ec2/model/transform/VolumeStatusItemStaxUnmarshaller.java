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

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * VolumeStatusItem StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VolumeStatusItemStaxUnmarshaller implements Unmarshaller<VolumeStatusItem, StaxUnmarshallerContext> {

    public VolumeStatusItem unmarshall(StaxUnmarshallerContext context) throws Exception {
        VolumeStatusItem volumeStatusItem = new VolumeStatusItem();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return volumeStatusItem;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("actionsSet", targetDepth)) {
                    volumeStatusItem.withActions(new ArrayList<VolumeStatusAction>());
                    continue;
                }

                if (context.testExpression("actionsSet/item", targetDepth)) {
                    volumeStatusItem.withActions(VolumeStatusActionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("availabilityZone", targetDepth)) {
                    volumeStatusItem.setAvailabilityZone(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("eventsSet", targetDepth)) {
                    volumeStatusItem.withEvents(new ArrayList<VolumeStatusEvent>());
                    continue;
                }

                if (context.testExpression("eventsSet/item", targetDepth)) {
                    volumeStatusItem.withEvents(VolumeStatusEventStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("volumeId", targetDepth)) {
                    volumeStatusItem.setVolumeId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("volumeStatus", targetDepth)) {
                    volumeStatusItem.setVolumeStatus(VolumeStatusInfoStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return volumeStatusItem;
                }
            }
        }
    }

    private static VolumeStatusItemStaxUnmarshaller instance;

    public static VolumeStatusItemStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new VolumeStatusItemStaxUnmarshaller();
        return instance;
    }
}
