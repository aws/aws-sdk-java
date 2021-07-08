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
package com.amazonaws.services.devopsguru.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.devopsguru.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ProactiveAnomaly JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProactiveAnomalyJsonUnmarshaller implements Unmarshaller<ProactiveAnomaly, JsonUnmarshallerContext> {

    public ProactiveAnomaly unmarshall(JsonUnmarshallerContext context) throws Exception {
        ProactiveAnomaly proactiveAnomaly = new ProactiveAnomaly();

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
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    proactiveAnomaly.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Severity", targetDepth)) {
                    context.nextToken();
                    proactiveAnomaly.setSeverity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    proactiveAnomaly.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UpdateTime", targetDepth)) {
                    context.nextToken();
                    proactiveAnomaly.setUpdateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("AnomalyTimeRange", targetDepth)) {
                    context.nextToken();
                    proactiveAnomaly.setAnomalyTimeRange(AnomalyTimeRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AnomalyReportedTimeRange", targetDepth)) {
                    context.nextToken();
                    proactiveAnomaly.setAnomalyReportedTimeRange(AnomalyReportedTimeRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PredictionTimeRange", targetDepth)) {
                    context.nextToken();
                    proactiveAnomaly.setPredictionTimeRange(PredictionTimeRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SourceDetails", targetDepth)) {
                    context.nextToken();
                    proactiveAnomaly.setSourceDetails(AnomalySourceDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AssociatedInsightId", targetDepth)) {
                    context.nextToken();
                    proactiveAnomaly.setAssociatedInsightId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceCollection", targetDepth)) {
                    context.nextToken();
                    proactiveAnomaly.setResourceCollection(ResourceCollectionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Limit", targetDepth)) {
                    context.nextToken();
                    proactiveAnomaly.setLimit(context.getUnmarshaller(Double.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return proactiveAnomaly;
    }

    private static ProactiveAnomalyJsonUnmarshaller instance;

    public static ProactiveAnomalyJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProactiveAnomalyJsonUnmarshaller();
        return instance;
    }
}
