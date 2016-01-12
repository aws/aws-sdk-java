/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.kms.model.transform;

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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.kms.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ReEncryptRequest Marshaller
 */
public class ReEncryptRequestMarshaller implements
        Marshaller<Request<ReEncryptRequest>, ReEncryptRequest> {

    public Request<ReEncryptRequest> marshall(ReEncryptRequest reEncryptRequest) {

        if (reEncryptRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ReEncryptRequest> request = new DefaultRequest<ReEncryptRequest>(
                reEncryptRequest, "AWSKMS");
        request.addHeader("X-Amz-Target", "TrentService.ReEncrypt");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (reEncryptRequest.getCiphertextBlob() != null) {
                jsonWriter.key("CiphertextBlob").value(
                        reEncryptRequest.getCiphertextBlob());
            }

            com.amazonaws.internal.SdkInternalMap<String, String> sourceEncryptionContextMap = (com.amazonaws.internal.SdkInternalMap<String, String>) reEncryptRequest
                    .getSourceEncryptionContext();
            if (!sourceEncryptionContextMap.isEmpty()
                    || !sourceEncryptionContextMap.isAutoConstruct()) {
                jsonWriter.key("SourceEncryptionContext");
                jsonWriter.object();

                for (Map.Entry<String, String> sourceEncryptionContextMapValue : sourceEncryptionContextMap
                        .entrySet()) {
                    if (sourceEncryptionContextMapValue.getValue() != null) {
                        jsonWriter
                                .key(sourceEncryptionContextMapValue.getKey());

                        jsonWriter.value(sourceEncryptionContextMapValue
                                .getValue());
                    }
                }
                jsonWriter.endObject();
            }

            if (reEncryptRequest.getDestinationKeyId() != null) {
                jsonWriter.key("DestinationKeyId").value(
                        reEncryptRequest.getDestinationKeyId());
            }

            com.amazonaws.internal.SdkInternalMap<String, String> destinationEncryptionContextMap = (com.amazonaws.internal.SdkInternalMap<String, String>) reEncryptRequest
                    .getDestinationEncryptionContext();
            if (!destinationEncryptionContextMap.isEmpty()
                    || !destinationEncryptionContextMap.isAutoConstruct()) {
                jsonWriter.key("DestinationEncryptionContext");
                jsonWriter.object();

                for (Map.Entry<String, String> destinationEncryptionContextMapValue : destinationEncryptionContextMap
                        .entrySet()) {
                    if (destinationEncryptionContextMapValue.getValue() != null) {
                        jsonWriter.key(destinationEncryptionContextMapValue
                                .getKey());

                        jsonWriter.value(destinationEncryptionContextMapValue
                                .getValue());
                    }
                }
                jsonWriter.endObject();
            }

            com.amazonaws.internal.SdkInternalList<String> grantTokensList = (com.amazonaws.internal.SdkInternalList<String>) reEncryptRequest
                    .getGrantTokens();
            if (!grantTokensList.isEmpty()
                    || !grantTokensList.isAutoConstruct()) {
                jsonWriter.key("GrantTokens");
                jsonWriter.array();
                for (String grantTokensListValue : grantTokensList) {
                    if (grantTokensListValue != null) {
                        jsonWriter.value(grantTokensListValue);
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();

            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
