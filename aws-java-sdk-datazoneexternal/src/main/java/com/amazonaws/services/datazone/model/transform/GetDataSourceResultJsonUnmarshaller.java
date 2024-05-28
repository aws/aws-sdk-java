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
 * GetDataSourceResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataSourceResultJsonUnmarshaller implements Unmarshaller<GetDataSourceResult, JsonUnmarshallerContext> {

    public GetDataSourceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetDataSourceResult getDataSourceResult = new GetDataSourceResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getDataSourceResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("assetFormsOutput", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setAssetFormsOutput(new ListUnmarshaller<FormOutput>(FormOutputJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("configuration", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setConfiguration(DataSourceConfigurationOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("domainId", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setDomainId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("enableSetting", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setEnableSetting(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environmentId", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setEnvironmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("errorMessage", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setErrorMessage(DataSourceErrorMessageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastRunAssetCount", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setLastRunAssetCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("lastRunAt", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setLastRunAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("lastRunErrorMessage", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setLastRunErrorMessage(DataSourceErrorMessageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lastRunStatus", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setLastRunStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("projectId", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setProjectId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("publishOnImport", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setPublishOnImport(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("recommendation", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setRecommendation(RecommendationConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("schedule", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setSchedule(ScheduleConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getDataSourceResult;
    }

    private static GetDataSourceResultJsonUnmarshaller instance;

    public static GetDataSourceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDataSourceResultJsonUnmarshaller();
        return instance;
    }
}
