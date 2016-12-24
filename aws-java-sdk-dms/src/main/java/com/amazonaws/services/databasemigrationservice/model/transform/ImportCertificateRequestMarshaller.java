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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * ImportCertificateRequest Marshaller
 */
public class ImportCertificateRequestMarshaller implements Marshaller<Request<ImportCertificateRequest>, ImportCertificateRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ImportCertificateRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ImportCertificateRequest> marshall(ImportCertificateRequest importCertificateRequest) {

        if (importCertificateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ImportCertificateRequest> request = new DefaultRequest<ImportCertificateRequest>(importCertificateRequest, "AWSDatabaseMigrationService");
        request.addHeader("X-Amz-Target", "AmazonDMSv20160101.ImportCertificate");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (importCertificateRequest.getCertificateIdentifier() != null) {
                jsonGenerator.writeFieldName("CertificateIdentifier").writeValue(importCertificateRequest.getCertificateIdentifier());
            }
            if (importCertificateRequest.getCertificatePem() != null) {
                jsonGenerator.writeFieldName("CertificatePem").writeValue(importCertificateRequest.getCertificatePem());
            }
            if (importCertificateRequest.getCertificateWallet() != null) {
                jsonGenerator.writeFieldName("CertificateWallet").writeValue(importCertificateRequest.getCertificateWallet());
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
