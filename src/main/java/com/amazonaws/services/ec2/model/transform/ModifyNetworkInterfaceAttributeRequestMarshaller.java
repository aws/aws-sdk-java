/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Modify Network Interface Attribute Request Marshaller
 */
public class ModifyNetworkInterfaceAttributeRequestMarshaller implements Marshaller<Request<ModifyNetworkInterfaceAttributeRequest>, ModifyNetworkInterfaceAttributeRequest> {

    public Request<ModifyNetworkInterfaceAttributeRequest> marshall(ModifyNetworkInterfaceAttributeRequest modifyNetworkInterfaceAttributeRequest) {

        if (modifyNetworkInterfaceAttributeRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<ModifyNetworkInterfaceAttributeRequest> request = new DefaultRequest<ModifyNetworkInterfaceAttributeRequest>(modifyNetworkInterfaceAttributeRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyNetworkInterfaceAttribute");
        request.addParameter("Version", "2013-10-15");

        if (modifyNetworkInterfaceAttributeRequest.getNetworkInterfaceId() != null) {
            request.addParameter("NetworkInterfaceId", StringUtils.fromString(modifyNetworkInterfaceAttributeRequest.getNetworkInterfaceId()));
        }
        if (modifyNetworkInterfaceAttributeRequest.getDescription() != null) {
            request.addParameter("Description.Value", StringUtils.fromString(modifyNetworkInterfaceAttributeRequest.getDescription()));
        }
        if (modifyNetworkInterfaceAttributeRequest.isSourceDestCheck() != null) {
            request.addParameter("SourceDestCheck.Value", StringUtils.fromBoolean(modifyNetworkInterfaceAttributeRequest.isSourceDestCheck()));
        }

        java.util.List<String> groupsList = modifyNetworkInterfaceAttributeRequest.getGroups();
        int groupsListIndex = 1;

        for (String groupsListValue : groupsList) {
            if (groupsListValue != null) {
                request.addParameter("SecurityGroupId." + groupsListIndex, StringUtils.fromString(groupsListValue));
            }

            groupsListIndex++;
        }
        NetworkInterfaceAttachmentChanges networkInterfaceAttachmentChangesAttachment = modifyNetworkInterfaceAttributeRequest.getAttachment();
        if (networkInterfaceAttachmentChangesAttachment != null) {
            if (networkInterfaceAttachmentChangesAttachment.getAttachmentId() != null) {
                request.addParameter("Attachment.AttachmentId", StringUtils.fromString(networkInterfaceAttachmentChangesAttachment.getAttachmentId()));
            }
            if (networkInterfaceAttachmentChangesAttachment.isDeleteOnTermination() != null) {
                request.addParameter("Attachment.DeleteOnTermination", StringUtils.fromBoolean(networkInterfaceAttachmentChangesAttachment.isDeleteOnTermination()));
            }
        }


        return request;
    }
}
