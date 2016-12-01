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
package com.amazonaws.services.pinpoint.model.transform;

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
import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.SdkHttpUtils;
import com.amazonaws.protocol.json.*;

/**
 * UpdateApnsChannelRequest Marshaller
 */
public class UpdateApnsChannelRequestMarshaller implements Marshaller<Request<UpdateApnsChannelRequest>, UpdateApnsChannelRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public UpdateApnsChannelRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateApnsChannelRequest> marshall(UpdateApnsChannelRequest updateApnsChannelRequest) {

        if (updateApnsChannelRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateApnsChannelRequest> request = new DefaultRequest<UpdateApnsChannelRequest>(updateApnsChannelRequest, "AmazonPinpoint");

        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/v1/apps/{application-id}/channels/apns";

        uriResourcePath = uriResourcePath.replace(
                "{application-id}",
                (updateApnsChannelRequest.getApplicationId() != null) ? SdkHttpUtils.urlEncode(
                        StringUtils.fromString(updateApnsChannelRequest.getApplicationId()), false) : "");
        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            APNSChannelRequest aPNSChannelRequest = updateApnsChannelRequest.getAPNSChannelRequest();
            if (aPNSChannelRequest != null) {
                jsonGenerator.writeStartObject();
                if (aPNSChannelRequest.getCertificate() != null) {
                    jsonGenerator.writeFieldName("Certificate").writeValue(aPNSChannelRequest.getCertificate());
                }
                if (aPNSChannelRequest.getPrivateKey() != null) {
                    jsonGenerator.writeFieldName("PrivateKey").writeValue(aPNSChannelRequest.getPrivateKey());
                }
                jsonGenerator.writeEndObject();
            }

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
