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
 * CreateAssetResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAssetResultJsonUnmarshaller implements Unmarshaller<CreateAssetResult, JsonUnmarshallerContext> {

    public CreateAssetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateAssetResult createAssetResult = new CreateAssetResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createAssetResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    createAssetResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    context.nextToken();
                    createAssetResult.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    createAssetResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("domainId", targetDepth)) {
                    context.nextToken();
                    createAssetResult.setDomainId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("externalIdentifier", targetDepth)) {
                    context.nextToken();
                    createAssetResult.setExternalIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("firstRevisionCreatedAt", targetDepth)) {
                    context.nextToken();
                    createAssetResult.setFirstRevisionCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("firstRevisionCreatedBy", targetDepth)) {
                    context.nextToken();
                    createAssetResult.setFirstRevisionCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("formsOutput", targetDepth)) {
                    context.nextToken();
                    createAssetResult.setFormsOutput(new ListUnmarshaller<FormOutput>(FormOutputJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("glossaryTerms", targetDepth)) {
                    context.nextToken();
                    createAssetResult.setGlossaryTerms(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    createAssetResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("latestTimeSeriesDataPointFormsOutput", targetDepth)) {
                    context.nextToken();
                    createAssetResult.setLatestTimeSeriesDataPointFormsOutput(new ListUnmarshaller<TimeSeriesDataPointSummaryFormOutput>(
                            TimeSeriesDataPointSummaryFormOutputJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("listing", targetDepth)) {
                    context.nextToken();
                    createAssetResult.setListing(AssetListingDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    createAssetResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("owningProjectId", targetDepth)) {
                    context.nextToken();
                    createAssetResult.setOwningProjectId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("predictionConfiguration", targetDepth)) {
                    context.nextToken();
                    createAssetResult.setPredictionConfiguration(PredictionConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("readOnlyFormsOutput", targetDepth)) {
                    context.nextToken();
                    createAssetResult.setReadOnlyFormsOutput(new ListUnmarshaller<FormOutput>(FormOutputJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("revision", targetDepth)) {
                    context.nextToken();
                    createAssetResult.setRevision(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("typeIdentifier", targetDepth)) {
                    context.nextToken();
                    createAssetResult.setTypeIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("typeRevision", targetDepth)) {
                    context.nextToken();
                    createAssetResult.setTypeRevision(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createAssetResult;
    }

    private static CreateAssetResultJsonUnmarshaller instance;

    public static CreateAssetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateAssetResultJsonUnmarshaller();
        return instance;
    }
}
