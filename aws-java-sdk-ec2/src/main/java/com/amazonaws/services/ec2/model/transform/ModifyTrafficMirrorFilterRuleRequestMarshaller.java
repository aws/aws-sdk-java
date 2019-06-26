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
 * ModifyTrafficMirrorFilterRuleRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyTrafficMirrorFilterRuleRequestMarshaller implements
        Marshaller<Request<ModifyTrafficMirrorFilterRuleRequest>, ModifyTrafficMirrorFilterRuleRequest> {

    public Request<ModifyTrafficMirrorFilterRuleRequest> marshall(ModifyTrafficMirrorFilterRuleRequest modifyTrafficMirrorFilterRuleRequest) {

        if (modifyTrafficMirrorFilterRuleRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyTrafficMirrorFilterRuleRequest> request = new DefaultRequest<ModifyTrafficMirrorFilterRuleRequest>(modifyTrafficMirrorFilterRuleRequest,
                "AmazonEC2");
        request.addParameter("Action", "ModifyTrafficMirrorFilterRule");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyTrafficMirrorFilterRuleRequest.getTrafficMirrorFilterRuleId() != null) {
            request.addParameter("TrafficMirrorFilterRuleId", StringUtils.fromString(modifyTrafficMirrorFilterRuleRequest.getTrafficMirrorFilterRuleId()));
        }

        if (modifyTrafficMirrorFilterRuleRequest.getTrafficDirection() != null) {
            request.addParameter("TrafficDirection", StringUtils.fromString(modifyTrafficMirrorFilterRuleRequest.getTrafficDirection()));
        }

        if (modifyTrafficMirrorFilterRuleRequest.getRuleNumber() != null) {
            request.addParameter("RuleNumber", StringUtils.fromInteger(modifyTrafficMirrorFilterRuleRequest.getRuleNumber()));
        }

        if (modifyTrafficMirrorFilterRuleRequest.getRuleAction() != null) {
            request.addParameter("RuleAction", StringUtils.fromString(modifyTrafficMirrorFilterRuleRequest.getRuleAction()));
        }

        TrafficMirrorPortRangeRequest destinationPortRange = modifyTrafficMirrorFilterRuleRequest.getDestinationPortRange();
        if (destinationPortRange != null) {

            if (destinationPortRange.getFromPort() != null) {
                request.addParameter("DestinationPortRange.FromPort", StringUtils.fromInteger(destinationPortRange.getFromPort()));
            }

            if (destinationPortRange.getToPort() != null) {
                request.addParameter("DestinationPortRange.ToPort", StringUtils.fromInteger(destinationPortRange.getToPort()));
            }
        }

        TrafficMirrorPortRangeRequest sourcePortRange = modifyTrafficMirrorFilterRuleRequest.getSourcePortRange();
        if (sourcePortRange != null) {

            if (sourcePortRange.getFromPort() != null) {
                request.addParameter("SourcePortRange.FromPort", StringUtils.fromInteger(sourcePortRange.getFromPort()));
            }

            if (sourcePortRange.getToPort() != null) {
                request.addParameter("SourcePortRange.ToPort", StringUtils.fromInteger(sourcePortRange.getToPort()));
            }
        }

        if (modifyTrafficMirrorFilterRuleRequest.getProtocol() != null) {
            request.addParameter("Protocol", StringUtils.fromInteger(modifyTrafficMirrorFilterRuleRequest.getProtocol()));
        }

        if (modifyTrafficMirrorFilterRuleRequest.getDestinationCidrBlock() != null) {
            request.addParameter("DestinationCidrBlock", StringUtils.fromString(modifyTrafficMirrorFilterRuleRequest.getDestinationCidrBlock()));
        }

        if (modifyTrafficMirrorFilterRuleRequest.getSourceCidrBlock() != null) {
            request.addParameter("SourceCidrBlock", StringUtils.fromString(modifyTrafficMirrorFilterRuleRequest.getSourceCidrBlock()));
        }

        if (modifyTrafficMirrorFilterRuleRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(modifyTrafficMirrorFilterRuleRequest.getDescription()));
        }

        com.amazonaws.internal.SdkInternalList<String> modifyTrafficMirrorFilterRuleRequestRemoveFieldsList = (com.amazonaws.internal.SdkInternalList<String>) modifyTrafficMirrorFilterRuleRequest
                .getRemoveFields();
        if (!modifyTrafficMirrorFilterRuleRequestRemoveFieldsList.isEmpty() || !modifyTrafficMirrorFilterRuleRequestRemoveFieldsList.isAutoConstruct()) {
            int removeFieldsListIndex = 1;

            for (String modifyTrafficMirrorFilterRuleRequestRemoveFieldsListValue : modifyTrafficMirrorFilterRuleRequestRemoveFieldsList) {
                if (modifyTrafficMirrorFilterRuleRequestRemoveFieldsListValue != null) {
                    request.addParameter("RemoveField." + removeFieldsListIndex,
                            StringUtils.fromString(modifyTrafficMirrorFilterRuleRequestRemoveFieldsListValue));
                }
                removeFieldsListIndex++;
            }
        }

        return request;
    }

}
