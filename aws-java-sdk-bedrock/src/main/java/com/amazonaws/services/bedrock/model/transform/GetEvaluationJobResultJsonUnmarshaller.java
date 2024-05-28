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
package com.amazonaws.services.bedrock.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.bedrock.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetEvaluationJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEvaluationJobResultJsonUnmarshaller implements Unmarshaller<GetEvaluationJobResult, JsonUnmarshallerContext> {

    public GetEvaluationJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetEvaluationJobResult getEvaluationJobResult = new GetEvaluationJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getEvaluationJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("jobName", targetDepth)) {
                    context.nextToken();
                    getEvaluationJobResult.setJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getEvaluationJobResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobArn", targetDepth)) {
                    context.nextToken();
                    getEvaluationJobResult.setJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobDescription", targetDepth)) {
                    context.nextToken();
                    getEvaluationJobResult.setJobDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    getEvaluationJobResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("customerEncryptionKeyId", targetDepth)) {
                    context.nextToken();
                    getEvaluationJobResult.setCustomerEncryptionKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobType", targetDepth)) {
                    context.nextToken();
                    getEvaluationJobResult.setJobType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("evaluationConfig", targetDepth)) {
                    context.nextToken();
                    getEvaluationJobResult.setEvaluationConfig(EvaluationConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("inferenceConfig", targetDepth)) {
                    context.nextToken();
                    getEvaluationJobResult.setInferenceConfig(EvaluationInferenceConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("outputDataConfig", targetDepth)) {
                    context.nextToken();
                    getEvaluationJobResult.setOutputDataConfig(EvaluationOutputDataConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    getEvaluationJobResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("lastModifiedTime", targetDepth)) {
                    context.nextToken();
                    getEvaluationJobResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("failureMessages", targetDepth)) {
                    context.nextToken();
                    getEvaluationJobResult.setFailureMessages(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return getEvaluationJobResult;
    }

    private static GetEvaluationJobResultJsonUnmarshaller instance;

    public static GetEvaluationJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetEvaluationJobResultJsonUnmarshaller();
        return instance;
    }
}
