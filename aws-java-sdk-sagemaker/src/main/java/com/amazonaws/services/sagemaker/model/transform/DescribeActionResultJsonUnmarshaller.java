/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeActionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeActionResultJsonUnmarshaller implements Unmarshaller<DescribeActionResult, JsonUnmarshallerContext> {

    public DescribeActionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeActionResult describeActionResult = new DescribeActionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeActionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ActionName", targetDepth)) {
                    context.nextToken();
                    describeActionResult.setActionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ActionArn", targetDepth)) {
                    context.nextToken();
                    describeActionResult.setActionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Source", targetDepth)) {
                    context.nextToken();
                    describeActionResult.setSource(ActionSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ActionType", targetDepth)) {
                    context.nextToken();
                    describeActionResult.setActionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    describeActionResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describeActionResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Properties", targetDepth)) {
                    context.nextToken();
                    describeActionResult.setProperties(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeActionResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    context.nextToken();
                    describeActionResult.setCreatedBy(UserContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    describeActionResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedBy", targetDepth)) {
                    context.nextToken();
                    describeActionResult.setLastModifiedBy(UserContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MetadataProperties", targetDepth)) {
                    context.nextToken();
                    describeActionResult.setMetadataProperties(MetadataPropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeActionResult;
    }

    private static DescribeActionResultJsonUnmarshaller instance;

    public static DescribeActionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeActionResultJsonUnmarshaller();
        return instance;
    }
}
