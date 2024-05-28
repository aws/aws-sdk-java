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

        PathRequestFilter filterAtSource = createNetworkInsightsPathRequest.getFilterAtSource();
        if (filterAtSource != null) {

            if (filterAtSource.getSourceAddress() != null) {
                request.addParameter("FilterAtSource.SourceAddress", StringUtils.fromString(filterAtSource.getSourceAddress()));
            }

            RequestFilterPortRange sourcePortRange = filterAtSource.getSourcePortRange();
            if (sourcePortRange != null) {

                if (sourcePortRange.getFromPort() != null) {
                    request.addParameter("FilterAtSource.SourcePortRange.FromPort", StringUtils.fromInteger(sourcePortRange.getFromPort()));
                }

                if (sourcePortRange.getToPort() != null) {
                    request.addParameter("FilterAtSource.SourcePortRange.ToPort", StringUtils.fromInteger(sourcePortRange.getToPort()));
                }
            }

            if (filterAtSource.getDestinationAddress() != null) {
                request.addParameter("FilterAtSource.DestinationAddress", StringUtils.fromString(filterAtSource.getDestinationAddress()));
            }

            RequestFilterPortRange destinationPortRange = filterAtSource.getDestinationPortRange();
            if (destinationPortRange != null) {

                if (destinationPortRange.getFromPort() != null) {
                    request.addParameter("FilterAtSource.DestinationPortRange.FromPort", StringUtils.fromInteger(destinationPortRange.getFromPort()));
                }

                if (destinationPortRange.getToPort() != null) {
                    request.addParameter("FilterAtSource.DestinationPortRange.ToPort", StringUtils.fromInteger(destinationPortRange.getToPort()));
                }
            }
        }

        PathRequestFilter filterAtDestination = createNetworkInsightsPathRequest.getFilterAtDestination();
        if (filterAtDestination != null) {

            if (filterAtDestination.getSourceAddress() != null) {
                request.addParameter("FilterAtDestination.SourceAddress", StringUtils.fromString(filterAtDestination.getSourceAddress()));
            }

            RequestFilterPortRange sourcePortRange = filterAtDestination.getSourcePortRange();
            if (sourcePortRange != null) {

                if (sourcePortRange.getFromPort() != null) {
                    request.addParameter("FilterAtDestination.SourcePortRange.FromPort", StringUtils.fromInteger(sourcePortRange.getFromPort()));
                }

                if (sourcePortRange.getToPort() != null) {
                    request.addParameter("FilterAtDestination.SourcePortRange.ToPort", StringUtils.fromInteger(sourcePortRange.getToPort()));
                }
            }

            if (filterAtDestination.getDestinationAddress() != null) {
                request.addParameter("FilterAtDestination.DestinationAddress", StringUtils.fromString(filterAtDestination.getDestinationAddress()));
            }

            RequestFilterPortRange destinationPortRange = filterAtDestination.getDestinationPortRange();
            if (destinationPortRange != null) {

                if (destinationPortRange.getFromPort() != null) {
                    request.addParameter("FilterAtDestination.DestinationPortRange.FromPort", StringUtils.fromInteger(destinationPortRange.getFromPort()));
                }

                if (destinationPortRange.getToPort() != null) {
                    request.addParameter("FilterAtDestination.DestinationPortRange.ToPort", StringUtils.fromInteger(destinationPortRange.getToPort()));
                }
            }
        }

        return request;
    }

}
