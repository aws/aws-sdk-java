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
package com.amazonaws.services.quicksight.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeDashboardSnapshotJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDashboardSnapshotJobResultJsonUnmarshaller implements Unmarshaller<DescribeDashboardSnapshotJobResult, JsonUnmarshallerContext> {

    public DescribeDashboardSnapshotJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeDashboardSnapshotJobResult describeDashboardSnapshotJobResult = new DescribeDashboardSnapshotJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeDashboardSnapshotJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("AwsAccountId", targetDepth)) {
                    context.nextToken();
                    describeDashboardSnapshotJobResult.setAwsAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DashboardId", targetDepth)) {
                    context.nextToken();
                    describeDashboardSnapshotJobResult.setDashboardId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnapshotJobId", targetDepth)) {
                    context.nextToken();
                    describeDashboardSnapshotJobResult.setSnapshotJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserConfiguration", targetDepth)) {
                    context.nextToken();
                    describeDashboardSnapshotJobResult
                            .setUserConfiguration(SnapshotUserConfigurationRedactedJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SnapshotConfiguration", targetDepth)) {
                    context.nextToken();
                    describeDashboardSnapshotJobResult.setSnapshotConfiguration(SnapshotConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    describeDashboardSnapshotJobResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobStatus", targetDepth)) {
                    context.nextToken();
                    describeDashboardSnapshotJobResult.setJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    describeDashboardSnapshotJobResult.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTime", targetDepth)) {
                    context.nextToken();
                    describeDashboardSnapshotJobResult.setLastUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("RequestId", targetDepth)) {
                    context.nextToken();
                    describeDashboardSnapshotJobResult.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describeDashboardSnapshotJobResult.setStatus(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeDashboardSnapshotJobResult;
    }

    private static DescribeDashboardSnapshotJobResultJsonUnmarshaller instance;

    public static DescribeDashboardSnapshotJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeDashboardSnapshotJobResultJsonUnmarshaller();
        return instance;
    }
}
