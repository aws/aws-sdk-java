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
package com.amazonaws.services.networkmanager.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.networkmanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Attachment JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttachmentJsonUnmarshaller implements Unmarshaller<Attachment, JsonUnmarshallerContext> {

    public Attachment unmarshall(JsonUnmarshallerContext context) throws Exception {
        Attachment attachment = new Attachment();

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
                if (context.testExpression("CoreNetworkId", targetDepth)) {
                    context.nextToken();
                    attachment.setCoreNetworkId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CoreNetworkArn", targetDepth)) {
                    context.nextToken();
                    attachment.setCoreNetworkArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AttachmentId", targetDepth)) {
                    context.nextToken();
                    attachment.setAttachmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OwnerAccountId", targetDepth)) {
                    context.nextToken();
                    attachment.setOwnerAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AttachmentType", targetDepth)) {
                    context.nextToken();
                    attachment.setAttachmentType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    attachment.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EdgeLocation", targetDepth)) {
                    context.nextToken();
                    attachment.setEdgeLocation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceArn", targetDepth)) {
                    context.nextToken();
                    attachment.setResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AttachmentPolicyRuleNumber", targetDepth)) {
                    context.nextToken();
                    attachment.setAttachmentPolicyRuleNumber(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SegmentName", targetDepth)) {
                    context.nextToken();
                    attachment.setSegmentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    attachment.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ProposedSegmentChange", targetDepth)) {
                    context.nextToken();
                    attachment.setProposedSegmentChange(ProposedSegmentChangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    attachment.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("UpdatedAt", targetDepth)) {
                    context.nextToken();
                    attachment.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return attachment;
    }

    private static AttachmentJsonUnmarshaller instance;

    public static AttachmentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AttachmentJsonUnmarshaller();
        return instance;
    }
}
