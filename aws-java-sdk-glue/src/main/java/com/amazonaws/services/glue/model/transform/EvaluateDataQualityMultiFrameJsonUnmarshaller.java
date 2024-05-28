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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EvaluateDataQualityMultiFrame JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluateDataQualityMultiFrameJsonUnmarshaller implements Unmarshaller<EvaluateDataQualityMultiFrame, JsonUnmarshallerContext> {

    public EvaluateDataQualityMultiFrame unmarshall(JsonUnmarshallerContext context) throws Exception {
        EvaluateDataQualityMultiFrame evaluateDataQualityMultiFrame = new EvaluateDataQualityMultiFrame();

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
                    evaluateDataQualityMultiFrame.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Inputs", targetDepth)) {
                    context.nextToken();
                    evaluateDataQualityMultiFrame.setInputs(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("AdditionalDataSources", targetDepth)) {
                    context.nextToken();
                    evaluateDataQualityMultiFrame.setAdditionalDataSources(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Ruleset", targetDepth)) {
                    context.nextToken();
                    evaluateDataQualityMultiFrame.setRuleset(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PublishingOptions", targetDepth)) {
                    context.nextToken();
                    evaluateDataQualityMultiFrame.setPublishingOptions(DQResultsPublishingOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AdditionalOptions", targetDepth)) {
                    context.nextToken();
                    evaluateDataQualityMultiFrame.setAdditionalOptions(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("StopJobOnFailureOptions", targetDepth)) {
                    context.nextToken();
                    evaluateDataQualityMultiFrame.setStopJobOnFailureOptions(DQStopJobOnFailureOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return evaluateDataQualityMultiFrame;
    }

    private static EvaluateDataQualityMultiFrameJsonUnmarshaller instance;

    public static EvaluateDataQualityMultiFrameJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EvaluateDataQualityMultiFrameJsonUnmarshaller();
        return instance;
    }
}
