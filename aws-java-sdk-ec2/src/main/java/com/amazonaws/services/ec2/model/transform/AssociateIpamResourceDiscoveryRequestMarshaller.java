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
 * AssociateIpamResourceDiscoveryRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateIpamResourceDiscoveryRequestMarshaller implements
        Marshaller<Request<AssociateIpamResourceDiscoveryRequest>, AssociateIpamResourceDiscoveryRequest> {

    public Request<AssociateIpamResourceDiscoveryRequest> marshall(AssociateIpamResourceDiscoveryRequest associateIpamResourceDiscoveryRequest) {

        if (associateIpamResourceDiscoveryRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AssociateIpamResourceDiscoveryRequest> request = new DefaultRequest<AssociateIpamResourceDiscoveryRequest>(
                associateIpamResourceDiscoveryRequest, "AmazonEC2");
        request.addParameter("Action", "AssociateIpamResourceDiscovery");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (associateIpamResourceDiscoveryRequest.getIpamId() != null) {
            request.addParameter("IpamId", StringUtils.fromString(associateIpamResourceDiscoveryRequest.getIpamId()));
        }

        if (associateIpamResourceDiscoveryRequest.getIpamResourceDiscoveryId() != null) {
            request.addParameter("IpamResourceDiscoveryId", StringUtils.fromString(associateIpamResourceDiscoveryRequest.getIpamResourceDiscoveryId()));
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> associateIpamResourceDiscoveryRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) associateIpamResourceDiscoveryRequest
                .getTagSpecifications();
        if (!associateIpamResourceDiscoveryRequestTagSpecificationsList.isEmpty()
                || !associateIpamResourceDiscoveryRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification associateIpamResourceDiscoveryRequestTagSpecificationsListValue : associateIpamResourceDiscoveryRequestTagSpecificationsList) {

                if (associateIpamResourceDiscoveryRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(associateIpamResourceDiscoveryRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) associateIpamResourceDiscoveryRequestTagSpecificationsListValue
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

        request.addParameter("ClientToken", IdempotentUtils.resolveString(associateIpamResourceDiscoveryRequest.getClientToken()));

        return request;
    }

}
