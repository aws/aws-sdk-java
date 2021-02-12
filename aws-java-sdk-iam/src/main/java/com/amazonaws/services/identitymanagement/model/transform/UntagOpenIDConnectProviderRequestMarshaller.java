/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * UntagOpenIDConnectProviderRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UntagOpenIDConnectProviderRequestMarshaller implements Marshaller<Request<UntagOpenIDConnectProviderRequest>, UntagOpenIDConnectProviderRequest> {

    public Request<UntagOpenIDConnectProviderRequest> marshall(UntagOpenIDConnectProviderRequest untagOpenIDConnectProviderRequest) {

        if (untagOpenIDConnectProviderRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UntagOpenIDConnectProviderRequest> request = new DefaultRequest<UntagOpenIDConnectProviderRequest>(untagOpenIDConnectProviderRequest,
                "AmazonIdentityManagement");
        request.addParameter("Action", "UntagOpenIDConnectProvider");
        request.addParameter("Version", "2010-05-08");
        request.setHttpMethod(HttpMethodName.POST);

        if (untagOpenIDConnectProviderRequest.getOpenIDConnectProviderArn() != null) {
            request.addParameter("OpenIDConnectProviderArn", StringUtils.fromString(untagOpenIDConnectProviderRequest.getOpenIDConnectProviderArn()));
        }

        if (!untagOpenIDConnectProviderRequest.getTagKeys().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) untagOpenIDConnectProviderRequest.getTagKeys()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> tagKeysList = (com.amazonaws.internal.SdkInternalList<String>) untagOpenIDConnectProviderRequest
                    .getTagKeys();
            int tagKeysListIndex = 1;

            for (String tagKeysListValue : tagKeysList) {
                if (tagKeysListValue != null) {
                    request.addParameter("TagKeys.member." + tagKeysListIndex, StringUtils.fromString(tagKeysListValue));
                }
                tagKeysListIndex++;
            }
        }

        return request;
    }

}
