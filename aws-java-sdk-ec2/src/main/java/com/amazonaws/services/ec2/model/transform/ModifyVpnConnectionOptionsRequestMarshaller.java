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
 * ModifyVpnConnectionOptionsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVpnConnectionOptionsRequestMarshaller implements Marshaller<Request<ModifyVpnConnectionOptionsRequest>, ModifyVpnConnectionOptionsRequest> {

    public Request<ModifyVpnConnectionOptionsRequest> marshall(ModifyVpnConnectionOptionsRequest modifyVpnConnectionOptionsRequest) {

        if (modifyVpnConnectionOptionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyVpnConnectionOptionsRequest> request = new DefaultRequest<ModifyVpnConnectionOptionsRequest>(modifyVpnConnectionOptionsRequest,
                "AmazonEC2");
        request.addParameter("Action", "ModifyVpnConnectionOptions");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyVpnConnectionOptionsRequest.getVpnConnectionId() != null) {
            request.addParameter("VpnConnectionId", StringUtils.fromString(modifyVpnConnectionOptionsRequest.getVpnConnectionId()));
        }

        if (modifyVpnConnectionOptionsRequest.getLocalIpv4NetworkCidr() != null) {
            request.addParameter("LocalIpv4NetworkCidr", StringUtils.fromString(modifyVpnConnectionOptionsRequest.getLocalIpv4NetworkCidr()));
        }

        if (modifyVpnConnectionOptionsRequest.getRemoteIpv4NetworkCidr() != null) {
            request.addParameter("RemoteIpv4NetworkCidr", StringUtils.fromString(modifyVpnConnectionOptionsRequest.getRemoteIpv4NetworkCidr()));
        }

        if (modifyVpnConnectionOptionsRequest.getLocalIpv6NetworkCidr() != null) {
            request.addParameter("LocalIpv6NetworkCidr", StringUtils.fromString(modifyVpnConnectionOptionsRequest.getLocalIpv6NetworkCidr()));
        }

        if (modifyVpnConnectionOptionsRequest.getRemoteIpv6NetworkCidr() != null) {
            request.addParameter("RemoteIpv6NetworkCidr", StringUtils.fromString(modifyVpnConnectionOptionsRequest.getRemoteIpv6NetworkCidr()));
        }

        return request;
    }

}
