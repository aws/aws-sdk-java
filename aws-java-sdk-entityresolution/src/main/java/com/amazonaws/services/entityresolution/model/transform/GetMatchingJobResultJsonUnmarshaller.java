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
package com.amazonaws.services.entityresolution.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.entityresolution.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetMatchingJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMatchingJobResultJsonUnmarshaller implements Unmarshaller<GetMatchingJobResult, JsonUnmarshallerContext> {

    public GetMatchingJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetMatchingJobResult getMatchingJobResult = new GetMatchingJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getMatchingJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("endTime", targetDepth)) {
                    context.nextToken();
                    getMatchingJobResult.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("errorDetails", targetDepth)) {
                    context.nextToken();
                    getMatchingJobResult.setErrorDetails(ErrorDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("jobId", targetDepth)) {
                    context.nextToken();
                    getMatchingJobResult.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("metrics", targetDepth)) {
                    context.nextToken();
                    getMatchingJobResult.setMetrics(JobMetricsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("outputSourceConfig", targetDepth)) {
                    context.nextToken();
                    getMatchingJobResult.setOutputSourceConfig(new ListUnmarshaller<JobOutputSource>(JobOutputSourceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    getMatchingJobResult.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getMatchingJobResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getMatchingJobResult;
    }

    private static GetMatchingJobResultJsonUnmarshaller instance;

    public static GetMatchingJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetMatchingJobResultJsonUnmarshaller();
        return instance;
    }
}
