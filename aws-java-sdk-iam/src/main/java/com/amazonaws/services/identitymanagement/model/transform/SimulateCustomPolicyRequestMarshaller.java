/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Simulate Custom Policy Request Marshaller
 */
public class SimulateCustomPolicyRequestMarshaller implements Marshaller<Request<SimulateCustomPolicyRequest>, SimulateCustomPolicyRequest> {

    public Request<SimulateCustomPolicyRequest> marshall(SimulateCustomPolicyRequest simulateCustomPolicyRequest) {

        if (simulateCustomPolicyRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<SimulateCustomPolicyRequest> request = new DefaultRequest<SimulateCustomPolicyRequest>(simulateCustomPolicyRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "SimulateCustomPolicy");
        request.addParameter("Version", "2010-05-08");

        java.util.List<String> policyInputListList = simulateCustomPolicyRequest.getPolicyInputList();
        int policyInputListListIndex = 1;

        for (String policyInputListListValue : policyInputListList) {
            if (policyInputListListValue != null) {
                request.addParameter("PolicyInputList.member." + policyInputListListIndex, StringUtils.fromString(policyInputListListValue));
            }

            policyInputListListIndex++;
        }

        java.util.List<String> actionNamesList = simulateCustomPolicyRequest.getActionNames();
        int actionNamesListIndex = 1;

        for (String actionNamesListValue : actionNamesList) {
            if (actionNamesListValue != null) {
                request.addParameter("ActionNames.member." + actionNamesListIndex, StringUtils.fromString(actionNamesListValue));
            }

            actionNamesListIndex++;
        }

        java.util.List<String> resourceArnsList = simulateCustomPolicyRequest.getResourceArns();
        int resourceArnsListIndex = 1;

        for (String resourceArnsListValue : resourceArnsList) {
            if (resourceArnsListValue != null) {
                request.addParameter("ResourceArns.member." + resourceArnsListIndex, StringUtils.fromString(resourceArnsListValue));
            }

            resourceArnsListIndex++;
        }

        java.util.List<ContextEntry> contextEntriesList = simulateCustomPolicyRequest.getContextEntries();
        int contextEntriesListIndex = 1;

        for (ContextEntry contextEntriesListValue : contextEntriesList) {
            ContextEntry contextEntryMember = contextEntriesListValue;
            if (contextEntryMember != null) {
                if (contextEntryMember.getContextKeyName() != null) {
                    request.addParameter("ContextEntries.member." + contextEntriesListIndex + ".ContextKeyName", StringUtils.fromString(contextEntryMember.getContextKeyName()));
                }

                java.util.List<String> contextKeyValuesList = contextEntryMember.getContextKeyValues();
                int contextKeyValuesListIndex = 1;

                for (String contextKeyValuesListValue : contextKeyValuesList) {
                    if (contextKeyValuesListValue != null) {
                        request.addParameter("ContextEntries.member." + contextEntriesListIndex + ".ContextKeyValues.member." + contextKeyValuesListIndex, StringUtils.fromString(contextKeyValuesListValue));
                    }

                    contextKeyValuesListIndex++;
                }
                if (contextEntryMember.getContextKeyType() != null) {
                    request.addParameter("ContextEntries.member." + contextEntriesListIndex + ".ContextKeyType", StringUtils.fromString(contextEntryMember.getContextKeyType()));
                }
            }

            contextEntriesListIndex++;
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
