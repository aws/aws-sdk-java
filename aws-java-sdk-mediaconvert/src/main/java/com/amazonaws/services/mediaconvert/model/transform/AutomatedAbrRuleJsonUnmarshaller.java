/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediaconvert.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AutomatedAbrRule JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutomatedAbrRuleJsonUnmarshaller implements Unmarshaller<AutomatedAbrRule, JsonUnmarshallerContext> {

    public AutomatedAbrRule unmarshall(JsonUnmarshallerContext context) throws Exception {
        AutomatedAbrRule automatedAbrRule = new AutomatedAbrRule();

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
                if (context.testExpression("allowedRenditions", targetDepth)) {
                    context.nextToken();
                    automatedAbrRule.setAllowedRenditions(new ListUnmarshaller<AllowedRenditionSize>(AllowedRenditionSizeJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("forceIncludeRenditions", targetDepth)) {
                    context.nextToken();
                    automatedAbrRule.setForceIncludeRenditions(new ListUnmarshaller<ForceIncludeRenditionSize>(ForceIncludeRenditionSizeJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("minBottomRenditionSize", targetDepth)) {
                    context.nextToken();
                    automatedAbrRule.setMinBottomRenditionSize(MinBottomRenditionSizeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("minTopRenditionSize", targetDepth)) {
                    context.nextToken();
                    automatedAbrRule.setMinTopRenditionSize(MinTopRenditionSizeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    automatedAbrRule.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return automatedAbrRule;
    }

    private static AutomatedAbrRuleJsonUnmarshaller instance;

    public static AutomatedAbrRuleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AutomatedAbrRuleJsonUnmarshaller();
        return instance;
    }
}
