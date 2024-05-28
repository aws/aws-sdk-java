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
package com.amazonaws.services.mailmanager.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mailmanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AddonInstance JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddonInstanceJsonUnmarshaller implements Unmarshaller<AddonInstance, JsonUnmarshallerContext> {

    public AddonInstance unmarshall(JsonUnmarshallerContext context) throws Exception {
        AddonInstance addonInstance = new AddonInstance();

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
                if (context.testExpression("AddonInstanceArn", targetDepth)) {
                    context.nextToken();
                    addonInstance.setAddonInstanceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AddonInstanceId", targetDepth)) {
                    context.nextToken();
                    addonInstance.setAddonInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AddonName", targetDepth)) {
                    context.nextToken();
                    addonInstance.setAddonName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AddonSubscriptionId", targetDepth)) {
                    context.nextToken();
                    addonInstance.setAddonSubscriptionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    context.nextToken();
                    addonInstance.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return addonInstance;
    }

    private static AddonInstanceJsonUnmarshaller instance;

    public static AddonInstanceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AddonInstanceJsonUnmarshaller();
        return instance;
    }
}
