/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Replace Network Acl Entry Request Marshaller
 */
public class ReplaceNetworkAclEntryRequestMarshaller implements Marshaller<Request<ReplaceNetworkAclEntryRequest>, ReplaceNetworkAclEntryRequest> {

    public Request<ReplaceNetworkAclEntryRequest> marshall(ReplaceNetworkAclEntryRequest replaceNetworkAclEntryRequest) {
        Request<ReplaceNetworkAclEntryRequest> request = new DefaultRequest<ReplaceNetworkAclEntryRequest>(replaceNetworkAclEntryRequest, "AmazonEC2");
        request.addParameter("Action", "ReplaceNetworkAclEntry");
        request.addParameter("Version", "2011-01-01");
        if (replaceNetworkAclEntryRequest != null) {
            if (replaceNetworkAclEntryRequest.getNetworkAclId() != null) {
                request.addParameter("NetworkAclId", StringUtils.fromString(replaceNetworkAclEntryRequest.getNetworkAclId()));
            }
        }
        if (replaceNetworkAclEntryRequest != null) {
            if (replaceNetworkAclEntryRequest.getRuleNumber() != null) {
                request.addParameter("RuleNumber", StringUtils.fromInteger(replaceNetworkAclEntryRequest.getRuleNumber()));
            }
        }
        if (replaceNetworkAclEntryRequest != null) {
            if (replaceNetworkAclEntryRequest.getProtocol() != null) {
                request.addParameter("Protocol", StringUtils.fromString(replaceNetworkAclEntryRequest.getProtocol()));
            }
        }
        if (replaceNetworkAclEntryRequest != null) {
            if (replaceNetworkAclEntryRequest.getRuleAction() != null) {
                request.addParameter("RuleAction", StringUtils.fromString(replaceNetworkAclEntryRequest.getRuleAction()));
            }
        }
        if (replaceNetworkAclEntryRequest != null) {
            if (replaceNetworkAclEntryRequest.isEgress() != null) {
                request.addParameter("Egress", StringUtils.fromBoolean(replaceNetworkAclEntryRequest.isEgress()));
            }
        }
        if (replaceNetworkAclEntryRequest != null) {
            if (replaceNetworkAclEntryRequest.getCidrBlock() != null) {
                request.addParameter("CidrBlock", StringUtils.fromString(replaceNetworkAclEntryRequest.getCidrBlock()));
            }
        }
        if (replaceNetworkAclEntryRequest != null) {
            IcmpTypeCode icmpTypeCode = replaceNetworkAclEntryRequest.getIcmpTypeCode();
            if (icmpTypeCode != null) {
                if (icmpTypeCode.getType() != null) {
                    request.addParameter("Icmp.Type", StringUtils.fromInteger(icmpTypeCode.getType()));
                }
            }
            if (icmpTypeCode != null) {
                if (icmpTypeCode.getCode() != null) {
                    request.addParameter("Icmp.Code", StringUtils.fromInteger(icmpTypeCode.getCode()));
                }
            }
        }
        if (replaceNetworkAclEntryRequest != null) {
            PortRange portRange = replaceNetworkAclEntryRequest.getPortRange();
            if (portRange != null) {
                if (portRange.getFrom() != null) {
                    request.addParameter("PortRange.From", StringUtils.fromInteger(portRange.getFrom()));
                }
            }
            if (portRange != null) {
                if (portRange.getTo() != null) {
                    request.addParameter("PortRange.To", StringUtils.fromInteger(portRange.getTo()));
                }
            }
        }


        return request;
    }
}
