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
 * PullRequestEvent JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PullRequestEventJsonUnmarshaller implements Unmarshaller<PullRequestEvent, JsonUnmarshallerContext> {

    public PullRequestEvent unmarshall(JsonUnmarshallerContext context) throws Exception {
        PullRequestEvent pullRequestEvent = new PullRequestEvent();

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
                    pullRequestEvent.setPullRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventDate", targetDepth)) {
                    context.nextToken();
                    pullRequestEvent.setEventDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("pullRequestEventType", targetDepth)) {
                    context.nextToken();
                    pullRequestEvent.setPullRequestEventType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("actorArn", targetDepth)) {
                    context.nextToken();
                    pullRequestEvent.setActorArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pullRequestCreatedEventMetadata", targetDepth)) {
                    context.nextToken();
                    pullRequestEvent.setPullRequestCreatedEventMetadata(PullRequestCreatedEventMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("pullRequestStatusChangedEventMetadata", targetDepth)) {
                    context.nextToken();
                    pullRequestEvent.setPullRequestStatusChangedEventMetadata(PullRequestStatusChangedEventMetadataJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("pullRequestSourceReferenceUpdatedEventMetadata", targetDepth)) {
                    context.nextToken();
                    pullRequestEvent.setPullRequestSourceReferenceUpdatedEventMetadata(PullRequestSourceReferenceUpdatedEventMetadataJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("pullRequestMergedStateChangedEventMetadata", targetDepth)) {
                    context.nextToken();
                    pullRequestEvent.setPullRequestMergedStateChangedEventMetadata(PullRequestMergedStateChangedEventMetadataJsonUnmarshaller.getInstance()
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

        return pullRequestEvent;
    }

    private static PullRequestEventJsonUnmarshaller instance;

    public static PullRequestEventJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PullRequestEventJsonUnmarshaller();
        return instance;
    }
}
