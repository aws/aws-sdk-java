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
package com.amazonaws.services.timestreaminfluxdb.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.timestreaminfluxdb.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DbInstanceSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DbInstanceSummaryJsonUnmarshaller implements Unmarshaller<DbInstanceSummary, JsonUnmarshallerContext> {

    public DbInstanceSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        DbInstanceSummary dbInstanceSummary = new DbInstanceSummary();

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
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    dbInstanceSummary.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    dbInstanceSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    dbInstanceSummary.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    dbInstanceSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("endpoint", targetDepth)) {
                    context.nextToken();
                    dbInstanceSummary.setEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dbInstanceType", targetDepth)) {
                    context.nextToken();
                    dbInstanceSummary.setDbInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dbStorageType", targetDepth)) {
                    context.nextToken();
                    dbInstanceSummary.setDbStorageType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("allocatedStorage", targetDepth)) {
                    context.nextToken();
                    dbInstanceSummary.setAllocatedStorage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("deploymentType", targetDepth)) {
                    context.nextToken();
                    dbInstanceSummary.setDeploymentType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return dbInstanceSummary;
    }

    private static DbInstanceSummaryJsonUnmarshaller instance;

    public static DbInstanceSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DbInstanceSummaryJsonUnmarshaller();
        return instance;
    }
}
