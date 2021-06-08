/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemailv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simpleemailv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetContactListResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetContactListResultJsonUnmarshaller implements Unmarshaller<GetContactListResult, JsonUnmarshallerContext> {

    public GetContactListResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetContactListResult getContactListResult = new GetContactListResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getContactListResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ContactListName", targetDepth)) {
                    context.nextToken();
                    getContactListResult.setContactListName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Topics", targetDepth)) {
                    context.nextToken();
                    getContactListResult.setTopics(new ListUnmarshaller<Topic>(TopicJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    getContactListResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    context.nextToken();
                    getContactListResult.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTimestamp", targetDepth)) {
                    context.nextToken();
                    getContactListResult.setLastUpdatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    getContactListResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

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

        return getContactListResult;
    }

    private static GetContactListResultJsonUnmarshaller instance;

    public static GetContactListResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetContactListResultJsonUnmarshaller();
        return instance;
    }
}
