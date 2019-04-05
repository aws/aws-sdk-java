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
package com.amazonaws.services.opsworks.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * VolumeConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VolumeConfigurationJsonUnmarshaller implements Unmarshaller<VolumeConfiguration, JsonUnmarshallerContext> {

    public VolumeConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        VolumeConfiguration volumeConfiguration = new VolumeConfiguration();

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
                if (context.testExpression("MountPoint", targetDepth)) {
                    context.nextToken();
                    volumeConfiguration.setMountPoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RaidLevel", targetDepth)) {
                    context.nextToken();
                    volumeConfiguration.setRaidLevel(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("NumberOfDisks", targetDepth)) {
                    context.nextToken();
                    volumeConfiguration.setNumberOfDisks(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Size", targetDepth)) {
                    context.nextToken();
                    volumeConfiguration.setSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("VolumeType", targetDepth)) {
                    context.nextToken();
                    volumeConfiguration.setVolumeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Iops", targetDepth)) {
                    context.nextToken();
                    volumeConfiguration.setIops(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Encrypted", targetDepth)) {
                    context.nextToken();
                    volumeConfiguration.setEncrypted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return volumeConfiguration;
    }

    private static VolumeConfigurationJsonUnmarshaller instance;

    public static VolumeConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VolumeConfigurationJsonUnmarshaller();
        return instance;
    }
}
