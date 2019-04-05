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
package com.amazonaws.services.elasticloadbalancingv2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticloadbalancingv2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * SetSubnetsResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetSubnetsResultStaxUnmarshaller implements Unmarshaller<SetSubnetsResult, StaxUnmarshallerContext> {

    public SetSubnetsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        SetSubnetsResult setSubnetsResult = new SetSubnetsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return setSubnetsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("AvailabilityZones", targetDepth)) {
                    setSubnetsResult.withAvailabilityZones(new ArrayList<AvailabilityZone>());
                    continue;
                }

                if (context.testExpression("AvailabilityZones/member", targetDepth)) {
                    setSubnetsResult.withAvailabilityZones(AvailabilityZoneStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return setSubnetsResult;
                }
            }
        }
    }

    private static SetSubnetsResultStaxUnmarshaller instance;

    public static SetSubnetsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new SetSubnetsResultStaxUnmarshaller();
        return instance;
    }
}
