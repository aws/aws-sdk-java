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
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ModifyNetworkInterfaceAttributeRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyNetworkInterfaceAttributeRequestMarshaller implements
        Marshaller<Request<ModifyNetworkInterfaceAttributeRequest>, ModifyNetworkInterfaceAttributeRequest> {

    public Request<ModifyNetworkInterfaceAttributeRequest> marshall(ModifyNetworkInterfaceAttributeRequest modifyNetworkInterfaceAttributeRequest) {

        if (modifyNetworkInterfaceAttributeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyNetworkInterfaceAttributeRequest> request = new DefaultRequest<ModifyNetworkInterfaceAttributeRequest>(
                modifyNetworkInterfaceAttributeRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyNetworkInterfaceAttribute");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        NetworkInterfaceAttachmentChanges attachment = modifyNetworkInterfaceAttributeRequest.getAttachment();
        if (attachment != null) {

            if (attachment.getAttachmentId() != null) {
                request.addParameter("Attachment.AttachmentId", StringUtils.fromString(attachment.getAttachmentId()));
            }

            if (attachment.getDeleteOnTermination() != null) {
                request.addParameter("Attachment.DeleteOnTermination", StringUtils.fromBoolean(attachment.getDeleteOnTermination()));
            }
        }

        if (modifyNetworkInterfaceAttributeRequest.getDescription() != null) {
            request.addParameter("Description.Value", StringUtils.fromString(modifyNetworkInterfaceAttributeRequest.getDescription()));
        }

        com.amazonaws.internal.SdkInternalList<String> modifyNetworkInterfaceAttributeRequestGroupsList = (com.amazonaws.internal.SdkInternalList<String>) modifyNetworkInterfaceAttributeRequest
                .getGroups();
        if (!modifyNetworkInterfaceAttributeRequestGroupsList.isEmpty() || !modifyNetworkInterfaceAttributeRequestGroupsList.isAutoConstruct()) {
            int groupsListIndex = 1;

            for (String modifyNetworkInterfaceAttributeRequestGroupsListValue : modifyNetworkInterfaceAttributeRequestGroupsList) {
                if (modifyNetworkInterfaceAttributeRequestGroupsListValue != null) {
                    request.addParameter("SecurityGroupId." + groupsListIndex, StringUtils.fromString(modifyNetworkInterfaceAttributeRequestGroupsListValue));
                }
                groupsListIndex++;
            }
        }

        if (modifyNetworkInterfaceAttributeRequest.getNetworkInterfaceId() != null) {
            request.addParameter("NetworkInterfaceId", StringUtils.fromString(modifyNetworkInterfaceAttributeRequest.getNetworkInterfaceId()));
        }

        if (modifyNetworkInterfaceAttributeRequest.getSourceDestCheck() != null) {
            request.addParameter("SourceDestCheck.Value", StringUtils.fromBoolean(modifyNetworkInterfaceAttributeRequest.getSourceDestCheck()));
        }

        return request;
    }

}
