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

/**
 * CreateTransitGatewayConnectPeerRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTransitGatewayConnectPeerRequestMarshaller implements
        Marshaller<Request<CreateTransitGatewayConnectPeerRequest>, CreateTransitGatewayConnectPeerRequest> {

    public Request<CreateTransitGatewayConnectPeerRequest> marshall(CreateTransitGatewayConnectPeerRequest createTransitGatewayConnectPeerRequest) {

        if (createTransitGatewayConnectPeerRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateTransitGatewayConnectPeerRequest> request = new DefaultRequest<CreateTransitGatewayConnectPeerRequest>(
                createTransitGatewayConnectPeerRequest, "AmazonEC2");
        request.addParameter("Action", "CreateTransitGatewayConnectPeer");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createTransitGatewayConnectPeerRequest.getTransitGatewayAttachmentId() != null) {
            request.addParameter("TransitGatewayAttachmentId", StringUtils.fromString(createTransitGatewayConnectPeerRequest.getTransitGatewayAttachmentId()));
        }

        if (createTransitGatewayConnectPeerRequest.getTransitGatewayAddress() != null) {
            request.addParameter("TransitGatewayAddress", StringUtils.fromString(createTransitGatewayConnectPeerRequest.getTransitGatewayAddress()));
        }

        if (createTransitGatewayConnectPeerRequest.getPeerAddress() != null) {
            request.addParameter("PeerAddress", StringUtils.fromString(createTransitGatewayConnectPeerRequest.getPeerAddress()));
        }

        TransitGatewayConnectRequestBgpOptions bgpOptions = createTransitGatewayConnectPeerRequest.getBgpOptions();
        if (bgpOptions != null) {

            if (bgpOptions.getPeerAsn() != null) {
                request.addParameter("BgpOptions.PeerAsn", StringUtils.fromLong(bgpOptions.getPeerAsn()));
            }
        }

        com.amazonaws.internal.SdkInternalList<String> createTransitGatewayConnectPeerRequestInsideCidrBlocksList = (com.amazonaws.internal.SdkInternalList<String>) createTransitGatewayConnectPeerRequest
                .getInsideCidrBlocks();
        if (!createTransitGatewayConnectPeerRequestInsideCidrBlocksList.isEmpty()
                || !createTransitGatewayConnectPeerRequestInsideCidrBlocksList.isAutoConstruct()) {
            int insideCidrBlocksListIndex = 1;

            for (String createTransitGatewayConnectPeerRequestInsideCidrBlocksListValue : createTransitGatewayConnectPeerRequestInsideCidrBlocksList) {
                if (createTransitGatewayConnectPeerRequestInsideCidrBlocksListValue != null) {
                    request.addParameter("InsideCidrBlocks." + insideCidrBlocksListIndex,
                            StringUtils.fromString(createTransitGatewayConnectPeerRequestInsideCidrBlocksListValue));
                }
                insideCidrBlocksListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> createTransitGatewayConnectPeerRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createTransitGatewayConnectPeerRequest
                .getTagSpecifications();
        if (!createTransitGatewayConnectPeerRequestTagSpecificationsList.isEmpty()
                || !createTransitGatewayConnectPeerRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createTransitGatewayConnectPeerRequestTagSpecificationsListValue : createTransitGatewayConnectPeerRequestTagSpecificationsList) {

                if (createTransitGatewayConnectPeerRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createTransitGatewayConnectPeerRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createTransitGatewayConnectPeerRequestTagSpecificationsListValue
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
