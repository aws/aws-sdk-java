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
 * WorkspaceDirectoryMarshaller
 */
public class WorkspaceDirectoryJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(WorkspaceDirectory workspaceDirectory,
            JSONWriter jsonWriter) {
        if (workspaceDirectory == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (workspaceDirectory.getDirectoryId() != null) {
                jsonWriter.key("DirectoryId").value(
                        workspaceDirectory.getDirectoryId());
            }

            if (workspaceDirectory.getAlias() != null) {
                jsonWriter.key("Alias").value(workspaceDirectory.getAlias());
            }

            if (workspaceDirectory.getDirectoryName() != null) {
                jsonWriter.key("DirectoryName").value(
                        workspaceDirectory.getDirectoryName());
            }

            if (workspaceDirectory.getRegistrationCode() != null) {
                jsonWriter.key("RegistrationCode").value(
                        workspaceDirectory.getRegistrationCode());
            }

            com.amazonaws.internal.SdkInternalList<String> subnetIdsList = (com.amazonaws.internal.SdkInternalList<String>) workspaceDirectory
                    .getSubnetIds();
            if (!subnetIdsList.isEmpty() || !subnetIdsList.isAutoConstruct()) {
                jsonWriter.key("SubnetIds");
                jsonWriter.array();
                for (String subnetIdsListValue : subnetIdsList) {
                    if (subnetIdsListValue != null) {
                        jsonWriter.value(subnetIdsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<String> dnsIpAddressesList = (com.amazonaws.internal.SdkInternalList<String>) workspaceDirectory
                    .getDnsIpAddresses();
            if (!dnsIpAddressesList.isEmpty()
                    || !dnsIpAddressesList.isAutoConstruct()) {
                jsonWriter.key("DnsIpAddresses");
                jsonWriter.array();
                for (String dnsIpAddressesListValue : dnsIpAddressesList) {
                    if (dnsIpAddressesListValue != null) {
                        jsonWriter.value(dnsIpAddressesListValue);
                    }
                }
                jsonWriter.endArray();
            }

            if (workspaceDirectory.getCustomerUserName() != null) {
                jsonWriter.key("CustomerUserName").value(
                        workspaceDirectory.getCustomerUserName());
            }

            if (workspaceDirectory.getIamRoleId() != null) {
                jsonWriter.key("IamRoleId").value(
                        workspaceDirectory.getIamRoleId());
            }

            if (workspaceDirectory.getDirectoryType() != null) {
                jsonWriter.key("DirectoryType").value(
                        workspaceDirectory.getDirectoryType());
            }

            if (workspaceDirectory.getWorkspaceSecurityGroupId() != null) {
                jsonWriter.key("WorkspaceSecurityGroupId").value(
                        workspaceDirectory.getWorkspaceSecurityGroupId());
            }

            if (workspaceDirectory.getState() != null) {
                jsonWriter.key("State").value(workspaceDirectory.getState());
            }

            if (workspaceDirectory.getWorkspaceCreationProperties() != null) {
                jsonWriter.key("WorkspaceCreationProperties");
                DefaultWorkspaceCreationPropertiesJsonMarshaller
                        .getInstance()
                        .marshall(
                                workspaceDirectory
                                        .getWorkspaceCreationProperties(),
                                jsonWriter);
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static WorkspaceDirectoryJsonMarshaller instance;

    public static WorkspaceDirectoryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WorkspaceDirectoryJsonMarshaller();
        return instance;
    }

}
