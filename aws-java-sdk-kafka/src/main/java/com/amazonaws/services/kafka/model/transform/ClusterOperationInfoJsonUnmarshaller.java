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
package com.amazonaws.services.kafka.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kafka.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ClusterOperationInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterOperationInfoJsonUnmarshaller implements Unmarshaller<ClusterOperationInfo, JsonUnmarshallerContext> {

    public ClusterOperationInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        ClusterOperationInfo clusterOperationInfo = new ClusterOperationInfo();

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
                if (context.testExpression("clientRequestId", targetDepth)) {
                    context.nextToken();
                    clusterOperationInfo.setClientRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clusterArn", targetDepth)) {
                    context.nextToken();
                    clusterOperationInfo.setClusterArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    clusterOperationInfo.setCreationTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    context.nextToken();
                    clusterOperationInfo.setEndTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("errorInfo", targetDepth)) {
                    context.nextToken();
                    clusterOperationInfo.setErrorInfo(ErrorInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("operationArn", targetDepth)) {
                    context.nextToken();
                    clusterOperationInfo.setOperationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("operationState", targetDepth)) {
                    context.nextToken();
                    clusterOperationInfo.setOperationState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("operationType", targetDepth)) {
                    context.nextToken();
                    clusterOperationInfo.setOperationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceClusterInfo", targetDepth)) {
                    context.nextToken();
                    clusterOperationInfo.setSourceClusterInfo(MutableClusterInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("targetClusterInfo", targetDepth)) {
                    context.nextToken();
                    clusterOperationInfo.setTargetClusterInfo(MutableClusterInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return clusterOperationInfo;
    }

    private static ClusterOperationInfoJsonUnmarshaller instance;

    public static ClusterOperationInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClusterOperationInfoJsonUnmarshaller();
        return instance;
    }
}
