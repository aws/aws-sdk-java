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
package com.amazonaws.services.athena.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.athena.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * QueryStage JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryStageJsonUnmarshaller implements Unmarshaller<QueryStage, JsonUnmarshallerContext> {

    public QueryStage unmarshall(JsonUnmarshallerContext context) throws Exception {
        QueryStage queryStage = new QueryStage();

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
                if (context.testExpression("StageId", targetDepth)) {
                    context.nextToken();
                    queryStage.setStageId(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    queryStage.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutputBytes", targetDepth)) {
                    context.nextToken();
                    queryStage.setOutputBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("OutputRows", targetDepth)) {
                    context.nextToken();
                    queryStage.setOutputRows(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("InputBytes", targetDepth)) {
                    context.nextToken();
                    queryStage.setInputBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("InputRows", targetDepth)) {
                    context.nextToken();
                    queryStage.setInputRows(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionTime", targetDepth)) {
                    context.nextToken();
                    queryStage.setExecutionTime(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("QueryStagePlan", targetDepth)) {
                    context.nextToken();
                    queryStage.setQueryStagePlan(QueryStagePlanNodeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SubStages", targetDepth)) {
                    context.nextToken();
                    queryStage.setSubStages(new ListUnmarshaller<QueryStage>(QueryStageJsonUnmarshaller.getInstance())

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

        return queryStage;
    }

    private static QueryStageJsonUnmarshaller instance;

    public static QueryStageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new QueryStageJsonUnmarshaller();
        return instance;
    }
}
