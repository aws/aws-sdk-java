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
package com.amazonaws.services.certificatemanager.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.certificatemanager.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * RequestCertificateRequest Marshaller
 */
public class RequestCertificateRequestMarshaller implements Marshaller<Request<RequestCertificateRequest>, RequestCertificateRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public RequestCertificateRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<RequestCertificateRequest> marshall(RequestCertificateRequest requestCertificateRequest) {

        if (requestCertificateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RequestCertificateRequest> request = new DefaultRequest<RequestCertificateRequest>(requestCertificateRequest, "AWSCertificateManager");
        request.addHeader("X-Amz-Target", "CertificateManager.RequestCertificate");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (requestCertificateRequest.getDomainName() != null) {
                jsonGenerator.writeFieldName("DomainName").writeValue(requestCertificateRequest.getDomainName());
            }

            java.util.List<String> subjectAlternativeNamesList = requestCertificateRequest.getSubjectAlternativeNames();
            if (subjectAlternativeNamesList != null) {
                jsonGenerator.writeFieldName("SubjectAlternativeNames");
                jsonGenerator.writeStartArray();
                for (String subjectAlternativeNamesListValue : subjectAlternativeNamesList) {
                    if (subjectAlternativeNamesListValue != null) {
                        jsonGenerator.writeValue(subjectAlternativeNamesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (requestCertificateRequest.getIdempotencyToken() != null) {
                jsonGenerator.writeFieldName("IdempotencyToken").writeValue(requestCertificateRequest.getIdempotencyToken());
            }

            java.util.List<DomainValidationOption> domainValidationOptionsList = requestCertificateRequest.getDomainValidationOptions();
            if (domainValidationOptionsList != null) {
                jsonGenerator.writeFieldName("DomainValidationOptions");
                jsonGenerator.writeStartArray();
                for (DomainValidationOption domainValidationOptionsListValue : domainValidationOptionsList) {
                    if (domainValidationOptionsListValue != null) {

                        DomainValidationOptionJsonMarshaller.getInstance().marshall(domainValidationOptionsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
