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
 * SimulatePrincipalPolicyRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SimulatePrincipalPolicyRequestMarshaller implements Marshaller<Request<SimulatePrincipalPolicyRequest>, SimulatePrincipalPolicyRequest> {

    public Request<SimulatePrincipalPolicyRequest> marshall(SimulatePrincipalPolicyRequest simulatePrincipalPolicyRequest) {

        if (simulatePrincipalPolicyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SimulatePrincipalPolicyRequest> request = new DefaultRequest<SimulatePrincipalPolicyRequest>(simulatePrincipalPolicyRequest,
                "AmazonIdentityManagement");
        request.addParameter("Action", "SimulatePrincipalPolicy");
        request.addParameter("Version", "2010-05-08");
        request.setHttpMethod(HttpMethodName.POST);

        if (simulatePrincipalPolicyRequest.getPolicySourceArn() != null) {
            request.addParameter("PolicySourceArn", StringUtils.fromString(simulatePrincipalPolicyRequest.getPolicySourceArn()));
        }

        if (!simulatePrincipalPolicyRequest.getPolicyInputList().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) simulatePrincipalPolicyRequest.getPolicyInputList()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> policyInputListList = (com.amazonaws.internal.SdkInternalList<String>) simulatePrincipalPolicyRequest
                    .getPolicyInputList();
            int policyInputListListIndex = 1;

            for (String policyInputListListValue : policyInputListList) {
                if (policyInputListListValue != null) {
                    request.addParameter("PolicyInputList.member." + policyInputListListIndex, StringUtils.fromString(policyInputListListValue));
                }
                policyInputListListIndex++;
            }
        }

        if (!simulatePrincipalPolicyRequest.getActionNames().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) simulatePrincipalPolicyRequest.getActionNames()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> actionNamesList = (com.amazonaws.internal.SdkInternalList<String>) simulatePrincipalPolicyRequest
                    .getActionNames();
            int actionNamesListIndex = 1;

            for (String actionNamesListValue : actionNamesList) {
                if (actionNamesListValue != null) {
                    request.addParameter("ActionNames.member." + actionNamesListIndex, StringUtils.fromString(actionNamesListValue));
                }
                actionNamesListIndex++;
            }
        }

        if (!simulatePrincipalPolicyRequest.getResourceArns().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) simulatePrincipalPolicyRequest.getResourceArns()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> resourceArnsList = (com.amazonaws.internal.SdkInternalList<String>) simulatePrincipalPolicyRequest
                    .getResourceArns();
            int resourceArnsListIndex = 1;

            for (String resourceArnsListValue : resourceArnsList) {
                if (resourceArnsListValue != null) {
                    request.addParameter("ResourceArns.member." + resourceArnsListIndex, StringUtils.fromString(resourceArnsListValue));
                }
                resourceArnsListIndex++;
            }
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

        if (!simulatePrincipalPolicyRequest.getContextEntries().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<ContextEntry>) simulatePrincipalPolicyRequest.getContextEntries()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<ContextEntry> contextEntriesList = (com.amazonaws.internal.SdkInternalList<ContextEntry>) simulatePrincipalPolicyRequest
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

        if (simulatePrincipalPolicyRequest.getResourceHandlingOption() != null) {
            request.addParameter("ResourceHandlingOption", StringUtils.fromString(simulatePrincipalPolicyRequest.getResourceHandlingOption()));
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
