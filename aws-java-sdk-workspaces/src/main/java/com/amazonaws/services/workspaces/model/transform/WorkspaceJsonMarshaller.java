/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspaces.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workspaces.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * WorkspaceMarshaller
 */
public class WorkspaceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Workspace workspace, StructuredJsonGenerator jsonGenerator) {

        if (workspace == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (workspace.getWorkspaceId() != null) {
                jsonGenerator.writeFieldName("WorkspaceId").writeValue(workspace.getWorkspaceId());
            }
            if (workspace.getDirectoryId() != null) {
                jsonGenerator.writeFieldName("DirectoryId").writeValue(workspace.getDirectoryId());
            }
            if (workspace.getUserName() != null) {
                jsonGenerator.writeFieldName("UserName").writeValue(workspace.getUserName());
            }
            if (workspace.getIpAddress() != null) {
                jsonGenerator.writeFieldName("IpAddress").writeValue(workspace.getIpAddress());
            }
            if (workspace.getState() != null) {
                jsonGenerator.writeFieldName("State").writeValue(workspace.getState());
            }
            if (workspace.getBundleId() != null) {
                jsonGenerator.writeFieldName("BundleId").writeValue(workspace.getBundleId());
            }
            if (workspace.getSubnetId() != null) {
                jsonGenerator.writeFieldName("SubnetId").writeValue(workspace.getSubnetId());
            }
            if (workspace.getErrorMessage() != null) {
                jsonGenerator.writeFieldName("ErrorMessage").writeValue(workspace.getErrorMessage());
            }
            if (workspace.getErrorCode() != null) {
                jsonGenerator.writeFieldName("ErrorCode").writeValue(workspace.getErrorCode());
            }
            if (workspace.getComputerName() != null) {
                jsonGenerator.writeFieldName("ComputerName").writeValue(workspace.getComputerName());
            }
            if (workspace.getVolumeEncryptionKey() != null) {
                jsonGenerator.writeFieldName("VolumeEncryptionKey").writeValue(workspace.getVolumeEncryptionKey());
            }
            if (workspace.getUserVolumeEncryptionEnabled() != null) {
                jsonGenerator.writeFieldName("UserVolumeEncryptionEnabled").writeValue(workspace.getUserVolumeEncryptionEnabled());
            }
            if (workspace.getRootVolumeEncryptionEnabled() != null) {
                jsonGenerator.writeFieldName("RootVolumeEncryptionEnabled").writeValue(workspace.getRootVolumeEncryptionEnabled());
            }
            if (workspace.getWorkspaceProperties() != null) {
                jsonGenerator.writeFieldName("WorkspaceProperties");
                WorkspacePropertiesJsonMarshaller.getInstance().marshall(workspace.getWorkspaceProperties(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static WorkspaceJsonMarshaller instance;

    public static WorkspaceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WorkspaceJsonMarshaller();
        return instance;
    }

}
