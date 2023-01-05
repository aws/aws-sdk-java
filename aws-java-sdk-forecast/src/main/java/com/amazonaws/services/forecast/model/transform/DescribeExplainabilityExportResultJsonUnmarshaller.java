/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.forecast.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.forecast.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeExplainabilityExportResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeExplainabilityExportResultJsonUnmarshaller implements Unmarshaller<DescribeExplainabilityExportResult, JsonUnmarshallerContext> {

    public DescribeExplainabilityExportResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeExplainabilityExportResult describeExplainabilityExportResult = new DescribeExplainabilityExportResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeExplainabilityExportResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ExplainabilityExportArn", targetDepth)) {
                    context.nextToken();
                    describeExplainabilityExportResult.setExplainabilityExportArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExplainabilityExportName", targetDepth)) {
                    context.nextToken();
                    describeExplainabilityExportResult.setExplainabilityExportName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExplainabilityArn", targetDepth)) {
                    context.nextToken();
                    describeExplainabilityExportResult.setExplainabilityArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Destination", targetDepth)) {
                    context.nextToken();
                    describeExplainabilityExportResult.setDestination(DataDestinationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Message", targetDepth)) {
                    context.nextToken();
                    describeExplainabilityExportResult.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describeExplainabilityExportResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeExplainabilityExportResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModificationTime", targetDepth)) {
                    context.nextToken();
                    describeExplainabilityExportResult.setLastModificationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Format", targetDepth)) {
                    context.nextToken();
                    describeExplainabilityExportResult.setFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeExplainabilityExportResult;
    }

    private static DescribeExplainabilityExportResultJsonUnmarshaller instance;

    public static DescribeExplainabilityExportResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeExplainabilityExportResultJsonUnmarshaller();
        return instance;
    }
}
