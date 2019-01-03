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
package com.amazonaws.services.rds.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ValidDBInstanceModificationsMessage StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidDBInstanceModificationsMessageStaxUnmarshaller implements Unmarshaller<ValidDBInstanceModificationsMessage, StaxUnmarshallerContext> {

    public ValidDBInstanceModificationsMessage unmarshall(StaxUnmarshallerContext context) throws Exception {
        ValidDBInstanceModificationsMessage validDBInstanceModificationsMessage = new ValidDBInstanceModificationsMessage();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 3;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return validDBInstanceModificationsMessage;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Storage", targetDepth)) {
                    validDBInstanceModificationsMessage.withStorage(new ArrayList<ValidStorageOptions>());
                    continue;
                }

                if (context.testExpression("Storage/ValidStorageOptions", targetDepth)) {
                    validDBInstanceModificationsMessage.withStorage(ValidStorageOptionsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ValidProcessorFeatures", targetDepth)) {
                    validDBInstanceModificationsMessage.withValidProcessorFeatures(new ArrayList<AvailableProcessorFeature>());
                    continue;
                }

                if (context.testExpression("ValidProcessorFeatures/AvailableProcessorFeature", targetDepth)) {
                    validDBInstanceModificationsMessage.withValidProcessorFeatures(AvailableProcessorFeatureStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return validDBInstanceModificationsMessage;
                }
            }
        }
    }

    private static ValidDBInstanceModificationsMessageStaxUnmarshaller instance;

    public static ValidDBInstanceModificationsMessageStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ValidDBInstanceModificationsMessageStaxUnmarshaller();
        return instance;
    }
}
