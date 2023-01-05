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
import com.amazonaws.util.IdempotentUtils;

/**
 * CreateIpamRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIpamRequestMarshaller implements Marshaller<Request<CreateIpamRequest>, CreateIpamRequest> {

    public Request<CreateIpamRequest> marshall(CreateIpamRequest createIpamRequest) {

        if (createIpamRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateIpamRequest> request = new DefaultRequest<CreateIpamRequest>(createIpamRequest, "AmazonEC2");
        request.addParameter("Action", "CreateIpam");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createIpamRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createIpamRequest.getDescription()));
        }

        com.amazonaws.internal.SdkInternalList<AddIpamOperatingRegion> createIpamRequestOperatingRegionsList = (com.amazonaws.internal.SdkInternalList<AddIpamOperatingRegion>) createIpamRequest
                .getOperatingRegions();
        if (!createIpamRequestOperatingRegionsList.isEmpty() || !createIpamRequestOperatingRegionsList.isAutoConstruct()) {
            int operatingRegionsListIndex = 1;

            for (AddIpamOperatingRegion createIpamRequestOperatingRegionsListValue : createIpamRequestOperatingRegionsList) {

                if (createIpamRequestOperatingRegionsListValue.getRegionName() != null) {
                    request.addParameter("OperatingRegion." + operatingRegionsListIndex + ".RegionName",
                            StringUtils.fromString(createIpamRequestOperatingRegionsListValue.getRegionName()));
                }
                operatingRegionsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> createIpamRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createIpamRequest
                .getTagSpecifications();
        if (!createIpamRequestTagSpecificationsList.isEmpty() || !createIpamRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createIpamRequestTagSpecificationsListValue : createIpamRequestTagSpecificationsList) {

                if (createIpamRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createIpamRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createIpamRequestTagSpecificationsListValue
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

        request.addParameter("ClientToken", IdempotentUtils.resolveString(createIpamRequest.getClientToken()));

        return request;
    }

}
