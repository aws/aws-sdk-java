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
package com.amazonaws.services.amplify.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.amplify.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DomainAssociation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainAssociationJsonUnmarshaller implements Unmarshaller<DomainAssociation, JsonUnmarshallerContext> {

    public DomainAssociation unmarshall(JsonUnmarshallerContext context) throws Exception {
        DomainAssociation domainAssociation = new DomainAssociation();

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
                if (context.testExpression("domainAssociationArn", targetDepth)) {
                    context.nextToken();
                    domainAssociation.setDomainAssociationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("domainName", targetDepth)) {
                    context.nextToken();
                    domainAssociation.setDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("enableAutoSubDomain", targetDepth)) {
                    context.nextToken();
                    domainAssociation.setEnableAutoSubDomain(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("domainStatus", targetDepth)) {
                    context.nextToken();
                    domainAssociation.setDomainStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusReason", targetDepth)) {
                    context.nextToken();
                    domainAssociation.setStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("certificateVerificationDNSRecord", targetDepth)) {
                    context.nextToken();
                    domainAssociation.setCertificateVerificationDNSRecord(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subDomains", targetDepth)) {
                    context.nextToken();
                    domainAssociation.setSubDomains(new ListUnmarshaller<SubDomain>(SubDomainJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return domainAssociation;
    }

    private static DomainAssociationJsonUnmarshaller instance;

    public static DomainAssociationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DomainAssociationJsonUnmarshaller();
        return instance;
    }
}
