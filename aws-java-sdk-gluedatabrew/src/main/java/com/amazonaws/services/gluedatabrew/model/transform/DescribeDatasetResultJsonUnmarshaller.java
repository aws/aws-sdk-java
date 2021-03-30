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
package com.amazonaws.services.gluedatabrew.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.gluedatabrew.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeDatasetResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDatasetResultJsonUnmarshaller implements Unmarshaller<DescribeDatasetResult, JsonUnmarshallerContext> {

    public DescribeDatasetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeDatasetResult describeDatasetResult = new DescribeDatasetResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeDatasetResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("CreatedBy", targetDepth)) {
                    context.nextToken();
                    describeDatasetResult.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreateDate", targetDepth)) {
                    context.nextToken();
                    describeDatasetResult.setCreateDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    describeDatasetResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Format", targetDepth)) {
                    context.nextToken();
                    describeDatasetResult.setFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FormatOptions", targetDepth)) {
                    context.nextToken();
                    describeDatasetResult.setFormatOptions(FormatOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Input", targetDepth)) {
                    context.nextToken();
                    describeDatasetResult.setInput(InputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastModifiedDate", targetDepth)) {
                    context.nextToken();
                    describeDatasetResult.setLastModifiedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedBy", targetDepth)) {
                    context.nextToken();
                    describeDatasetResult.setLastModifiedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Source", targetDepth)) {
                    context.nextToken();
                    describeDatasetResult.setSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PathOptions", targetDepth)) {
                    context.nextToken();
                    describeDatasetResult.setPathOptions(PathOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    describeDatasetResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("ResourceArn", targetDepth)) {
                    context.nextToken();
                    describeDatasetResult.setResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeDatasetResult;
    }

    private static DescribeDatasetResultJsonUnmarshaller instance;

    public static DescribeDatasetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeDatasetResultJsonUnmarshaller();
        return instance;
    }
}
