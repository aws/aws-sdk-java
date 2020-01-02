/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ConfusionMatrix JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfusionMatrixJsonUnmarshaller implements Unmarshaller<ConfusionMatrix, JsonUnmarshallerContext> {

    public ConfusionMatrix unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConfusionMatrix confusionMatrix = new ConfusionMatrix();

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
                if (context.testExpression("NumTruePositives", targetDepth)) {
                    context.nextToken();
                    confusionMatrix.setNumTruePositives(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("NumFalsePositives", targetDepth)) {
                    context.nextToken();
                    confusionMatrix.setNumFalsePositives(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("NumTrueNegatives", targetDepth)) {
                    context.nextToken();
                    confusionMatrix.setNumTrueNegatives(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("NumFalseNegatives", targetDepth)) {
                    context.nextToken();
                    confusionMatrix.setNumFalseNegatives(context.getUnmarshaller(Long.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return confusionMatrix;
    }

    private static ConfusionMatrixJsonUnmarshaller instance;

    public static ConfusionMatrixJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConfusionMatrixJsonUnmarshaller();
        return instance;
    }
}
