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

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.certificatemanager.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * CertificateDetailMarshaller
 */
public class CertificateDetailJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(CertificateDetail certificateDetail, StructuredJsonGenerator jsonGenerator) {

        if (certificateDetail == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (certificateDetail.getCertificateArn() != null) {
                jsonGenerator.writeFieldName("CertificateArn").writeValue(certificateDetail.getCertificateArn());
            }
            if (certificateDetail.getDomainName() != null) {
                jsonGenerator.writeFieldName("DomainName").writeValue(certificateDetail.getDomainName());
            }

            java.util.List<String> subjectAlternativeNamesList = certificateDetail.getSubjectAlternativeNames();
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

            java.util.List<DomainValidation> domainValidationOptionsList = certificateDetail.getDomainValidationOptions();
            if (domainValidationOptionsList != null) {
                jsonGenerator.writeFieldName("DomainValidationOptions");
                jsonGenerator.writeStartArray();
                for (DomainValidation domainValidationOptionsListValue : domainValidationOptionsList) {
                    if (domainValidationOptionsListValue != null) {

                        DomainValidationJsonMarshaller.getInstance().marshall(domainValidationOptionsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (certificateDetail.getSerial() != null) {
                jsonGenerator.writeFieldName("Serial").writeValue(certificateDetail.getSerial());
            }
            if (certificateDetail.getSubject() != null) {
                jsonGenerator.writeFieldName("Subject").writeValue(certificateDetail.getSubject());
            }
            if (certificateDetail.getIssuer() != null) {
                jsonGenerator.writeFieldName("Issuer").writeValue(certificateDetail.getIssuer());
            }
            if (certificateDetail.getCreatedAt() != null) {
                jsonGenerator.writeFieldName("CreatedAt").writeValue(certificateDetail.getCreatedAt());
            }
            if (certificateDetail.getIssuedAt() != null) {
                jsonGenerator.writeFieldName("IssuedAt").writeValue(certificateDetail.getIssuedAt());
            }
            if (certificateDetail.getImportedAt() != null) {
                jsonGenerator.writeFieldName("ImportedAt").writeValue(certificateDetail.getImportedAt());
            }
            if (certificateDetail.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(certificateDetail.getStatus());
            }
            if (certificateDetail.getRevokedAt() != null) {
                jsonGenerator.writeFieldName("RevokedAt").writeValue(certificateDetail.getRevokedAt());
            }
            if (certificateDetail.getRevocationReason() != null) {
                jsonGenerator.writeFieldName("RevocationReason").writeValue(certificateDetail.getRevocationReason());
            }
            if (certificateDetail.getNotBefore() != null) {
                jsonGenerator.writeFieldName("NotBefore").writeValue(certificateDetail.getNotBefore());
            }
            if (certificateDetail.getNotAfter() != null) {
                jsonGenerator.writeFieldName("NotAfter").writeValue(certificateDetail.getNotAfter());
            }
            if (certificateDetail.getKeyAlgorithm() != null) {
                jsonGenerator.writeFieldName("KeyAlgorithm").writeValue(certificateDetail.getKeyAlgorithm());
            }
            if (certificateDetail.getSignatureAlgorithm() != null) {
                jsonGenerator.writeFieldName("SignatureAlgorithm").writeValue(certificateDetail.getSignatureAlgorithm());
            }

            java.util.List<String> inUseByList = certificateDetail.getInUseBy();
            if (inUseByList != null) {
                jsonGenerator.writeFieldName("InUseBy");
                jsonGenerator.writeStartArray();
                for (String inUseByListValue : inUseByList) {
                    if (inUseByListValue != null) {
                        jsonGenerator.writeValue(inUseByListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (certificateDetail.getFailureReason() != null) {
                jsonGenerator.writeFieldName("FailureReason").writeValue(certificateDetail.getFailureReason());
            }
            if (certificateDetail.getType() != null) {
                jsonGenerator.writeFieldName("Type").writeValue(certificateDetail.getType());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static CertificateDetailJsonMarshaller instance;

    public static CertificateDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CertificateDetailJsonMarshaller();
        return instance;
    }

}
