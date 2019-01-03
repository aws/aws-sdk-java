/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.alexaforbusiness.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.alexaforbusiness.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Profile JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProfileJsonUnmarshaller implements Unmarshaller<Profile, JsonUnmarshallerContext> {

    public Profile unmarshall(JsonUnmarshallerContext context) throws Exception {
        Profile profile = new Profile();

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
                if (context.testExpression("ProfileArn", targetDepth)) {
                    context.nextToken();
                    profile.setProfileArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProfileName", targetDepth)) {
                    context.nextToken();
                    profile.setProfileName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsDefault", targetDepth)) {
                    context.nextToken();
                    profile.setIsDefault(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Address", targetDepth)) {
                    context.nextToken();
                    profile.setAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Timezone", targetDepth)) {
                    context.nextToken();
                    profile.setTimezone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DistanceUnit", targetDepth)) {
                    context.nextToken();
                    profile.setDistanceUnit(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TemperatureUnit", targetDepth)) {
                    context.nextToken();
                    profile.setTemperatureUnit(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WakeWord", targetDepth)) {
                    context.nextToken();
                    profile.setWakeWord(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SetupModeDisabled", targetDepth)) {
                    context.nextToken();
                    profile.setSetupModeDisabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("MaxVolumeLimit", targetDepth)) {
                    context.nextToken();
                    profile.setMaxVolumeLimit(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("PSTNEnabled", targetDepth)) {
                    context.nextToken();
                    profile.setPSTNEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("AddressBookArn", targetDepth)) {
                    context.nextToken();
                    profile.setAddressBookArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return profile;
    }

    private static ProfileJsonUnmarshaller instance;

    public static ProfileJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProfileJsonUnmarshaller();
        return instance;
    }
}
