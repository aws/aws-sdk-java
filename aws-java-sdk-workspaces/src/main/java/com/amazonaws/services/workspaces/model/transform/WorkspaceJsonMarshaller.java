/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.workspaces.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.workspaces.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * WorkspaceMarshaller
 */
public class WorkspaceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Workspace workspace, JSONWriter jsonWriter) {
        if (workspace == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (workspace.getWorkspaceId() != null) {
                jsonWriter.key("WorkspaceId").value(workspace.getWorkspaceId());
            }

            if (workspace.getDirectoryId() != null) {
                jsonWriter.key("DirectoryId").value(workspace.getDirectoryId());
            }

            if (workspace.getUserName() != null) {
                jsonWriter.key("UserName").value(workspace.getUserName());
            }

            if (workspace.getIpAddress() != null) {
                jsonWriter.key("IpAddress").value(workspace.getIpAddress());
            }

            if (workspace.getState() != null) {
                jsonWriter.key("State").value(workspace.getState());
            }

            if (workspace.getBundleId() != null) {
                jsonWriter.key("BundleId").value(workspace.getBundleId());
            }

            if (workspace.getSubnetId() != null) {
                jsonWriter.key("SubnetId").value(workspace.getSubnetId());
            }

            if (workspace.getErrorMessage() != null) {
                jsonWriter.key("ErrorMessage").value(
                        workspace.getErrorMessage());
            }

            if (workspace.getErrorCode() != null) {
                jsonWriter.key("ErrorCode").value(workspace.getErrorCode());
            }

            if (workspace.getComputerName() != null) {
                jsonWriter.key("ComputerName").value(
                        workspace.getComputerName());
            }

            if (workspace.getVolumeEncryptionKey() != null) {
                jsonWriter.key("VolumeEncryptionKey").value(
                        workspace.getVolumeEncryptionKey());
            }

            if (workspace.getUserVolumeEncryptionEnabled() != null) {
                jsonWriter.key("UserVolumeEncryptionEnabled").value(
                        workspace.getUserVolumeEncryptionEnabled());
            }

            if (workspace.getRootVolumeEncryptionEnabled() != null) {
                jsonWriter.key("RootVolumeEncryptionEnabled").value(
                        workspace.getRootVolumeEncryptionEnabled());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static WorkspaceJsonMarshaller instance;

    public static WorkspaceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WorkspaceJsonMarshaller();
        return instance;
    }

}
