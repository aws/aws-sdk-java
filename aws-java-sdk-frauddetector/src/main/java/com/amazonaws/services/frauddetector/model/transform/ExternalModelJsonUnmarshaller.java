/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.frauddetector.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.frauddetector.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ExternalModel JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExternalModelJsonUnmarshaller implements Unmarshaller<ExternalModel, JsonUnmarshallerContext> {

    public ExternalModel unmarshall(JsonUnmarshallerContext context) throws Exception {
        ExternalModel externalModel = new ExternalModel();

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
                if (context.testExpression("modelEndpoint", targetDepth)) {
                    context.nextToken();
                    externalModel.setModelEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("modelSource", targetDepth)) {
                    context.nextToken();
                    externalModel.setModelSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("role", targetDepth)) {
                    context.nextToken();
                    externalModel.setRole(RoleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("inputConfiguration", targetDepth)) {
                    context.nextToken();
                    externalModel.setInputConfiguration(ModelInputConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("outputConfiguration", targetDepth)) {
                    context.nextToken();
                    externalModel.setOutputConfiguration(ModelOutputConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("modelEndpointStatus", targetDepth)) {
                    context.nextToken();
                    externalModel.setModelEndpointStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdatedTime", targetDepth)) {
                    context.nextToken();
                    externalModel.setLastUpdatedTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdTime", targetDepth)) {
                    context.nextToken();
                    externalModel.setCreatedTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return externalModel;
    }

    private static ExternalModelJsonUnmarshaller instance;

    public static ExternalModelJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ExternalModelJsonUnmarshaller();
        return instance;
    }
}
