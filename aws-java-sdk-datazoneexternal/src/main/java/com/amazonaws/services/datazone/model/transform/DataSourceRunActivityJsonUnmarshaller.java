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
package com.amazonaws.services.datazone.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.datazone.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DataSourceRunActivity JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceRunActivityJsonUnmarshaller implements Unmarshaller<DataSourceRunActivity, JsonUnmarshallerContext> {

    public DataSourceRunActivity unmarshall(JsonUnmarshallerContext context) throws Exception {
        DataSourceRunActivity dataSourceRunActivity = new DataSourceRunActivity();

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
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    dataSourceRunActivity.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("dataAssetId", targetDepth)) {
                    context.nextToken();
                    dataSourceRunActivity.setDataAssetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dataAssetStatus", targetDepth)) {
                    context.nextToken();
                    dataSourceRunActivity.setDataAssetStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dataSourceRunId", targetDepth)) {
                    context.nextToken();
                    dataSourceRunActivity.setDataSourceRunId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("database", targetDepth)) {
                    context.nextToken();
                    dataSourceRunActivity.setDatabase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("errorMessage", targetDepth)) {
                    context.nextToken();
                    dataSourceRunActivity.setErrorMessage(DataSourceErrorMessageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("projectId", targetDepth)) {
                    context.nextToken();
                    dataSourceRunActivity.setProjectId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("technicalDescription", targetDepth)) {
                    context.nextToken();
                    dataSourceRunActivity.setTechnicalDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("technicalName", targetDepth)) {
                    context.nextToken();
                    dataSourceRunActivity.setTechnicalName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    dataSourceRunActivity.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return dataSourceRunActivity;
    }

    private static DataSourceRunActivityJsonUnmarshaller instance;

    public static DataSourceRunActivityJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DataSourceRunActivityJsonUnmarshaller();
        return instance;
    }
}
