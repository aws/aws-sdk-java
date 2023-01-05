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
 * DisassociateInstanceEventWindowRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateInstanceEventWindowRequestMarshaller implements
        Marshaller<Request<DisassociateInstanceEventWindowRequest>, DisassociateInstanceEventWindowRequest> {

    public Request<DisassociateInstanceEventWindowRequest> marshall(DisassociateInstanceEventWindowRequest disassociateInstanceEventWindowRequest) {

        if (disassociateInstanceEventWindowRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DisassociateInstanceEventWindowRequest> request = new DefaultRequest<DisassociateInstanceEventWindowRequest>(
                disassociateInstanceEventWindowRequest, "AmazonEC2");
        request.addParameter("Action", "DisassociateInstanceEventWindow");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (disassociateInstanceEventWindowRequest.getInstanceEventWindowId() != null) {
            request.addParameter("InstanceEventWindowId", StringUtils.fromString(disassociateInstanceEventWindowRequest.getInstanceEventWindowId()));
        }

        InstanceEventWindowDisassociationRequest associationTarget = disassociateInstanceEventWindowRequest.getAssociationTarget();
        if (associationTarget != null) {

            com.amazonaws.internal.SdkInternalList<String> instanceEventWindowDisassociationRequestInstanceIdsList = (com.amazonaws.internal.SdkInternalList<String>) associationTarget
                    .getInstanceIds();
            if (!instanceEventWindowDisassociationRequestInstanceIdsList.isEmpty()
                    || !instanceEventWindowDisassociationRequestInstanceIdsList.isAutoConstruct()) {
                int instanceIdsListIndex = 1;

                for (String instanceEventWindowDisassociationRequestInstanceIdsListValue : instanceEventWindowDisassociationRequestInstanceIdsList) {
                    if (instanceEventWindowDisassociationRequestInstanceIdsListValue != null) {
                        request.addParameter("AssociationTarget.InstanceId." + instanceIdsListIndex,
                                StringUtils.fromString(instanceEventWindowDisassociationRequestInstanceIdsListValue));
                    }
                    instanceIdsListIndex++;
                }
            }

            com.amazonaws.internal.SdkInternalList<Tag> instanceEventWindowDisassociationRequestInstanceTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) associationTarget
                    .getInstanceTags();
            if (!instanceEventWindowDisassociationRequestInstanceTagsList.isEmpty()
                    || !instanceEventWindowDisassociationRequestInstanceTagsList.isAutoConstruct()) {
                int instanceTagsListIndex = 1;

                for (Tag instanceEventWindowDisassociationRequestInstanceTagsListValue : instanceEventWindowDisassociationRequestInstanceTagsList) {

                    if (instanceEventWindowDisassociationRequestInstanceTagsListValue.getKey() != null) {
                        request.addParameter("AssociationTarget.InstanceTag." + instanceTagsListIndex + ".Key",
                                StringUtils.fromString(instanceEventWindowDisassociationRequestInstanceTagsListValue.getKey()));
                    }

                    if (instanceEventWindowDisassociationRequestInstanceTagsListValue.getValue() != null) {
                        request.addParameter("AssociationTarget.InstanceTag." + instanceTagsListIndex + ".Value",
                                StringUtils.fromString(instanceEventWindowDisassociationRequestInstanceTagsListValue.getValue()));
                    }
                    instanceTagsListIndex++;
                }
            }

            com.amazonaws.internal.SdkInternalList<String> instanceEventWindowDisassociationRequestDedicatedHostIdsList = (com.amazonaws.internal.SdkInternalList<String>) associationTarget
                    .getDedicatedHostIds();
            if (!instanceEventWindowDisassociationRequestDedicatedHostIdsList.isEmpty()
                    || !instanceEventWindowDisassociationRequestDedicatedHostIdsList.isAutoConstruct()) {
                int dedicatedHostIdsListIndex = 1;

                for (String instanceEventWindowDisassociationRequestDedicatedHostIdsListValue : instanceEventWindowDisassociationRequestDedicatedHostIdsList) {
                    if (instanceEventWindowDisassociationRequestDedicatedHostIdsListValue != null) {
                        request.addParameter("AssociationTarget.DedicatedHostId." + dedicatedHostIdsListIndex,
                                StringUtils.fromString(instanceEventWindowDisassociationRequestDedicatedHostIdsListValue));
                    }
                    dedicatedHostIdsListIndex++;
                }
            }
        }

        return request;
    }

}
