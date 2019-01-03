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
 * PullRequest JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PullRequestJsonUnmarshaller implements Unmarshaller<PullRequest, JsonUnmarshallerContext> {

    public PullRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        PullRequest pullRequest = new PullRequest();

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
                    pullRequest.setPullRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("title", targetDepth)) {
                    context.nextToken();
                    pullRequest.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    pullRequest.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastActivityDate", targetDepth)) {
                    context.nextToken();
                    pullRequest.setLastActivityDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("creationDate", targetDepth)) {
                    context.nextToken();
                    pullRequest.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("pullRequestStatus", targetDepth)) {
                    context.nextToken();
                    pullRequest.setPullRequestStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("authorArn", targetDepth)) {
                    context.nextToken();
                    pullRequest.setAuthorArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pullRequestTargets", targetDepth)) {
                    context.nextToken();
                    pullRequest.setPullRequestTargets(new ListUnmarshaller<PullRequestTarget>(PullRequestTargetJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("clientRequestToken", targetDepth)) {
                    context.nextToken();
                    pullRequest.setClientRequestToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return pullRequest;
    }

    private static PullRequestJsonUnmarshaller instance;

    public static PullRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PullRequestJsonUnmarshaller();
        return instance;
    }
}
