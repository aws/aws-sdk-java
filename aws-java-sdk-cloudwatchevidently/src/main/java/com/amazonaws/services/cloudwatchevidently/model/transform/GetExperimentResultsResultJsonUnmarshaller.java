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
package com.amazonaws.services.cloudwatchevidently.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudwatchevidently.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetExperimentResultsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetExperimentResultsResultJsonUnmarshaller implements Unmarshaller<GetExperimentResultsResult, JsonUnmarshallerContext> {

    public GetExperimentResultsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetExperimentResultsResult getExperimentResultsResult = new GetExperimentResultsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getExperimentResultsResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("details", targetDepth)) {
                    context.nextToken();
                    getExperimentResultsResult.setDetails(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("reports", targetDepth)) {
                    context.nextToken();
                    getExperimentResultsResult.setReports(new ListUnmarshaller<ExperimentReport>(ExperimentReportJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("resultsData", targetDepth)) {
                    context.nextToken();
                    getExperimentResultsResult.setResultsData(new ListUnmarshaller<ExperimentResultsData>(ExperimentResultsDataJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("timestamps", targetDepth)) {
                    context.nextToken();
                    getExperimentResultsResult.setTimestamps(new ListUnmarshaller<java.util.Date>(DateJsonUnmarshallerFactory.getInstance("unixTimestamp"))

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

        return getExperimentResultsResult;
    }

    private static GetExperimentResultsResultJsonUnmarshaller instance;

    public static GetExperimentResultsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetExperimentResultsResultJsonUnmarshaller();
        return instance;
    }
}
