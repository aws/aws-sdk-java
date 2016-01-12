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

package com.amazonaws.services.directory.model.transform;

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
import com.amazonaws.services.directory.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ConnectDirectoryRequest Marshaller
 */
public class ConnectDirectoryRequestMarshaller implements
        Marshaller<Request<ConnectDirectoryRequest>, ConnectDirectoryRequest> {

    public Request<ConnectDirectoryRequest> marshall(
            ConnectDirectoryRequest connectDirectoryRequest) {

        if (connectDirectoryRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ConnectDirectoryRequest> request = new DefaultRequest<ConnectDirectoryRequest>(
                connectDirectoryRequest, "AWSDirectoryService");
        request.addHeader("X-Amz-Target",
                "DirectoryService_20150416.ConnectDirectory");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (connectDirectoryRequest.getName() != null) {
                jsonWriter.key("Name").value(connectDirectoryRequest.getName());
            }

            if (connectDirectoryRequest.getShortName() != null) {
                jsonWriter.key("ShortName").value(
                        connectDirectoryRequest.getShortName());
            }

            if (connectDirectoryRequest.getPassword() != null) {
                jsonWriter.key("Password").value(
                        connectDirectoryRequest.getPassword());
            }

            if (connectDirectoryRequest.getDescription() != null) {
                jsonWriter.key("Description").value(
                        connectDirectoryRequest.getDescription());
            }

            if (connectDirectoryRequest.getSize() != null) {
                jsonWriter.key("Size").value(connectDirectoryRequest.getSize());
            }

            if (connectDirectoryRequest.getConnectSettings() != null) {
                jsonWriter.key("ConnectSettings");
                DirectoryConnectSettingsJsonMarshaller.getInstance().marshall(
                        connectDirectoryRequest.getConnectSettings(),
                        jsonWriter);
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
