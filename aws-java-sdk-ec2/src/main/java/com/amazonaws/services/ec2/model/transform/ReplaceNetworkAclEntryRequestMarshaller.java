/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * ReplaceNetworkAclEntryRequest Marshaller
 */

public class ReplaceNetworkAclEntryRequestMarshaller implements Marshaller<Request<ReplaceNetworkAclEntryRequest>, ReplaceNetworkAclEntryRequest> {

    public Request<ReplaceNetworkAclEntryRequest> marshall(ReplaceNetworkAclEntryRequest replaceNetworkAclEntryRequest) {

        if (replaceNetworkAclEntryRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<ReplaceNetworkAclEntryRequest> request = new DefaultRequest<ReplaceNetworkAclEntryRequest>(replaceNetworkAclEntryRequest, "AmazonEC2");
        request.addParameter("Action", "ReplaceNetworkAclEntry");
        request.addParameter("Version", "2016-09-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (replaceNetworkAclEntryRequest.getNetworkAclId() != null) {
            request.addParameter("NetworkAclId", StringUtils.fromString(replaceNetworkAclEntryRequest.getNetworkAclId()));
        }

        if (replaceNetworkAclEntryRequest.getRuleNumber() != null) {
            request.addParameter("RuleNumber", StringUtils.fromInteger(replaceNetworkAclEntryRequest.getRuleNumber()));
        }

        if (replaceNetworkAclEntryRequest.getProtocol() != null) {
            request.addParameter("Protocol", StringUtils.fromString(replaceNetworkAclEntryRequest.getProtocol()));
        }

        if (replaceNetworkAclEntryRequest.getRuleAction() != null) {
            request.addParameter("RuleAction", StringUtils.fromString(replaceNetworkAclEntryRequest.getRuleAction()));
        }

        if (replaceNetworkAclEntryRequest.getEgress() != null) {
            request.addParameter("Egress", StringUtils.fromBoolean(replaceNetworkAclEntryRequest.getEgress()));
        }

        if (replaceNetworkAclEntryRequest.getCidrBlock() != null) {
            request.addParameter("CidrBlock", StringUtils.fromString(replaceNetworkAclEntryRequest.getCidrBlock()));
        }

        IcmpTypeCode icmpTypeCode = replaceNetworkAclEntryRequest.getIcmpTypeCode();
        if (icmpTypeCode != null) {

            if (icmpTypeCode.getType() != null) {
                request.addParameter("Icmp.Type", StringUtils.fromInteger(icmpTypeCode.getType()));
            }

            if (icmpTypeCode.getCode() != null) {
                request.addParameter("Icmp.Code", StringUtils.fromInteger(icmpTypeCode.getCode()));
            }
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

        return request;
    }

}
