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
package com.amazonaws.services.mwaa.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mwaa.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MetricDatum JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricDatumJsonUnmarshaller implements Unmarshaller<MetricDatum, JsonUnmarshallerContext> {

    public MetricDatum unmarshall(JsonUnmarshallerContext context) throws Exception {
        MetricDatum metricDatum = new MetricDatum();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Dimensions", targetDepth)) {
                    context.nextToken();
                    metricDatum.setDimensions(new ListUnmarshaller<Dimension>(DimensionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("MetricName", targetDepth)) {
                    context.nextToken();
                    metricDatum.setMetricName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatisticValues", targetDepth)) {
                    context.nextToken();
                    metricDatum.setStatisticValues(StatisticSetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Timestamp", targetDepth)) {
                    context.nextToken();
                    metricDatum.setTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Unit", targetDepth)) {
                    context.nextToken();
                    metricDatum.setUnit(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Value", targetDepth)) {
                    context.nextToken();
                    metricDatum.setValue(context.getUnmarshaller(Double.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return metricDatum;
    }

    private static MetricDatumJsonUnmarshaller instance;

    public static MetricDatumJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MetricDatumJsonUnmarshaller();
        return instance;
    }
}
