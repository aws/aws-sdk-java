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
 * AssociateInstanceEventWindowRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateInstanceEventWindowRequestMarshaller implements
        Marshaller<Request<AssociateInstanceEventWindowRequest>, AssociateInstanceEventWindowRequest> {

    public Request<AssociateInstanceEventWindowRequest> marshall(AssociateInstanceEventWindowRequest associateInstanceEventWindowRequest) {

        if (associateInstanceEventWindowRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AssociateInstanceEventWindowRequest> request = new DefaultRequest<AssociateInstanceEventWindowRequest>(associateInstanceEventWindowRequest,
                "AmazonEC2");
        request.addParameter("Action", "AssociateInstanceEventWindow");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (associateInstanceEventWindowRequest.getInstanceEventWindowId() != null) {
            request.addParameter("InstanceEventWindowId", StringUtils.fromString(associateInstanceEventWindowRequest.getInstanceEventWindowId()));
        }

        InstanceEventWindowAssociationRequest associationTarget = associateInstanceEventWindowRequest.getAssociationTarget();
        if (associationTarget != null) {

            com.amazonaws.internal.SdkInternalList<String> instanceEventWindowAssociationRequestInstanceIdsList = (com.amazonaws.internal.SdkInternalList<String>) associationTarget
                    .getInstanceIds();
            if (!instanceEventWindowAssociationRequestInstanceIdsList.isEmpty() || !instanceEventWindowAssociationRequestInstanceIdsList.isAutoConstruct()) {
                int instanceIdsListIndex = 1;

                for (String instanceEventWindowAssociationRequestInstanceIdsListValue : instanceEventWindowAssociationRequestInstanceIdsList) {
                    if (instanceEventWindowAssociationRequestInstanceIdsListValue != null) {
                        request.addParameter("AssociationTarget.InstanceId." + instanceIdsListIndex,
                                StringUtils.fromString(instanceEventWindowAssociationRequestInstanceIdsListValue));
                    }
                    instanceIdsListIndex++;
                }
            }

            com.amazonaws.internal.SdkInternalList<Tag> instanceEventWindowAssociationRequestInstanceTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) associationTarget
                    .getInstanceTags();
            if (!instanceEventWindowAssociationRequestInstanceTagsList.isEmpty() || !instanceEventWindowAssociationRequestInstanceTagsList.isAutoConstruct()) {
                int instanceTagsListIndex = 1;

                for (Tag instanceEventWindowAssociationRequestInstanceTagsListValue : instanceEventWindowAssociationRequestInstanceTagsList) {

                    if (instanceEventWindowAssociationRequestInstanceTagsListValue.getKey() != null) {
                        request.addParameter("AssociationTarget.InstanceTag." + instanceTagsListIndex + ".Key",
                                StringUtils.fromString(instanceEventWindowAssociationRequestInstanceTagsListValue.getKey()));
                    }

                    if (instanceEventWindowAssociationRequestInstanceTagsListValue.getValue() != null) {
                        request.addParameter("AssociationTarget.InstanceTag." + instanceTagsListIndex + ".Value",
                                StringUtils.fromString(instanceEventWindowAssociationRequestInstanceTagsListValue.getValue()));
                    }
                    instanceTagsListIndex++;
                }
            }

            com.amazonaws.internal.SdkInternalList<String> instanceEventWindowAssociationRequestDedicatedHostIdsList = (com.amazonaws.internal.SdkInternalList<String>) associationTarget
                    .getDedicatedHostIds();
            if (!instanceEventWindowAssociationRequestDedicatedHostIdsList.isEmpty()
                    || !instanceEventWindowAssociationRequestDedicatedHostIdsList.isAutoConstruct()) {
                int dedicatedHostIdsListIndex = 1;

                for (String instanceEventWindowAssociationRequestDedicatedHostIdsListValue : instanceEventWindowAssociationRequestDedicatedHostIdsList) {
                    if (instanceEventWindowAssociationRequestDedicatedHostIdsListValue != null) {
                        request.addParameter("AssociationTarget.DedicatedHostId." + dedicatedHostIdsListIndex,
                                StringUtils.fromString(instanceEventWindowAssociationRequestDedicatedHostIdsListValue));
                    }
                    dedicatedHostIdsListIndex++;
                }
            }
        }

        return request;
    }

}
