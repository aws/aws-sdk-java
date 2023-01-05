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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SourceControlDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceControlDetailsJsonUnmarshaller implements Unmarshaller<SourceControlDetails, JsonUnmarshallerContext> {

    public SourceControlDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        SourceControlDetails sourceControlDetails = new SourceControlDetails();

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
                if (context.testExpression("Provider", targetDepth)) {
                    context.nextToken();
                    sourceControlDetails.setProvider(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Repository", targetDepth)) {
                    context.nextToken();
                    sourceControlDetails.setRepository(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Owner", targetDepth)) {
                    context.nextToken();
                    sourceControlDetails.setOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Branch", targetDepth)) {
                    context.nextToken();
                    sourceControlDetails.setBranch(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Folder", targetDepth)) {
                    context.nextToken();
                    sourceControlDetails.setFolder(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastCommitId", targetDepth)) {
                    context.nextToken();
                    sourceControlDetails.setLastCommitId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AuthStrategy", targetDepth)) {
                    context.nextToken();
                    sourceControlDetails.setAuthStrategy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AuthToken", targetDepth)) {
                    context.nextToken();
                    sourceControlDetails.setAuthToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return sourceControlDetails;
    }

    private static SourceControlDetailsJsonUnmarshaller instance;

    public static SourceControlDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SourceControlDetailsJsonUnmarshaller();
        return instance;
    }
}
