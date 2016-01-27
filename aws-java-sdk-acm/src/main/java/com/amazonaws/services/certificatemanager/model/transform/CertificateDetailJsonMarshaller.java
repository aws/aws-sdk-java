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

package com.amazonaws.services.certificatemanager.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.certificatemanager.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * CertificateDetailMarshaller
 */
public class CertificateDetailJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(CertificateDetail certificateDetail,
            JSONWriter jsonWriter) {
        if (certificateDetail == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (certificateDetail.getCertificateArn() != null) {
                jsonWriter.key("CertificateArn").value(
                        certificateDetail.getCertificateArn());
            }

            if (certificateDetail.getDomainName() != null) {
                jsonWriter.key("DomainName").value(
                        certificateDetail.getDomainName());
            }

            java.util.List<String> subjectAlternativeNamesList = certificateDetail
                    .getSubjectAlternativeNames();
            if (subjectAlternativeNamesList != null) {
                jsonWriter.key("SubjectAlternativeNames");
                jsonWriter.array();
                for (String subjectAlternativeNamesListValue : subjectAlternativeNamesList) {
                    if (subjectAlternativeNamesListValue != null) {
                        jsonWriter.value(subjectAlternativeNamesListValue);
                    }
                }
                jsonWriter.endArray();
            }

            java.util.List<DomainValidation> domainValidationOptionsList = certificateDetail
                    .getDomainValidationOptions();
            if (domainValidationOptionsList != null) {
                jsonWriter.key("DomainValidationOptions");
                jsonWriter.array();
                for (DomainValidation domainValidationOptionsListValue : domainValidationOptionsList) {
                    if (domainValidationOptionsListValue != null) {

                        DomainValidationJsonMarshaller.getInstance().marshall(
                                domainValidationOptionsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (certificateDetail.getSerial() != null) {
                jsonWriter.key("Serial").value(certificateDetail.getSerial());
            }

            if (certificateDetail.getSubject() != null) {
                jsonWriter.key("Subject").value(certificateDetail.getSubject());
            }

            if (certificateDetail.getIssuer() != null) {
                jsonWriter.key("Issuer").value(certificateDetail.getIssuer());
            }

            if (certificateDetail.getCreatedAt() != null) {
                jsonWriter.key("CreatedAt").value(
                        certificateDetail.getCreatedAt());
            }

            if (certificateDetail.getIssuedAt() != null) {
                jsonWriter.key("IssuedAt").value(
                        certificateDetail.getIssuedAt());
            }

            if (certificateDetail.getStatus() != null) {
                jsonWriter.key("Status").value(certificateDetail.getStatus());
            }

            if (certificateDetail.getRevokedAt() != null) {
                jsonWriter.key("RevokedAt").value(
                        certificateDetail.getRevokedAt());
            }

            if (certificateDetail.getRevocationReason() != null) {
                jsonWriter.key("RevocationReason").value(
                        certificateDetail.getRevocationReason());
            }

            if (certificateDetail.getNotBefore() != null) {
                jsonWriter.key("NotBefore").value(
                        certificateDetail.getNotBefore());
            }

            if (certificateDetail.getNotAfter() != null) {
                jsonWriter.key("NotAfter").value(
                        certificateDetail.getNotAfter());
            }

            if (certificateDetail.getKeyAlgorithm() != null) {
                jsonWriter.key("KeyAlgorithm").value(
                        certificateDetail.getKeyAlgorithm());
            }

            if (certificateDetail.getSignatureAlgorithm() != null) {
                jsonWriter.key("SignatureAlgorithm").value(
                        certificateDetail.getSignatureAlgorithm());
            }

            java.util.List<String> inUseByList = certificateDetail.getInUseBy();
            if (inUseByList != null) {
                jsonWriter.key("InUseBy");
                jsonWriter.array();
                for (String inUseByListValue : inUseByList) {
                    if (inUseByListValue != null) {
                        jsonWriter.value(inUseByListValue);
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static CertificateDetailJsonMarshaller instance;

    public static CertificateDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CertificateDetailJsonMarshaller();
        return instance;
    }

}
