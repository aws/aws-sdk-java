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
package com.amazonaws.services.stepfunctions.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.stepfunctions.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InspectionData JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InspectionDataJsonUnmarshaller implements Unmarshaller<InspectionData, JsonUnmarshallerContext> {

    public InspectionData unmarshall(JsonUnmarshallerContext context) throws Exception {
        InspectionData inspectionData = new InspectionData();

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
                if (context.testExpression("input", targetDepth)) {
                    context.nextToken();
                    inspectionData.setInput(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("afterInputPath", targetDepth)) {
                    context.nextToken();
                    inspectionData.setAfterInputPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("afterParameters", targetDepth)) {
                    context.nextToken();
                    inspectionData.setAfterParameters(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("result", targetDepth)) {
                    context.nextToken();
                    inspectionData.setResult(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("afterResultSelector", targetDepth)) {
                    context.nextToken();
                    inspectionData.setAfterResultSelector(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("afterResultPath", targetDepth)) {
                    context.nextToken();
                    inspectionData.setAfterResultPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("request", targetDepth)) {
                    context.nextToken();
                    inspectionData.setRequest(InspectionDataRequestJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("response", targetDepth)) {
                    context.nextToken();
                    inspectionData.setResponse(InspectionDataResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return inspectionData;
    }

    private static InspectionDataJsonUnmarshaller instance;

    public static InspectionDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InspectionDataJsonUnmarshaller();
        return instance;
    }
}
