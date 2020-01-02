/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.util.IdempotentUtils;

/**
 * CreateTrafficMirrorSessionRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTrafficMirrorSessionRequestMarshaller implements Marshaller<Request<CreateTrafficMirrorSessionRequest>, CreateTrafficMirrorSessionRequest> {

    public Request<CreateTrafficMirrorSessionRequest> marshall(CreateTrafficMirrorSessionRequest createTrafficMirrorSessionRequest) {

        if (createTrafficMirrorSessionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateTrafficMirrorSessionRequest> request = new DefaultRequest<CreateTrafficMirrorSessionRequest>(createTrafficMirrorSessionRequest,
                "AmazonEC2");
        request.addParameter("Action", "CreateTrafficMirrorSession");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createTrafficMirrorSessionRequest.getNetworkInterfaceId() != null) {
            request.addParameter("NetworkInterfaceId", StringUtils.fromString(createTrafficMirrorSessionRequest.getNetworkInterfaceId()));
        }

        if (createTrafficMirrorSessionRequest.getTrafficMirrorTargetId() != null) {
            request.addParameter("TrafficMirrorTargetId", StringUtils.fromString(createTrafficMirrorSessionRequest.getTrafficMirrorTargetId()));
        }

        if (createTrafficMirrorSessionRequest.getTrafficMirrorFilterId() != null) {
            request.addParameter("TrafficMirrorFilterId", StringUtils.fromString(createTrafficMirrorSessionRequest.getTrafficMirrorFilterId()));
        }

        if (createTrafficMirrorSessionRequest.getPacketLength() != null) {
            request.addParameter("PacketLength", StringUtils.fromInteger(createTrafficMirrorSessionRequest.getPacketLength()));
        }

        if (createTrafficMirrorSessionRequest.getSessionNumber() != null) {
            request.addParameter("SessionNumber", StringUtils.fromInteger(createTrafficMirrorSessionRequest.getSessionNumber()));
        }

        if (createTrafficMirrorSessionRequest.getVirtualNetworkId() != null) {
            request.addParameter("VirtualNetworkId", StringUtils.fromInteger(createTrafficMirrorSessionRequest.getVirtualNetworkId()));
        }

        if (createTrafficMirrorSessionRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createTrafficMirrorSessionRequest.getDescription()));
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> createTrafficMirrorSessionRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createTrafficMirrorSessionRequest
                .getTagSpecifications();
        if (!createTrafficMirrorSessionRequestTagSpecificationsList.isEmpty() || !createTrafficMirrorSessionRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createTrafficMirrorSessionRequestTagSpecificationsListValue : createTrafficMirrorSessionRequestTagSpecificationsList) {

                if (createTrafficMirrorSessionRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createTrafficMirrorSessionRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createTrafficMirrorSessionRequestTagSpecificationsListValue
                        .getTags();
                if (!tagSpecificationTagsList.isEmpty() || !tagSpecificationTagsList.isAutoConstruct()) {
                    int tagsListIndex = 1;

                    for (Tag tagSpecificationTagsListValue : tagSpecificationTagsList) {

                        if (tagSpecificationTagsListValue.getKey() != null) {
                            request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".Tag." + tagsListIndex + ".Key",
                                    StringUtils.fromString(tagSpecificationTagsListValue.getKey()));
                        }

                        if (tagSpecificationTagsListValue.getValue() != null) {
                            request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".Tag." + tagsListIndex + ".Value",
                                    StringUtils.fromString(tagSpecificationTagsListValue.getValue()));
                        }
                        tagsListIndex++;
                    }
                }
                tagSpecificationsListIndex++;
            }
        }

        request.addParameter("ClientToken", IdempotentUtils.resolveString(createTrafficMirrorSessionRequest.getClientToken()));

        return request;
    }

}
