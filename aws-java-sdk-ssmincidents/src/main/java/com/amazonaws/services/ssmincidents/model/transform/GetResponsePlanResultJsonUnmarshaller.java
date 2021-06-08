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
package com.amazonaws.services.ssmincidents.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ssmincidents.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetResponsePlanResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResponsePlanResultJsonUnmarshaller implements Unmarshaller<GetResponsePlanResult, JsonUnmarshallerContext> {

    public GetResponsePlanResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetResponsePlanResult getResponsePlanResult = new GetResponsePlanResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getResponsePlanResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("actions", targetDepth)) {
                    context.nextToken();
                    getResponsePlanResult.setActions(new ListUnmarshaller<Action>(ActionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    getResponsePlanResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("chatChannel", targetDepth)) {
                    context.nextToken();
                    getResponsePlanResult.setChatChannel(ChatChannelJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("displayName", targetDepth)) {
                    context.nextToken();
                    getResponsePlanResult.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("engagements", targetDepth)) {
                    context.nextToken();
                    getResponsePlanResult.setEngagements(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("incidentTemplate", targetDepth)) {
                    context.nextToken();
                    getResponsePlanResult.setIncidentTemplate(IncidentTemplateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    getResponsePlanResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getResponsePlanResult;
    }

    private static GetResponsePlanResultJsonUnmarshaller instance;

    public static GetResponsePlanResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetResponsePlanResultJsonUnmarshaller();
        return instance;
    }
}
