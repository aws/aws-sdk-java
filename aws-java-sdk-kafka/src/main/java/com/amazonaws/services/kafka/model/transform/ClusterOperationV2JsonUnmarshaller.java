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
package com.amazonaws.services.kafka.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kafka.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ClusterOperationV2 JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterOperationV2JsonUnmarshaller implements Unmarshaller<ClusterOperationV2, JsonUnmarshallerContext> {

    public ClusterOperationV2 unmarshall(JsonUnmarshallerContext context) throws Exception {
        ClusterOperationV2 clusterOperationV2 = new ClusterOperationV2();

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
                if (context.testExpression("clusterArn", targetDepth)) {
                    context.nextToken();
                    clusterOperationV2.setClusterArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clusterType", targetDepth)) {
                    context.nextToken();
                    clusterOperationV2.setClusterType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    clusterOperationV2.setStartTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    context.nextToken();
                    clusterOperationV2.setEndTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("errorInfo", targetDepth)) {
                    context.nextToken();
                    clusterOperationV2.setErrorInfo(ErrorInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("operationArn", targetDepth)) {
                    context.nextToken();
                    clusterOperationV2.setOperationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("operationState", targetDepth)) {
                    context.nextToken();
                    clusterOperationV2.setOperationState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("operationType", targetDepth)) {
                    context.nextToken();
                    clusterOperationV2.setOperationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("provisioned", targetDepth)) {
                    context.nextToken();
                    clusterOperationV2.setProvisioned(ClusterOperationV2ProvisionedJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("serverless", targetDepth)) {
                    context.nextToken();
                    clusterOperationV2.setServerless(ClusterOperationV2ServerlessJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return clusterOperationV2;
    }

    private static ClusterOperationV2JsonUnmarshaller instance;

    public static ClusterOperationV2JsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClusterOperationV2JsonUnmarshaller();
        return instance;
    }
}
