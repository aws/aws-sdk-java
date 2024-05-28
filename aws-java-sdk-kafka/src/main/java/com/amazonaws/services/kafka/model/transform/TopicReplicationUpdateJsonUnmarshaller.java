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
package com.amazonaws.services.kafka.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kafka.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TopicReplicationUpdate JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopicReplicationUpdateJsonUnmarshaller implements Unmarshaller<TopicReplicationUpdate, JsonUnmarshallerContext> {

    public TopicReplicationUpdate unmarshall(JsonUnmarshallerContext context) throws Exception {
        TopicReplicationUpdate topicReplicationUpdate = new TopicReplicationUpdate();

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
                if (context.testExpression("copyAccessControlListsForTopics", targetDepth)) {
                    context.nextToken();
                    topicReplicationUpdate.setCopyAccessControlListsForTopics(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("copyTopicConfigurations", targetDepth)) {
                    context.nextToken();
                    topicReplicationUpdate.setCopyTopicConfigurations(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("detectAndCopyNewTopics", targetDepth)) {
                    context.nextToken();
                    topicReplicationUpdate.setDetectAndCopyNewTopics(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("topicsToExclude", targetDepth)) {
                    context.nextToken();
                    topicReplicationUpdate.setTopicsToExclude(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("topicsToReplicate", targetDepth)) {
                    context.nextToken();
                    topicReplicationUpdate.setTopicsToReplicate(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return topicReplicationUpdate;
    }

    private static TopicReplicationUpdateJsonUnmarshaller instance;

    public static TopicReplicationUpdateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TopicReplicationUpdateJsonUnmarshaller();
        return instance;
    }
}
