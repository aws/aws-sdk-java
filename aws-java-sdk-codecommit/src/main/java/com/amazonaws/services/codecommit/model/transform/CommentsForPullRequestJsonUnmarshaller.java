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
 * CommentsForPullRequest JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CommentsForPullRequestJsonUnmarshaller implements Unmarshaller<CommentsForPullRequest, JsonUnmarshallerContext> {

    public CommentsForPullRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        CommentsForPullRequest commentsForPullRequest = new CommentsForPullRequest();

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
                if (context.testExpression("pullRequestId", targetDepth)) {
                    context.nextToken();
                    commentsForPullRequest.setPullRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("repositoryName", targetDepth)) {
                    context.nextToken();
                    commentsForPullRequest.setRepositoryName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("beforeCommitId", targetDepth)) {
                    context.nextToken();
                    commentsForPullRequest.setBeforeCommitId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("afterCommitId", targetDepth)) {
                    context.nextToken();
                    commentsForPullRequest.setAfterCommitId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("beforeBlobId", targetDepth)) {
                    context.nextToken();
                    commentsForPullRequest.setBeforeBlobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("afterBlobId", targetDepth)) {
                    context.nextToken();
                    commentsForPullRequest.setAfterBlobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    context.nextToken();
                    commentsForPullRequest.setLocation(LocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("comments", targetDepth)) {
                    context.nextToken();
                    commentsForPullRequest.setComments(new ListUnmarshaller<Comment>(CommentJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return commentsForPullRequest;
    }

    private static CommentsForPullRequestJsonUnmarshaller instance;

    public static CommentsForPullRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CommentsForPullRequestJsonUnmarshaller();
        return instance;
    }
}
