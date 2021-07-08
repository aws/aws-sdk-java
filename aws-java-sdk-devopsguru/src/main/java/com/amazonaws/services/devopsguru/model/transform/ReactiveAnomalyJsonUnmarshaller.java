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
 * ReactiveAnomaly JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReactiveAnomalyJsonUnmarshaller implements Unmarshaller<ReactiveAnomaly, JsonUnmarshallerContext> {

    public ReactiveAnomaly unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReactiveAnomaly reactiveAnomaly = new ReactiveAnomaly();

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
                    reactiveAnomaly.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Severity", targetDepth)) {
                    context.nextToken();
                    reactiveAnomaly.setSeverity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    reactiveAnomaly.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AnomalyTimeRange", targetDepth)) {
                    context.nextToken();
                    reactiveAnomaly.setAnomalyTimeRange(AnomalyTimeRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AnomalyReportedTimeRange", targetDepth)) {
                    context.nextToken();
                    reactiveAnomaly.setAnomalyReportedTimeRange(AnomalyReportedTimeRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SourceDetails", targetDepth)) {
                    context.nextToken();
                    reactiveAnomaly.setSourceDetails(AnomalySourceDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AssociatedInsightId", targetDepth)) {
                    context.nextToken();
                    reactiveAnomaly.setAssociatedInsightId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceCollection", targetDepth)) {
                    context.nextToken();
                    reactiveAnomaly.setResourceCollection(ResourceCollectionJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return reactiveAnomaly;
    }

    private static ReactiveAnomalyJsonUnmarshaller instance;

    public static ReactiveAnomalyJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReactiveAnomalyJsonUnmarshaller();
        return instance;
    }
}
