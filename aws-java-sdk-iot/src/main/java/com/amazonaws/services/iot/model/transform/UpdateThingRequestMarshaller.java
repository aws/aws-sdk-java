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
package com.amazonaws.services.iot.model.transform;

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
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.SdkHttpUtils;
import com.amazonaws.protocol.json.*;

/**
 * UpdateThingRequest Marshaller
 */
public class UpdateThingRequestMarshaller implements Marshaller<Request<UpdateThingRequest>, UpdateThingRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public UpdateThingRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateThingRequest> marshall(UpdateThingRequest updateThingRequest) {

        if (updateThingRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateThingRequest> request = new DefaultRequest<UpdateThingRequest>(updateThingRequest, "AWSIot");

        request.setHttpMethod(HttpMethodName.PATCH);

        String uriResourcePath = "/things/{thingName}";

        uriResourcePath = uriResourcePath.replace("{thingName}",
                (updateThingRequest.getThingName() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(updateThingRequest.getThingName()), false) : "");
        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            if (updateThingRequest.getThingTypeName() != null) {
                jsonGenerator.writeFieldName("thingTypeName").writeValue(updateThingRequest.getThingTypeName());
            }
            if (updateThingRequest.getAttributePayload() != null) {
                jsonGenerator.writeFieldName("attributePayload");
                AttributePayloadJsonMarshaller.getInstance().marshall(updateThingRequest.getAttributePayload(), jsonGenerator);
            }
            if (updateThingRequest.getExpectedVersion() != null) {
                jsonGenerator.writeFieldName("expectedVersion").writeValue(updateThingRequest.getExpectedVersion());
            }
            if (updateThingRequest.getRemoveThingType() != null) {
                jsonGenerator.writeFieldName("removeThingType").writeValue(updateThingRequest.getRemoveThingType());
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
