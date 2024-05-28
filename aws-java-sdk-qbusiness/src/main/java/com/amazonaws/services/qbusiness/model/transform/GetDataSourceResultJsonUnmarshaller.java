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
package com.amazonaws.services.qbusiness.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.qbusiness.model.*;
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
                if (context.testExpression("applicationId", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("indexId", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setIndexId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dataSourceId", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setDataSourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dataSourceArn", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setDataSourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("displayName", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vpcConfiguration", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setVpcConfiguration(DataSourceVpcConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("syncSchedule", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setSyncSchedule(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("error", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setError(ErrorDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("documentEnrichmentConfiguration", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setDocumentEnrichmentConfiguration(DocumentEnrichmentConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
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
