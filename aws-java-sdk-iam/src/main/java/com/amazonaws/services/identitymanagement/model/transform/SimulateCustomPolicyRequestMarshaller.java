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
package com.amazonaws.services.identitymanagement.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * SimulateCustomPolicyRequest Marshaller
 */

public class SimulateCustomPolicyRequestMarshaller implements Marshaller<Request<SimulateCustomPolicyRequest>, SimulateCustomPolicyRequest> {

    public Request<SimulateCustomPolicyRequest> marshall(SimulateCustomPolicyRequest simulateCustomPolicyRequest) {

        if (simulateCustomPolicyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SimulateCustomPolicyRequest> request = new DefaultRequest<SimulateCustomPolicyRequest>(simulateCustomPolicyRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "SimulateCustomPolicy");
        request.addParameter("Version", "2010-05-08");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> policyInputListList = (com.amazonaws.internal.SdkInternalList<String>) simulateCustomPolicyRequest
                .getPolicyInputList();
        if (!policyInputListList.isEmpty() || !policyInputListList.isAutoConstruct()) {
            int policyInputListListIndex = 1;

            for (String policyInputListListValue : policyInputListList) {
                if (policyInputListListValue != null) {
                    request.addParameter("PolicyInputList.member." + policyInputListListIndex, StringUtils.fromString(policyInputListListValue));
                }
                policyInputListListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> actionNamesList = (com.amazonaws.internal.SdkInternalList<String>) simulateCustomPolicyRequest
                .getActionNames();
        if (!actionNamesList.isEmpty() || !actionNamesList.isAutoConstruct()) {
            int actionNamesListIndex = 1;

            for (String actionNamesListValue : actionNamesList) {
                if (actionNamesListValue != null) {
                    request.addParameter("ActionNames.member." + actionNamesListIndex, StringUtils.fromString(actionNamesListValue));
                }
                actionNamesListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> resourceArnsList = (com.amazonaws.internal.SdkInternalList<String>) simulateCustomPolicyRequest
                .getResourceArns();
        if (!resourceArnsList.isEmpty() || !resourceArnsList.isAutoConstruct()) {
            int resourceArnsListIndex = 1;

            for (String resourceArnsListValue : resourceArnsList) {
                if (resourceArnsListValue != null) {
                    request.addParameter("ResourceArns.member." + resourceArnsListIndex, StringUtils.fromString(resourceArnsListValue));
                }
                resourceArnsListIndex++;
            }
        }

        if (simulateCustomPolicyRequest.getResourcePolicy() != null) {
            request.addParameter("ResourcePolicy", StringUtils.fromString(simulateCustomPolicyRequest.getResourcePolicy()));
        }

        if (simulateCustomPolicyRequest.getResourceOwner() != null) {
            request.addParameter("ResourceOwner", StringUtils.fromString(simulateCustomPolicyRequest.getResourceOwner()));
        }

        if (simulateCustomPolicyRequest.getCallerArn() != null) {
            request.addParameter("CallerArn", StringUtils.fromString(simulateCustomPolicyRequest.getCallerArn()));
        }

        com.amazonaws.internal.SdkInternalList<ContextEntry> contextEntriesList = (com.amazonaws.internal.SdkInternalList<ContextEntry>) simulateCustomPolicyRequest
                .getContextEntries();
        if (!contextEntriesList.isEmpty() || !contextEntriesList.isAutoConstruct()) {
            int contextEntriesListIndex = 1;

            for (ContextEntry contextEntriesListValue : contextEntriesList) {

                if (contextEntriesListValue.getContextKeyName() != null) {
                    request.addParameter("ContextEntries.member." + contextEntriesListIndex + ".ContextKeyName",
                            StringUtils.fromString(contextEntriesListValue.getContextKeyName()));
                }

                com.amazonaws.internal.SdkInternalList<String> contextKeyValuesList = (com.amazonaws.internal.SdkInternalList<String>) contextEntriesListValue
                        .getContextKeyValues();
                if (!contextKeyValuesList.isEmpty() || !contextKeyValuesList.isAutoConstruct()) {
                    int contextKeyValuesListIndex = 1;

                    for (String contextKeyValuesListValue : contextKeyValuesList) {
                        if (contextKeyValuesListValue != null) {
                            request.addParameter("ContextEntries.member." + contextEntriesListIndex + ".ContextKeyValues.member." + contextKeyValuesListIndex,
                                    StringUtils.fromString(contextKeyValuesListValue));
                        }
                        contextKeyValuesListIndex++;
                    }
                }

                if (contextEntriesListValue.getContextKeyType() != null) {
                    request.addParameter("ContextEntries.member." + contextEntriesListIndex + ".ContextKeyType",
                            StringUtils.fromString(contextEntriesListValue.getContextKeyType()));
                }
                contextEntriesListIndex++;
            }
        }

        if (simulateCustomPolicyRequest.getResourceHandlingOption() != null) {
            request.addParameter("ResourceHandlingOption", StringUtils.fromString(simulateCustomPolicyRequest.getResourceHandlingOption()));
        }

        if (simulateCustomPolicyRequest.getMaxItems() != null) {
            request.addParameter("MaxItems", StringUtils.fromInteger(simulateCustomPolicyRequest.getMaxItems()));
        }

        if (simulateCustomPolicyRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(simulateCustomPolicyRequest.getMarker()));
        }

        return request;
    }

}
