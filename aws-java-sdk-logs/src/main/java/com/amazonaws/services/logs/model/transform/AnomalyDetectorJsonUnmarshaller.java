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
 * AnomalyDetector JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnomalyDetectorJsonUnmarshaller implements Unmarshaller<AnomalyDetector, JsonUnmarshallerContext> {

    public AnomalyDetector unmarshall(JsonUnmarshallerContext context) throws Exception {
        AnomalyDetector anomalyDetector = new AnomalyDetector();

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
                if (context.testExpression("anomalyDetectorArn", targetDepth)) {
                    context.nextToken();
                    anomalyDetector.setAnomalyDetectorArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("detectorName", targetDepth)) {
                    context.nextToken();
                    anomalyDetector.setDetectorName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("logGroupArnList", targetDepth)) {
                    context.nextToken();
                    anomalyDetector.setLogGroupArnList(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("evaluationFrequency", targetDepth)) {
                    context.nextToken();
                    anomalyDetector.setEvaluationFrequency(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("filterPattern", targetDepth)) {
                    context.nextToken();
                    anomalyDetector.setFilterPattern(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("anomalyDetectorStatus", targetDepth)) {
                    context.nextToken();
                    anomalyDetector.setAnomalyDetectorStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("kmsKeyId", targetDepth)) {
                    context.nextToken();
                    anomalyDetector.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTimeStamp", targetDepth)) {
                    context.nextToken();
                    anomalyDetector.setCreationTimeStamp(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("lastModifiedTimeStamp", targetDepth)) {
                    context.nextToken();
                    anomalyDetector.setLastModifiedTimeStamp(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("anomalyVisibilityTime", targetDepth)) {
                    context.nextToken();
                    anomalyDetector.setAnomalyVisibilityTime(context.getUnmarshaller(Long.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return anomalyDetector;
    }

    private static AnomalyDetectorJsonUnmarshaller instance;

    public static AnomalyDetectorJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AnomalyDetectorJsonUnmarshaller();
        return instance;
    }
}
