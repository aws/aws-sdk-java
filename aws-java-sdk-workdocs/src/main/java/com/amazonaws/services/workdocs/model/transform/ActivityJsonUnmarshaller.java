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
package com.amazonaws.services.workdocs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.workdocs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Activity JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActivityJsonUnmarshaller implements Unmarshaller<Activity, JsonUnmarshallerContext> {

    public Activity unmarshall(JsonUnmarshallerContext context) throws Exception {
        Activity activity = new Activity();

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
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    activity.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TimeStamp", targetDepth)) {
                    context.nextToken();
                    activity.setTimeStamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("IsIndirectActivity", targetDepth)) {
                    context.nextToken();
                    activity.setIsIndirectActivity(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("OrganizationId", targetDepth)) {
                    context.nextToken();
                    activity.setOrganizationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Initiator", targetDepth)) {
                    context.nextToken();
                    activity.setInitiator(UserMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Participants", targetDepth)) {
                    context.nextToken();
                    activity.setParticipants(ParticipantsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ResourceMetadata", targetDepth)) {
                    context.nextToken();
                    activity.setResourceMetadata(ResourceMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OriginalParent", targetDepth)) {
                    context.nextToken();
                    activity.setOriginalParent(ResourceMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CommentMetadata", targetDepth)) {
                    context.nextToken();
                    activity.setCommentMetadata(CommentMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return activity;
    }

    private static ActivityJsonUnmarshaller instance;

    public static ActivityJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ActivityJsonUnmarshaller();
        return instance;
    }
}
