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
package com.amazonaws.services.elasticloadbalancing.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * SetLoadBalancerPoliciesForBackendServerRequest Marshaller
 */

public class SetLoadBalancerPoliciesForBackendServerRequestMarshaller implements
        Marshaller<Request<SetLoadBalancerPoliciesForBackendServerRequest>, SetLoadBalancerPoliciesForBackendServerRequest> {

    public Request<SetLoadBalancerPoliciesForBackendServerRequest> marshall(
            SetLoadBalancerPoliciesForBackendServerRequest setLoadBalancerPoliciesForBackendServerRequest) {

        if (setLoadBalancerPoliciesForBackendServerRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SetLoadBalancerPoliciesForBackendServerRequest> request = new DefaultRequest<SetLoadBalancerPoliciesForBackendServerRequest>(
                setLoadBalancerPoliciesForBackendServerRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "SetLoadBalancerPoliciesForBackendServer");
        request.addParameter("Version", "2012-06-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (setLoadBalancerPoliciesForBackendServerRequest.getLoadBalancerName() != null) {
            request.addParameter("LoadBalancerName", StringUtils.fromString(setLoadBalancerPoliciesForBackendServerRequest.getLoadBalancerName()));
        }

        if (setLoadBalancerPoliciesForBackendServerRequest.getInstancePort() != null) {
            request.addParameter("InstancePort", StringUtils.fromInteger(setLoadBalancerPoliciesForBackendServerRequest.getInstancePort()));
        }

        com.amazonaws.internal.SdkInternalList<String> policyNamesList = (com.amazonaws.internal.SdkInternalList<String>) setLoadBalancerPoliciesForBackendServerRequest
                .getPolicyNames();
        if (policyNamesList.isEmpty()) {
            request.addParameter("PolicyNames", "");
        }
        if (!policyNamesList.isEmpty() || !policyNamesList.isAutoConstruct()) {
            int policyNamesListIndex = 1;

            for (String policyNamesListValue : policyNamesList) {
                if (policyNamesListValue != null) {
                    request.addParameter("PolicyNames.member." + policyNamesListIndex, StringUtils.fromString(policyNamesListValue));
                }
                policyNamesListIndex++;
            }
        }

        return request;
    }

}
