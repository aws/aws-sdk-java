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
package com.amazonaws.services.redshiftdataapi.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.redshiftdataapi.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SubStatementData JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubStatementDataJsonUnmarshaller implements Unmarshaller<SubStatementData, JsonUnmarshallerContext> {

    public SubStatementData unmarshall(JsonUnmarshallerContext context) throws Exception {
        SubStatementData subStatementData = new SubStatementData();

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
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    subStatementData.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Duration", targetDepth)) {
                    context.nextToken();
                    subStatementData.setDuration(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Error", targetDepth)) {
                    context.nextToken();
                    subStatementData.setError(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HasResultSet", targetDepth)) {
                    context.nextToken();
                    subStatementData.setHasResultSet(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    subStatementData.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QueryString", targetDepth)) {
                    context.nextToken();
                    subStatementData.setQueryString(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RedshiftQueryId", targetDepth)) {
                    context.nextToken();
                    subStatementData.setRedshiftQueryId(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ResultRows", targetDepth)) {
                    context.nextToken();
                    subStatementData.setResultRows(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ResultSize", targetDepth)) {
                    context.nextToken();
                    subStatementData.setResultSize(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    subStatementData.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UpdatedAt", targetDepth)) {
                    context.nextToken();
                    subStatementData.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return subStatementData;
    }

    private static SubStatementDataJsonUnmarshaller instance;

    public static SubStatementDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SubStatementDataJsonUnmarshaller();
        return instance;
    }
}
