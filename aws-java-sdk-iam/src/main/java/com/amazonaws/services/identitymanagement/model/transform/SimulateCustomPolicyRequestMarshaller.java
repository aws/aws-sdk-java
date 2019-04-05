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
package com.amazonaws.services.identitymanagement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * SimulateCustomPolicyRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SimulateCustomPolicyRequestMarshaller implements Marshaller<Request<SimulateCustomPolicyRequest>, SimulateCustomPolicyRequest> {

    public Request<SimulateCustomPolicyRequest> marshall(SimulateCustomPolicyRequest simulateCustomPolicyRequest) {

        if (simulateCustomPolicyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SimulateCustomPolicyRequest> request = new DefaultRequest<SimulateCustomPolicyRequest>(simulateCustomPolicyRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "SimulateCustomPolicy");
        request.addParameter("Version", "2010-05-08");
        request.setHttpMethod(HttpMethodName.POST);

        if (!simulateCustomPolicyRequest.getPolicyInputList().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) simulateCustomPolicyRequest.getPolicyInputList()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> policyInputListList = (com.amazonaws.internal.SdkInternalList<String>) simulateCustomPolicyRequest
                    .getPolicyInputList();
            int policyInputListListIndex = 1;

            for (String policyInputListListValue : policyInputListList) {
                if (policyInputListListValue != null) {
                    request.addParameter("PolicyInputList.member." + policyInputListListIndex, StringUtils.fromString(policyInputListListValue));
                }
                policyInputListListIndex++;
            }
        }

        if (!simulateCustomPolicyRequest.getActionNames().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) simulateCustomPolicyRequest.getActionNames()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> actionNamesList = (com.amazonaws.internal.SdkInternalList<String>) simulateCustomPolicyRequest
                    .getActionNames();
            int actionNamesListIndex = 1;

            for (String actionNamesListValue : actionNamesList) {
                if (actionNamesListValue != null) {
                    request.addParameter("ActionNames.member." + actionNamesListIndex, StringUtils.fromString(actionNamesListValue));
                }
                actionNamesListIndex++;
            }
        }

        if (!simulateCustomPolicyRequest.getResourceArns().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) simulateCustomPolicyRequest.getResourceArns()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> resourceArnsList = (com.amazonaws.internal.SdkInternalList<String>) simulateCustomPolicyRequest
                    .getResourceArns();
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

        if (!simulateCustomPolicyRequest.getContextEntries().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<ContextEntry>) simulateCustomPolicyRequest.getContextEntries()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<ContextEntry> contextEntriesList = (com.amazonaws.internal.SdkInternalList<ContextEntry>) simulateCustomPolicyRequest
                    .getContextEntries();
            int contextEntriesListIndex = 1;

            for (ContextEntry contextEntriesListValue : contextEntriesList) {

                if (contextEntriesListValue.getContextKeyName() != null) {
                    request.addParameter("ContextEntries.member." + contextEntriesListIndex + ".ContextKeyName",
                            StringUtils.fromString(contextEntriesListValue.getContextKeyName()));
                }

                if (!contextEntriesListValue.getContextKeyValues().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<String>) contextEntriesListValue.getContextKeyValues()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<String> contextKeyValuesList = (com.amazonaws.internal.SdkInternalList<String>) contextEntriesListValue
                            .getContextKeyValues();
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
