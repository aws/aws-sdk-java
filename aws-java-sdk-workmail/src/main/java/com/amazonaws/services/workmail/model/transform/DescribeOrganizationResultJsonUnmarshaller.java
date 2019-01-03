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
package com.amazonaws.services.workmail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.workmail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeOrganizationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOrganizationResultJsonUnmarshaller implements Unmarshaller<DescribeOrganizationResult, JsonUnmarshallerContext> {

    public DescribeOrganizationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeOrganizationResult describeOrganizationResult = new DescribeOrganizationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeOrganizationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("OrganizationId", targetDepth)) {
                    context.nextToken();
                    describeOrganizationResult.setOrganizationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Alias", targetDepth)) {
                    context.nextToken();
                    describeOrganizationResult.setAlias(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    describeOrganizationResult.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DirectoryId", targetDepth)) {
                    context.nextToken();
                    describeOrganizationResult.setDirectoryId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DirectoryType", targetDepth)) {
                    context.nextToken();
                    describeOrganizationResult.setDirectoryType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultMailDomain", targetDepth)) {
                    context.nextToken();
                    describeOrganizationResult.setDefaultMailDomain(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CompletedDate", targetDepth)) {
                    context.nextToken();
                    describeOrganizationResult.setCompletedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ErrorMessage", targetDepth)) {
                    context.nextToken();
                    describeOrganizationResult.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeOrganizationResult;
    }

    private static DescribeOrganizationResultJsonUnmarshaller instance;

    public static DescribeOrganizationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeOrganizationResultJsonUnmarshaller();
        return instance;
    }
}
