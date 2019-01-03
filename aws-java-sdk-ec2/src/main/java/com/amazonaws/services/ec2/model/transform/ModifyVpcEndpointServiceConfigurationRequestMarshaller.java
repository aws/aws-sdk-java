/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ModifyVpcEndpointServiceConfigurationRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVpcEndpointServiceConfigurationRequestMarshaller implements
        Marshaller<Request<ModifyVpcEndpointServiceConfigurationRequest>, ModifyVpcEndpointServiceConfigurationRequest> {

    public Request<ModifyVpcEndpointServiceConfigurationRequest> marshall(
            ModifyVpcEndpointServiceConfigurationRequest modifyVpcEndpointServiceConfigurationRequest) {

        if (modifyVpcEndpointServiceConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyVpcEndpointServiceConfigurationRequest> request = new DefaultRequest<ModifyVpcEndpointServiceConfigurationRequest>(
                modifyVpcEndpointServiceConfigurationRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyVpcEndpointServiceConfiguration");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyVpcEndpointServiceConfigurationRequest.getServiceId() != null) {
            request.addParameter("ServiceId", StringUtils.fromString(modifyVpcEndpointServiceConfigurationRequest.getServiceId()));
        }

        if (modifyVpcEndpointServiceConfigurationRequest.getAcceptanceRequired() != null) {
            request.addParameter("AcceptanceRequired", StringUtils.fromBoolean(modifyVpcEndpointServiceConfigurationRequest.getAcceptanceRequired()));
        }

        com.amazonaws.internal.SdkInternalList<String> modifyVpcEndpointServiceConfigurationRequestAddNetworkLoadBalancerArnsList = (com.amazonaws.internal.SdkInternalList<String>) modifyVpcEndpointServiceConfigurationRequest
                .getAddNetworkLoadBalancerArns();
        if (!modifyVpcEndpointServiceConfigurationRequestAddNetworkLoadBalancerArnsList.isEmpty()
                || !modifyVpcEndpointServiceConfigurationRequestAddNetworkLoadBalancerArnsList.isAutoConstruct()) {
            int addNetworkLoadBalancerArnsListIndex = 1;

            for (String modifyVpcEndpointServiceConfigurationRequestAddNetworkLoadBalancerArnsListValue : modifyVpcEndpointServiceConfigurationRequestAddNetworkLoadBalancerArnsList) {
                if (modifyVpcEndpointServiceConfigurationRequestAddNetworkLoadBalancerArnsListValue != null) {
                    request.addParameter("AddNetworkLoadBalancerArn." + addNetworkLoadBalancerArnsListIndex,
                            StringUtils.fromString(modifyVpcEndpointServiceConfigurationRequestAddNetworkLoadBalancerArnsListValue));
                }
                addNetworkLoadBalancerArnsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> modifyVpcEndpointServiceConfigurationRequestRemoveNetworkLoadBalancerArnsList = (com.amazonaws.internal.SdkInternalList<String>) modifyVpcEndpointServiceConfigurationRequest
                .getRemoveNetworkLoadBalancerArns();
        if (!modifyVpcEndpointServiceConfigurationRequestRemoveNetworkLoadBalancerArnsList.isEmpty()
                || !modifyVpcEndpointServiceConfigurationRequestRemoveNetworkLoadBalancerArnsList.isAutoConstruct()) {
            int removeNetworkLoadBalancerArnsListIndex = 1;

            for (String modifyVpcEndpointServiceConfigurationRequestRemoveNetworkLoadBalancerArnsListValue : modifyVpcEndpointServiceConfigurationRequestRemoveNetworkLoadBalancerArnsList) {
                if (modifyVpcEndpointServiceConfigurationRequestRemoveNetworkLoadBalancerArnsListValue != null) {
                    request.addParameter("RemoveNetworkLoadBalancerArn." + removeNetworkLoadBalancerArnsListIndex,
                            StringUtils.fromString(modifyVpcEndpointServiceConfigurationRequestRemoveNetworkLoadBalancerArnsListValue));
                }
                removeNetworkLoadBalancerArnsListIndex++;
            }
        }

        return request;
    }

}
