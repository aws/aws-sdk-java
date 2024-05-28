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
 * AssetListing JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetListingJsonUnmarshaller implements Unmarshaller<AssetListing, JsonUnmarshallerContext> {

    public AssetListing unmarshall(JsonUnmarshallerContext context) throws Exception {
        AssetListing assetListing = new AssetListing();

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
                if (context.testExpression("assetId", targetDepth)) {
                    context.nextToken();
                    assetListing.setAssetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assetRevision", targetDepth)) {
                    context.nextToken();
                    assetListing.setAssetRevision(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assetType", targetDepth)) {
                    context.nextToken();
                    assetListing.setAssetType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    assetListing.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("forms", targetDepth)) {
                    context.nextToken();
                    assetListing.setForms(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("glossaryTerms", targetDepth)) {
                    context.nextToken();
                    assetListing.setGlossaryTerms(new ListUnmarshaller<DetailedGlossaryTerm>(DetailedGlossaryTermJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("latestTimeSeriesDataPointForms", targetDepth)) {
                    context.nextToken();
                    assetListing.setLatestTimeSeriesDataPointForms(new ListUnmarshaller<TimeSeriesDataPointSummaryFormOutput>(
                            TimeSeriesDataPointSummaryFormOutputJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("owningProjectId", targetDepth)) {
                    context.nextToken();
                    assetListing.setOwningProjectId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return assetListing;
    }

    private static AssetListingJsonUnmarshaller instance;

    public static AssetListingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssetListingJsonUnmarshaller();
        return instance;
    }
}
