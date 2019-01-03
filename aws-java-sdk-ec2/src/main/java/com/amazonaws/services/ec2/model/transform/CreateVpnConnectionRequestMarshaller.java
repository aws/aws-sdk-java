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
 * CreateVpnConnectionRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVpnConnectionRequestMarshaller implements Marshaller<Request<CreateVpnConnectionRequest>, CreateVpnConnectionRequest> {

    public Request<CreateVpnConnectionRequest> marshall(CreateVpnConnectionRequest createVpnConnectionRequest) {

        if (createVpnConnectionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateVpnConnectionRequest> request = new DefaultRequest<CreateVpnConnectionRequest>(createVpnConnectionRequest, "AmazonEC2");
        request.addParameter("Action", "CreateVpnConnection");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createVpnConnectionRequest.getCustomerGatewayId() != null) {
            request.addParameter("CustomerGatewayId", StringUtils.fromString(createVpnConnectionRequest.getCustomerGatewayId()));
        }

        if (createVpnConnectionRequest.getType() != null) {
            request.addParameter("Type", StringUtils.fromString(createVpnConnectionRequest.getType()));
        }

        if (createVpnConnectionRequest.getVpnGatewayId() != null) {
            request.addParameter("VpnGatewayId", StringUtils.fromString(createVpnConnectionRequest.getVpnGatewayId()));
        }

        if (createVpnConnectionRequest.getTransitGatewayId() != null) {
            request.addParameter("TransitGatewayId", StringUtils.fromString(createVpnConnectionRequest.getTransitGatewayId()));
        }

        VpnConnectionOptionsSpecification options = createVpnConnectionRequest.getOptions();
        if (options != null) {

            if (options.getStaticRoutesOnly() != null) {
                request.addParameter("Options.StaticRoutesOnly", StringUtils.fromBoolean(options.getStaticRoutesOnly()));
            }

            com.amazonaws.internal.SdkInternalList<VpnTunnelOptionsSpecification> vpnConnectionOptionsSpecificationTunnelOptionsList = (com.amazonaws.internal.SdkInternalList<VpnTunnelOptionsSpecification>) options
                    .getTunnelOptions();
            if (!vpnConnectionOptionsSpecificationTunnelOptionsList.isEmpty() || !vpnConnectionOptionsSpecificationTunnelOptionsList.isAutoConstruct()) {
                int tunnelOptionsListIndex = 1;

                for (VpnTunnelOptionsSpecification vpnConnectionOptionsSpecificationTunnelOptionsListValue : vpnConnectionOptionsSpecificationTunnelOptionsList) {

                    if (vpnConnectionOptionsSpecificationTunnelOptionsListValue.getTunnelInsideCidr() != null) {
                        request.addParameter("Options.TunnelOptions." + tunnelOptionsListIndex + ".TunnelInsideCidr",
                                StringUtils.fromString(vpnConnectionOptionsSpecificationTunnelOptionsListValue.getTunnelInsideCidr()));
                    }

                    if (vpnConnectionOptionsSpecificationTunnelOptionsListValue.getPreSharedKey() != null) {
                        request.addParameter("Options.TunnelOptions." + tunnelOptionsListIndex + ".PreSharedKey",
                                StringUtils.fromString(vpnConnectionOptionsSpecificationTunnelOptionsListValue.getPreSharedKey()));
                    }
                    tunnelOptionsListIndex++;
                }
            }
        }

        return request;
    }

}
