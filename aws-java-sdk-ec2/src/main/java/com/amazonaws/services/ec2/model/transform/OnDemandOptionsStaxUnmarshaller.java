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
 * OnDemandOptions StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OnDemandOptionsStaxUnmarshaller implements Unmarshaller<OnDemandOptions, StaxUnmarshallerContext> {

    public OnDemandOptions unmarshall(StaxUnmarshallerContext context) throws Exception {
        OnDemandOptions onDemandOptions = new OnDemandOptions();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return onDemandOptions;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("allocationStrategy", targetDepth)) {
                    onDemandOptions.setAllocationStrategy(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("singleInstanceType", targetDepth)) {
                    onDemandOptions.setSingleInstanceType(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("singleAvailabilityZone", targetDepth)) {
                    onDemandOptions.setSingleAvailabilityZone(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("minTargetCapacity", targetDepth)) {
                    onDemandOptions.setMinTargetCapacity(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return onDemandOptions;
                }
            }
        }
    }

    private static OnDemandOptionsStaxUnmarshaller instance;

    public static OnDemandOptionsStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new OnDemandOptionsStaxUnmarshaller();
        return instance;
    }
}
