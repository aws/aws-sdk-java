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
 * CreateImportJobRequest Marshaller
 */
public class CreateImportJobRequestMarshaller implements Marshaller<Request<CreateImportJobRequest>, CreateImportJobRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateImportJobRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateImportJobRequest> marshall(CreateImportJobRequest createImportJobRequest) {

        if (createImportJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateImportJobRequest> request = new DefaultRequest<CreateImportJobRequest>(createImportJobRequest, "AmazonPinpoint");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/v1/apps/{application-id}/jobs/import";

        uriResourcePath = uriResourcePath.replace(
                "{application-id}",
                (createImportJobRequest.getApplicationId() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(createImportJobRequest.getApplicationId()),
                        false) : "");
        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            ImportJobRequest importJobRequest = createImportJobRequest.getImportJobRequest();
            if (importJobRequest != null) {
                jsonGenerator.writeStartObject();
                if (importJobRequest.getDefineSegment() != null) {
                    jsonGenerator.writeFieldName("DefineSegment").writeValue(importJobRequest.getDefineSegment());
                }
                if (importJobRequest.getExternalId() != null) {
                    jsonGenerator.writeFieldName("ExternalId").writeValue(importJobRequest.getExternalId());
                }
                if (importJobRequest.getFormat() != null) {
                    jsonGenerator.writeFieldName("Format").writeValue(importJobRequest.getFormat());
                }
                if (importJobRequest.getRegisterEndpoints() != null) {
                    jsonGenerator.writeFieldName("RegisterEndpoints").writeValue(importJobRequest.getRegisterEndpoints());
                }
                if (importJobRequest.getRoleArn() != null) {
                    jsonGenerator.writeFieldName("RoleArn").writeValue(importJobRequest.getRoleArn());
                }
                if (importJobRequest.getS3Url() != null) {
                    jsonGenerator.writeFieldName("S3Url").writeValue(importJobRequest.getS3Url());
                }
                if (importJobRequest.getSegmentId() != null) {
                    jsonGenerator.writeFieldName("SegmentId").writeValue(importJobRequest.getSegmentId());
                }
                if (importJobRequest.getSegmentName() != null) {
                    jsonGenerator.writeFieldName("SegmentName").writeValue(importJobRequest.getSegmentName());
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
