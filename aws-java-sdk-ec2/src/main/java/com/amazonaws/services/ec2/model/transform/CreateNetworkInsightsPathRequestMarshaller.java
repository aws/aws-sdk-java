/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * CreateNetworkInsightsPathRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNetworkInsightsPathRequestMarshaller implements Marshaller<Request<CreateNetworkInsightsPathRequest>, CreateNetworkInsightsPathRequest> {

    public Request<CreateNetworkInsightsPathRequest> marshall(CreateNetworkInsightsPathRequest createNetworkInsightsPathRequest) {

        if (createNetworkInsightsPathRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateNetworkInsightsPathRequest> request = new DefaultRequest<CreateNetworkInsightsPathRequest>(createNetworkInsightsPathRequest, "AmazonEC2");
        request.addParameter("Action", "CreateNetworkInsightsPath");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createNetworkInsightsPathRequest.getSourceIp() != null) {
            request.addParameter("SourceIp", StringUtils.fromString(createNetworkInsightsPathRequest.getSourceIp()));
        }

        if (createNetworkInsightsPathRequest.getDestinationIp() != null) {
            request.addParameter("DestinationIp", StringUtils.fromString(createNetworkInsightsPathRequest.getDestinationIp()));
        }

        if (createNetworkInsightsPathRequest.getSource() != null) {
            request.addParameter("Source", StringUtils.fromString(createNetworkInsightsPathRequest.getSource()));
        }

        if (createNetworkInsightsPathRequest.getDestination() != null) {
            request.addParameter("Destination", StringUtils.fromString(createNetworkInsightsPathRequest.getDestination()));
        }

        if (createNetworkInsightsPathRequest.getProtocol() != null) {
            request.addParameter("Protocol", StringUtils.fromString(createNetworkInsightsPathRequest.getProtocol()));
        }

        if (createNetworkInsightsPathRequest.getDestinationPort() != null) {
            request.addParameter("DestinationPort", StringUtils.fromInteger(createNetworkInsightsPathRequest.getDestinationPort()));
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> createNetworkInsightsPathRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createNetworkInsightsPathRequest
                .getTagSpecifications();
        if (!createNetworkInsightsPathRequestTagSpecificationsList.isEmpty() || !createNetworkInsightsPathRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createNetworkInsightsPathRequestTagSpecificationsListValue : createNetworkInsightsPathRequestTagSpecificationsList) {

                if (createNetworkInsightsPathRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createNetworkInsightsPathRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createNetworkInsightsPathRequestTagSpecificationsListValue
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

        request.addParameter("ClientToken", IdempotentUtils.resolveString(createNetworkInsightsPathRequest.getClientToken()));

        return request;
    }

}
