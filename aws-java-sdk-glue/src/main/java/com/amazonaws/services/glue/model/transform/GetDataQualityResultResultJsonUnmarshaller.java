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
 * GetDataQualityResultResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataQualityResultResultJsonUnmarshaller implements Unmarshaller<GetDataQualityResultResult, JsonUnmarshallerContext> {

    public GetDataQualityResultResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetDataQualityResultResult getDataQualityResultResult = new GetDataQualityResultResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getDataQualityResultResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ResultId", targetDepth)) {
                    context.nextToken();
                    getDataQualityResultResult.setResultId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Score", targetDepth)) {
                    context.nextToken();
                    getDataQualityResultResult.setScore(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("DataSource", targetDepth)) {
                    context.nextToken();
                    getDataQualityResultResult.setDataSource(DataSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RulesetName", targetDepth)) {
                    context.nextToken();
                    getDataQualityResultResult.setRulesetName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EvaluationContext", targetDepth)) {
                    context.nextToken();
                    getDataQualityResultResult.setEvaluationContext(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartedOn", targetDepth)) {
                    context.nextToken();
                    getDataQualityResultResult.setStartedOn(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CompletedOn", targetDepth)) {
                    context.nextToken();
                    getDataQualityResultResult.setCompletedOn(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("JobName", targetDepth)) {
                    context.nextToken();
                    getDataQualityResultResult.setJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobRunId", targetDepth)) {
                    context.nextToken();
                    getDataQualityResultResult.setJobRunId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RulesetEvaluationRunId", targetDepth)) {
                    context.nextToken();
                    getDataQualityResultResult.setRulesetEvaluationRunId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RuleResults", targetDepth)) {
                    context.nextToken();
                    getDataQualityResultResult.setRuleResults(new ListUnmarshaller<DataQualityRuleResult>(DataQualityRuleResultJsonUnmarshaller.getInstance())

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

        return getDataQualityResultResult;
    }

    private static GetDataQualityResultResultJsonUnmarshaller instance;

    public static GetDataQualityResultResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDataQualityResultResultJsonUnmarshaller();
        return instance;
    }
}
