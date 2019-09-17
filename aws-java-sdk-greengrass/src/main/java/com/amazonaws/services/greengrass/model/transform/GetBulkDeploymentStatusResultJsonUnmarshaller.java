/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrass.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.greengrass.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetBulkDeploymentStatusResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBulkDeploymentStatusResultJsonUnmarshaller implements Unmarshaller<GetBulkDeploymentStatusResult, JsonUnmarshallerContext> {

    public GetBulkDeploymentStatusResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetBulkDeploymentStatusResult getBulkDeploymentStatusResult = new GetBulkDeploymentStatusResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getBulkDeploymentStatusResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("BulkDeploymentMetrics", targetDepth)) {
                    context.nextToken();
                    getBulkDeploymentStatusResult.setBulkDeploymentMetrics(BulkDeploymentMetricsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("BulkDeploymentStatus", targetDepth)) {
                    context.nextToken();
                    getBulkDeploymentStatusResult.setBulkDeploymentStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    getBulkDeploymentStatusResult.setCreatedAt(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ErrorDetails", targetDepth)) {
                    context.nextToken();
                    getBulkDeploymentStatusResult.setErrorDetails(new ListUnmarshaller<ErrorDetail>(ErrorDetailJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ErrorMessage", targetDepth)) {
                    context.nextToken();
                    getBulkDeploymentStatusResult.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    getBulkDeploymentStatusResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getBulkDeploymentStatusResult;
    }

    private static GetBulkDeploymentStatusResultJsonUnmarshaller instance;

    public static GetBulkDeploymentStatusResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetBulkDeploymentStatusResultJsonUnmarshaller();
        return instance;
    }
}
