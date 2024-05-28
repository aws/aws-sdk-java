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
package com.amazonaws.services.resiliencehub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.resiliencehub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateAppVersionAppComponentResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAppVersionAppComponentResultJsonUnmarshaller implements Unmarshaller<CreateAppVersionAppComponentResult, JsonUnmarshallerContext> {

    public CreateAppVersionAppComponentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateAppVersionAppComponentResult createAppVersionAppComponentResult = new CreateAppVersionAppComponentResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createAppVersionAppComponentResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("appArn", targetDepth)) {
                    context.nextToken();
                    createAppVersionAppComponentResult.setAppArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("appComponent", targetDepth)) {
                    context.nextToken();
                    createAppVersionAppComponentResult.setAppComponent(AppComponentJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("appVersion", targetDepth)) {
                    context.nextToken();
                    createAppVersionAppComponentResult.setAppVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createAppVersionAppComponentResult;
    }

    private static CreateAppVersionAppComponentResultJsonUnmarshaller instance;

    public static CreateAppVersionAppComponentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateAppVersionAppComponentResultJsonUnmarshaller();
        return instance;
    }
}
