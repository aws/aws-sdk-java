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
package com.amazonaws.services.amplifybackend.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.amplifybackend.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetBackendStorageResourceConfig JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBackendStorageResourceConfigJsonUnmarshaller implements Unmarshaller<GetBackendStorageResourceConfig, JsonUnmarshallerContext> {

    public GetBackendStorageResourceConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetBackendStorageResourceConfig getBackendStorageResourceConfig = new GetBackendStorageResourceConfig();

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
                if (context.testExpression("bucketName", targetDepth)) {
                    context.nextToken();
                    getBackendStorageResourceConfig.setBucketName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("imported", targetDepth)) {
                    context.nextToken();
                    getBackendStorageResourceConfig.setImported(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("permissions", targetDepth)) {
                    context.nextToken();
                    getBackendStorageResourceConfig.setPermissions(BackendStoragePermissionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("serviceName", targetDepth)) {
                    context.nextToken();
                    getBackendStorageResourceConfig.setServiceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getBackendStorageResourceConfig;
    }

    private static GetBackendStorageResourceConfigJsonUnmarshaller instance;

    public static GetBackendStorageResourceConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetBackendStorageResourceConfigJsonUnmarshaller();
        return instance;
    }
}
