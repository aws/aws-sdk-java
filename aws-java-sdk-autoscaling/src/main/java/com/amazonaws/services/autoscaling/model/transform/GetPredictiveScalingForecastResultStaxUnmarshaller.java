/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * GetPredictiveScalingForecastResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPredictiveScalingForecastResultStaxUnmarshaller implements Unmarshaller<GetPredictiveScalingForecastResult, StaxUnmarshallerContext> {

    public GetPredictiveScalingForecastResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetPredictiveScalingForecastResult getPredictiveScalingForecastResult = new GetPredictiveScalingForecastResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return getPredictiveScalingForecastResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("LoadForecast", targetDepth)) {
                    getPredictiveScalingForecastResult.withLoadForecast(new ArrayList<LoadForecast>());
                    continue;
                }

                if (context.testExpression("LoadForecast/member", targetDepth)) {
                    getPredictiveScalingForecastResult.withLoadForecast(LoadForecastStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CapacityForecast", targetDepth)) {
                    getPredictiveScalingForecastResult.setCapacityForecast(CapacityForecastStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UpdateTime", targetDepth)) {
                    getPredictiveScalingForecastResult.setUpdateTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getPredictiveScalingForecastResult;
                }
            }
        }
    }

    private static GetPredictiveScalingForecastResultStaxUnmarshaller instance;

    public static GetPredictiveScalingForecastResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetPredictiveScalingForecastResultStaxUnmarshaller();
        return instance;
    }
}
