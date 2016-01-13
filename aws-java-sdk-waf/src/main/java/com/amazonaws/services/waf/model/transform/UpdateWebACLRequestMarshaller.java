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

package com.amazonaws.services.waf.model.transform;

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
import com.amazonaws.services.waf.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * UpdateWebACLRequest Marshaller
 */
public class UpdateWebACLRequestMarshaller implements
        Marshaller<Request<UpdateWebACLRequest>, UpdateWebACLRequest> {

    public Request<UpdateWebACLRequest> marshall(
            UpdateWebACLRequest updateWebACLRequest) {

        if (updateWebACLRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<UpdateWebACLRequest> request = new DefaultRequest<UpdateWebACLRequest>(
                updateWebACLRequest, "AWSWAF");
        request.addHeader("X-Amz-Target", "AWSWAF_20150824.UpdateWebACL");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (updateWebACLRequest.getWebACLId() != null) {
                jsonWriter.key("WebACLId").value(
                        updateWebACLRequest.getWebACLId());
            }

            if (updateWebACLRequest.getChangeToken() != null) {
                jsonWriter.key("ChangeToken").value(
                        updateWebACLRequest.getChangeToken());
            }

            java.util.List<WebACLUpdate> updatesList = updateWebACLRequest
                    .getUpdates();
            if (updatesList != null) {
                jsonWriter.key("Updates");
                jsonWriter.array();
                for (WebACLUpdate updatesListValue : updatesList) {
                    if (updatesListValue != null) {

                        WebACLUpdateJsonMarshaller.getInstance().marshall(
                                updatesListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (updateWebACLRequest.getDefaultAction() != null) {
                jsonWriter.key("DefaultAction");
                WafActionJsonMarshaller.getInstance().marshall(
                        updateWebACLRequest.getDefaultAction(), jsonWriter);
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
