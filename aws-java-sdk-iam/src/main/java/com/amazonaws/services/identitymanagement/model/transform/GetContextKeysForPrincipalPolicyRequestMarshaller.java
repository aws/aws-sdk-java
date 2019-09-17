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
 * GetContextKeysForPrincipalPolicyRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetContextKeysForPrincipalPolicyRequestMarshaller implements
        Marshaller<Request<GetContextKeysForPrincipalPolicyRequest>, GetContextKeysForPrincipalPolicyRequest> {

    public Request<GetContextKeysForPrincipalPolicyRequest> marshall(GetContextKeysForPrincipalPolicyRequest getContextKeysForPrincipalPolicyRequest) {

        if (getContextKeysForPrincipalPolicyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetContextKeysForPrincipalPolicyRequest> request = new DefaultRequest<GetContextKeysForPrincipalPolicyRequest>(
                getContextKeysForPrincipalPolicyRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "GetContextKeysForPrincipalPolicy");
        request.addParameter("Version", "2010-05-08");
        request.setHttpMethod(HttpMethodName.POST);

        if (getContextKeysForPrincipalPolicyRequest.getPolicySourceArn() != null) {
            request.addParameter("PolicySourceArn", StringUtils.fromString(getContextKeysForPrincipalPolicyRequest.getPolicySourceArn()));
        }

        if (!getContextKeysForPrincipalPolicyRequest.getPolicyInputList().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) getContextKeysForPrincipalPolicyRequest.getPolicyInputList()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> policyInputListList = (com.amazonaws.internal.SdkInternalList<String>) getContextKeysForPrincipalPolicyRequest
                    .getPolicyInputList();
            int policyInputListListIndex = 1;

            for (String policyInputListListValue : policyInputListList) {
                if (policyInputListListValue != null) {
                    request.addParameter("PolicyInputList.member." + policyInputListListIndex, StringUtils.fromString(policyInputListListValue));
                }
                policyInputListListIndex++;
            }
        }

        return request;
    }

}
