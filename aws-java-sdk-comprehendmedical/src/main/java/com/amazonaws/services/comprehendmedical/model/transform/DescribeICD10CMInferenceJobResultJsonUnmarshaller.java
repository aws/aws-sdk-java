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
package com.amazonaws.services.comprehendmedical.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.comprehendmedical.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeICD10CMInferenceJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeICD10CMInferenceJobResultJsonUnmarshaller implements Unmarshaller<DescribeICD10CMInferenceJobResult, JsonUnmarshallerContext> {

    public DescribeICD10CMInferenceJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeICD10CMInferenceJobResult describeICD10CMInferenceJobResult = new DescribeICD10CMInferenceJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeICD10CMInferenceJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ComprehendMedicalAsyncJobProperties", targetDepth)) {
                    context.nextToken();
                    describeICD10CMInferenceJobResult.setComprehendMedicalAsyncJobProperties(ComprehendMedicalAsyncJobPropertiesJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeICD10CMInferenceJobResult;
    }

    private static DescribeICD10CMInferenceJobResultJsonUnmarshaller instance;

    public static DescribeICD10CMInferenceJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeICD10CMInferenceJobResultJsonUnmarshaller();
        return instance;
    }
}
