/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotwireless.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotwireless.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DakCertificateMetadata JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DakCertificateMetadataJsonUnmarshaller implements Unmarshaller<DakCertificateMetadata, JsonUnmarshallerContext> {

    public DakCertificateMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        DakCertificateMetadata dakCertificateMetadata = new DakCertificateMetadata();

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
                if (context.testExpression("CertificateId", targetDepth)) {
                    context.nextToken();
                    dakCertificateMetadata.setCertificateId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxAllowedSignature", targetDepth)) {
                    context.nextToken();
                    dakCertificateMetadata.setMaxAllowedSignature(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("FactorySupport", targetDepth)) {
                    context.nextToken();
                    dakCertificateMetadata.setFactorySupport(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ApId", targetDepth)) {
                    context.nextToken();
                    dakCertificateMetadata.setApId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceTypeId", targetDepth)) {
                    context.nextToken();
                    dakCertificateMetadata.setDeviceTypeId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return dakCertificateMetadata;
    }

    private static DakCertificateMetadataJsonUnmarshaller instance;

    public static DakCertificateMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DakCertificateMetadataJsonUnmarshaller();
        return instance;
    }
}
