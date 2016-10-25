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
 * UploadArchiveRequest Marshaller
 */
public class UploadArchiveRequestMarshaller implements Marshaller<Request<UploadArchiveRequest>, UploadArchiveRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public UploadArchiveRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UploadArchiveRequest> marshall(UploadArchiveRequest uploadArchiveRequest) {

        if (uploadArchiveRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UploadArchiveRequest> request = new DefaultRequest<UploadArchiveRequest>(uploadArchiveRequest, "AmazonGlacier");

        request.setHttpMethod(HttpMethodName.POST);

        if (uploadArchiveRequest.getArchiveDescription() != null) {
            request.addHeader("x-amz-archive-description", StringUtils.fromString(uploadArchiveRequest.getArchiveDescription()));
        }

        if (uploadArchiveRequest.getChecksum() != null) {
            request.addHeader("x-amz-sha256-tree-hash", StringUtils.fromString(uploadArchiveRequest.getChecksum()));
        }

        if (uploadArchiveRequest.getContentLength() != null) {
            request.addHeader("Content-Length", StringUtils.fromLong(uploadArchiveRequest.getContentLength()));
        }

        String uriResourcePath = "/{accountId}/vaults/{vaultName}/archives";

        uriResourcePath = uriResourcePath
                .replace(
                        "{vaultName}",
                        (uploadArchiveRequest.getVaultName() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(uploadArchiveRequest.getVaultName()),
                                false) : "");
        uriResourcePath = uriResourcePath
                .replace(
                        "{accountId}",
                        (uploadArchiveRequest.getAccountId() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(uploadArchiveRequest.getAccountId()),
                                false) : "");
        request.setResourcePath(uriResourcePath);

        request.setContent(uploadArchiveRequest.getBody());
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
