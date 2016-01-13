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
 * GenerateDataKeyWithoutPlaintextRequest Marshaller
 */
public class GenerateDataKeyWithoutPlaintextRequestMarshaller
        implements
        Marshaller<Request<GenerateDataKeyWithoutPlaintextRequest>, GenerateDataKeyWithoutPlaintextRequest> {

    public Request<GenerateDataKeyWithoutPlaintextRequest> marshall(
            GenerateDataKeyWithoutPlaintextRequest generateDataKeyWithoutPlaintextRequest) {

        if (generateDataKeyWithoutPlaintextRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<GenerateDataKeyWithoutPlaintextRequest> request = new DefaultRequest<GenerateDataKeyWithoutPlaintextRequest>(
                generateDataKeyWithoutPlaintextRequest, "AWSKMS");
        request.addHeader("X-Amz-Target",
                "TrentService.GenerateDataKeyWithoutPlaintext");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (generateDataKeyWithoutPlaintextRequest.getKeyId() != null) {
                jsonWriter.key("KeyId").value(
                        generateDataKeyWithoutPlaintextRequest.getKeyId());
            }

            com.amazonaws.internal.SdkInternalMap<String, String> encryptionContextMap = (com.amazonaws.internal.SdkInternalMap<String, String>) generateDataKeyWithoutPlaintextRequest
                    .getEncryptionContext();
            if (!encryptionContextMap.isEmpty()
                    || !encryptionContextMap.isAutoConstruct()) {
                jsonWriter.key("EncryptionContext");
                jsonWriter.object();

                for (Map.Entry<String, String> encryptionContextMapValue : encryptionContextMap
                        .entrySet()) {
                    if (encryptionContextMapValue.getValue() != null) {
                        jsonWriter.key(encryptionContextMapValue.getKey());

                        jsonWriter.value(encryptionContextMapValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            if (generateDataKeyWithoutPlaintextRequest.getKeySpec() != null) {
                jsonWriter.key("KeySpec").value(
                        generateDataKeyWithoutPlaintextRequest.getKeySpec());
            }

            if (generateDataKeyWithoutPlaintextRequest.getNumberOfBytes() != null) {
                jsonWriter.key("NumberOfBytes").value(
                        generateDataKeyWithoutPlaintextRequest
                                .getNumberOfBytes());
            }

            com.amazonaws.internal.SdkInternalList<String> grantTokensList = (com.amazonaws.internal.SdkInternalList<String>) generateDataKeyWithoutPlaintextRequest
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
