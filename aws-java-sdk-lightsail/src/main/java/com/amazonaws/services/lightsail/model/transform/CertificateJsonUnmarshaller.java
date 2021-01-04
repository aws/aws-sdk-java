/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Certificate JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CertificateJsonUnmarshaller implements Unmarshaller<Certificate, JsonUnmarshallerContext> {

    public Certificate unmarshall(JsonUnmarshallerContext context) throws Exception {
        Certificate certificate = new Certificate();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    certificate.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    certificate.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("domainName", targetDepth)) {
                    context.nextToken();
                    certificate.setDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    certificate.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serialNumber", targetDepth)) {
                    context.nextToken();
                    certificate.setSerialNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subjectAlternativeNames", targetDepth)) {
                    context.nextToken();
                    certificate.setSubjectAlternativeNames(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("domainValidationRecords", targetDepth)) {
                    context.nextToken();
                    certificate.setDomainValidationRecords(new ListUnmarshaller<DomainValidationRecord>(DomainValidationRecordJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("requestFailureReason", targetDepth)) {
                    context.nextToken();
                    certificate.setRequestFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("inUseResourceCount", targetDepth)) {
                    context.nextToken();
                    certificate.setInUseResourceCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("keyAlgorithm", targetDepth)) {
                    context.nextToken();
                    certificate.setKeyAlgorithm(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    certificate.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("issuedAt", targetDepth)) {
                    context.nextToken();
                    certificate.setIssuedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("issuerCA", targetDepth)) {
                    context.nextToken();
                    certificate.setIssuerCA(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("notBefore", targetDepth)) {
                    context.nextToken();
                    certificate.setNotBefore(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("notAfter", targetDepth)) {
                    context.nextToken();
                    certificate.setNotAfter(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("eligibleToRenew", targetDepth)) {
                    context.nextToken();
                    certificate.setEligibleToRenew(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("renewalSummary", targetDepth)) {
                    context.nextToken();
                    certificate.setRenewalSummary(RenewalSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("revokedAt", targetDepth)) {
                    context.nextToken();
                    certificate.setRevokedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("revocationReason", targetDepth)) {
                    context.nextToken();
                    certificate.setRevocationReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    certificate.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("supportCode", targetDepth)) {
                    context.nextToken();
                    certificate.setSupportCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return certificate;
    }

    private static CertificateJsonUnmarshaller instance;

    public static CertificateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CertificateJsonUnmarshaller();
        return instance;
    }
}
