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
 * GetIdentityVerificationAttributesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIdentityVerificationAttributesRequestMarshaller implements
        Marshaller<Request<GetIdentityVerificationAttributesRequest>, GetIdentityVerificationAttributesRequest> {

    public Request<GetIdentityVerificationAttributesRequest> marshall(GetIdentityVerificationAttributesRequest getIdentityVerificationAttributesRequest) {

        if (getIdentityVerificationAttributesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetIdentityVerificationAttributesRequest> request = new DefaultRequest<GetIdentityVerificationAttributesRequest>(
                getIdentityVerificationAttributesRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "GetIdentityVerificationAttributes");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (!getIdentityVerificationAttributesRequest.getIdentities().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) getIdentityVerificationAttributesRequest.getIdentities()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> identitiesList = (com.amazonaws.internal.SdkInternalList<String>) getIdentityVerificationAttributesRequest
                    .getIdentities();
            int identitiesListIndex = 1;

            for (String identitiesListValue : identitiesList) {
                if (identitiesListValue != null) {
                    request.addParameter("Identities.member." + identitiesListIndex, StringUtils.fromString(identitiesListValue));
                }
                identitiesListIndex++;
            }
        }

        return request;
    }

}
