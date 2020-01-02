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

/**
 * DeregisterTransitGatewayMulticastGroupMembersRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeregisterTransitGatewayMulticastGroupMembersRequestMarshaller implements
        Marshaller<Request<DeregisterTransitGatewayMulticastGroupMembersRequest>, DeregisterTransitGatewayMulticastGroupMembersRequest> {

    public Request<DeregisterTransitGatewayMulticastGroupMembersRequest> marshall(
            DeregisterTransitGatewayMulticastGroupMembersRequest deregisterTransitGatewayMulticastGroupMembersRequest) {

        if (deregisterTransitGatewayMulticastGroupMembersRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeregisterTransitGatewayMulticastGroupMembersRequest> request = new DefaultRequest<DeregisterTransitGatewayMulticastGroupMembersRequest>(
                deregisterTransitGatewayMulticastGroupMembersRequest, "AmazonEC2");
        request.addParameter("Action", "DeregisterTransitGatewayMulticastGroupMembers");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (deregisterTransitGatewayMulticastGroupMembersRequest.getTransitGatewayMulticastDomainId() != null) {
            request.addParameter("TransitGatewayMulticastDomainId",
                    StringUtils.fromString(deregisterTransitGatewayMulticastGroupMembersRequest.getTransitGatewayMulticastDomainId()));
        }

        if (deregisterTransitGatewayMulticastGroupMembersRequest.getGroupIpAddress() != null) {
            request.addParameter("GroupIpAddress", StringUtils.fromString(deregisterTransitGatewayMulticastGroupMembersRequest.getGroupIpAddress()));
        }

        com.amazonaws.internal.SdkInternalList<String> deregisterTransitGatewayMulticastGroupMembersRequestNetworkInterfaceIdsList = (com.amazonaws.internal.SdkInternalList<String>) deregisterTransitGatewayMulticastGroupMembersRequest
                .getNetworkInterfaceIds();
        if (!deregisterTransitGatewayMulticastGroupMembersRequestNetworkInterfaceIdsList.isEmpty()
                || !deregisterTransitGatewayMulticastGroupMembersRequestNetworkInterfaceIdsList.isAutoConstruct()) {
            int networkInterfaceIdsListIndex = 1;

            for (String deregisterTransitGatewayMulticastGroupMembersRequestNetworkInterfaceIdsListValue : deregisterTransitGatewayMulticastGroupMembersRequestNetworkInterfaceIdsList) {
                if (deregisterTransitGatewayMulticastGroupMembersRequestNetworkInterfaceIdsListValue != null) {
                    request.addParameter("NetworkInterfaceIds." + networkInterfaceIdsListIndex,
                            StringUtils.fromString(deregisterTransitGatewayMulticastGroupMembersRequestNetworkInterfaceIdsListValue));
                }
                networkInterfaceIdsListIndex++;
            }
        }

        return request;
    }

}
