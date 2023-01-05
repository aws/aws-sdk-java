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
 * DescribeExplainabilityResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeExplainabilityResultJsonUnmarshaller implements Unmarshaller<DescribeExplainabilityResult, JsonUnmarshallerContext> {

    public DescribeExplainabilityResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeExplainabilityResult describeExplainabilityResult = new DescribeExplainabilityResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeExplainabilityResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ExplainabilityArn", targetDepth)) {
                    context.nextToken();
                    describeExplainabilityResult.setExplainabilityArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExplainabilityName", targetDepth)) {
                    context.nextToken();
                    describeExplainabilityResult.setExplainabilityName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceArn", targetDepth)) {
                    context.nextToken();
                    describeExplainabilityResult.setResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExplainabilityConfig", targetDepth)) {
                    context.nextToken();
                    describeExplainabilityResult.setExplainabilityConfig(ExplainabilityConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EnableVisualization", targetDepth)) {
                    context.nextToken();
                    describeExplainabilityResult.setEnableVisualization(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("DataSource", targetDepth)) {
                    context.nextToken();
                    describeExplainabilityResult.setDataSource(DataSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Schema", targetDepth)) {
                    context.nextToken();
                    describeExplainabilityResult.setSchema(SchemaJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StartDateTime", targetDepth)) {
                    context.nextToken();
                    describeExplainabilityResult.setStartDateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndDateTime", targetDepth)) {
                    context.nextToken();
                    describeExplainabilityResult.setEndDateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedTimeRemainingInMinutes", targetDepth)) {
                    context.nextToken();
                    describeExplainabilityResult.setEstimatedTimeRemainingInMinutes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Message", targetDepth)) {
                    context.nextToken();
                    describeExplainabilityResult.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describeExplainabilityResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeExplainabilityResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModificationTime", targetDepth)) {
                    context.nextToken();
                    describeExplainabilityResult.setLastModificationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeExplainabilityResult;
    }

    private static DescribeExplainabilityResultJsonUnmarshaller instance;

    public static DescribeExplainabilityResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeExplainabilityResultJsonUnmarshaller();
        return instance;
    }
}
