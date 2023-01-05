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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EvaluateDataQuality JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluateDataQualityJsonUnmarshaller implements Unmarshaller<EvaluateDataQuality, JsonUnmarshallerContext> {

    public EvaluateDataQuality unmarshall(JsonUnmarshallerContext context) throws Exception {
        EvaluateDataQuality evaluateDataQuality = new EvaluateDataQuality();

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
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    evaluateDataQuality.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Inputs", targetDepth)) {
                    context.nextToken();
                    evaluateDataQuality.setInputs(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Ruleset", targetDepth)) {
                    context.nextToken();
                    evaluateDataQuality.setRuleset(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Output", targetDepth)) {
                    context.nextToken();
                    evaluateDataQuality.setOutput(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PublishingOptions", targetDepth)) {
                    context.nextToken();
                    evaluateDataQuality.setPublishingOptions(DQResultsPublishingOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StopJobOnFailureOptions", targetDepth)) {
                    context.nextToken();
                    evaluateDataQuality.setStopJobOnFailureOptions(DQStopJobOnFailureOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return evaluateDataQuality;
    }

    private static EvaluateDataQualityJsonUnmarshaller instance;

    public static EvaluateDataQualityJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EvaluateDataQualityJsonUnmarshaller();
        return instance;
    }
}
