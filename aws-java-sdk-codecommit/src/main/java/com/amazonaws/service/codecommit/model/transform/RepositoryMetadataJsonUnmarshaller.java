/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.service.codecommit.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.service.codecommit.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RepositoryMetadata JSON Unmarshaller
 */
public class RepositoryMetadataJsonUnmarshaller implements
        Unmarshaller<RepositoryMetadata, JsonUnmarshallerContext> {

    public RepositoryMetadata unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        RepositoryMetadata repositoryMetadata = new RepositoryMetadata();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("accountId", targetDepth)) {
                    context.nextToken();
                    repositoryMetadata.setAccountId(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("repositoryId", targetDepth)) {
                    context.nextToken();
                    repositoryMetadata.setRepositoryId(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("repositoryName", targetDepth)) {
                    context.nextToken();
                    repositoryMetadata.setRepositoryName(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context
                        .testExpression("repositoryDescription", targetDepth)) {
                    context.nextToken();
                    repositoryMetadata
                            .setRepositoryDescription(StringJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("defaultBranch", targetDepth)) {
                    context.nextToken();
                    repositoryMetadata.setDefaultBranch(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("lastModifiedDate", targetDepth)) {
                    context.nextToken();
                    repositoryMetadata.setLastModifiedDate(DateJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("creationDate", targetDepth)) {
                    context.nextToken();
                    repositoryMetadata.setCreationDate(DateJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("cloneUrlHttp", targetDepth)) {
                    context.nextToken();
                    repositoryMetadata.setCloneUrlHttp(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("cloneUrlSsh", targetDepth)) {
                    context.nextToken();
                    repositoryMetadata.setCloneUrlSsh(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    repositoryMetadata.setArn(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return repositoryMetadata;
    }

    private static RepositoryMetadataJsonUnmarshaller instance;

    public static RepositoryMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RepositoryMetadataJsonUnmarshaller();
        return instance;
    }
}
