/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * CreateInstanceConnectEndpointRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateInstanceConnectEndpointRequestMarshaller implements
        Marshaller<Request<CreateInstanceConnectEndpointRequest>, CreateInstanceConnectEndpointRequest> {

    public Request<CreateInstanceConnectEndpointRequest> marshall(CreateInstanceConnectEndpointRequest createInstanceConnectEndpointRequest) {

        if (createInstanceConnectEndpointRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateInstanceConnectEndpointRequest> request = new DefaultRequest<CreateInstanceConnectEndpointRequest>(createInstanceConnectEndpointRequest,
                "AmazonEC2");
        request.addParameter("Action", "CreateInstanceConnectEndpoint");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createInstanceConnectEndpointRequest.getSubnetId() != null) {
            request.addParameter("SubnetId", StringUtils.fromString(createInstanceConnectEndpointRequest.getSubnetId()));
        }

        com.amazonaws.internal.SdkInternalList<String> createInstanceConnectEndpointRequestSecurityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) createInstanceConnectEndpointRequest
                .getSecurityGroupIds();
        if (!createInstanceConnectEndpointRequestSecurityGroupIdsList.isEmpty() || !createInstanceConnectEndpointRequestSecurityGroupIdsList.isAutoConstruct()) {
            int securityGroupIdsListIndex = 1;

            for (String createInstanceConnectEndpointRequestSecurityGroupIdsListValue : createInstanceConnectEndpointRequestSecurityGroupIdsList) {
                if (createInstanceConnectEndpointRequestSecurityGroupIdsListValue != null) {
                    request.addParameter("SecurityGroupId." + securityGroupIdsListIndex,
                            StringUtils.fromString(createInstanceConnectEndpointRequestSecurityGroupIdsListValue));
                }
                securityGroupIdsListIndex++;
            }
        }

        if (createInstanceConnectEndpointRequest.getPreserveClientIp() != null) {
            request.addParameter("PreserveClientIp", StringUtils.fromBoolean(createInstanceConnectEndpointRequest.getPreserveClientIp()));
        }

        request.addParameter("ClientToken", IdempotentUtils.resolveString(createInstanceConnectEndpointRequest.getClientToken()));

        com.amazonaws.internal.SdkInternalList<TagSpecification> createInstanceConnectEndpointRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createInstanceConnectEndpointRequest
                .getTagSpecifications();
        if (!createInstanceConnectEndpointRequestTagSpecificationsList.isEmpty()
                || !createInstanceConnectEndpointRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createInstanceConnectEndpointRequestTagSpecificationsListValue : createInstanceConnectEndpointRequestTagSpecificationsList) {

                if (createInstanceConnectEndpointRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createInstanceConnectEndpointRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createInstanceConnectEndpointRequestTagSpecificationsListValue
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

        return request;
    }

}
