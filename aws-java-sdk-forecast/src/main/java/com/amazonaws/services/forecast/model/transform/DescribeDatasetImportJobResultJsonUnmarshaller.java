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
package com.amazonaws.services.forecast.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.forecast.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeDatasetImportJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDatasetImportJobResultJsonUnmarshaller implements Unmarshaller<DescribeDatasetImportJobResult, JsonUnmarshallerContext> {

    public DescribeDatasetImportJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeDatasetImportJobResult describeDatasetImportJobResult = new DescribeDatasetImportJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeDatasetImportJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("DatasetImportJobName", targetDepth)) {
                    context.nextToken();
                    describeDatasetImportJobResult.setDatasetImportJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatasetImportJobArn", targetDepth)) {
                    context.nextToken();
                    describeDatasetImportJobResult.setDatasetImportJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatasetArn", targetDepth)) {
                    context.nextToken();
                    describeDatasetImportJobResult.setDatasetArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TimestampFormat", targetDepth)) {
                    context.nextToken();
                    describeDatasetImportJobResult.setTimestampFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataSource", targetDepth)) {
                    context.nextToken();
                    describeDatasetImportJobResult.setDataSource(DataSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FieldStatistics", targetDepth)) {
                    context.nextToken();
                    describeDatasetImportJobResult.setFieldStatistics(new MapUnmarshaller<String, Statistics>(context.getUnmarshaller(String.class),
                            StatisticsJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("DataSize", targetDepth)) {
                    context.nextToken();
                    describeDatasetImportJobResult.setDataSize(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describeDatasetImportJobResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Message", targetDepth)) {
                    context.nextToken();
                    describeDatasetImportJobResult.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeDatasetImportJobResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModificationTime", targetDepth)) {
                    context.nextToken();
                    describeDatasetImportJobResult.setLastModificationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeDatasetImportJobResult;
    }

    private static DescribeDatasetImportJobResultJsonUnmarshaller instance;

    public static DescribeDatasetImportJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeDatasetImportJobResultJsonUnmarshaller();
        return instance;
    }
}
