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

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.glacier.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.SdkHttpUtils;
import com.amazonaws.protocol.json.*;

/**
 * UploadMultipartPartRequest Marshaller
 */
public class UploadMultipartPartRequestMarshaller implements Marshaller<Request<UploadMultipartPartRequest>, UploadMultipartPartRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public UploadMultipartPartRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UploadMultipartPartRequest> marshall(UploadMultipartPartRequest uploadMultipartPartRequest) {

        if (uploadMultipartPartRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UploadMultipartPartRequest> request = new DefaultRequest<UploadMultipartPartRequest>(uploadMultipartPartRequest, "AmazonGlacier");

        request.setHttpMethod(HttpMethodName.PUT);

        if (uploadMultipartPartRequest.getChecksum() != null) {
            request.addHeader("x-amz-sha256-tree-hash", StringUtils.fromString(uploadMultipartPartRequest.getChecksum()));
        }

        if (uploadMultipartPartRequest.getRange() != null) {
            request.addHeader("Content-Range", StringUtils.fromString(uploadMultipartPartRequest.getRange()));
        }

        String uriResourcePath = "/{accountId}/vaults/{vaultName}/multipart-uploads/{uploadId}";

        uriResourcePath = uriResourcePath.replace(
                "{accountId}",
                (uploadMultipartPartRequest.getAccountId() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(uploadMultipartPartRequest.getAccountId()),
                        false) : "");
        uriResourcePath = uriResourcePath.replace(
                "{vaultName}",
                (uploadMultipartPartRequest.getVaultName() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(uploadMultipartPartRequest.getVaultName()),
                        false) : "");
        uriResourcePath = uriResourcePath.replace(
                "{uploadId}",
                (uploadMultipartPartRequest.getUploadId() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(uploadMultipartPartRequest.getUploadId()),
                        false) : "");
        request.setResourcePath(uriResourcePath);

        request.setContent(uploadMultipartPartRequest.getBody());
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
