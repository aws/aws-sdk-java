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
package com.amazonaws.services.managedblockchain.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.managedblockchain.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Proposal JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProposalJsonUnmarshaller implements Unmarshaller<Proposal, JsonUnmarshallerContext> {

    public Proposal unmarshall(JsonUnmarshallerContext context) throws Exception {
        Proposal proposal = new Proposal();

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
                if (context.testExpression("ProposalId", targetDepth)) {
                    context.nextToken();
                    proposal.setProposalId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NetworkId", targetDepth)) {
                    context.nextToken();
                    proposal.setNetworkId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    proposal.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Actions", targetDepth)) {
                    context.nextToken();
                    proposal.setActions(ProposalActionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ProposedByMemberId", targetDepth)) {
                    context.nextToken();
                    proposal.setProposedByMemberId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProposedByMemberName", targetDepth)) {
                    context.nextToken();
                    proposal.setProposedByMemberName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    proposal.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    context.nextToken();
                    proposal.setCreationDate(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("ExpirationDate", targetDepth)) {
                    context.nextToken();
                    proposal.setExpirationDate(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("YesVoteCount", targetDepth)) {
                    context.nextToken();
                    proposal.setYesVoteCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("NoVoteCount", targetDepth)) {
                    context.nextToken();
                    proposal.setNoVoteCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("OutstandingVoteCount", targetDepth)) {
                    context.nextToken();
                    proposal.setOutstandingVoteCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return proposal;
    }

    private static ProposalJsonUnmarshaller instance;

    public static ProposalJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProposalJsonUnmarshaller();
        return instance;
    }
}
