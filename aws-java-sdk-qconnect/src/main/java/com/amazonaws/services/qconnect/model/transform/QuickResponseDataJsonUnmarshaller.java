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
package com.amazonaws.services.qconnect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.qconnect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * QuickResponseData JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QuickResponseDataJsonUnmarshaller implements Unmarshaller<QuickResponseData, JsonUnmarshallerContext> {

    public QuickResponseData unmarshall(JsonUnmarshallerContext context) throws Exception {
        QuickResponseData quickResponseData = new QuickResponseData();

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
                if (context.testExpression("channels", targetDepth)) {
                    context.nextToken();
                    quickResponseData.setChannels(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("contentType", targetDepth)) {
                    context.nextToken();
                    quickResponseData.setContentType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("contents", targetDepth)) {
                    context.nextToken();
                    quickResponseData.setContents(QuickResponseContentsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("createdTime", targetDepth)) {
                    context.nextToken();
                    quickResponseData.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    quickResponseData.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("groupingConfiguration", targetDepth)) {
                    context.nextToken();
                    quickResponseData.setGroupingConfiguration(GroupingConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("isActive", targetDepth)) {
                    context.nextToken();
                    quickResponseData.setIsActive(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("knowledgeBaseArn", targetDepth)) {
                    context.nextToken();
                    quickResponseData.setKnowledgeBaseArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("knowledgeBaseId", targetDepth)) {
                    context.nextToken();
                    quickResponseData.setKnowledgeBaseId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("language", targetDepth)) {
                    context.nextToken();
                    quickResponseData.setLanguage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastModifiedBy", targetDepth)) {
                    context.nextToken();
                    quickResponseData.setLastModifiedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastModifiedTime", targetDepth)) {
                    context.nextToken();
                    quickResponseData.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    quickResponseData.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("quickResponseArn", targetDepth)) {
                    context.nextToken();
                    quickResponseData.setQuickResponseArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("quickResponseId", targetDepth)) {
                    context.nextToken();
                    quickResponseData.setQuickResponseId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("shortcutKey", targetDepth)) {
                    context.nextToken();
                    quickResponseData.setShortcutKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    quickResponseData.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    quickResponseData.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
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

        return quickResponseData;
    }

    private static QuickResponseDataJsonUnmarshaller instance;

    public static QuickResponseDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new QuickResponseDataJsonUnmarshaller();
        return instance;
    }
}
