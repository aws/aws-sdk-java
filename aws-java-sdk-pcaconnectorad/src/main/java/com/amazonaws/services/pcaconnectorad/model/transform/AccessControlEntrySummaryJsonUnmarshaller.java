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
package com.amazonaws.services.pcaconnectorad.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pcaconnectorad.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AccessControlEntrySummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessControlEntrySummaryJsonUnmarshaller implements Unmarshaller<AccessControlEntrySummary, JsonUnmarshallerContext> {

    public AccessControlEntrySummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AccessControlEntrySummary accessControlEntrySummary = new AccessControlEntrySummary();

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
                if (context.testExpression("AccessRights", targetDepth)) {
                    context.nextToken();
                    accessControlEntrySummary.setAccessRights(AccessRightsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    accessControlEntrySummary.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("GroupDisplayName", targetDepth)) {
                    context.nextToken();
                    accessControlEntrySummary.setGroupDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GroupSecurityIdentifier", targetDepth)) {
                    context.nextToken();
                    accessControlEntrySummary.setGroupSecurityIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TemplateArn", targetDepth)) {
                    context.nextToken();
                    accessControlEntrySummary.setTemplateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UpdatedAt", targetDepth)) {
                    context.nextToken();
                    accessControlEntrySummary.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return accessControlEntrySummary;
    }

    private static AccessControlEntrySummaryJsonUnmarshaller instance;

    public static AccessControlEntrySummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AccessControlEntrySummaryJsonUnmarshaller();
        return instance;
    }
}
