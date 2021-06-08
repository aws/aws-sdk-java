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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsCertificateManagerCertificateDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCertificateManagerCertificateDetailsJsonUnmarshaller implements Unmarshaller<AwsCertificateManagerCertificateDetails, JsonUnmarshallerContext> {

    public AwsCertificateManagerCertificateDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsCertificateManagerCertificateDetails awsCertificateManagerCertificateDetails = new AwsCertificateManagerCertificateDetails();

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
                if (context.testExpression("CertificateAuthorityArn", targetDepth)) {
                    context.nextToken();
                    awsCertificateManagerCertificateDetails.setCertificateAuthorityArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    awsCertificateManagerCertificateDetails.setCreatedAt(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DomainName", targetDepth)) {
                    context.nextToken();
                    awsCertificateManagerCertificateDetails.setDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DomainValidationOptions", targetDepth)) {
                    context.nextToken();
                    awsCertificateManagerCertificateDetails
                            .setDomainValidationOptions(new ListUnmarshaller<AwsCertificateManagerCertificateDomainValidationOption>(
                                    AwsCertificateManagerCertificateDomainValidationOptionJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("ExtendedKeyUsages", targetDepth)) {
                    context.nextToken();
                    awsCertificateManagerCertificateDetails.setExtendedKeyUsages(new ListUnmarshaller<AwsCertificateManagerCertificateExtendedKeyUsage>(
                            AwsCertificateManagerCertificateExtendedKeyUsageJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    awsCertificateManagerCertificateDetails.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImportedAt", targetDepth)) {
                    context.nextToken();
                    awsCertificateManagerCertificateDetails.setImportedAt(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InUseBy", targetDepth)) {
                    context.nextToken();
                    awsCertificateManagerCertificateDetails.setInUseBy(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("IssuedAt", targetDepth)) {
                    context.nextToken();
                    awsCertificateManagerCertificateDetails.setIssuedAt(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Issuer", targetDepth)) {
                    context.nextToken();
                    awsCertificateManagerCertificateDetails.setIssuer(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KeyAlgorithm", targetDepth)) {
                    context.nextToken();
                    awsCertificateManagerCertificateDetails.setKeyAlgorithm(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KeyUsages", targetDepth)) {
                    context.nextToken();
                    awsCertificateManagerCertificateDetails.setKeyUsages(new ListUnmarshaller<AwsCertificateManagerCertificateKeyUsage>(
                            AwsCertificateManagerCertificateKeyUsageJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NotAfter", targetDepth)) {
                    context.nextToken();
                    awsCertificateManagerCertificateDetails.setNotAfter(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NotBefore", targetDepth)) {
                    context.nextToken();
                    awsCertificateManagerCertificateDetails.setNotBefore(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Options", targetDepth)) {
                    context.nextToken();
                    awsCertificateManagerCertificateDetails.setOptions(AwsCertificateManagerCertificateOptionsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("RenewalEligibility", targetDepth)) {
                    context.nextToken();
                    awsCertificateManagerCertificateDetails.setRenewalEligibility(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RenewalSummary", targetDepth)) {
                    context.nextToken();
                    awsCertificateManagerCertificateDetails.setRenewalSummary(AwsCertificateManagerCertificateRenewalSummaryJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("Serial", targetDepth)) {
                    context.nextToken();
                    awsCertificateManagerCertificateDetails.setSerial(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SignatureAlgorithm", targetDepth)) {
                    context.nextToken();
                    awsCertificateManagerCertificateDetails.setSignatureAlgorithm(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    awsCertificateManagerCertificateDetails.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Subject", targetDepth)) {
                    context.nextToken();
                    awsCertificateManagerCertificateDetails.setSubject(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubjectAlternativeNames", targetDepth)) {
                    context.nextToken();
                    awsCertificateManagerCertificateDetails.setSubjectAlternativeNames(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    awsCertificateManagerCertificateDetails.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsCertificateManagerCertificateDetails;
    }

    private static AwsCertificateManagerCertificateDetailsJsonUnmarshaller instance;

    public static AwsCertificateManagerCertificateDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsCertificateManagerCertificateDetailsJsonUnmarshaller();
        return instance;
    }
}
