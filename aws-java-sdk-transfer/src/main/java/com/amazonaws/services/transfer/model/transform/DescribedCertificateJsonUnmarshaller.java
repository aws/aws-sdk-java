/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.transfer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.transfer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribedCertificate JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribedCertificateJsonUnmarshaller implements Unmarshaller<DescribedCertificate, JsonUnmarshallerContext> {

    public DescribedCertificate unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribedCertificate describedCertificate = new DescribedCertificate();

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
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    describedCertificate.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CertificateId", targetDepth)) {
                    context.nextToken();
                    describedCertificate.setCertificateId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Usage", targetDepth)) {
                    context.nextToken();
                    describedCertificate.setUsage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describedCertificate.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Certificate", targetDepth)) {
                    context.nextToken();
                    describedCertificate.setCertificate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CertificateChain", targetDepth)) {
                    context.nextToken();
                    describedCertificate.setCertificateChain(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ActiveDate", targetDepth)) {
                    context.nextToken();
                    describedCertificate.setActiveDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("InactiveDate", targetDepth)) {
                    context.nextToken();
                    describedCertificate.setInactiveDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Serial", targetDepth)) {
                    context.nextToken();
                    describedCertificate.setSerial(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NotBeforeDate", targetDepth)) {
                    context.nextToken();
                    describedCertificate.setNotBeforeDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("NotAfterDate", targetDepth)) {
                    context.nextToken();
                    describedCertificate.setNotAfterDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    describedCertificate.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    describedCertificate.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    describedCertificate.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

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

        return describedCertificate;
    }

    private static DescribedCertificateJsonUnmarshaller instance;

    public static DescribedCertificateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribedCertificateJsonUnmarshaller();
        return instance;
    }
}
