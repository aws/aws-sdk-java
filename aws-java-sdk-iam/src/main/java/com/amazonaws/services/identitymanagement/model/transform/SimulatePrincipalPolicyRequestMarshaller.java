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
 * Simulate Principal Policy Request Marshaller
 */
public class SimulatePrincipalPolicyRequestMarshaller implements Marshaller<Request<SimulatePrincipalPolicyRequest>, SimulatePrincipalPolicyRequest> {

    public Request<SimulatePrincipalPolicyRequest> marshall(SimulatePrincipalPolicyRequest simulatePrincipalPolicyRequest) {

        if (simulatePrincipalPolicyRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<SimulatePrincipalPolicyRequest> request = new DefaultRequest<SimulatePrincipalPolicyRequest>(simulatePrincipalPolicyRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "SimulatePrincipalPolicy");
        request.addParameter("Version", "2010-05-08");

        if (simulatePrincipalPolicyRequest.getPolicySourceArn() != null) {
            request.addParameter("PolicySourceArn", StringUtils.fromString(simulatePrincipalPolicyRequest.getPolicySourceArn()));
        }

        java.util.List<String> policyInputListList = simulatePrincipalPolicyRequest.getPolicyInputList();
        int policyInputListListIndex = 1;

        for (String policyInputListListValue : policyInputListList) {
            if (policyInputListListValue != null) {
                request.addParameter("PolicyInputList.member." + policyInputListListIndex, StringUtils.fromString(policyInputListListValue));
            }

            policyInputListListIndex++;
        }

        java.util.List<String> actionNamesList = simulatePrincipalPolicyRequest.getActionNames();
        int actionNamesListIndex = 1;

        for (String actionNamesListValue : actionNamesList) {
            if (actionNamesListValue != null) {
                request.addParameter("ActionNames.member." + actionNamesListIndex, StringUtils.fromString(actionNamesListValue));
            }

            actionNamesListIndex++;
        }

        java.util.List<String> resourceArnsList = simulatePrincipalPolicyRequest.getResourceArns();
        int resourceArnsListIndex = 1;

        for (String resourceArnsListValue : resourceArnsList) {
            if (resourceArnsListValue != null) {
                request.addParameter("ResourceArns.member." + resourceArnsListIndex, StringUtils.fromString(resourceArnsListValue));
            }

            resourceArnsListIndex++;
        }
        if (simulatePrincipalPolicyRequest.getResourcePolicy() != null) {
            request.addParameter("ResourcePolicy", StringUtils.fromString(simulatePrincipalPolicyRequest.getResourcePolicy()));
        }
        if (simulatePrincipalPolicyRequest.getResourceOwner() != null) {
            request.addParameter("ResourceOwner", StringUtils.fromString(simulatePrincipalPolicyRequest.getResourceOwner()));
        }
        if (simulatePrincipalPolicyRequest.getCallerArn() != null) {
            request.addParameter("CallerArn", StringUtils.fromString(simulatePrincipalPolicyRequest.getCallerArn()));
        }

        java.util.List<ContextEntry> contextEntriesList = simulatePrincipalPolicyRequest.getContextEntries();
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
        if (simulatePrincipalPolicyRequest.getMaxItems() != null) {
            request.addParameter("MaxItems", StringUtils.fromInteger(simulatePrincipalPolicyRequest.getMaxItems()));
        }
        if (simulatePrincipalPolicyRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(simulatePrincipalPolicyRequest.getMarker()));
        }

        return request;
    }
}
