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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ConfigurationOptions JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigurationOptionsJsonUnmarshaller implements Unmarshaller<ConfigurationOptions, JsonUnmarshallerContext> {

    public ConfigurationOptions unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConfigurationOptions configurationOptions = new ConfigurationOptions();

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
                if (context.testExpression("Integer", targetDepth)) {
                    context.nextToken();
                    configurationOptions.setInteger(IntegerConfigurationOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("IntegerList", targetDepth)) {
                    context.nextToken();
                    configurationOptions.setIntegerList(IntegerListConfigurationOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Double", targetDepth)) {
                    context.nextToken();
                    configurationOptions.setDouble(DoubleConfigurationOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("String", targetDepth)) {
                    context.nextToken();
                    configurationOptions.setString(StringConfigurationOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StringList", targetDepth)) {
                    context.nextToken();
                    configurationOptions.setStringList(StringListConfigurationOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Boolean", targetDepth)) {
                    context.nextToken();
                    configurationOptions.setBoolean(BooleanConfigurationOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Enum", targetDepth)) {
                    context.nextToken();
                    configurationOptions.setEnum(EnumConfigurationOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EnumList", targetDepth)) {
                    context.nextToken();
                    configurationOptions.setEnumList(EnumListConfigurationOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return configurationOptions;
    }

    private static ConfigurationOptionsJsonUnmarshaller instance;

    public static ConfigurationOptionsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConfigurationOptionsJsonUnmarshaller();
        return instance;
    }
}
