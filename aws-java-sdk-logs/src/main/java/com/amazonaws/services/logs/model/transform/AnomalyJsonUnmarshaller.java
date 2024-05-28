/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.logs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.logs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Anomaly JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnomalyJsonUnmarshaller implements Unmarshaller<Anomaly, JsonUnmarshallerContext> {

    public Anomaly unmarshall(JsonUnmarshallerContext context) throws Exception {
        Anomaly anomaly = new Anomaly();

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
                if (context.testExpression("anomalyId", targetDepth)) {
                    context.nextToken();
                    anomaly.setAnomalyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("patternId", targetDepth)) {
                    context.nextToken();
                    anomaly.setPatternId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("anomalyDetectorArn", targetDepth)) {
                    context.nextToken();
                    anomaly.setAnomalyDetectorArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("patternString", targetDepth)) {
                    context.nextToken();
                    anomaly.setPatternString(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("patternRegex", targetDepth)) {
                    context.nextToken();
                    anomaly.setPatternRegex(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("priority", targetDepth)) {
                    context.nextToken();
                    anomaly.setPriority(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("firstSeen", targetDepth)) {
                    context.nextToken();
                    anomaly.setFirstSeen(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("lastSeen", targetDepth)) {
                    context.nextToken();
                    anomaly.setLastSeen(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    anomaly.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("active", targetDepth)) {
                    context.nextToken();
                    anomaly.setActive(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    context.nextToken();
                    anomaly.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("histogram", targetDepth)) {
                    context.nextToken();
                    anomaly.setHistogram(new MapUnmarshaller<String, Long>(context.getUnmarshaller(String.class), context.getUnmarshaller(Long.class))
                            .unmarshall(context));
                }
                if (context.testExpression("logSamples", targetDepth)) {
                    context.nextToken();
                    anomaly.setLogSamples(new ListUnmarshaller<LogEvent>(LogEventJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("patternTokens", targetDepth)) {
                    context.nextToken();
                    anomaly.setPatternTokens(new ListUnmarshaller<PatternToken>(PatternTokenJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("logGroupArnList", targetDepth)) {
                    context.nextToken();
                    anomaly.setLogGroupArnList(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("suppressed", targetDepth)) {
                    context.nextToken();
                    anomaly.setSuppressed(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("suppressedDate", targetDepth)) {
                    context.nextToken();
                    anomaly.setSuppressedDate(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("suppressedUntil", targetDepth)) {
                    context.nextToken();
                    anomaly.setSuppressedUntil(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("isPatternLevelSuppression", targetDepth)) {
                    context.nextToken();
                    anomaly.setIsPatternLevelSuppression(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return anomaly;
    }

    private static AnomalyJsonUnmarshaller instance;

    public static AnomalyJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AnomalyJsonUnmarshaller();
        return instance;
    }
}
