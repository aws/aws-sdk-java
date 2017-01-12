/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.glacier.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * AbortMultipartUploadRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbortMultipartUploadRequestMarshaller implements Marshaller<Request<AbortMultipartUploadRequest>, AbortMultipartUploadRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public AbortMultipartUploadRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<AbortMultipartUploadRequest> marshall(AbortMultipartUploadRequest abortMultipartUploadRequest) {

        if (abortMultipartUploadRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AbortMultipartUploadRequest> request = new DefaultRequest<AbortMultipartUploadRequest>(abortMultipartUploadRequest, "AmazonGlacier");

        request.setHttpMethod(HttpMethodName.DELETE);

        String uriResourcePath = "/{accountId}/vaults/{vaultName}/multipart-uploads/{uploadId}";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "accountId",
                abortMultipartUploadRequest.getAccountId() == null ? "-" : abortMultipartUploadRequest.getAccountId());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "vaultName", abortMultipartUploadRequest.getVaultName());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "uploadId", abortMultipartUploadRequest.getUploadId());
        request.setResourcePath(uriResourcePath);

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
