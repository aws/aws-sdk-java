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
 * CreateOpenIDConnectProviderRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateOpenIDConnectProviderRequestMarshaller implements
        Marshaller<Request<CreateOpenIDConnectProviderRequest>, CreateOpenIDConnectProviderRequest> {

    public Request<CreateOpenIDConnectProviderRequest> marshall(CreateOpenIDConnectProviderRequest createOpenIDConnectProviderRequest) {

        if (createOpenIDConnectProviderRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateOpenIDConnectProviderRequest> request = new DefaultRequest<CreateOpenIDConnectProviderRequest>(createOpenIDConnectProviderRequest,
                "AmazonIdentityManagement");
        request.addParameter("Action", "CreateOpenIDConnectProvider");
        request.addParameter("Version", "2010-05-08");
        request.setHttpMethod(HttpMethodName.POST);

        if (createOpenIDConnectProviderRequest.getUrl() != null) {
            request.addParameter("Url", StringUtils.fromString(createOpenIDConnectProviderRequest.getUrl()));
        }

        if (!createOpenIDConnectProviderRequest.getClientIDList().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createOpenIDConnectProviderRequest.getClientIDList()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> clientIDListList = (com.amazonaws.internal.SdkInternalList<String>) createOpenIDConnectProviderRequest
                    .getClientIDList();
            int clientIDListListIndex = 1;

            for (String clientIDListListValue : clientIDListList) {
                if (clientIDListListValue != null) {
                    request.addParameter("ClientIDList.member." + clientIDListListIndex, StringUtils.fromString(clientIDListListValue));
                }
                clientIDListListIndex++;
            }
        }

        if (!createOpenIDConnectProviderRequest.getThumbprintList().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createOpenIDConnectProviderRequest.getThumbprintList()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> thumbprintListList = (com.amazonaws.internal.SdkInternalList<String>) createOpenIDConnectProviderRequest
                    .getThumbprintList();
            int thumbprintListListIndex = 1;

            for (String thumbprintListListValue : thumbprintListList) {
                if (thumbprintListListValue != null) {
                    request.addParameter("ThumbprintList.member." + thumbprintListListIndex, StringUtils.fromString(thumbprintListListValue));
                }
                thumbprintListListIndex++;
            }
        }

        return request;
    }

}
