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
 * GetIndexResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIndexResultJsonUnmarshaller implements Unmarshaller<GetIndexResult, JsonUnmarshallerContext> {

    public GetIndexResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetIndexResult getIndexResult = new GetIndexResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getIndexResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("applicationId", targetDepth)) {
                    context.nextToken();
                    getIndexResult.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("indexId", targetDepth)) {
                    context.nextToken();
                    getIndexResult.setIndexId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("displayName", targetDepth)) {
                    context.nextToken();
                    getIndexResult.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    getIndexResult.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("indexArn", targetDepth)) {
                    context.nextToken();
                    getIndexResult.setIndexArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getIndexResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    getIndexResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    getIndexResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    getIndexResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("capacityConfiguration", targetDepth)) {
                    context.nextToken();
                    getIndexResult.setCapacityConfiguration(IndexCapacityConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("documentAttributeConfigurations", targetDepth)) {
                    context.nextToken();
                    getIndexResult.setDocumentAttributeConfigurations(new ListUnmarshaller<DocumentAttributeConfiguration>(
                            DocumentAttributeConfigurationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("error", targetDepth)) {
                    context.nextToken();
                    getIndexResult.setError(ErrorDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("indexStatistics", targetDepth)) {
                    context.nextToken();
                    getIndexResult.setIndexStatistics(IndexStatisticsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getIndexResult;
    }

    private static GetIndexResultJsonUnmarshaller instance;

    public static GetIndexResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetIndexResultJsonUnmarshaller();
        return instance;
    }
}
