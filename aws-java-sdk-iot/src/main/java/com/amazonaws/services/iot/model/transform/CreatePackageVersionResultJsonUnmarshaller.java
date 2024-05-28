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
package com.amazonaws.services.iot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreatePackageVersionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePackageVersionResultJsonUnmarshaller implements Unmarshaller<CreatePackageVersionResult, JsonUnmarshallerContext> {

    public CreatePackageVersionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreatePackageVersionResult createPackageVersionResult = new CreatePackageVersionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createPackageVersionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("packageVersionArn", targetDepth)) {
                    context.nextToken();
                    createPackageVersionResult.setPackageVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("packageName", targetDepth)) {
                    context.nextToken();
                    createPackageVersionResult.setPackageName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("versionName", targetDepth)) {
                    context.nextToken();
                    createPackageVersionResult.setVersionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    createPackageVersionResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("attributes", targetDepth)) {
                    context.nextToken();
                    createPackageVersionResult.setAttributes(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    createPackageVersionResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("errorReason", targetDepth)) {
                    context.nextToken();
                    createPackageVersionResult.setErrorReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createPackageVersionResult;
    }

    private static CreatePackageVersionResultJsonUnmarshaller instance;

    public static CreatePackageVersionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreatePackageVersionResultJsonUnmarshaller();
        return instance;
    }
}
