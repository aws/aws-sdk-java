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
 * CreateIpamPoolRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIpamPoolRequestMarshaller implements Marshaller<Request<CreateIpamPoolRequest>, CreateIpamPoolRequest> {

    public Request<CreateIpamPoolRequest> marshall(CreateIpamPoolRequest createIpamPoolRequest) {

        if (createIpamPoolRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateIpamPoolRequest> request = new DefaultRequest<CreateIpamPoolRequest>(createIpamPoolRequest, "AmazonEC2");
        request.addParameter("Action", "CreateIpamPool");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createIpamPoolRequest.getIpamScopeId() != null) {
            request.addParameter("IpamScopeId", StringUtils.fromString(createIpamPoolRequest.getIpamScopeId()));
        }

        if (createIpamPoolRequest.getLocale() != null) {
            request.addParameter("Locale", StringUtils.fromString(createIpamPoolRequest.getLocale()));
        }

        if (createIpamPoolRequest.getSourceIpamPoolId() != null) {
            request.addParameter("SourceIpamPoolId", StringUtils.fromString(createIpamPoolRequest.getSourceIpamPoolId()));
        }

        if (createIpamPoolRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createIpamPoolRequest.getDescription()));
        }

        if (createIpamPoolRequest.getAddressFamily() != null) {
            request.addParameter("AddressFamily", StringUtils.fromString(createIpamPoolRequest.getAddressFamily()));
        }

        if (createIpamPoolRequest.getAutoImport() != null) {
            request.addParameter("AutoImport", StringUtils.fromBoolean(createIpamPoolRequest.getAutoImport()));
        }

        if (createIpamPoolRequest.getPubliclyAdvertisable() != null) {
            request.addParameter("PubliclyAdvertisable", StringUtils.fromBoolean(createIpamPoolRequest.getPubliclyAdvertisable()));
        }

        if (createIpamPoolRequest.getAllocationMinNetmaskLength() != null) {
            request.addParameter("AllocationMinNetmaskLength", StringUtils.fromInteger(createIpamPoolRequest.getAllocationMinNetmaskLength()));
        }

        if (createIpamPoolRequest.getAllocationMaxNetmaskLength() != null) {
            request.addParameter("AllocationMaxNetmaskLength", StringUtils.fromInteger(createIpamPoolRequest.getAllocationMaxNetmaskLength()));
        }

        if (createIpamPoolRequest.getAllocationDefaultNetmaskLength() != null) {
            request.addParameter("AllocationDefaultNetmaskLength", StringUtils.fromInteger(createIpamPoolRequest.getAllocationDefaultNetmaskLength()));
        }

        com.amazonaws.internal.SdkInternalList<RequestIpamResourceTag> createIpamPoolRequestAllocationResourceTagsList = (com.amazonaws.internal.SdkInternalList<RequestIpamResourceTag>) createIpamPoolRequest
                .getAllocationResourceTags();
        if (!createIpamPoolRequestAllocationResourceTagsList.isEmpty() || !createIpamPoolRequestAllocationResourceTagsList.isAutoConstruct()) {
            int allocationResourceTagsListIndex = 1;

            for (RequestIpamResourceTag createIpamPoolRequestAllocationResourceTagsListValue : createIpamPoolRequestAllocationResourceTagsList) {

                if (createIpamPoolRequestAllocationResourceTagsListValue.getKey() != null) {
                    request.addParameter("AllocationResourceTag." + allocationResourceTagsListIndex + ".Key",
                            StringUtils.fromString(createIpamPoolRequestAllocationResourceTagsListValue.getKey()));
                }

                if (createIpamPoolRequestAllocationResourceTagsListValue.getValue() != null) {
                    request.addParameter("AllocationResourceTag." + allocationResourceTagsListIndex + ".Value",
                            StringUtils.fromString(createIpamPoolRequestAllocationResourceTagsListValue.getValue()));
                }
                allocationResourceTagsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> createIpamPoolRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createIpamPoolRequest
                .getTagSpecifications();
        if (!createIpamPoolRequestTagSpecificationsList.isEmpty() || !createIpamPoolRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createIpamPoolRequestTagSpecificationsListValue : createIpamPoolRequestTagSpecificationsList) {

                if (createIpamPoolRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createIpamPoolRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createIpamPoolRequestTagSpecificationsListValue
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

        request.addParameter("ClientToken", IdempotentUtils.resolveString(createIpamPoolRequest.getClientToken()));

        if (createIpamPoolRequest.getAwsService() != null) {
            request.addParameter("AwsService", StringUtils.fromString(createIpamPoolRequest.getAwsService()));
        }

        return request;
    }

}
