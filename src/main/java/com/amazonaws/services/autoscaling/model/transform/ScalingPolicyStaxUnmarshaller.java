/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.autoscaling.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Scaling Policy StAX Unmarshaller
 */
public class ScalingPolicyStaxUnmarshaller implements Unmarshaller<ScalingPolicy, StaxUnmarshallerContext> {

    public ScalingPolicy unmarshall(StaxUnmarshallerContext context) throws Exception {
        ScalingPolicy scalingPolicy = new ScalingPolicy();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        
        if (context.isStartOfDocument()) targetDepth += 2;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return scalingPolicy;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("AutoScalingGroupName", targetDepth)) {
                    scalingPolicy.setAutoScalingGroupName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PolicyName", targetDepth)) {
                    scalingPolicy.setPolicyName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ScalingAdjustment", targetDepth)) {
                    scalingPolicy.setScalingAdjustment(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("AdjustmentType", targetDepth)) {
                    scalingPolicy.setAdjustmentType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Cooldown", targetDepth)) {
                    scalingPolicy.setCooldown(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PolicyARN", targetDepth)) {
                    scalingPolicy.setPolicyARN(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Alarms/member", targetDepth)) {
                    scalingPolicy.getAlarms().add(AlarmStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("MinAdjustmentStep", targetDepth)) {
                    scalingPolicy.setMinAdjustmentStep(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return scalingPolicy;
                }
            }
        }
    }

    private static ScalingPolicyStaxUnmarshaller instance;
    public static ScalingPolicyStaxUnmarshaller getInstance() {
        if (instance == null) instance = new ScalingPolicyStaxUnmarshaller();
        return instance;
    }
}
    