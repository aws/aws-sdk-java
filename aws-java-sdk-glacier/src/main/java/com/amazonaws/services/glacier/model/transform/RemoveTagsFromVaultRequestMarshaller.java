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
 * RemoveTagsFromVaultRequest Marshaller
 */
public class RemoveTagsFromVaultRequestMarshaller implements Marshaller<Request<RemoveTagsFromVaultRequest>, RemoveTagsFromVaultRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public RemoveTagsFromVaultRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<RemoveTagsFromVaultRequest> marshall(RemoveTagsFromVaultRequest removeTagsFromVaultRequest) {

        if (removeTagsFromVaultRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RemoveTagsFromVaultRequest> request = new DefaultRequest<RemoveTagsFromVaultRequest>(removeTagsFromVaultRequest, "AmazonGlacier");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/{accountId}/vaults/{vaultName}/tags?operation=remove";

        uriResourcePath = com.amazonaws.util.UriResourcePathUtils.addStaticQueryParamtersToRequest(request, uriResourcePath);

        uriResourcePath = uriResourcePath.replace(
                "{accountId}",
                (removeTagsFromVaultRequest.getAccountId() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(removeTagsFromVaultRequest.getAccountId()),
                        false) : "");
        uriResourcePath = uriResourcePath.replace(
                "{vaultName}",
                (removeTagsFromVaultRequest.getVaultName() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(removeTagsFromVaultRequest.getVaultName()),
                        false) : "");
        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            java.util.List<String> tagKeysList = removeTagsFromVaultRequest.getTagKeys();
            if (tagKeysList != null) {
                jsonGenerator.writeFieldName("TagKeys");
                jsonGenerator.writeStartArray();
                for (String tagKeysListValue : tagKeysList) {
                    if (tagKeysListValue != null) {
                        jsonGenerator.writeValue(tagKeysListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", protocolFactory.getContentType());
            }
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
