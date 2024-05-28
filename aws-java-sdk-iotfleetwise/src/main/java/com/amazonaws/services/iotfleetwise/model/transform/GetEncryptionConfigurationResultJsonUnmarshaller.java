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
package com.amazonaws.services.iotfleetwise.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotfleetwise.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetEncryptionConfigurationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEncryptionConfigurationResultJsonUnmarshaller implements Unmarshaller<GetEncryptionConfigurationResult, JsonUnmarshallerContext> {

    public GetEncryptionConfigurationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetEncryptionConfigurationResult getEncryptionConfigurationResult = new GetEncryptionConfigurationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getEncryptionConfigurationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("kmsKeyId", targetDepth)) {
                    context.nextToken();
                    getEncryptionConfigurationResult.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("encryptionStatus", targetDepth)) {
                    context.nextToken();
                    getEncryptionConfigurationResult.setEncryptionStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("encryptionType", targetDepth)) {
                    context.nextToken();
                    getEncryptionConfigurationResult.setEncryptionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("errorMessage", targetDepth)) {
                    context.nextToken();
                    getEncryptionConfigurationResult.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    getEncryptionConfigurationResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastModificationTime", targetDepth)) {
                    context.nextToken();
                    getEncryptionConfigurationResult.setLastModificationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getEncryptionConfigurationResult;
    }

    private static GetEncryptionConfigurationResultJsonUnmarshaller instance;

    public static GetEncryptionConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetEncryptionConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
