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
package com.amazonaws.services.simpleemail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * GetIdentityPoliciesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIdentityPoliciesRequestMarshaller implements Marshaller<Request<GetIdentityPoliciesRequest>, GetIdentityPoliciesRequest> {

    public Request<GetIdentityPoliciesRequest> marshall(GetIdentityPoliciesRequest getIdentityPoliciesRequest) {

        if (getIdentityPoliciesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetIdentityPoliciesRequest> request = new DefaultRequest<GetIdentityPoliciesRequest>(getIdentityPoliciesRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "GetIdentityPolicies");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (getIdentityPoliciesRequest.getIdentity() != null) {
            request.addParameter("Identity", StringUtils.fromString(getIdentityPoliciesRequest.getIdentity()));
        }

        if (!getIdentityPoliciesRequest.getPolicyNames().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) getIdentityPoliciesRequest.getPolicyNames()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> policyNamesList = (com.amazonaws.internal.SdkInternalList<String>) getIdentityPoliciesRequest
                    .getPolicyNames();
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
