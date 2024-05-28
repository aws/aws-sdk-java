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
 * UpdateCapabilityResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCapabilityResultJsonUnmarshaller implements Unmarshaller<UpdateCapabilityResult, JsonUnmarshallerContext> {

    public UpdateCapabilityResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateCapabilityResult updateCapabilityResult = new UpdateCapabilityResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateCapabilityResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("capabilityId", targetDepth)) {
                    context.nextToken();
                    updateCapabilityResult.setCapabilityId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("capabilityArn", targetDepth)) {
                    context.nextToken();
                    updateCapabilityResult.setCapabilityArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    updateCapabilityResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    updateCapabilityResult.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("configuration", targetDepth)) {
                    context.nextToken();
                    updateCapabilityResult.setConfiguration(CapabilityConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("instructionsDocuments", targetDepth)) {
                    context.nextToken();
                    updateCapabilityResult.setInstructionsDocuments(new ListUnmarshaller<S3Location>(S3LocationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    updateCapabilityResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("modifiedAt", targetDepth)) {
                    context.nextToken();
                    updateCapabilityResult.setModifiedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateCapabilityResult;
    }

    private static UpdateCapabilityResultJsonUnmarshaller instance;

    public static UpdateCapabilityResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateCapabilityResultJsonUnmarshaller();
        return instance;
    }
}
