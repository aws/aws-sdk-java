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
 * ReplaceNetworkAclEntryRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplaceNetworkAclEntryRequestMarshaller implements Marshaller<Request<ReplaceNetworkAclEntryRequest>, ReplaceNetworkAclEntryRequest> {

    public Request<ReplaceNetworkAclEntryRequest> marshall(ReplaceNetworkAclEntryRequest replaceNetworkAclEntryRequest) {

        if (replaceNetworkAclEntryRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ReplaceNetworkAclEntryRequest> request = new DefaultRequest<ReplaceNetworkAclEntryRequest>(replaceNetworkAclEntryRequest, "AmazonEC2");
        request.addParameter("Action", "ReplaceNetworkAclEntry");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (replaceNetworkAclEntryRequest.getCidrBlock() != null) {
            request.addParameter("CidrBlock", StringUtils.fromString(replaceNetworkAclEntryRequest.getCidrBlock()));
        }

        if (replaceNetworkAclEntryRequest.getEgress() != null) {
            request.addParameter("Egress", StringUtils.fromBoolean(replaceNetworkAclEntryRequest.getEgress()));
        }

        IcmpTypeCode icmpTypeCode = replaceNetworkAclEntryRequest.getIcmpTypeCode();
        if (icmpTypeCode != null) {

            if (icmpTypeCode.getCode() != null) {
                request.addParameter("Icmp.Code", StringUtils.fromInteger(icmpTypeCode.getCode()));
            }

            if (icmpTypeCode.getType() != null) {
                request.addParameter("Icmp.Type", StringUtils.fromInteger(icmpTypeCode.getType()));
            }
        }

        if (replaceNetworkAclEntryRequest.getIpv6CidrBlock() != null) {
            request.addParameter("Ipv6CidrBlock", StringUtils.fromString(replaceNetworkAclEntryRequest.getIpv6CidrBlock()));
        }

        if (replaceNetworkAclEntryRequest.getNetworkAclId() != null) {
            request.addParameter("NetworkAclId", StringUtils.fromString(replaceNetworkAclEntryRequest.getNetworkAclId()));
        }

        PortRange portRange = replaceNetworkAclEntryRequest.getPortRange();
        if (portRange != null) {

            if (portRange.getFrom() != null) {
                request.addParameter("PortRange.From", StringUtils.fromInteger(portRange.getFrom()));
            }

            if (portRange.getTo() != null) {
                request.addParameter("PortRange.To", StringUtils.fromInteger(portRange.getTo()));
            }
        }

        if (replaceNetworkAclEntryRequest.getProtocol() != null) {
            request.addParameter("Protocol", StringUtils.fromString(replaceNetworkAclEntryRequest.getProtocol()));
        }

        if (replaceNetworkAclEntryRequest.getRuleAction() != null) {
            request.addParameter("RuleAction", StringUtils.fromString(replaceNetworkAclEntryRequest.getRuleAction()));
        }

        if (replaceNetworkAclEntryRequest.getRuleNumber() != null) {
            request.addParameter("RuleNumber", StringUtils.fromInteger(replaceNetworkAclEntryRequest.getRuleNumber()));
        }

        return request;
    }

}
