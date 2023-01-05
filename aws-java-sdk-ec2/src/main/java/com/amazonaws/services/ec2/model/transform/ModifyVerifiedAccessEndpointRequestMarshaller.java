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
 * ModifyVerifiedAccessEndpointRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVerifiedAccessEndpointRequestMarshaller implements
        Marshaller<Request<ModifyVerifiedAccessEndpointRequest>, ModifyVerifiedAccessEndpointRequest> {

    public Request<ModifyVerifiedAccessEndpointRequest> marshall(ModifyVerifiedAccessEndpointRequest modifyVerifiedAccessEndpointRequest) {

        if (modifyVerifiedAccessEndpointRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyVerifiedAccessEndpointRequest> request = new DefaultRequest<ModifyVerifiedAccessEndpointRequest>(modifyVerifiedAccessEndpointRequest,
                "AmazonEC2");
        request.addParameter("Action", "ModifyVerifiedAccessEndpoint");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyVerifiedAccessEndpointRequest.getVerifiedAccessEndpointId() != null) {
            request.addParameter("VerifiedAccessEndpointId", StringUtils.fromString(modifyVerifiedAccessEndpointRequest.getVerifiedAccessEndpointId()));
        }

        if (modifyVerifiedAccessEndpointRequest.getVerifiedAccessGroupId() != null) {
            request.addParameter("VerifiedAccessGroupId", StringUtils.fromString(modifyVerifiedAccessEndpointRequest.getVerifiedAccessGroupId()));
        }

        ModifyVerifiedAccessEndpointLoadBalancerOptions loadBalancerOptions = modifyVerifiedAccessEndpointRequest.getLoadBalancerOptions();
        if (loadBalancerOptions != null) {

            com.amazonaws.internal.SdkInternalList<String> modifyVerifiedAccessEndpointLoadBalancerOptionsSubnetIdsList = (com.amazonaws.internal.SdkInternalList<String>) loadBalancerOptions
                    .getSubnetIds();
            if (!modifyVerifiedAccessEndpointLoadBalancerOptionsSubnetIdsList.isEmpty()
                    || !modifyVerifiedAccessEndpointLoadBalancerOptionsSubnetIdsList.isAutoConstruct()) {
                int subnetIdsListIndex = 1;

                for (String modifyVerifiedAccessEndpointLoadBalancerOptionsSubnetIdsListValue : modifyVerifiedAccessEndpointLoadBalancerOptionsSubnetIdsList) {
                    if (modifyVerifiedAccessEndpointLoadBalancerOptionsSubnetIdsListValue != null) {
                        request.addParameter("LoadBalancerOptions.SubnetId." + subnetIdsListIndex,
                                StringUtils.fromString(modifyVerifiedAccessEndpointLoadBalancerOptionsSubnetIdsListValue));
                    }
                    subnetIdsListIndex++;
                }
            }

            if (loadBalancerOptions.getProtocol() != null) {
                request.addParameter("LoadBalancerOptions.Protocol", StringUtils.fromString(loadBalancerOptions.getProtocol()));
            }

            if (loadBalancerOptions.getPort() != null) {
                request.addParameter("LoadBalancerOptions.Port", StringUtils.fromInteger(loadBalancerOptions.getPort()));
            }
        }

        ModifyVerifiedAccessEndpointEniOptions networkInterfaceOptions = modifyVerifiedAccessEndpointRequest.getNetworkInterfaceOptions();
        if (networkInterfaceOptions != null) {

            if (networkInterfaceOptions.getProtocol() != null) {
                request.addParameter("NetworkInterfaceOptions.Protocol", StringUtils.fromString(networkInterfaceOptions.getProtocol()));
            }

            if (networkInterfaceOptions.getPort() != null) {
                request.addParameter("NetworkInterfaceOptions.Port", StringUtils.fromInteger(networkInterfaceOptions.getPort()));
            }
        }

        if (modifyVerifiedAccessEndpointRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(modifyVerifiedAccessEndpointRequest.getDescription()));
        }

        request.addParameter("ClientToken", IdempotentUtils.resolveString(modifyVerifiedAccessEndpointRequest.getClientToken()));

        return request;
    }

}
