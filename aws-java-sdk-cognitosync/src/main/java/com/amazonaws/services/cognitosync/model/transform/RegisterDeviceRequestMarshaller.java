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

package com.amazonaws.services.cognitosync.model.transform;

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
import com.amazonaws.services.cognitosync.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * RegisterDeviceRequest Marshaller
 */
public class RegisterDeviceRequestMarshaller implements
        Marshaller<Request<RegisterDeviceRequest>, RegisterDeviceRequest> {

    private static final String DEFAULT_CONTENT_TYPE = "application/x-amz-json-1.1";

    public Request<RegisterDeviceRequest> marshall(
            RegisterDeviceRequest registerDeviceRequest) {

        if (registerDeviceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<RegisterDeviceRequest> request = new DefaultRequest<RegisterDeviceRequest>(
                registerDeviceRequest, "AmazonCognitoSync");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/identitypools/{IdentityPoolId}/identity/{IdentityId}/device";

        uriResourcePath = uriResourcePath.replace(
                "{IdentityPoolId}",
                (registerDeviceRequest.getIdentityPoolId() == null) ? ""
                        : StringUtils.fromString(registerDeviceRequest
                                .getIdentityPoolId()));
        uriResourcePath = uriResourcePath.replace(
                "{IdentityId}",
                (registerDeviceRequest.getIdentityId() == null) ? ""
                        : StringUtils.fromString(registerDeviceRequest
                                .getIdentityId()));
        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (registerDeviceRequest.getPlatform() != null) {
                jsonWriter.key("Platform").value(
                        registerDeviceRequest.getPlatform());
            }

            if (registerDeviceRequest.getToken() != null) {
                jsonWriter.key("Token").value(registerDeviceRequest.getToken());
            }

            jsonWriter.endObject();

            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", DEFAULT_CONTENT_TYPE);
            }
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
