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
package com.amazonaws.services.xray.model.transform;

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
import com.amazonaws.services.xray.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.SdkHttpUtils;
import com.amazonaws.protocol.json.*;

/**
 * PutTelemetryRecordsRequest Marshaller
 */
public class PutTelemetryRecordsRequestMarshaller implements Marshaller<Request<PutTelemetryRecordsRequest>, PutTelemetryRecordsRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public PutTelemetryRecordsRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<PutTelemetryRecordsRequest> marshall(PutTelemetryRecordsRequest putTelemetryRecordsRequest) {

        if (putTelemetryRecordsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PutTelemetryRecordsRequest> request = new DefaultRequest<PutTelemetryRecordsRequest>(putTelemetryRecordsRequest, "AWSXRay");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/TelemetryRecords";

        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            java.util.List<TelemetryRecord> telemetryRecordsList = putTelemetryRecordsRequest.getTelemetryRecords();
            if (telemetryRecordsList != null) {
                jsonGenerator.writeFieldName("TelemetryRecords");
                jsonGenerator.writeStartArray();
                for (TelemetryRecord telemetryRecordsListValue : telemetryRecordsList) {
                    if (telemetryRecordsListValue != null) {

                        TelemetryRecordJsonMarshaller.getInstance().marshall(telemetryRecordsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (putTelemetryRecordsRequest.getEC2InstanceId() != null) {
                jsonGenerator.writeFieldName("EC2InstanceId").writeValue(putTelemetryRecordsRequest.getEC2InstanceId());
            }
            if (putTelemetryRecordsRequest.getHostname() != null) {
                jsonGenerator.writeFieldName("Hostname").writeValue(putTelemetryRecordsRequest.getHostname());
            }
            if (putTelemetryRecordsRequest.getResourceARN() != null) {
                jsonGenerator.writeFieldName("ResourceARN").writeValue(putTelemetryRecordsRequest.getResourceARN());
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
