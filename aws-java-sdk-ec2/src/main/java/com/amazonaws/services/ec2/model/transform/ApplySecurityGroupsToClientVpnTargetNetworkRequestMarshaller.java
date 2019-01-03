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
 * ApplySecurityGroupsToClientVpnTargetNetworkRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplySecurityGroupsToClientVpnTargetNetworkRequestMarshaller implements
        Marshaller<Request<ApplySecurityGroupsToClientVpnTargetNetworkRequest>, ApplySecurityGroupsToClientVpnTargetNetworkRequest> {

    public Request<ApplySecurityGroupsToClientVpnTargetNetworkRequest> marshall(
            ApplySecurityGroupsToClientVpnTargetNetworkRequest applySecurityGroupsToClientVpnTargetNetworkRequest) {

        if (applySecurityGroupsToClientVpnTargetNetworkRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ApplySecurityGroupsToClientVpnTargetNetworkRequest> request = new DefaultRequest<ApplySecurityGroupsToClientVpnTargetNetworkRequest>(
                applySecurityGroupsToClientVpnTargetNetworkRequest, "AmazonEC2");
        request.addParameter("Action", "ApplySecurityGroupsToClientVpnTargetNetwork");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (applySecurityGroupsToClientVpnTargetNetworkRequest.getClientVpnEndpointId() != null) {
            request.addParameter("ClientVpnEndpointId", StringUtils.fromString(applySecurityGroupsToClientVpnTargetNetworkRequest.getClientVpnEndpointId()));
        }

        if (applySecurityGroupsToClientVpnTargetNetworkRequest.getVpcId() != null) {
            request.addParameter("VpcId", StringUtils.fromString(applySecurityGroupsToClientVpnTargetNetworkRequest.getVpcId()));
        }

        com.amazonaws.internal.SdkInternalList<String> applySecurityGroupsToClientVpnTargetNetworkRequestSecurityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) applySecurityGroupsToClientVpnTargetNetworkRequest
                .getSecurityGroupIds();
        if (!applySecurityGroupsToClientVpnTargetNetworkRequestSecurityGroupIdsList.isEmpty()
                || !applySecurityGroupsToClientVpnTargetNetworkRequestSecurityGroupIdsList.isAutoConstruct()) {
            int securityGroupIdsListIndex = 1;

            for (String applySecurityGroupsToClientVpnTargetNetworkRequestSecurityGroupIdsListValue : applySecurityGroupsToClientVpnTargetNetworkRequestSecurityGroupIdsList) {
                if (applySecurityGroupsToClientVpnTargetNetworkRequestSecurityGroupIdsListValue != null) {
                    request.addParameter("SecurityGroupId." + securityGroupIdsListIndex,
                            StringUtils.fromString(applySecurityGroupsToClientVpnTargetNetworkRequestSecurityGroupIdsListValue));
                }
                securityGroupIdsListIndex++;
            }
        }

        return request;
    }

}
