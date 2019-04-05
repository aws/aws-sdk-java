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
package com.amazonaws.services.clouddirectory.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.clouddirectory.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BatchListOutgoingTypedLinks JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchListOutgoingTypedLinksJsonUnmarshaller implements Unmarshaller<BatchListOutgoingTypedLinks, JsonUnmarshallerContext> {

    public BatchListOutgoingTypedLinks unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchListOutgoingTypedLinks batchListOutgoingTypedLinks = new BatchListOutgoingTypedLinks();

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
                if (context.testExpression("ObjectReference", targetDepth)) {
                    context.nextToken();
                    batchListOutgoingTypedLinks.setObjectReference(ObjectReferenceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FilterAttributeRanges", targetDepth)) {
                    context.nextToken();
                    batchListOutgoingTypedLinks.setFilterAttributeRanges(new ListUnmarshaller<TypedLinkAttributeRange>(TypedLinkAttributeRangeJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("FilterTypedLink", targetDepth)) {
                    context.nextToken();
                    batchListOutgoingTypedLinks.setFilterTypedLink(TypedLinkSchemaAndFacetNameJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NextToken", targetDepth)) {
                    context.nextToken();
                    batchListOutgoingTypedLinks.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxResults", targetDepth)) {
                    context.nextToken();
                    batchListOutgoingTypedLinks.setMaxResults(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return batchListOutgoingTypedLinks;
    }

    private static BatchListOutgoingTypedLinksJsonUnmarshaller instance;

    public static BatchListOutgoingTypedLinksJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchListOutgoingTypedLinksJsonUnmarshaller();
        return instance;
    }
}
