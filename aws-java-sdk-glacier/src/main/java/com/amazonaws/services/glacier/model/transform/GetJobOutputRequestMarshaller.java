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
import com.amazonaws.util.StringUtils;
import com.amazonaws.protocol.json.*;

/**
 * GetJobOutputRequest Marshaller
 */
public class GetJobOutputRequestMarshaller implements Marshaller<Request<GetJobOutputRequest>, GetJobOutputRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public GetJobOutputRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<GetJobOutputRequest> marshall(GetJobOutputRequest getJobOutputRequest) {

        if (getJobOutputRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetJobOutputRequest> request = new DefaultRequest<GetJobOutputRequest>(getJobOutputRequest, "AmazonGlacier");

        request.setHttpMethod(HttpMethodName.GET);

        if (getJobOutputRequest.getRange() != null) {
            request.addHeader("Range", StringUtils.fromString(getJobOutputRequest.getRange()));
        }

        String uriResourcePath = "/{accountId}/vaults/{vaultName}/jobs/{jobId}/output";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "accountId",
                getJobOutputRequest.getAccountId() == null ? "-" : getJobOutputRequest.getAccountId());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "vaultName", getJobOutputRequest.getVaultName());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "jobId", getJobOutputRequest.getJobId());
        request.setResourcePath(uriResourcePath);

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
