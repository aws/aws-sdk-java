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
package com.amazonaws.services.lookoutequipment.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lookoutequipment.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeDataIngestionJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDataIngestionJobResultJsonUnmarshaller implements Unmarshaller<DescribeDataIngestionJobResult, JsonUnmarshallerContext> {

    public DescribeDataIngestionJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeDataIngestionJobResult describeDataIngestionJobResult = new DescribeDataIngestionJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeDataIngestionJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("JobId", targetDepth)) {
                    context.nextToken();
                    describeDataIngestionJobResult.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatasetArn", targetDepth)) {
                    context.nextToken();
                    describeDataIngestionJobResult.setDatasetArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IngestionInputConfiguration", targetDepth)) {
                    context.nextToken();
                    describeDataIngestionJobResult
                            .setIngestionInputConfiguration(IngestionInputConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    describeDataIngestionJobResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    describeDataIngestionJobResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describeDataIngestionJobResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailedReason", targetDepth)) {
                    context.nextToken();
                    describeDataIngestionJobResult.setFailedReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataQualitySummary", targetDepth)) {
                    context.nextToken();
                    describeDataIngestionJobResult.setDataQualitySummary(DataQualitySummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("IngestedFilesSummary", targetDepth)) {
                    context.nextToken();
                    describeDataIngestionJobResult.setIngestedFilesSummary(IngestedFilesSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StatusDetail", targetDepth)) {
                    context.nextToken();
                    describeDataIngestionJobResult.setStatusDetail(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IngestedDataSize", targetDepth)) {
                    context.nextToken();
                    describeDataIngestionJobResult.setIngestedDataSize(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("DataStartTime", targetDepth)) {
                    context.nextToken();
                    describeDataIngestionJobResult.setDataStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DataEndTime", targetDepth)) {
                    context.nextToken();
                    describeDataIngestionJobResult.setDataEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeDataIngestionJobResult;
    }

    private static DescribeDataIngestionJobResultJsonUnmarshaller instance;

    public static DescribeDataIngestionJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeDataIngestionJobResultJsonUnmarshaller();
        return instance;
    }
}
