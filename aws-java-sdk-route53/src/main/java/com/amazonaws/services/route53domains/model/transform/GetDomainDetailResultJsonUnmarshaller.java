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
package com.amazonaws.services.route53domains.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.route53domains.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetDomainDetailResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDomainDetailResultJsonUnmarshaller implements Unmarshaller<GetDomainDetailResult, JsonUnmarshallerContext> {

    public GetDomainDetailResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetDomainDetailResult getDomainDetailResult = new GetDomainDetailResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getDomainDetailResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("DomainName", targetDepth)) {
                    context.nextToken();
                    getDomainDetailResult.setDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Nameservers", targetDepth)) {
                    context.nextToken();
                    getDomainDetailResult.setNameservers(new ListUnmarshaller<Nameserver>(NameserverJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("AutoRenew", targetDepth)) {
                    context.nextToken();
                    getDomainDetailResult.setAutoRenew(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("AdminContact", targetDepth)) {
                    context.nextToken();
                    getDomainDetailResult.setAdminContact(ContactDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RegistrantContact", targetDepth)) {
                    context.nextToken();
                    getDomainDetailResult.setRegistrantContact(ContactDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TechContact", targetDepth)) {
                    context.nextToken();
                    getDomainDetailResult.setTechContact(ContactDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AdminPrivacy", targetDepth)) {
                    context.nextToken();
                    getDomainDetailResult.setAdminPrivacy(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RegistrantPrivacy", targetDepth)) {
                    context.nextToken();
                    getDomainDetailResult.setRegistrantPrivacy(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("TechPrivacy", targetDepth)) {
                    context.nextToken();
                    getDomainDetailResult.setTechPrivacy(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RegistrarName", targetDepth)) {
                    context.nextToken();
                    getDomainDetailResult.setRegistrarName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WhoIsServer", targetDepth)) {
                    context.nextToken();
                    getDomainDetailResult.setWhoIsServer(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RegistrarUrl", targetDepth)) {
                    context.nextToken();
                    getDomainDetailResult.setRegistrarUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AbuseContactEmail", targetDepth)) {
                    context.nextToken();
                    getDomainDetailResult.setAbuseContactEmail(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AbuseContactPhone", targetDepth)) {
                    context.nextToken();
                    getDomainDetailResult.setAbuseContactPhone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RegistryDomainId", targetDepth)) {
                    context.nextToken();
                    getDomainDetailResult.setRegistryDomainId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    context.nextToken();
                    getDomainDetailResult.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("UpdatedDate", targetDepth)) {
                    context.nextToken();
                    getDomainDetailResult.setUpdatedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ExpirationDate", targetDepth)) {
                    context.nextToken();
                    getDomainDetailResult.setExpirationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Reseller", targetDepth)) {
                    context.nextToken();
                    getDomainDetailResult.setReseller(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DnsSec", targetDepth)) {
                    context.nextToken();
                    getDomainDetailResult.setDnsSec(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusList", targetDepth)) {
                    context.nextToken();
                    getDomainDetailResult.setStatusList(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getDomainDetailResult;
    }

    private static GetDomainDetailResultJsonUnmarshaller instance;

    public static GetDomainDetailResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDomainDetailResultJsonUnmarshaller();
        return instance;
    }
}
