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
package com.amazonaws.services.fsx.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.fsx.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * OpenZFSFileSystemConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpenZFSFileSystemConfigurationJsonUnmarshaller implements Unmarshaller<OpenZFSFileSystemConfiguration, JsonUnmarshallerContext> {

    public OpenZFSFileSystemConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        OpenZFSFileSystemConfiguration openZFSFileSystemConfiguration = new OpenZFSFileSystemConfiguration();

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
                if (context.testExpression("AutomaticBackupRetentionDays", targetDepth)) {
                    context.nextToken();
                    openZFSFileSystemConfiguration.setAutomaticBackupRetentionDays(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CopyTagsToBackups", targetDepth)) {
                    context.nextToken();
                    openZFSFileSystemConfiguration.setCopyTagsToBackups(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CopyTagsToVolumes", targetDepth)) {
                    context.nextToken();
                    openZFSFileSystemConfiguration.setCopyTagsToVolumes(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("DailyAutomaticBackupStartTime", targetDepth)) {
                    context.nextToken();
                    openZFSFileSystemConfiguration.setDailyAutomaticBackupStartTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeploymentType", targetDepth)) {
                    context.nextToken();
                    openZFSFileSystemConfiguration.setDeploymentType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ThroughputCapacity", targetDepth)) {
                    context.nextToken();
                    openZFSFileSystemConfiguration.setThroughputCapacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("WeeklyMaintenanceStartTime", targetDepth)) {
                    context.nextToken();
                    openZFSFileSystemConfiguration.setWeeklyMaintenanceStartTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DiskIopsConfiguration", targetDepth)) {
                    context.nextToken();
                    openZFSFileSystemConfiguration.setDiskIopsConfiguration(DiskIopsConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RootVolumeId", targetDepth)) {
                    context.nextToken();
                    openZFSFileSystemConfiguration.setRootVolumeId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return openZFSFileSystemConfiguration;
    }

    private static OpenZFSFileSystemConfigurationJsonUnmarshaller instance;

    public static OpenZFSFileSystemConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OpenZFSFileSystemConfigurationJsonUnmarshaller();
        return instance;
    }
}
