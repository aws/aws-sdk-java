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
package com.amazonaws.services.secretsmanager.model.transform;

import java.math.*;
import java.nio.ByteBuffer;
import javax.annotation.Generated;

import com.amazonaws.services.secretsmanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetSecretValueResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSecretValueResultJsonUnmarshaller implements Unmarshaller<GetSecretValueResult, JsonUnmarshallerContext> {

    public GetSecretValueResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetSecretValueResult getSecretValueResult = new GetSecretValueResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getSecretValueResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ARN", targetDepth)) {
                    context.nextToken();
                    getSecretValueResult.setARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    getSecretValueResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VersionId", targetDepth)) {
                    context.nextToken();
                    getSecretValueResult.setVersionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretBinary", targetDepth)) {
                    context.nextToken();
                    getSecretValueResult.setSecretBinary(context.getUnmarshaller(java.nio.ByteBuffer.class).unmarshall(context));
                }
                if (context.testExpression("SecretString", targetDepth)) {
                    context.nextToken();
                    getSecretValueResult.setSecretString(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VersionStages", targetDepth)) {
                    context.nextToken();
                    getSecretValueResult.setVersionStages(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("CreatedDate", targetDepth)) {
                    context.nextToken();
                    getSecretValueResult.setCreatedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getSecretValueResult;
    }

    private static GetSecretValueResultJsonUnmarshaller instance;

    public static GetSecretValueResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetSecretValueResultJsonUnmarshaller();
        return instance;
    }
}
