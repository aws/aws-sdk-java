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
 * Create Network Acl Entry Request Marshaller
 */
public class CreateNetworkAclEntryRequestMarshaller implements Marshaller<Request<CreateNetworkAclEntryRequest>, CreateNetworkAclEntryRequest> {

    public Request<CreateNetworkAclEntryRequest> marshall(CreateNetworkAclEntryRequest createNetworkAclEntryRequest) {
        Request<CreateNetworkAclEntryRequest> request = new DefaultRequest<CreateNetworkAclEntryRequest>(createNetworkAclEntryRequest, "AmazonEC2");
        request.addParameter("Action", "CreateNetworkAclEntry");
        request.addParameter("Version", "2011-01-01");
        if (createNetworkAclEntryRequest != null) {
            if (createNetworkAclEntryRequest.getNetworkAclId() != null) {
                request.addParameter("NetworkAclId", StringUtils.fromString(createNetworkAclEntryRequest.getNetworkAclId()));
            }
        }
        if (createNetworkAclEntryRequest != null) {
            if (createNetworkAclEntryRequest.getRuleNumber() != null) {
                request.addParameter("RuleNumber", StringUtils.fromInteger(createNetworkAclEntryRequest.getRuleNumber()));
            }
        }
        if (createNetworkAclEntryRequest != null) {
            if (createNetworkAclEntryRequest.getProtocol() != null) {
                request.addParameter("Protocol", StringUtils.fromString(createNetworkAclEntryRequest.getProtocol()));
            }
        }
        if (createNetworkAclEntryRequest != null) {
            if (createNetworkAclEntryRequest.getRuleAction() != null) {
                request.addParameter("RuleAction", StringUtils.fromString(createNetworkAclEntryRequest.getRuleAction()));
            }
        }
        if (createNetworkAclEntryRequest != null) {
            if (createNetworkAclEntryRequest.isEgress() != null) {
                request.addParameter("Egress", StringUtils.fromBoolean(createNetworkAclEntryRequest.isEgress()));
            }
        }
        if (createNetworkAclEntryRequest != null) {
            if (createNetworkAclEntryRequest.getCidrBlock() != null) {
                request.addParameter("CidrBlock", StringUtils.fromString(createNetworkAclEntryRequest.getCidrBlock()));
            }
        }
        if (createNetworkAclEntryRequest != null) {
            IcmpTypeCode icmpTypeCode = createNetworkAclEntryRequest.getIcmpTypeCode();
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
        if (createNetworkAclEntryRequest != null) {
            PortRange portRange = createNetworkAclEntryRequest.getPortRange();
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
