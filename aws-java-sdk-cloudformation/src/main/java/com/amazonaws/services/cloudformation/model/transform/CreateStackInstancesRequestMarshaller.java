/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * CreateStackInstancesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStackInstancesRequestMarshaller implements Marshaller<Request<CreateStackInstancesRequest>, CreateStackInstancesRequest> {

    public Request<CreateStackInstancesRequest> marshall(CreateStackInstancesRequest createStackInstancesRequest) {

        if (createStackInstancesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateStackInstancesRequest> request = new DefaultRequest<CreateStackInstancesRequest>(createStackInstancesRequest, "AmazonCloudFormation");
        request.addParameter("Action", "CreateStackInstances");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createStackInstancesRequest.getStackSetName() != null) {
            request.addParameter("StackSetName", StringUtils.fromString(createStackInstancesRequest.getStackSetName()));
        }

        com.amazonaws.internal.SdkInternalList<String> accountsList = (com.amazonaws.internal.SdkInternalList<String>) createStackInstancesRequest
                .getAccounts();
        if (accountsList.isEmpty() && !accountsList.isAutoConstruct()) {
            request.addParameter("Accounts", "");
        }
        if (!accountsList.isEmpty() || !accountsList.isAutoConstruct()) {
            int accountsListIndex = 1;

            for (String accountsListValue : accountsList) {
                if (accountsListValue != null) {
                    request.addParameter("Accounts.member." + accountsListIndex, StringUtils.fromString(accountsListValue));
                }
                accountsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> regionsList = (com.amazonaws.internal.SdkInternalList<String>) createStackInstancesRequest.getRegions();
        if (regionsList.isEmpty() && !regionsList.isAutoConstruct()) {
            request.addParameter("Regions", "");
        }
        if (!regionsList.isEmpty() || !regionsList.isAutoConstruct()) {
            int regionsListIndex = 1;

            for (String regionsListValue : regionsList) {
                if (regionsListValue != null) {
                    request.addParameter("Regions.member." + regionsListIndex, StringUtils.fromString(regionsListValue));
                }
                regionsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Parameter> parameterOverridesList = (com.amazonaws.internal.SdkInternalList<Parameter>) createStackInstancesRequest
                .getParameterOverrides();
        if (parameterOverridesList.isEmpty() && !parameterOverridesList.isAutoConstruct()) {
            request.addParameter("ParameterOverrides", "");
        }
        if (!parameterOverridesList.isEmpty() || !parameterOverridesList.isAutoConstruct()) {
            int parameterOverridesListIndex = 1;

            for (Parameter parameterOverridesListValue : parameterOverridesList) {

                if (parameterOverridesListValue.getParameterKey() != null) {
                    request.addParameter("ParameterOverrides.member." + parameterOverridesListIndex + ".ParameterKey",
                            StringUtils.fromString(parameterOverridesListValue.getParameterKey()));
                }

                if (parameterOverridesListValue.getParameterValue() != null) {
                    request.addParameter("ParameterOverrides.member." + parameterOverridesListIndex + ".ParameterValue",
                            StringUtils.fromString(parameterOverridesListValue.getParameterValue()));
                }

                if (parameterOverridesListValue.getUsePreviousValue() != null) {
                    request.addParameter("ParameterOverrides.member." + parameterOverridesListIndex + ".UsePreviousValue",
                            StringUtils.fromBoolean(parameterOverridesListValue.getUsePreviousValue()));
                }

                if (parameterOverridesListValue.getResolvedValue() != null) {
                    request.addParameter("ParameterOverrides.member." + parameterOverridesListIndex + ".ResolvedValue",
                            StringUtils.fromString(parameterOverridesListValue.getResolvedValue()));
                }
                parameterOverridesListIndex++;
            }
        }

        StackSetOperationPreferences operationPreferences = createStackInstancesRequest.getOperationPreferences();
        if (operationPreferences != null) {

            com.amazonaws.internal.SdkInternalList<String> regionOrderList = (com.amazonaws.internal.SdkInternalList<String>) operationPreferences
                    .getRegionOrder();
            if (regionOrderList.isEmpty() && !regionOrderList.isAutoConstruct()) {
                request.addParameter("OperationPreferences.RegionOrder", "");
            }
            if (!regionOrderList.isEmpty() || !regionOrderList.isAutoConstruct()) {
                int regionOrderListIndex = 1;

                for (String regionOrderListValue : regionOrderList) {
                    if (regionOrderListValue != null) {
                        request.addParameter("OperationPreferences.RegionOrder.member." + regionOrderListIndex, StringUtils.fromString(regionOrderListValue));
                    }
                    regionOrderListIndex++;
                }
            }

            if (operationPreferences.getFailureToleranceCount() != null) {
                request.addParameter("OperationPreferences.FailureToleranceCount", StringUtils.fromInteger(operationPreferences.getFailureToleranceCount()));
            }

            if (operationPreferences.getFailureTolerancePercentage() != null) {
                request.addParameter("OperationPreferences.FailureTolerancePercentage",
                        StringUtils.fromInteger(operationPreferences.getFailureTolerancePercentage()));
            }

            if (operationPreferences.getMaxConcurrentCount() != null) {
                request.addParameter("OperationPreferences.MaxConcurrentCount", StringUtils.fromInteger(operationPreferences.getMaxConcurrentCount()));
            }

            if (operationPreferences.getMaxConcurrentPercentage() != null) {
                request.addParameter("OperationPreferences.MaxConcurrentPercentage", StringUtils.fromInteger(operationPreferences.getMaxConcurrentPercentage()));
            }
        }

        request.addParameter("OperationId", IdempotentUtils.resolveString(createStackInstancesRequest.getOperationId()));

        return request;
    }

}
