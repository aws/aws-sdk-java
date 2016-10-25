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

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * CertificateMarshaller
 */
public class CertificateJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Certificate certificate, StructuredJsonGenerator jsonGenerator) {

        if (certificate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (certificate.getCertificateIdentifier() != null) {
                jsonGenerator.writeFieldName("CertificateIdentifier").writeValue(certificate.getCertificateIdentifier());
            }
            if (certificate.getCertificateCreationDate() != null) {
                jsonGenerator.writeFieldName("CertificateCreationDate").writeValue(certificate.getCertificateCreationDate());
            }
            if (certificate.getCertificatePem() != null) {
                jsonGenerator.writeFieldName("CertificatePem").writeValue(certificate.getCertificatePem());
            }
            if (certificate.getCertificateArn() != null) {
                jsonGenerator.writeFieldName("CertificateArn").writeValue(certificate.getCertificateArn());
            }
            if (certificate.getCertificateOwner() != null) {
                jsonGenerator.writeFieldName("CertificateOwner").writeValue(certificate.getCertificateOwner());
            }
            if (certificate.getValidFromDate() != null) {
                jsonGenerator.writeFieldName("ValidFromDate").writeValue(certificate.getValidFromDate());
            }
            if (certificate.getValidToDate() != null) {
                jsonGenerator.writeFieldName("ValidToDate").writeValue(certificate.getValidToDate());
            }
            if (certificate.getSigningAlgorithm() != null) {
                jsonGenerator.writeFieldName("SigningAlgorithm").writeValue(certificate.getSigningAlgorithm());
            }
            if (certificate.getKeyLength() != null) {
                jsonGenerator.writeFieldName("KeyLength").writeValue(certificate.getKeyLength());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static CertificateJsonMarshaller instance;

    public static CertificateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CertificateJsonMarshaller();
        return instance;
    }

}
