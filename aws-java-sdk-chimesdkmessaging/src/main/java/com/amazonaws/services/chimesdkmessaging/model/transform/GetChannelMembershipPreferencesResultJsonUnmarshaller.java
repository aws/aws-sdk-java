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
package com.amazonaws.services.chimesdkmessaging.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.chimesdkmessaging.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetChannelMembershipPreferencesResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetChannelMembershipPreferencesResultJsonUnmarshaller implements Unmarshaller<GetChannelMembershipPreferencesResult, JsonUnmarshallerContext> {

    public GetChannelMembershipPreferencesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetChannelMembershipPreferencesResult getChannelMembershipPreferencesResult = new GetChannelMembershipPreferencesResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getChannelMembershipPreferencesResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ChannelArn", targetDepth)) {
                    context.nextToken();
                    getChannelMembershipPreferencesResult.setChannelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Member", targetDepth)) {
                    context.nextToken();
                    getChannelMembershipPreferencesResult.setMember(IdentityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Preferences", targetDepth)) {
                    context.nextToken();
                    getChannelMembershipPreferencesResult.setPreferences(ChannelMembershipPreferencesJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getChannelMembershipPreferencesResult;
    }

    private static GetChannelMembershipPreferencesResultJsonUnmarshaller instance;

    public static GetChannelMembershipPreferencesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetChannelMembershipPreferencesResultJsonUnmarshaller();
        return instance;
    }
}
