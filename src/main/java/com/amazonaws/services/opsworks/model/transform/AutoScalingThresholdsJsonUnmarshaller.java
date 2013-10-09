/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.opsworks.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;


/**
 * Auto Scaling Thresholds JSON Unmarshaller
 */
public class AutoScalingThresholdsJsonUnmarshaller implements Unmarshaller<AutoScalingThresholds, JsonUnmarshallerContext> {

    

    public AutoScalingThresholds unmarshall(JsonUnmarshallerContext context) throws Exception {
        AutoScalingThresholds autoScalingThresholds = new AutoScalingThresholds();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("InstanceCount", targetDepth)) {
                    context.nextToken();
                    autoScalingThresholds.setInstanceCount(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ThresholdsWaitTime", targetDepth)) {
                    context.nextToken();
                    autoScalingThresholds.setThresholdsWaitTime(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("IgnoreMetricsTime", targetDepth)) {
                    context.nextToken();
                    autoScalingThresholds.setIgnoreMetricsTime(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CpuThreshold", targetDepth)) {
                    context.nextToken();
                    autoScalingThresholds.setCpuThreshold(DoubleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MemoryThreshold", targetDepth)) {
                    context.nextToken();
                    autoScalingThresholds.setMemoryThreshold(DoubleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LoadThreshold", targetDepth)) {
                    context.nextToken();
                    autoScalingThresholds.setLoadThreshold(DoubleJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return autoScalingThresholds;
    }

    private static AutoScalingThresholdsJsonUnmarshaller instance;
    public static AutoScalingThresholdsJsonUnmarshaller getInstance() {
        if (instance == null) instance = new AutoScalingThresholdsJsonUnmarshaller();
        return instance;
    }
}
    