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
package com.amazonaws.services.b2bi.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.b2bi.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateCapabilityResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCapabilityResultJsonUnmarshaller implements Unmarshaller<CreateCapabilityResult, JsonUnmarshallerContext> {

    public CreateCapabilityResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateCapabilityResult createCapabilityResult = new CreateCapabilityResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createCapabilityResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("capabilityId", targetDepth)) {
                    context.nextToken();
                    createCapabilityResult.setCapabilityId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("capabilityArn", targetDepth)) {
                    context.nextToken();
                    createCapabilityResult.setCapabilityArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    createCapabilityResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    createCapabilityResult.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("configuration", targetDepth)) {
                    context.nextToken();
                    createCapabilityResult.setConfiguration(CapabilityConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("instructionsDocuments", targetDepth)) {
                    context.nextToken();
                    createCapabilityResult.setInstructionsDocuments(new ListUnmarshaller<S3Location>(S3LocationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    createCapabilityResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createCapabilityResult;
    }

    private static CreateCapabilityResultJsonUnmarshaller instance;

    public static CreateCapabilityResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateCapabilityResultJsonUnmarshaller();
        return instance;
    }
}
