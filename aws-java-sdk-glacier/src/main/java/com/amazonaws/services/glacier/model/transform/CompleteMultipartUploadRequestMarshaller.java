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

import com.amazonaws.util.StringUtils;

import com.amazonaws.protocol.json.*;

/**
 * CompleteMultipartUploadRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompleteMultipartUploadRequestMarshaller implements Marshaller<Request<CompleteMultipartUploadRequest>, CompleteMultipartUploadRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public CompleteMultipartUploadRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CompleteMultipartUploadRequest> marshall(CompleteMultipartUploadRequest completeMultipartUploadRequest) {

        if (completeMultipartUploadRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CompleteMultipartUploadRequest> request = new DefaultRequest<CompleteMultipartUploadRequest>(completeMultipartUploadRequest, "AmazonGlacier");

        request.setHttpMethod(HttpMethodName.POST);

        if (completeMultipartUploadRequest.getArchiveSize() != null) {
            request.addHeader("x-amz-archive-size", StringUtils.fromString(completeMultipartUploadRequest.getArchiveSize()));
        }

        if (completeMultipartUploadRequest.getChecksum() != null) {
            request.addHeader("x-amz-sha256-tree-hash", StringUtils.fromString(completeMultipartUploadRequest.getChecksum()));
        }

        String uriResourcePath = "/{accountId}/vaults/{vaultName}/multipart-uploads/{uploadId}";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "accountId",
                completeMultipartUploadRequest.getAccountId() == null ? "-" : completeMultipartUploadRequest.getAccountId());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "vaultName",
                completeMultipartUploadRequest.getVaultName());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY
                .marshall(uriResourcePath, "uploadId", completeMultipartUploadRequest.getUploadId());
        request.setResourcePath(uriResourcePath);

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
