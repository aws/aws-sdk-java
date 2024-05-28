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
 * CreateIpamResourceDiscoveryRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIpamResourceDiscoveryRequestMarshaller implements
        Marshaller<Request<CreateIpamResourceDiscoveryRequest>, CreateIpamResourceDiscoveryRequest> {

    public Request<CreateIpamResourceDiscoveryRequest> marshall(CreateIpamResourceDiscoveryRequest createIpamResourceDiscoveryRequest) {

        if (createIpamResourceDiscoveryRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateIpamResourceDiscoveryRequest> request = new DefaultRequest<CreateIpamResourceDiscoveryRequest>(createIpamResourceDiscoveryRequest,
                "AmazonEC2");
        request.addParameter("Action", "CreateIpamResourceDiscovery");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createIpamResourceDiscoveryRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createIpamResourceDiscoveryRequest.getDescription()));
        }

        com.amazonaws.internal.SdkInternalList<AddIpamOperatingRegion> createIpamResourceDiscoveryRequestOperatingRegionsList = (com.amazonaws.internal.SdkInternalList<AddIpamOperatingRegion>) createIpamResourceDiscoveryRequest
                .getOperatingRegions();
        if (!createIpamResourceDiscoveryRequestOperatingRegionsList.isEmpty() || !createIpamResourceDiscoveryRequestOperatingRegionsList.isAutoConstruct()) {
            int operatingRegionsListIndex = 1;

            for (AddIpamOperatingRegion createIpamResourceDiscoveryRequestOperatingRegionsListValue : createIpamResourceDiscoveryRequestOperatingRegionsList) {

                if (createIpamResourceDiscoveryRequestOperatingRegionsListValue.getRegionName() != null) {
                    request.addParameter("OperatingRegion." + operatingRegionsListIndex + ".RegionName",
                            StringUtils.fromString(createIpamResourceDiscoveryRequestOperatingRegionsListValue.getRegionName()));
                }
                operatingRegionsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> createIpamResourceDiscoveryRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createIpamResourceDiscoveryRequest
                .getTagSpecifications();
        if (!createIpamResourceDiscoveryRequestTagSpecificationsList.isEmpty() || !createIpamResourceDiscoveryRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createIpamResourceDiscoveryRequestTagSpecificationsListValue : createIpamResourceDiscoveryRequestTagSpecificationsList) {

                if (createIpamResourceDiscoveryRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createIpamResourceDiscoveryRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createIpamResourceDiscoveryRequestTagSpecificationsListValue
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

        request.addParameter("ClientToken", IdempotentUtils.resolveString(createIpamResourceDiscoveryRequest.getClientToken()));

        return request;
    }

}
