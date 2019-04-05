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
 * DescribeRulesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRulesRequestMarshaller implements Marshaller<Request<DescribeRulesRequest>, DescribeRulesRequest> {

    public Request<DescribeRulesRequest> marshall(DescribeRulesRequest describeRulesRequest) {

        if (describeRulesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeRulesRequest> request = new DefaultRequest<DescribeRulesRequest>(describeRulesRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "DescribeRules");
        request.addParameter("Version", "2015-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeRulesRequest.getListenerArn() != null) {
            request.addParameter("ListenerArn", StringUtils.fromString(describeRulesRequest.getListenerArn()));
        }

        if (describeRulesRequest.getRuleArns() != null) {
            java.util.List<String> ruleArnsList = describeRulesRequest.getRuleArns();
            if (ruleArnsList.isEmpty()) {
                request.addParameter("RuleArns", "");
            } else {
                int ruleArnsListIndex = 1;

                for (String ruleArnsListValue : ruleArnsList) {
                    if (ruleArnsListValue != null) {
                        request.addParameter("RuleArns.member." + ruleArnsListIndex, StringUtils.fromString(ruleArnsListValue));
                    }
                    ruleArnsListIndex++;
                }
            }
        }

        if (describeRulesRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeRulesRequest.getMarker()));
        }

        if (describeRulesRequest.getPageSize() != null) {
            request.addParameter("PageSize", StringUtils.fromInteger(describeRulesRequest.getPageSize()));
        }

        return request;
    }

}
