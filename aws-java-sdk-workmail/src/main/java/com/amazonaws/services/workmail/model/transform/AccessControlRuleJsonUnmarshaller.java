/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workmail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.workmail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AccessControlRule JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessControlRuleJsonUnmarshaller implements Unmarshaller<AccessControlRule, JsonUnmarshallerContext> {

    public AccessControlRule unmarshall(JsonUnmarshallerContext context) throws Exception {
        AccessControlRule accessControlRule = new AccessControlRule();

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
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    accessControlRule.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Effect", targetDepth)) {
                    context.nextToken();
                    accessControlRule.setEffect(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    accessControlRule.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IpRanges", targetDepth)) {
                    context.nextToken();
                    accessControlRule.setIpRanges(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("NotIpRanges", targetDepth)) {
                    context.nextToken();
                    accessControlRule.setNotIpRanges(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Actions", targetDepth)) {
                    context.nextToken();
                    accessControlRule.setActions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("NotActions", targetDepth)) {
                    context.nextToken();
                    accessControlRule.setNotActions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("UserIds", targetDepth)) {
                    context.nextToken();
                    accessControlRule.setUserIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("NotUserIds", targetDepth)) {
                    context.nextToken();
                    accessControlRule.setNotUserIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("DateCreated", targetDepth)) {
                    context.nextToken();
                    accessControlRule.setDateCreated(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DateModified", targetDepth)) {
                    context.nextToken();
                    accessControlRule.setDateModified(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return accessControlRule;
    }

    private static AccessControlRuleJsonUnmarshaller instance;

    public static AccessControlRuleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AccessControlRuleJsonUnmarshaller();
        return instance;
    }
}
