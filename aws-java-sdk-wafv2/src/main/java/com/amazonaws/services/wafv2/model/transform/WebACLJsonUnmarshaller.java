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
package com.amazonaws.services.wafv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.wafv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * WebACL JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WebACLJsonUnmarshaller implements Unmarshaller<WebACL, JsonUnmarshallerContext> {

    public WebACL unmarshall(JsonUnmarshallerContext context) throws Exception {
        WebACL webACL = new WebACL();

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
                    webACL.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    webACL.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ARN", targetDepth)) {
                    context.nextToken();
                    webACL.setARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultAction", targetDepth)) {
                    context.nextToken();
                    webACL.setDefaultAction(DefaultActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    webACL.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Rules", targetDepth)) {
                    context.nextToken();
                    webACL.setRules(new ListUnmarshaller<Rule>(RuleJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("VisibilityConfig", targetDepth)) {
                    context.nextToken();
                    webACL.setVisibilityConfig(VisibilityConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Capacity", targetDepth)) {
                    context.nextToken();
                    webACL.setCapacity(context.getUnmarshaller(Long.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return webACL;
    }

    private static WebACLJsonUnmarshaller instance;

    public static WebACLJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WebACLJsonUnmarshaller();
        return instance;
    }
}
