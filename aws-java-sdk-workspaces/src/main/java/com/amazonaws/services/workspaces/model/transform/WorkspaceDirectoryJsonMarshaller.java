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
 * WorkspaceDirectoryMarshaller
 */
public class WorkspaceDirectoryJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(WorkspaceDirectory workspaceDirectory, StructuredJsonGenerator jsonGenerator) {

        if (workspaceDirectory == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (workspaceDirectory.getDirectoryId() != null) {
                jsonGenerator.writeFieldName("DirectoryId").writeValue(workspaceDirectory.getDirectoryId());
            }
            if (workspaceDirectory.getAlias() != null) {
                jsonGenerator.writeFieldName("Alias").writeValue(workspaceDirectory.getAlias());
            }
            if (workspaceDirectory.getDirectoryName() != null) {
                jsonGenerator.writeFieldName("DirectoryName").writeValue(workspaceDirectory.getDirectoryName());
            }
            if (workspaceDirectory.getRegistrationCode() != null) {
                jsonGenerator.writeFieldName("RegistrationCode").writeValue(workspaceDirectory.getRegistrationCode());
            }

            com.amazonaws.internal.SdkInternalList<String> subnetIdsList = (com.amazonaws.internal.SdkInternalList<String>) workspaceDirectory.getSubnetIds();
            if (!subnetIdsList.isEmpty() || !subnetIdsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("SubnetIds");
                jsonGenerator.writeStartArray();
                for (String subnetIdsListValue : subnetIdsList) {
                    if (subnetIdsListValue != null) {
                        jsonGenerator.writeValue(subnetIdsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<String> dnsIpAddressesList = (com.amazonaws.internal.SdkInternalList<String>) workspaceDirectory
                    .getDnsIpAddresses();
            if (!dnsIpAddressesList.isEmpty() || !dnsIpAddressesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("DnsIpAddresses");
                jsonGenerator.writeStartArray();
                for (String dnsIpAddressesListValue : dnsIpAddressesList) {
                    if (dnsIpAddressesListValue != null) {
                        jsonGenerator.writeValue(dnsIpAddressesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (workspaceDirectory.getCustomerUserName() != null) {
                jsonGenerator.writeFieldName("CustomerUserName").writeValue(workspaceDirectory.getCustomerUserName());
            }
            if (workspaceDirectory.getIamRoleId() != null) {
                jsonGenerator.writeFieldName("IamRoleId").writeValue(workspaceDirectory.getIamRoleId());
            }
            if (workspaceDirectory.getDirectoryType() != null) {
                jsonGenerator.writeFieldName("DirectoryType").writeValue(workspaceDirectory.getDirectoryType());
            }
            if (workspaceDirectory.getWorkspaceSecurityGroupId() != null) {
                jsonGenerator.writeFieldName("WorkspaceSecurityGroupId").writeValue(workspaceDirectory.getWorkspaceSecurityGroupId());
            }
            if (workspaceDirectory.getState() != null) {
                jsonGenerator.writeFieldName("State").writeValue(workspaceDirectory.getState());
            }
            if (workspaceDirectory.getWorkspaceCreationProperties() != null) {
                jsonGenerator.writeFieldName("WorkspaceCreationProperties");
                DefaultWorkspaceCreationPropertiesJsonMarshaller.getInstance().marshall(workspaceDirectory.getWorkspaceCreationProperties(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static WorkspaceDirectoryJsonMarshaller instance;

    public static WorkspaceDirectoryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WorkspaceDirectoryJsonMarshaller();
        return instance;
    }

}
