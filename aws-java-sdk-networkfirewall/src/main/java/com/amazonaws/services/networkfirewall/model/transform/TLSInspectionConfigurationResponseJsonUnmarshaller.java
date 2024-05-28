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
package com.amazonaws.services.networkfirewall.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.networkfirewall.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TLSInspectionConfigurationResponse JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TLSInspectionConfigurationResponseJsonUnmarshaller implements Unmarshaller<TLSInspectionConfigurationResponse, JsonUnmarshallerContext> {

    public TLSInspectionConfigurationResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        TLSInspectionConfigurationResponse tLSInspectionConfigurationResponse = new TLSInspectionConfigurationResponse();

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
                if (context.testExpression("TLSInspectionConfigurationArn", targetDepth)) {
                    context.nextToken();
                    tLSInspectionConfigurationResponse.setTLSInspectionConfigurationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TLSInspectionConfigurationName", targetDepth)) {
                    context.nextToken();
                    tLSInspectionConfigurationResponse.setTLSInspectionConfigurationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TLSInspectionConfigurationId", targetDepth)) {
                    context.nextToken();
                    tLSInspectionConfigurationResponse.setTLSInspectionConfigurationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TLSInspectionConfigurationStatus", targetDepth)) {
                    context.nextToken();
                    tLSInspectionConfigurationResponse.setTLSInspectionConfigurationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    tLSInspectionConfigurationResponse.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    tLSInspectionConfigurationResponse.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    tLSInspectionConfigurationResponse.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("NumberOfAssociations", targetDepth)) {
                    context.nextToken();
                    tLSInspectionConfigurationResponse.setNumberOfAssociations(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("EncryptionConfiguration", targetDepth)) {
                    context.nextToken();
                    tLSInspectionConfigurationResponse.setEncryptionConfiguration(EncryptionConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Certificates", targetDepth)) {
                    context.nextToken();
                    tLSInspectionConfigurationResponse.setCertificates(new ListUnmarshaller<TlsCertificateData>(TlsCertificateDataJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CertificateAuthority", targetDepth)) {
                    context.nextToken();
                    tLSInspectionConfigurationResponse.setCertificateAuthority(TlsCertificateDataJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return tLSInspectionConfigurationResponse;
    }

    private static TLSInspectionConfigurationResponseJsonUnmarshaller instance;

    public static TLSInspectionConfigurationResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TLSInspectionConfigurationResponseJsonUnmarshaller();
        return instance;
    }
}
