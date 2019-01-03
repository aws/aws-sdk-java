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
package com.amazonaws.services.pinpoint.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AddressConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddressConfigurationJsonUnmarshaller implements Unmarshaller<AddressConfiguration, JsonUnmarshallerContext> {

    public AddressConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        AddressConfiguration addressConfiguration = new AddressConfiguration();

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
                if (context.testExpression("BodyOverride", targetDepth)) {
                    context.nextToken();
                    addressConfiguration.setBodyOverride(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ChannelType", targetDepth)) {
                    context.nextToken();
                    addressConfiguration.setChannelType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Context", targetDepth)) {
                    context.nextToken();
                    addressConfiguration.setContext(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("RawContent", targetDepth)) {
                    context.nextToken();
                    addressConfiguration.setRawContent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Substitutions", targetDepth)) {
                    context.nextToken();
                    addressConfiguration.setSubstitutions(new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<String>(context.getUnmarshaller(String.class))).unmarshall(context));
                }
                if (context.testExpression("TitleOverride", targetDepth)) {
                    context.nextToken();
                    addressConfiguration.setTitleOverride(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return addressConfiguration;
    }

    private static AddressConfigurationJsonUnmarshaller instance;

    public static AddressConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AddressConfigurationJsonUnmarshaller();
        return instance;
    }
}
