/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Create Vpn Connection Request Marshaller
 */
public class CreateVpnConnectionRequestMarshaller implements Marshaller<Request<CreateVpnConnectionRequest>, CreateVpnConnectionRequest> {

    public Request<CreateVpnConnectionRequest> marshall(CreateVpnConnectionRequest createVpnConnectionRequest) {
        Request<CreateVpnConnectionRequest> request = new DefaultRequest<CreateVpnConnectionRequest>(createVpnConnectionRequest, "AmazonEC2");
        request.addParameter("Action", "CreateVpnConnection");
        request.addParameter("Version", "2010-06-15");
        if (createVpnConnectionRequest != null) {
            if (createVpnConnectionRequest.getType() != null) {
                request.addParameter("Type", StringUtils.fromString(createVpnConnectionRequest.getType()));
            }
        }
        if (createVpnConnectionRequest != null) {
            if (createVpnConnectionRequest.getCustomerGatewayId() != null) {
                request.addParameter("CustomerGatewayId", StringUtils.fromString(createVpnConnectionRequest.getCustomerGatewayId()));
            }
        }
        if (createVpnConnectionRequest != null) {
            if (createVpnConnectionRequest.getVpnGatewayId() != null) {
                request.addParameter("VpnGatewayId", StringUtils.fromString(createVpnConnectionRequest.getVpnGatewayId()));
            }
        }


        return request;
    }
}
