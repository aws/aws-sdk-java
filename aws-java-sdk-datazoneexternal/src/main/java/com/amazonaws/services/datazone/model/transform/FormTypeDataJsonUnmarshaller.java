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
 * FormTypeData JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FormTypeDataJsonUnmarshaller implements Unmarshaller<FormTypeData, JsonUnmarshallerContext> {

    public FormTypeData unmarshall(JsonUnmarshallerContext context) throws Exception {
        FormTypeData formTypeData = new FormTypeData();

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
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    formTypeData.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    context.nextToken();
                    formTypeData.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    formTypeData.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("domainId", targetDepth)) {
                    context.nextToken();
                    formTypeData.setDomainId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("imports", targetDepth)) {
                    context.nextToken();
                    formTypeData.setImports(new ListUnmarshaller<Import>(ImportJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("model", targetDepth)) {
                    context.nextToken();
                    formTypeData.setModel(ModelJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    formTypeData.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("originDomainId", targetDepth)) {
                    context.nextToken();
                    formTypeData.setOriginDomainId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("originProjectId", targetDepth)) {
                    context.nextToken();
                    formTypeData.setOriginProjectId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("owningProjectId", targetDepth)) {
                    context.nextToken();
                    formTypeData.setOwningProjectId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("revision", targetDepth)) {
                    context.nextToken();
                    formTypeData.setRevision(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    formTypeData.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return formTypeData;
    }

    private static FormTypeDataJsonUnmarshaller instance;

    public static FormTypeDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FormTypeDataJsonUnmarshaller();
        return instance;
    }
}
