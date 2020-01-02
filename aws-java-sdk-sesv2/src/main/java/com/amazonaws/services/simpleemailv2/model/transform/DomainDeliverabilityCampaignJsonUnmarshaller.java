/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemailv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simpleemailv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DomainDeliverabilityCampaign JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainDeliverabilityCampaignJsonUnmarshaller implements Unmarshaller<DomainDeliverabilityCampaign, JsonUnmarshallerContext> {

    public DomainDeliverabilityCampaign unmarshall(JsonUnmarshallerContext context) throws Exception {
        DomainDeliverabilityCampaign domainDeliverabilityCampaign = new DomainDeliverabilityCampaign();

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
                if (context.testExpression("CampaignId", targetDepth)) {
                    context.nextToken();
                    domainDeliverabilityCampaign.setCampaignId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImageUrl", targetDepth)) {
                    context.nextToken();
                    domainDeliverabilityCampaign.setImageUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Subject", targetDepth)) {
                    context.nextToken();
                    domainDeliverabilityCampaign.setSubject(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FromAddress", targetDepth)) {
                    context.nextToken();
                    domainDeliverabilityCampaign.setFromAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SendingIps", targetDepth)) {
                    context.nextToken();
                    domainDeliverabilityCampaign.setSendingIps(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("FirstSeenDateTime", targetDepth)) {
                    context.nextToken();
                    domainDeliverabilityCampaign.setFirstSeenDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastSeenDateTime", targetDepth)) {
                    context.nextToken();
                    domainDeliverabilityCampaign.setLastSeenDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("InboxCount", targetDepth)) {
                    context.nextToken();
                    domainDeliverabilityCampaign.setInboxCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("SpamCount", targetDepth)) {
                    context.nextToken();
                    domainDeliverabilityCampaign.setSpamCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ReadRate", targetDepth)) {
                    context.nextToken();
                    domainDeliverabilityCampaign.setReadRate(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("DeleteRate", targetDepth)) {
                    context.nextToken();
                    domainDeliverabilityCampaign.setDeleteRate(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("ReadDeleteRate", targetDepth)) {
                    context.nextToken();
                    domainDeliverabilityCampaign.setReadDeleteRate(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("ProjectedVolume", targetDepth)) {
                    context.nextToken();
                    domainDeliverabilityCampaign.setProjectedVolume(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Esps", targetDepth)) {
                    context.nextToken();
                    domainDeliverabilityCampaign.setEsps(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return domainDeliverabilityCampaign;
    }

    private static DomainDeliverabilityCampaignJsonUnmarshaller instance;

    public static DomainDeliverabilityCampaignJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DomainDeliverabilityCampaignJsonUnmarshaller();
        return instance;
    }
}
