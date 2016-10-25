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
package com.amazonaws.services.autoscaling.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * DescribePoliciesRequest Marshaller
 */

public class DescribePoliciesRequestMarshaller implements Marshaller<Request<DescribePoliciesRequest>, DescribePoliciesRequest> {

    public Request<DescribePoliciesRequest> marshall(DescribePoliciesRequest describePoliciesRequest) {

        if (describePoliciesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribePoliciesRequest> request = new DefaultRequest<DescribePoliciesRequest>(describePoliciesRequest, "AmazonAutoScaling");
        request.addParameter("Action", "DescribePolicies");
        request.addParameter("Version", "2011-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describePoliciesRequest.getAutoScalingGroupName() != null) {
            request.addParameter("AutoScalingGroupName", StringUtils.fromString(describePoliciesRequest.getAutoScalingGroupName()));
        }

        com.amazonaws.internal.SdkInternalList<String> policyNamesList = (com.amazonaws.internal.SdkInternalList<String>) describePoliciesRequest
                .getPolicyNames();
        if (!policyNamesList.isEmpty() || !policyNamesList.isAutoConstruct()) {
            int policyNamesListIndex = 1;

            for (String policyNamesListValue : policyNamesList) {
                if (policyNamesListValue != null) {
                    request.addParameter("PolicyNames.member." + policyNamesListIndex, StringUtils.fromString(policyNamesListValue));
                }
                policyNamesListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> policyTypesList = (com.amazonaws.internal.SdkInternalList<String>) describePoliciesRequest
                .getPolicyTypes();
        if (!policyTypesList.isEmpty() || !policyTypesList.isAutoConstruct()) {
            int policyTypesListIndex = 1;

            for (String policyTypesListValue : policyTypesList) {
                if (policyTypesListValue != null) {
                    request.addParameter("PolicyTypes.member." + policyTypesListIndex, StringUtils.fromString(policyTypesListValue));
                }
                policyTypesListIndex++;
            }
        }

        if (describePoliciesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describePoliciesRequest.getNextToken()));
        }

        if (describePoliciesRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describePoliciesRequest.getMaxRecords()));
        }

        return request;
    }

}
