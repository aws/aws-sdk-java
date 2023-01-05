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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ClarifyCheckStepMetadata JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClarifyCheckStepMetadataJsonUnmarshaller implements Unmarshaller<ClarifyCheckStepMetadata, JsonUnmarshallerContext> {

    public ClarifyCheckStepMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        ClarifyCheckStepMetadata clarifyCheckStepMetadata = new ClarifyCheckStepMetadata();

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
                if (context.testExpression("CheckType", targetDepth)) {
                    context.nextToken();
                    clarifyCheckStepMetadata.setCheckType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BaselineUsedForDriftCheckConstraints", targetDepth)) {
                    context.nextToken();
                    clarifyCheckStepMetadata.setBaselineUsedForDriftCheckConstraints(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CalculatedBaselineConstraints", targetDepth)) {
                    context.nextToken();
                    clarifyCheckStepMetadata.setCalculatedBaselineConstraints(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelPackageGroupName", targetDepth)) {
                    context.nextToken();
                    clarifyCheckStepMetadata.setModelPackageGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ViolationReport", targetDepth)) {
                    context.nextToken();
                    clarifyCheckStepMetadata.setViolationReport(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CheckJobArn", targetDepth)) {
                    context.nextToken();
                    clarifyCheckStepMetadata.setCheckJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SkipCheck", targetDepth)) {
                    context.nextToken();
                    clarifyCheckStepMetadata.setSkipCheck(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RegisterNewBaseline", targetDepth)) {
                    context.nextToken();
                    clarifyCheckStepMetadata.setRegisterNewBaseline(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return clarifyCheckStepMetadata;
    }

    private static ClarifyCheckStepMetadataJsonUnmarshaller instance;

    public static ClarifyCheckStepMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClarifyCheckStepMetadataJsonUnmarshaller();
        return instance;
    }
}
