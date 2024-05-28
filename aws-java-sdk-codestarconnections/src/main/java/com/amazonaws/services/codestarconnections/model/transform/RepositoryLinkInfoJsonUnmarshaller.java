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
package com.amazonaws.services.codestarconnections.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codestarconnections.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RepositoryLinkInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RepositoryLinkInfoJsonUnmarshaller implements Unmarshaller<RepositoryLinkInfo, JsonUnmarshallerContext> {

    public RepositoryLinkInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        RepositoryLinkInfo repositoryLinkInfo = new RepositoryLinkInfo();

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
                if (context.testExpression("ConnectionArn", targetDepth)) {
                    context.nextToken();
                    repositoryLinkInfo.setConnectionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EncryptionKeyArn", targetDepth)) {
                    context.nextToken();
                    repositoryLinkInfo.setEncryptionKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OwnerId", targetDepth)) {
                    context.nextToken();
                    repositoryLinkInfo.setOwnerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProviderType", targetDepth)) {
                    context.nextToken();
                    repositoryLinkInfo.setProviderType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RepositoryLinkArn", targetDepth)) {
                    context.nextToken();
                    repositoryLinkInfo.setRepositoryLinkArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RepositoryLinkId", targetDepth)) {
                    context.nextToken();
                    repositoryLinkInfo.setRepositoryLinkId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RepositoryName", targetDepth)) {
                    context.nextToken();
                    repositoryLinkInfo.setRepositoryName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return repositoryLinkInfo;
    }

    private static RepositoryLinkInfoJsonUnmarshaller instance;

    public static RepositoryLinkInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RepositoryLinkInfoJsonUnmarshaller();
        return instance;
    }
}
