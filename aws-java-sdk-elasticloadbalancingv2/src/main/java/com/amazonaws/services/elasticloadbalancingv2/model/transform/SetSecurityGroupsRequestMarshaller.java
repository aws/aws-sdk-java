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
 * SetSecurityGroupsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetSecurityGroupsRequestMarshaller implements Marshaller<Request<SetSecurityGroupsRequest>, SetSecurityGroupsRequest> {

    public Request<SetSecurityGroupsRequest> marshall(SetSecurityGroupsRequest setSecurityGroupsRequest) {

        if (setSecurityGroupsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SetSecurityGroupsRequest> request = new DefaultRequest<SetSecurityGroupsRequest>(setSecurityGroupsRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "SetSecurityGroups");
        request.addParameter("Version", "2015-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (setSecurityGroupsRequest.getLoadBalancerArn() != null) {
            request.addParameter("LoadBalancerArn", StringUtils.fromString(setSecurityGroupsRequest.getLoadBalancerArn()));
        }

        if (setSecurityGroupsRequest.getSecurityGroups() != null) {
            java.util.List<String> securityGroupsList = setSecurityGroupsRequest.getSecurityGroups();
            if (securityGroupsList.isEmpty()) {
                request.addParameter("SecurityGroups", "");
            } else {
                int securityGroupsListIndex = 1;

                for (String securityGroupsListValue : securityGroupsList) {
                    if (securityGroupsListValue != null) {
                        request.addParameter("SecurityGroups.member." + securityGroupsListIndex, StringUtils.fromString(securityGroupsListValue));
                    }
                    securityGroupsListIndex++;
                }
            }
        }

        return request;
    }

}
