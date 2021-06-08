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
package com.amazonaws.services.acmpca.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.acmpca.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GeneralName JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeneralNameJsonUnmarshaller implements Unmarshaller<GeneralName, JsonUnmarshallerContext> {

    public GeneralName unmarshall(JsonUnmarshallerContext context) throws Exception {
        GeneralName generalName = new GeneralName();

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
                if (context.testExpression("OtherName", targetDepth)) {
                    context.nextToken();
                    generalName.setOtherName(OtherNameJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Rfc822Name", targetDepth)) {
                    context.nextToken();
                    generalName.setRfc822Name(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DnsName", targetDepth)) {
                    context.nextToken();
                    generalName.setDnsName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DirectoryName", targetDepth)) {
                    context.nextToken();
                    generalName.setDirectoryName(ASN1SubjectJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EdiPartyName", targetDepth)) {
                    context.nextToken();
                    generalName.setEdiPartyName(EdiPartyNameJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("UniformResourceIdentifier", targetDepth)) {
                    context.nextToken();
                    generalName.setUniformResourceIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IpAddress", targetDepth)) {
                    context.nextToken();
                    generalName.setIpAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RegisteredId", targetDepth)) {
                    context.nextToken();
                    generalName.setRegisteredId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return generalName;
    }

    private static GeneralNameJsonUnmarshaller instance;

    public static GeneralNameJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GeneralNameJsonUnmarshaller();
        return instance;
    }
}
