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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeCertificatesResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCertificatesResultJsonUnmarshaller implements Unmarshaller<DescribeCertificatesResult, JsonUnmarshallerContext> {

    public DescribeCertificatesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeCertificatesResult describeCertificatesResult = new DescribeCertificatesResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeCertificatesResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Marker", targetDepth)) {
                    context.nextToken();
                    describeCertificatesResult.setMarker(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Certificates", targetDepth)) {
                    context.nextToken();
                    describeCertificatesResult
                            .setCertificates(new ListUnmarshaller<Certificate>(CertificateJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeCertificatesResult;
    }

    private static DescribeCertificatesResultJsonUnmarshaller instance;

    public static DescribeCertificatesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeCertificatesResultJsonUnmarshaller();
        return instance;
    }
}
