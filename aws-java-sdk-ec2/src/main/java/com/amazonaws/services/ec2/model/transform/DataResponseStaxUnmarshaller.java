/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DataResponse StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataResponseStaxUnmarshaller implements Unmarshaller<DataResponse, StaxUnmarshallerContext> {

    public DataResponse unmarshall(StaxUnmarshallerContext context) throws Exception {
        DataResponse dataResponse = new DataResponse();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return dataResponse;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("id", targetDepth)) {
                    dataResponse.setId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("source", targetDepth)) {
                    dataResponse.setSource(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("destination", targetDepth)) {
                    dataResponse.setDestination(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("metric", targetDepth)) {
                    dataResponse.setMetric(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("statistic", targetDepth)) {
                    dataResponse.setStatistic(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("period", targetDepth)) {
                    dataResponse.setPeriod(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("metricPointSet", targetDepth)) {
                    dataResponse.withMetricPoints(new ArrayList<MetricPoint>());
                    continue;
                }

                if (context.testExpression("metricPointSet/item", targetDepth)) {
                    dataResponse.withMetricPoints(MetricPointStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return dataResponse;
                }
            }
        }
    }

    private static DataResponseStaxUnmarshaller instance;

    public static DataResponseStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DataResponseStaxUnmarshaller();
        return instance;
    }
}
