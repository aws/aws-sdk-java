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
 * DeleteDataSourceResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDataSourceResultJsonUnmarshaller implements Unmarshaller<DeleteDataSourceResult, JsonUnmarshallerContext> {

    public DeleteDataSourceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteDataSourceResult deleteDataSourceResult = new DeleteDataSourceResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return deleteDataSourceResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("assetFormsOutput", targetDepth)) {
                    context.nextToken();
                    deleteDataSourceResult.setAssetFormsOutput(new ListUnmarshaller<FormOutput>(FormOutputJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("configuration", targetDepth)) {
                    context.nextToken();
                    deleteDataSourceResult.setConfiguration(DataSourceConfigurationOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    deleteDataSourceResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    deleteDataSourceResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("domainId", targetDepth)) {
                    context.nextToken();
                    deleteDataSourceResult.setDomainId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("enableSetting", targetDepth)) {
                    context.nextToken();
                    deleteDataSourceResult.setEnableSetting(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environmentId", targetDepth)) {
                    context.nextToken();
                    deleteDataSourceResult.setEnvironmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("errorMessage", targetDepth)) {
                    context.nextToken();
                    deleteDataSourceResult.setErrorMessage(DataSourceErrorMessageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    deleteDataSourceResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastRunAt", targetDepth)) {
                    context.nextToken();
                    deleteDataSourceResult.setLastRunAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("lastRunErrorMessage", targetDepth)) {
                    context.nextToken();
                    deleteDataSourceResult.setLastRunErrorMessage(DataSourceErrorMessageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lastRunStatus", targetDepth)) {
                    context.nextToken();
                    deleteDataSourceResult.setLastRunStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    deleteDataSourceResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("projectId", targetDepth)) {
                    context.nextToken();
                    deleteDataSourceResult.setProjectId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("publishOnImport", targetDepth)) {
                    context.nextToken();
                    deleteDataSourceResult.setPublishOnImport(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("schedule", targetDepth)) {
                    context.nextToken();
                    deleteDataSourceResult.setSchedule(ScheduleConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    deleteDataSourceResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    deleteDataSourceResult.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    deleteDataSourceResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return deleteDataSourceResult;
    }

    private static DeleteDataSourceResultJsonUnmarshaller instance;

    public static DeleteDataSourceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteDataSourceResultJsonUnmarshaller();
        return instance;
    }
}
