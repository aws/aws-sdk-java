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
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.waf.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * SampledHTTPRequestMarshaller
 */
public class SampledHTTPRequestJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(SampledHTTPRequest sampledHTTPRequest,
            JSONWriter jsonWriter) {
        if (sampledHTTPRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (sampledHTTPRequest.getRequest() != null) {
                jsonWriter.key("Request");
                HTTPRequestJsonMarshaller.getInstance().marshall(
                        sampledHTTPRequest.getRequest(), jsonWriter);
            }

            if (sampledHTTPRequest.getWeight() != null) {
                jsonWriter.key("Weight").value(sampledHTTPRequest.getWeight());
            }

            if (sampledHTTPRequest.getTimestamp() != null) {
                jsonWriter.key("Timestamp").value(
                        sampledHTTPRequest.getTimestamp());
            }

            if (sampledHTTPRequest.getAction() != null) {
                jsonWriter.key("Action").value(sampledHTTPRequest.getAction());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static SampledHTTPRequestJsonMarshaller instance;

    public static SampledHTTPRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SampledHTTPRequestJsonMarshaller();
        return instance;
    }

}
