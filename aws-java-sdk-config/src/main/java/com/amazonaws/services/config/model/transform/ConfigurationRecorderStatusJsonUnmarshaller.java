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
package com.amazonaws.services.config.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ConfigurationRecorderStatus JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigurationRecorderStatusJsonUnmarshaller implements Unmarshaller<ConfigurationRecorderStatus, JsonUnmarshallerContext> {

    public ConfigurationRecorderStatus unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConfigurationRecorderStatus configurationRecorderStatus = new ConfigurationRecorderStatus();

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
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    configurationRecorderStatus.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastStartTime", targetDepth)) {
                    context.nextToken();
                    configurationRecorderStatus.setLastStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastStopTime", targetDepth)) {
                    context.nextToken();
                    configurationRecorderStatus.setLastStopTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("recording", targetDepth)) {
                    context.nextToken();
                    configurationRecorderStatus.setRecording(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("lastStatus", targetDepth)) {
                    context.nextToken();
                    configurationRecorderStatus.setLastStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastErrorCode", targetDepth)) {
                    context.nextToken();
                    configurationRecorderStatus.setLastErrorCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastErrorMessage", targetDepth)) {
                    context.nextToken();
                    configurationRecorderStatus.setLastErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastStatusChangeTime", targetDepth)) {
                    context.nextToken();
                    configurationRecorderStatus.setLastStatusChangeTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return configurationRecorderStatus;
    }

    private static ConfigurationRecorderStatusJsonUnmarshaller instance;

    public static ConfigurationRecorderStatusJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConfigurationRecorderStatusJsonUnmarshaller();
        return instance;
    }
}
