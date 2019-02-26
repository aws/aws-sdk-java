/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * LoadBalancerTlsCertificate JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoadBalancerTlsCertificateJsonUnmarshaller implements Unmarshaller<LoadBalancerTlsCertificate, JsonUnmarshallerContext> {

    public LoadBalancerTlsCertificate unmarshall(JsonUnmarshallerContext context) throws Exception {
        LoadBalancerTlsCertificate loadBalancerTlsCertificate = new LoadBalancerTlsCertificate();

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
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    loadBalancerTlsCertificate.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    loadBalancerTlsCertificate.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("supportCode", targetDepth)) {
                    context.nextToken();
                    loadBalancerTlsCertificate.setSupportCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    loadBalancerTlsCertificate.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    context.nextToken();
                    loadBalancerTlsCertificate.setLocation(ResourceLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("resourceType", targetDepth)) {
                    context.nextToken();
                    loadBalancerTlsCertificate.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    loadBalancerTlsCertificate.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("loadBalancerName", targetDepth)) {
                    context.nextToken();
                    loadBalancerTlsCertificate.setLoadBalancerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("isAttached", targetDepth)) {
                    context.nextToken();
                    loadBalancerTlsCertificate.setIsAttached(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    loadBalancerTlsCertificate.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("domainName", targetDepth)) {
                    context.nextToken();
                    loadBalancerTlsCertificate.setDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("domainValidationRecords", targetDepth)) {
                    context.nextToken();
                    loadBalancerTlsCertificate.setDomainValidationRecords(new ListUnmarshaller<LoadBalancerTlsCertificateDomainValidationRecord>(
                            LoadBalancerTlsCertificateDomainValidationRecordJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("failureReason", targetDepth)) {
                    context.nextToken();
                    loadBalancerTlsCertificate.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("issuedAt", targetDepth)) {
                    context.nextToken();
                    loadBalancerTlsCertificate.setIssuedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("issuer", targetDepth)) {
                    context.nextToken();
                    loadBalancerTlsCertificate.setIssuer(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("keyAlgorithm", targetDepth)) {
                    context.nextToken();
                    loadBalancerTlsCertificate.setKeyAlgorithm(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("notAfter", targetDepth)) {
                    context.nextToken();
                    loadBalancerTlsCertificate.setNotAfter(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("notBefore", targetDepth)) {
                    context.nextToken();
                    loadBalancerTlsCertificate.setNotBefore(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("renewalSummary", targetDepth)) {
                    context.nextToken();
                    loadBalancerTlsCertificate.setRenewalSummary(LoadBalancerTlsCertificateRenewalSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("revocationReason", targetDepth)) {
                    context.nextToken();
                    loadBalancerTlsCertificate.setRevocationReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("revokedAt", targetDepth)) {
                    context.nextToken();
                    loadBalancerTlsCertificate.setRevokedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("serial", targetDepth)) {
                    context.nextToken();
                    loadBalancerTlsCertificate.setSerial(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("signatureAlgorithm", targetDepth)) {
                    context.nextToken();
                    loadBalancerTlsCertificate.setSignatureAlgorithm(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subject", targetDepth)) {
                    context.nextToken();
                    loadBalancerTlsCertificate.setSubject(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subjectAlternativeNames", targetDepth)) {
                    context.nextToken();
                    loadBalancerTlsCertificate.setSubjectAlternativeNames(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return loadBalancerTlsCertificate;
    }

    private static LoadBalancerTlsCertificateJsonUnmarshaller instance;

    public static LoadBalancerTlsCertificateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LoadBalancerTlsCertificateJsonUnmarshaller();
        return instance;
    }
}
