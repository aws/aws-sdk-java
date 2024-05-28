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
package com.amazonaws.services.connectwisdom.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.connectwisdom.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * QuickResponseSearchResultData JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QuickResponseSearchResultDataJsonUnmarshaller implements Unmarshaller<QuickResponseSearchResultData, JsonUnmarshallerContext> {

    public QuickResponseSearchResultData unmarshall(JsonUnmarshallerContext context) throws Exception {
        QuickResponseSearchResultData quickResponseSearchResultData = new QuickResponseSearchResultData();

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
                if (context.testExpression("attributesInterpolated", targetDepth)) {
                    context.nextToken();
                    quickResponseSearchResultData.setAttributesInterpolated(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("attributesNotInterpolated", targetDepth)) {
                    context.nextToken();
                    quickResponseSearchResultData.setAttributesNotInterpolated(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("channels", targetDepth)) {
                    context.nextToken();
                    quickResponseSearchResultData.setChannels(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("contentType", targetDepth)) {
                    context.nextToken();
                    quickResponseSearchResultData.setContentType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("contents", targetDepth)) {
                    context.nextToken();
                    quickResponseSearchResultData.setContents(QuickResponseContentsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("createdTime", targetDepth)) {
                    context.nextToken();
                    quickResponseSearchResultData.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    quickResponseSearchResultData.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("groupingConfiguration", targetDepth)) {
                    context.nextToken();
                    quickResponseSearchResultData.setGroupingConfiguration(GroupingConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("isActive", targetDepth)) {
                    context.nextToken();
                    quickResponseSearchResultData.setIsActive(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("knowledgeBaseArn", targetDepth)) {
                    context.nextToken();
                    quickResponseSearchResultData.setKnowledgeBaseArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("knowledgeBaseId", targetDepth)) {
                    context.nextToken();
                    quickResponseSearchResultData.setKnowledgeBaseId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("language", targetDepth)) {
                    context.nextToken();
                    quickResponseSearchResultData.setLanguage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastModifiedBy", targetDepth)) {
                    context.nextToken();
                    quickResponseSearchResultData.setLastModifiedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastModifiedTime", targetDepth)) {
                    context.nextToken();
                    quickResponseSearchResultData.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    quickResponseSearchResultData.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("quickResponseArn", targetDepth)) {
                    context.nextToken();
                    quickResponseSearchResultData.setQuickResponseArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("quickResponseId", targetDepth)) {
                    context.nextToken();
                    quickResponseSearchResultData.setQuickResponseId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("shortcutKey", targetDepth)) {
                    context.nextToken();
                    quickResponseSearchResultData.setShortcutKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    quickResponseSearchResultData.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    quickResponseSearchResultData.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return quickResponseSearchResultData;
    }

    private static QuickResponseSearchResultDataJsonUnmarshaller instance;

    public static QuickResponseSearchResultDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new QuickResponseSearchResultDataJsonUnmarshaller();
        return instance;
    }
}
