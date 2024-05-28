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
package com.amazonaws.services.datazone.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.datazone.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetAssetResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAssetResultJsonUnmarshaller implements Unmarshaller<GetAssetResult, JsonUnmarshallerContext> {

    public GetAssetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetAssetResult getAssetResult = new GetAssetResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getAssetResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    getAssetResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    context.nextToken();
                    getAssetResult.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    getAssetResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("domainId", targetDepth)) {
                    context.nextToken();
                    getAssetResult.setDomainId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("externalIdentifier", targetDepth)) {
                    context.nextToken();
                    getAssetResult.setExternalIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("firstRevisionCreatedAt", targetDepth)) {
                    context.nextToken();
                    getAssetResult.setFirstRevisionCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("firstRevisionCreatedBy", targetDepth)) {
                    context.nextToken();
                    getAssetResult.setFirstRevisionCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("formsOutput", targetDepth)) {
                    context.nextToken();
                    getAssetResult.setFormsOutput(new ListUnmarshaller<FormOutput>(FormOutputJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("glossaryTerms", targetDepth)) {
                    context.nextToken();
                    getAssetResult.setGlossaryTerms(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    getAssetResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("latestTimeSeriesDataPointFormsOutput", targetDepth)) {
                    context.nextToken();
                    getAssetResult.setLatestTimeSeriesDataPointFormsOutput(new ListUnmarshaller<TimeSeriesDataPointSummaryFormOutput>(
                            TimeSeriesDataPointSummaryFormOutputJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("listing", targetDepth)) {
                    context.nextToken();
                    getAssetResult.setListing(AssetListingDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    getAssetResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("owningProjectId", targetDepth)) {
                    context.nextToken();
                    getAssetResult.setOwningProjectId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("readOnlyFormsOutput", targetDepth)) {
                    context.nextToken();
                    getAssetResult.setReadOnlyFormsOutput(new ListUnmarshaller<FormOutput>(FormOutputJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("revision", targetDepth)) {
                    context.nextToken();
                    getAssetResult.setRevision(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("typeIdentifier", targetDepth)) {
                    context.nextToken();
                    getAssetResult.setTypeIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("typeRevision", targetDepth)) {
                    context.nextToken();
                    getAssetResult.setTypeRevision(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getAssetResult;
    }

    private static GetAssetResultJsonUnmarshaller instance;

    public static GetAssetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetAssetResultJsonUnmarshaller();
        return instance;
    }
}
