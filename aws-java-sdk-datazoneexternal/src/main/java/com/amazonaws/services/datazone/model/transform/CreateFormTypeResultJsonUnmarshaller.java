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
package com.amazonaws.services.datazone.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.datazone.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateFormTypeResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFormTypeResultJsonUnmarshaller implements Unmarshaller<CreateFormTypeResult, JsonUnmarshallerContext> {

    public CreateFormTypeResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateFormTypeResult createFormTypeResult = new CreateFormTypeResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createFormTypeResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    createFormTypeResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("domainId", targetDepth)) {
                    context.nextToken();
                    createFormTypeResult.setDomainId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    createFormTypeResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("originDomainId", targetDepth)) {
                    context.nextToken();
                    createFormTypeResult.setOriginDomainId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("originProjectId", targetDepth)) {
                    context.nextToken();
                    createFormTypeResult.setOriginProjectId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("owningProjectId", targetDepth)) {
                    context.nextToken();
                    createFormTypeResult.setOwningProjectId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("revision", targetDepth)) {
                    context.nextToken();
                    createFormTypeResult.setRevision(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createFormTypeResult;
    }

    private static CreateFormTypeResultJsonUnmarshaller instance;

    public static CreateFormTypeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateFormTypeResultJsonUnmarshaller();
        return instance;
    }
}
