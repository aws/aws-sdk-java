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
 * CreateNetworkAclEntryRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNetworkAclEntryRequestMarshaller implements Marshaller<Request<CreateNetworkAclEntryRequest>, CreateNetworkAclEntryRequest> {

    public Request<CreateNetworkAclEntryRequest> marshall(CreateNetworkAclEntryRequest createNetworkAclEntryRequest) {

        if (createNetworkAclEntryRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateNetworkAclEntryRequest> request = new DefaultRequest<CreateNetworkAclEntryRequest>(createNetworkAclEntryRequest, "AmazonEC2");
        request.addParameter("Action", "CreateNetworkAclEntry");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createNetworkAclEntryRequest.getCidrBlock() != null) {
            request.addParameter("CidrBlock", StringUtils.fromString(createNetworkAclEntryRequest.getCidrBlock()));
        }

        if (createNetworkAclEntryRequest.getEgress() != null) {
            request.addParameter("Egress", StringUtils.fromBoolean(createNetworkAclEntryRequest.getEgress()));
        }

        IcmpTypeCode icmpTypeCode = createNetworkAclEntryRequest.getIcmpTypeCode();
        if (icmpTypeCode != null) {

            if (icmpTypeCode.getCode() != null) {
                request.addParameter("Icmp.Code", StringUtils.fromInteger(icmpTypeCode.getCode()));
            }

            if (icmpTypeCode.getType() != null) {
                request.addParameter("Icmp.Type", StringUtils.fromInteger(icmpTypeCode.getType()));
            }
        }

        if (createNetworkAclEntryRequest.getIpv6CidrBlock() != null) {
            request.addParameter("Ipv6CidrBlock", StringUtils.fromString(createNetworkAclEntryRequest.getIpv6CidrBlock()));
        }

        if (createNetworkAclEntryRequest.getNetworkAclId() != null) {
            request.addParameter("NetworkAclId", StringUtils.fromString(createNetworkAclEntryRequest.getNetworkAclId()));
        }

        PortRange portRange = createNetworkAclEntryRequest.getPortRange();
        if (portRange != null) {

            if (portRange.getFrom() != null) {
                request.addParameter("PortRange.From", StringUtils.fromInteger(portRange.getFrom()));
            }

            if (portRange.getTo() != null) {
                request.addParameter("PortRange.To", StringUtils.fromInteger(portRange.getTo()));
            }
        }

        if (createNetworkAclEntryRequest.getProtocol() != null) {
            request.addParameter("Protocol", StringUtils.fromString(createNetworkAclEntryRequest.getProtocol()));
        }

        if (createNetworkAclEntryRequest.getRuleAction() != null) {
            request.addParameter("RuleAction", StringUtils.fromString(createNetworkAclEntryRequest.getRuleAction()));
        }

        if (createNetworkAclEntryRequest.getRuleNumber() != null) {
            request.addParameter("RuleNumber", StringUtils.fromInteger(createNetworkAclEntryRequest.getRuleNumber()));
        }

        return request;
    }

}
