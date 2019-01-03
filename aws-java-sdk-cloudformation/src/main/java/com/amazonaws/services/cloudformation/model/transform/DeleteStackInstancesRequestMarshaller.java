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
 * DeleteStackInstancesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteStackInstancesRequestMarshaller implements Marshaller<Request<DeleteStackInstancesRequest>, DeleteStackInstancesRequest> {

    public Request<DeleteStackInstancesRequest> marshall(DeleteStackInstancesRequest deleteStackInstancesRequest) {

        if (deleteStackInstancesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteStackInstancesRequest> request = new DefaultRequest<DeleteStackInstancesRequest>(deleteStackInstancesRequest, "AmazonCloudFormation");
        request.addParameter("Action", "DeleteStackInstances");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (deleteStackInstancesRequest.getStackSetName() != null) {
            request.addParameter("StackSetName", StringUtils.fromString(deleteStackInstancesRequest.getStackSetName()));
        }

        if (deleteStackInstancesRequest.getAccounts().isEmpty()
                && !((com.amazonaws.internal.SdkInternalList<String>) deleteStackInstancesRequest.getAccounts()).isAutoConstruct()) {
            request.addParameter("Accounts", "");
        }
        if (!deleteStackInstancesRequest.getAccounts().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) deleteStackInstancesRequest.getAccounts()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> accountsList = (com.amazonaws.internal.SdkInternalList<String>) deleteStackInstancesRequest
                    .getAccounts();
            int accountsListIndex = 1;

            for (String accountsListValue : accountsList) {
                if (accountsListValue != null) {
                    request.addParameter("Accounts.member." + accountsListIndex, StringUtils.fromString(accountsListValue));
                }
                accountsListIndex++;
            }
        }

        if (deleteStackInstancesRequest.getRegions().isEmpty()
                && !((com.amazonaws.internal.SdkInternalList<String>) deleteStackInstancesRequest.getRegions()).isAutoConstruct()) {
            request.addParameter("Regions", "");
        }
        if (!deleteStackInstancesRequest.getRegions().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) deleteStackInstancesRequest.getRegions()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> regionsList = (com.amazonaws.internal.SdkInternalList<String>) deleteStackInstancesRequest
                    .getRegions();
            int regionsListIndex = 1;

            for (String regionsListValue : regionsList) {
                if (regionsListValue != null) {
                    request.addParameter("Regions.member." + regionsListIndex, StringUtils.fromString(regionsListValue));
                }
                regionsListIndex++;
            }
        }

        {
            StackSetOperationPreferences operationPreferences = deleteStackInstancesRequest.getOperationPreferences();
            if (operationPreferences != null) {

                if (operationPreferences.getRegionOrder().isEmpty()
                        && !((com.amazonaws.internal.SdkInternalList<String>) operationPreferences.getRegionOrder()).isAutoConstruct()) {
                    request.addParameter("OperationPreferences.RegionOrder", "");
                }
                if (!operationPreferences.getRegionOrder().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<String>) operationPreferences.getRegionOrder()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<String> regionOrderList = (com.amazonaws.internal.SdkInternalList<String>) operationPreferences
                            .getRegionOrder();
                    int regionOrderListIndex = 1;

                    for (String regionOrderListValue : regionOrderList) {
                        if (regionOrderListValue != null) {
                            request.addParameter("OperationPreferences.RegionOrder.member." + regionOrderListIndex,
                                    StringUtils.fromString(regionOrderListValue));
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
                    request.addParameter("OperationPreferences.MaxConcurrentPercentage",
                            StringUtils.fromInteger(operationPreferences.getMaxConcurrentPercentage()));
                }
            }
        }

        if (deleteStackInstancesRequest.getRetainStacks() != null) {
            request.addParameter("RetainStacks", StringUtils.fromBoolean(deleteStackInstancesRequest.getRetainStacks()));
        }

        request.addParameter("OperationId", IdempotentUtils.resolveString(deleteStackInstancesRequest.getOperationId()));

        return request;
    }

}
