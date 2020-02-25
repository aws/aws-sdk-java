/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.robomaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.robomaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeSimulationJobBatchResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSimulationJobBatchResultJsonUnmarshaller implements Unmarshaller<DescribeSimulationJobBatchResult, JsonUnmarshallerContext> {

    public DescribeSimulationJobBatchResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeSimulationJobBatchResult describeSimulationJobBatchResult = new DescribeSimulationJobBatchResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeSimulationJobBatchResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    describeSimulationJobBatchResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    describeSimulationJobBatchResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    describeSimulationJobBatchResult.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    describeSimulationJobBatchResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("clientRequestToken", targetDepth)) {
                    context.nextToken();
                    describeSimulationJobBatchResult.setClientRequestToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("batchPolicy", targetDepth)) {
                    context.nextToken();
                    describeSimulationJobBatchResult.setBatchPolicy(BatchPolicyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("failureCode", targetDepth)) {
                    context.nextToken();
                    describeSimulationJobBatchResult.setFailureCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureReason", targetDepth)) {
                    context.nextToken();
                    describeSimulationJobBatchResult.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failedRequests", targetDepth)) {
                    context.nextToken();
                    describeSimulationJobBatchResult.setFailedRequests(new ListUnmarshaller<FailedCreateSimulationJobRequest>(
                            FailedCreateSimulationJobRequestJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("pendingRequests", targetDepth)) {
                    context.nextToken();
                    describeSimulationJobBatchResult.setPendingRequests(new ListUnmarshaller<SimulationJobRequest>(SimulationJobRequestJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("createdRequests", targetDepth)) {
                    context.nextToken();
                    describeSimulationJobBatchResult.setCreatedRequests(new ListUnmarshaller<SimulationJobSummary>(SimulationJobSummaryJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    describeSimulationJobBatchResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
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

        return describeSimulationJobBatchResult;
    }

    private static DescribeSimulationJobBatchResultJsonUnmarshaller instance;

    public static DescribeSimulationJobBatchResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeSimulationJobBatchResultJsonUnmarshaller();
        return instance;
    }
}
