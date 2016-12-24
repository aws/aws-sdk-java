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
package com.amazonaws.services.glacier.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.glacier.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * GetDataRetrievalPolicyRequest Marshaller
 */
public class GetDataRetrievalPolicyRequestMarshaller implements Marshaller<Request<GetDataRetrievalPolicyRequest>, GetDataRetrievalPolicyRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public GetDataRetrievalPolicyRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<GetDataRetrievalPolicyRequest> marshall(GetDataRetrievalPolicyRequest getDataRetrievalPolicyRequest) {

        if (getDataRetrievalPolicyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetDataRetrievalPolicyRequest> request = new DefaultRequest<GetDataRetrievalPolicyRequest>(getDataRetrievalPolicyRequest, "AmazonGlacier");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/{accountId}/policies/data-retrieval";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "accountId",
                getDataRetrievalPolicyRequest.getAccountId() == null ? "-" : getDataRetrievalPolicyRequest.getAccountId());
        request.setResourcePath(uriResourcePath);

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
