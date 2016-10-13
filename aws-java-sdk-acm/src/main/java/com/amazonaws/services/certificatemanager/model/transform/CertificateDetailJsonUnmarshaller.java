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
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.certificatemanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CertificateDetail JSON Unmarshaller
 */
public class CertificateDetailJsonUnmarshaller implements Unmarshaller<CertificateDetail, JsonUnmarshallerContext> {

    public CertificateDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        CertificateDetail certificateDetail = new CertificateDetail();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("CertificateArn", targetDepth)) {
                    context.nextToken();
                    certificateDetail.setCertificateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DomainName", targetDepth)) {
                    context.nextToken();
                    certificateDetail.setDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubjectAlternativeNames", targetDepth)) {
                    context.nextToken();
                    certificateDetail.setSubjectAlternativeNames(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("DomainValidationOptions", targetDepth)) {
                    context.nextToken();
                    certificateDetail.setDomainValidationOptions(new ListUnmarshaller<DomainValidation>(DomainValidationJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("Serial", targetDepth)) {
                    context.nextToken();
                    certificateDetail.setSerial(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Subject", targetDepth)) {
                    context.nextToken();
                    certificateDetail.setSubject(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Issuer", targetDepth)) {
                    context.nextToken();
                    certificateDetail.setIssuer(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    certificateDetail.setCreatedAt(context.getUnmarshaller(java.util.Date.class).unmarshall(context));
                }
                if (context.testExpression("IssuedAt", targetDepth)) {
                    context.nextToken();
                    certificateDetail.setIssuedAt(context.getUnmarshaller(java.util.Date.class).unmarshall(context));
                }
                if (context.testExpression("ImportedAt", targetDepth)) {
                    context.nextToken();
                    certificateDetail.setImportedAt(context.getUnmarshaller(java.util.Date.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    certificateDetail.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RevokedAt", targetDepth)) {
                    context.nextToken();
                    certificateDetail.setRevokedAt(context.getUnmarshaller(java.util.Date.class).unmarshall(context));
                }
                if (context.testExpression("RevocationReason", targetDepth)) {
                    context.nextToken();
                    certificateDetail.setRevocationReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NotBefore", targetDepth)) {
                    context.nextToken();
                    certificateDetail.setNotBefore(context.getUnmarshaller(java.util.Date.class).unmarshall(context));
                }
                if (context.testExpression("NotAfter", targetDepth)) {
                    context.nextToken();
                    certificateDetail.setNotAfter(context.getUnmarshaller(java.util.Date.class).unmarshall(context));
                }
                if (context.testExpression("KeyAlgorithm", targetDepth)) {
                    context.nextToken();
                    certificateDetail.setKeyAlgorithm(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SignatureAlgorithm", targetDepth)) {
                    context.nextToken();
                    certificateDetail.setSignatureAlgorithm(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InUseBy", targetDepth)) {
                    context.nextToken();
                    certificateDetail.setInUseBy(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    certificateDetail.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    certificateDetail.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return certificateDetail;
    }

    private static CertificateDetailJsonUnmarshaller instance;

    public static CertificateDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CertificateDetailJsonUnmarshaller();
        return instance;
    }
}
