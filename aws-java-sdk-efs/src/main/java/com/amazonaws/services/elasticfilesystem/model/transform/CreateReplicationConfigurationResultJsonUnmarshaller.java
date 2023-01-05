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
package com.amazonaws.services.elasticfilesystem.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.elasticfilesystem.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateReplicationConfigurationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateReplicationConfigurationResultJsonUnmarshaller implements Unmarshaller<CreateReplicationConfigurationResult, JsonUnmarshallerContext> {

    public CreateReplicationConfigurationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateReplicationConfigurationResult createReplicationConfigurationResult = new CreateReplicationConfigurationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createReplicationConfigurationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("SourceFileSystemId", targetDepth)) {
                    context.nextToken();
                    createReplicationConfigurationResult.setSourceFileSystemId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceFileSystemRegion", targetDepth)) {
                    context.nextToken();
                    createReplicationConfigurationResult.setSourceFileSystemRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceFileSystemArn", targetDepth)) {
                    context.nextToken();
                    createReplicationConfigurationResult.setSourceFileSystemArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OriginalSourceFileSystemArn", targetDepth)) {
                    context.nextToken();
                    createReplicationConfigurationResult.setOriginalSourceFileSystemArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    createReplicationConfigurationResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Destinations", targetDepth)) {
                    context.nextToken();
                    createReplicationConfigurationResult.setDestinations(new ListUnmarshaller<Destination>(DestinationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createReplicationConfigurationResult;
    }

    private static CreateReplicationConfigurationResultJsonUnmarshaller instance;

    public static CreateReplicationConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateReplicationConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
