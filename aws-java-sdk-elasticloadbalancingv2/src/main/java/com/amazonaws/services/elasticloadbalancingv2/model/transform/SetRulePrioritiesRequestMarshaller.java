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
package com.amazonaws.services.elasticloadbalancingv2.model.transform;

import java.util.List;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticloadbalancingv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * SetRulePrioritiesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetRulePrioritiesRequestMarshaller implements Marshaller<Request<SetRulePrioritiesRequest>, SetRulePrioritiesRequest> {

    public Request<SetRulePrioritiesRequest> marshall(SetRulePrioritiesRequest setRulePrioritiesRequest) {

        if (setRulePrioritiesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SetRulePrioritiesRequest> request = new DefaultRequest<SetRulePrioritiesRequest>(setRulePrioritiesRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "SetRulePriorities");
        request.addParameter("Version", "2015-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (setRulePrioritiesRequest.getRulePriorities() != null) {
            java.util.List<RulePriorityPair> rulePrioritiesList = setRulePrioritiesRequest.getRulePriorities();
            if (rulePrioritiesList.isEmpty()) {
                request.addParameter("RulePriorities", "");
            } else {
                int rulePrioritiesListIndex = 1;

                for (RulePriorityPair rulePrioritiesListValue : rulePrioritiesList) {

                    if (rulePrioritiesListValue.getRuleArn() != null) {
                        request.addParameter("RulePriorities.member." + rulePrioritiesListIndex + ".RuleArn",
                                StringUtils.fromString(rulePrioritiesListValue.getRuleArn()));
                    }

                    if (rulePrioritiesListValue.getPriority() != null) {
                        request.addParameter("RulePriorities.member." + rulePrioritiesListIndex + ".Priority",
                                StringUtils.fromInteger(rulePrioritiesListValue.getPriority()));
                    }
                    rulePrioritiesListIndex++;
                }
            }
        }

        return request;
    }

}
