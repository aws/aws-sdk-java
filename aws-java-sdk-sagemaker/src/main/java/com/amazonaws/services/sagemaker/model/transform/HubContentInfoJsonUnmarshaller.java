/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * HubContentInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HubContentInfoJsonUnmarshaller implements Unmarshaller<HubContentInfo, JsonUnmarshallerContext> {

    public HubContentInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        HubContentInfo hubContentInfo = new HubContentInfo();

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
                if (context.testExpression("HubContentName", targetDepth)) {
                    context.nextToken();
                    hubContentInfo.setHubContentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HubContentArn", targetDepth)) {
                    context.nextToken();
                    hubContentInfo.setHubContentArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HubContentVersion", targetDepth)) {
                    context.nextToken();
                    hubContentInfo.setHubContentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HubContentType", targetDepth)) {
                    context.nextToken();
                    hubContentInfo.setHubContentType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentSchemaVersion", targetDepth)) {
                    context.nextToken();
                    hubContentInfo.setDocumentSchemaVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HubContentDisplayName", targetDepth)) {
                    context.nextToken();
                    hubContentInfo.setHubContentDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HubContentDescription", targetDepth)) {
                    context.nextToken();
                    hubContentInfo.setHubContentDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HubContentSearchKeywords", targetDepth)) {
                    context.nextToken();
                    hubContentInfo.setHubContentSearchKeywords(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("HubContentStatus", targetDepth)) {
                    context.nextToken();
                    hubContentInfo.setHubContentStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    hubContentInfo.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return hubContentInfo;
    }

    private static HubContentInfoJsonUnmarshaller instance;

    public static HubContentInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HubContentInfoJsonUnmarshaller();
        return instance;
    }
}
