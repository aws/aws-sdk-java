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
package com.amazonaws.services.appmesh.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appmesh.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GrpcMetadataMatchMethod JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GrpcMetadataMatchMethodJsonUnmarshaller implements Unmarshaller<GrpcMetadataMatchMethod, JsonUnmarshallerContext> {

    public GrpcMetadataMatchMethod unmarshall(JsonUnmarshallerContext context) throws Exception {
        GrpcMetadataMatchMethod grpcMetadataMatchMethod = new GrpcMetadataMatchMethod();

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
                if (context.testExpression("exact", targetDepth)) {
                    context.nextToken();
                    grpcMetadataMatchMethod.setExact(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("prefix", targetDepth)) {
                    context.nextToken();
                    grpcMetadataMatchMethod.setPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("range", targetDepth)) {
                    context.nextToken();
                    grpcMetadataMatchMethod.setRange(MatchRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("regex", targetDepth)) {
                    context.nextToken();
                    grpcMetadataMatchMethod.setRegex(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("suffix", targetDepth)) {
                    context.nextToken();
                    grpcMetadataMatchMethod.setSuffix(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return grpcMetadataMatchMethod;
    }

    private static GrpcMetadataMatchMethodJsonUnmarshaller instance;

    public static GrpcMetadataMatchMethodJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GrpcMetadataMatchMethodJsonUnmarshaller();
        return instance;
    }
}
