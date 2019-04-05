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
package com.amazonaws.services.acmpca.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.acmpca.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ASN1Subject JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ASN1SubjectJsonUnmarshaller implements Unmarshaller<ASN1Subject, JsonUnmarshallerContext> {

    public ASN1Subject unmarshall(JsonUnmarshallerContext context) throws Exception {
        ASN1Subject aSN1Subject = new ASN1Subject();

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
                if (context.testExpression("Country", targetDepth)) {
                    context.nextToken();
                    aSN1Subject.setCountry(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Organization", targetDepth)) {
                    context.nextToken();
                    aSN1Subject.setOrganization(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OrganizationalUnit", targetDepth)) {
                    context.nextToken();
                    aSN1Subject.setOrganizationalUnit(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DistinguishedNameQualifier", targetDepth)) {
                    context.nextToken();
                    aSN1Subject.setDistinguishedNameQualifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    aSN1Subject.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CommonName", targetDepth)) {
                    context.nextToken();
                    aSN1Subject.setCommonName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SerialNumber", targetDepth)) {
                    context.nextToken();
                    aSN1Subject.setSerialNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Locality", targetDepth)) {
                    context.nextToken();
                    aSN1Subject.setLocality(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Title", targetDepth)) {
                    context.nextToken();
                    aSN1Subject.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Surname", targetDepth)) {
                    context.nextToken();
                    aSN1Subject.setSurname(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GivenName", targetDepth)) {
                    context.nextToken();
                    aSN1Subject.setGivenName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Initials", targetDepth)) {
                    context.nextToken();
                    aSN1Subject.setInitials(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Pseudonym", targetDepth)) {
                    context.nextToken();
                    aSN1Subject.setPseudonym(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GenerationQualifier", targetDepth)) {
                    context.nextToken();
                    aSN1Subject.setGenerationQualifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return aSN1Subject;
    }

    private static ASN1SubjectJsonUnmarshaller instance;

    public static ASN1SubjectJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ASN1SubjectJsonUnmarshaller();
        return instance;
    }
}
