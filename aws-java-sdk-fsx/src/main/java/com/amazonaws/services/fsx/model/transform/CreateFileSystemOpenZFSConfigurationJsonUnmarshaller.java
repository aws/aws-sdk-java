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
 * CreateFileSystemOpenZFSConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFileSystemOpenZFSConfigurationJsonUnmarshaller implements Unmarshaller<CreateFileSystemOpenZFSConfiguration, JsonUnmarshallerContext> {

    public CreateFileSystemOpenZFSConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateFileSystemOpenZFSConfiguration createFileSystemOpenZFSConfiguration = new CreateFileSystemOpenZFSConfiguration();

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
                    createFileSystemOpenZFSConfiguration.setAutomaticBackupRetentionDays(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CopyTagsToBackups", targetDepth)) {
                    context.nextToken();
                    createFileSystemOpenZFSConfiguration.setCopyTagsToBackups(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CopyTagsToVolumes", targetDepth)) {
                    context.nextToken();
                    createFileSystemOpenZFSConfiguration.setCopyTagsToVolumes(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("DailyAutomaticBackupStartTime", targetDepth)) {
                    context.nextToken();
                    createFileSystemOpenZFSConfiguration.setDailyAutomaticBackupStartTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeploymentType", targetDepth)) {
                    context.nextToken();
                    createFileSystemOpenZFSConfiguration.setDeploymentType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ThroughputCapacity", targetDepth)) {
                    context.nextToken();
                    createFileSystemOpenZFSConfiguration.setThroughputCapacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("WeeklyMaintenanceStartTime", targetDepth)) {
                    context.nextToken();
                    createFileSystemOpenZFSConfiguration.setWeeklyMaintenanceStartTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DiskIopsConfiguration", targetDepth)) {
                    context.nextToken();
                    createFileSystemOpenZFSConfiguration.setDiskIopsConfiguration(DiskIopsConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RootVolumeConfiguration", targetDepth)) {
                    context.nextToken();
                    createFileSystemOpenZFSConfiguration.setRootVolumeConfiguration(OpenZFSCreateRootVolumeConfigurationJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createFileSystemOpenZFSConfiguration;
    }

    private static CreateFileSystemOpenZFSConfigurationJsonUnmarshaller instance;

    public static CreateFileSystemOpenZFSConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateFileSystemOpenZFSConfigurationJsonUnmarshaller();
        return instance;
    }
}
