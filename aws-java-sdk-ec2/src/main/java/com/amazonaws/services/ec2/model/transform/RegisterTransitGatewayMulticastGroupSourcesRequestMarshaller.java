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
 * RegisterTransitGatewayMulticastGroupSourcesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterTransitGatewayMulticastGroupSourcesRequestMarshaller implements
        Marshaller<Request<RegisterTransitGatewayMulticastGroupSourcesRequest>, RegisterTransitGatewayMulticastGroupSourcesRequest> {

    public Request<RegisterTransitGatewayMulticastGroupSourcesRequest> marshall(
            RegisterTransitGatewayMulticastGroupSourcesRequest registerTransitGatewayMulticastGroupSourcesRequest) {

        if (registerTransitGatewayMulticastGroupSourcesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RegisterTransitGatewayMulticastGroupSourcesRequest> request = new DefaultRequest<RegisterTransitGatewayMulticastGroupSourcesRequest>(
                registerTransitGatewayMulticastGroupSourcesRequest, "AmazonEC2");
        request.addParameter("Action", "RegisterTransitGatewayMulticastGroupSources");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (registerTransitGatewayMulticastGroupSourcesRequest.getTransitGatewayMulticastDomainId() != null) {
            request.addParameter("TransitGatewayMulticastDomainId",
                    StringUtils.fromString(registerTransitGatewayMulticastGroupSourcesRequest.getTransitGatewayMulticastDomainId()));
        }

        if (registerTransitGatewayMulticastGroupSourcesRequest.getGroupIpAddress() != null) {
            request.addParameter("GroupIpAddress", StringUtils.fromString(registerTransitGatewayMulticastGroupSourcesRequest.getGroupIpAddress()));
        }

        com.amazonaws.internal.SdkInternalList<String> registerTransitGatewayMulticastGroupSourcesRequestNetworkInterfaceIdsList = (com.amazonaws.internal.SdkInternalList<String>) registerTransitGatewayMulticastGroupSourcesRequest
                .getNetworkInterfaceIds();
        if (!registerTransitGatewayMulticastGroupSourcesRequestNetworkInterfaceIdsList.isEmpty()
                || !registerTransitGatewayMulticastGroupSourcesRequestNetworkInterfaceIdsList.isAutoConstruct()) {
            int networkInterfaceIdsListIndex = 1;

            for (String registerTransitGatewayMulticastGroupSourcesRequestNetworkInterfaceIdsListValue : registerTransitGatewayMulticastGroupSourcesRequestNetworkInterfaceIdsList) {
                if (registerTransitGatewayMulticastGroupSourcesRequestNetworkInterfaceIdsListValue != null) {
                    request.addParameter("NetworkInterfaceIds." + networkInterfaceIdsListIndex,
                            StringUtils.fromString(registerTransitGatewayMulticastGroupSourcesRequestNetworkInterfaceIdsListValue));
                }
                networkInterfaceIdsListIndex++;
            }
        }

        return request;
    }

}
