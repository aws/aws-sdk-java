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
package com.amazonaws.services.appmesh.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appmesh.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GrpcRetryPolicy JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GrpcRetryPolicyJsonUnmarshaller implements Unmarshaller<GrpcRetryPolicy, JsonUnmarshallerContext> {

    public GrpcRetryPolicy unmarshall(JsonUnmarshallerContext context) throws Exception {
        GrpcRetryPolicy grpcRetryPolicy = new GrpcRetryPolicy();

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
                if (context.testExpression("grpcRetryEvents", targetDepth)) {
                    context.nextToken();
                    grpcRetryPolicy.setGrpcRetryEvents(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("httpRetryEvents", targetDepth)) {
                    context.nextToken();
                    grpcRetryPolicy.setHttpRetryEvents(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("maxRetries", targetDepth)) {
                    context.nextToken();
                    grpcRetryPolicy.setMaxRetries(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("perRetryTimeout", targetDepth)) {
                    context.nextToken();
                    grpcRetryPolicy.setPerRetryTimeout(DurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tcpRetryEvents", targetDepth)) {
                    context.nextToken();
                    grpcRetryPolicy.setTcpRetryEvents(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return grpcRetryPolicy;
    }

    private static GrpcRetryPolicyJsonUnmarshaller instance;

    public static GrpcRetryPolicyJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GrpcRetryPolicyJsonUnmarshaller();
        return instance;
    }
}
