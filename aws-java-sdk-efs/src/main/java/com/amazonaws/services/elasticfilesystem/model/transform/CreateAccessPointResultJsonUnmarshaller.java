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
package com.amazonaws.services.elasticfilesystem.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.elasticfilesystem.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateAccessPointResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAccessPointResultJsonUnmarshaller implements Unmarshaller<CreateAccessPointResult, JsonUnmarshallerContext> {

    public CreateAccessPointResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateAccessPointResult createAccessPointResult = new CreateAccessPointResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createAccessPointResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ClientToken", targetDepth)) {
                    context.nextToken();
                    createAccessPointResult.setClientToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    createAccessPointResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    createAccessPointResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("AccessPointId", targetDepth)) {
                    context.nextToken();
                    createAccessPointResult.setAccessPointId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AccessPointArn", targetDepth)) {
                    context.nextToken();
                    createAccessPointResult.setAccessPointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileSystemId", targetDepth)) {
                    context.nextToken();
                    createAccessPointResult.setFileSystemId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PosixUser", targetDepth)) {
                    context.nextToken();
                    createAccessPointResult.setPosixUser(PosixUserJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RootDirectory", targetDepth)) {
                    context.nextToken();
                    createAccessPointResult.setRootDirectory(RootDirectoryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OwnerId", targetDepth)) {
                    context.nextToken();
                    createAccessPointResult.setOwnerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LifeCycleState", targetDepth)) {
                    context.nextToken();
                    createAccessPointResult.setLifeCycleState(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createAccessPointResult;
    }

    private static CreateAccessPointResultJsonUnmarshaller instance;

    public static CreateAccessPointResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateAccessPointResultJsonUnmarshaller();
        return instance;
    }
}
