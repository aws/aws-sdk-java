/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codecommit.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codecommit.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Commit JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CommitJsonUnmarshaller implements Unmarshaller<Commit, JsonUnmarshallerContext> {

    public Commit unmarshall(JsonUnmarshallerContext context) throws Exception {
        Commit commit = new Commit();

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
                if (context.testExpression("commitId", targetDepth)) {
                    context.nextToken();
                    commit.setCommitId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("treeId", targetDepth)) {
                    context.nextToken();
                    commit.setTreeId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("parents", targetDepth)) {
                    context.nextToken();
                    commit.setParents(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("message", targetDepth)) {
                    context.nextToken();
                    commit.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("author", targetDepth)) {
                    context.nextToken();
                    commit.setAuthor(UserInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("committer", targetDepth)) {
                    context.nextToken();
                    commit.setCommitter(UserInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("additionalData", targetDepth)) {
                    context.nextToken();
                    commit.setAdditionalData(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return commit;
    }

    private static CommitJsonUnmarshaller instance;

    public static CommitJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CommitJsonUnmarshaller();
        return instance;
    }
}
