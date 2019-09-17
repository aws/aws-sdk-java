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
import com.amazonaws.util.IdempotentUtils;

/**
 * CreateTrafficMirrorFilterRuleRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTrafficMirrorFilterRuleRequestMarshaller implements
        Marshaller<Request<CreateTrafficMirrorFilterRuleRequest>, CreateTrafficMirrorFilterRuleRequest> {

    public Request<CreateTrafficMirrorFilterRuleRequest> marshall(CreateTrafficMirrorFilterRuleRequest createTrafficMirrorFilterRuleRequest) {

        if (createTrafficMirrorFilterRuleRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateTrafficMirrorFilterRuleRequest> request = new DefaultRequest<CreateTrafficMirrorFilterRuleRequest>(createTrafficMirrorFilterRuleRequest,
                "AmazonEC2");
        request.addParameter("Action", "CreateTrafficMirrorFilterRule");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createTrafficMirrorFilterRuleRequest.getTrafficMirrorFilterId() != null) {
            request.addParameter("TrafficMirrorFilterId", StringUtils.fromString(createTrafficMirrorFilterRuleRequest.getTrafficMirrorFilterId()));
        }

        if (createTrafficMirrorFilterRuleRequest.getTrafficDirection() != null) {
            request.addParameter("TrafficDirection", StringUtils.fromString(createTrafficMirrorFilterRuleRequest.getTrafficDirection()));
        }

        if (createTrafficMirrorFilterRuleRequest.getRuleNumber() != null) {
            request.addParameter("RuleNumber", StringUtils.fromInteger(createTrafficMirrorFilterRuleRequest.getRuleNumber()));
        }

        if (createTrafficMirrorFilterRuleRequest.getRuleAction() != null) {
            request.addParameter("RuleAction", StringUtils.fromString(createTrafficMirrorFilterRuleRequest.getRuleAction()));
        }

        TrafficMirrorPortRangeRequest destinationPortRange = createTrafficMirrorFilterRuleRequest.getDestinationPortRange();
        if (destinationPortRange != null) {

            if (destinationPortRange.getFromPort() != null) {
                request.addParameter("DestinationPortRange.FromPort", StringUtils.fromInteger(destinationPortRange.getFromPort()));
            }

            if (destinationPortRange.getToPort() != null) {
                request.addParameter("DestinationPortRange.ToPort", StringUtils.fromInteger(destinationPortRange.getToPort()));
            }
        }

        TrafficMirrorPortRangeRequest sourcePortRange = createTrafficMirrorFilterRuleRequest.getSourcePortRange();
        if (sourcePortRange != null) {

            if (sourcePortRange.getFromPort() != null) {
                request.addParameter("SourcePortRange.FromPort", StringUtils.fromInteger(sourcePortRange.getFromPort()));
            }

            if (sourcePortRange.getToPort() != null) {
                request.addParameter("SourcePortRange.ToPort", StringUtils.fromInteger(sourcePortRange.getToPort()));
            }
        }

        if (createTrafficMirrorFilterRuleRequest.getProtocol() != null) {
            request.addParameter("Protocol", StringUtils.fromInteger(createTrafficMirrorFilterRuleRequest.getProtocol()));
        }

        if (createTrafficMirrorFilterRuleRequest.getDestinationCidrBlock() != null) {
            request.addParameter("DestinationCidrBlock", StringUtils.fromString(createTrafficMirrorFilterRuleRequest.getDestinationCidrBlock()));
        }

        if (createTrafficMirrorFilterRuleRequest.getSourceCidrBlock() != null) {
            request.addParameter("SourceCidrBlock", StringUtils.fromString(createTrafficMirrorFilterRuleRequest.getSourceCidrBlock()));
        }

        if (createTrafficMirrorFilterRuleRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createTrafficMirrorFilterRuleRequest.getDescription()));
        }

        request.addParameter("ClientToken", IdempotentUtils.resolveString(createTrafficMirrorFilterRuleRequest.getClientToken()));

        return request;
    }

}
