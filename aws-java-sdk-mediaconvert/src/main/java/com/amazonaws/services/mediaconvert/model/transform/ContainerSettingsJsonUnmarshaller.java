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
package com.amazonaws.services.mediaconvert.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ContainerSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerSettingsJsonUnmarshaller implements Unmarshaller<ContainerSettings, JsonUnmarshallerContext> {

    public ContainerSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        ContainerSettings containerSettings = new ContainerSettings();

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
                if (context.testExpression("container", targetDepth)) {
                    context.nextToken();
                    containerSettings.setContainer(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("f4vSettings", targetDepth)) {
                    context.nextToken();
                    containerSettings.setF4vSettings(F4vSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("m2tsSettings", targetDepth)) {
                    context.nextToken();
                    containerSettings.setM2tsSettings(M2tsSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("m3u8Settings", targetDepth)) {
                    context.nextToken();
                    containerSettings.setM3u8Settings(M3u8SettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("movSettings", targetDepth)) {
                    context.nextToken();
                    containerSettings.setMovSettings(MovSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("mp4Settings", targetDepth)) {
                    context.nextToken();
                    containerSettings.setMp4Settings(Mp4SettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return containerSettings;
    }

    private static ContainerSettingsJsonUnmarshaller instance;

    public static ContainerSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContainerSettingsJsonUnmarshaller();
        return instance;
    }
}
