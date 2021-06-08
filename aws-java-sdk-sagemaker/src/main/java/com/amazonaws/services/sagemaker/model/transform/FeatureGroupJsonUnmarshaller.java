/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * FeatureGroup JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FeatureGroupJsonUnmarshaller implements Unmarshaller<FeatureGroup, JsonUnmarshallerContext> {

    public FeatureGroup unmarshall(JsonUnmarshallerContext context) throws Exception {
        FeatureGroup featureGroup = new FeatureGroup();

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
                if (context.testExpression("FeatureGroupArn", targetDepth)) {
                    context.nextToken();
                    featureGroup.setFeatureGroupArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FeatureGroupName", targetDepth)) {
                    context.nextToken();
                    featureGroup.setFeatureGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecordIdentifierFeatureName", targetDepth)) {
                    context.nextToken();
                    featureGroup.setRecordIdentifierFeatureName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EventTimeFeatureName", targetDepth)) {
                    context.nextToken();
                    featureGroup.setEventTimeFeatureName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FeatureDefinitions", targetDepth)) {
                    context.nextToken();
                    featureGroup.setFeatureDefinitions(new ListUnmarshaller<FeatureDefinition>(FeatureDefinitionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    featureGroup.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("OnlineStoreConfig", targetDepth)) {
                    context.nextToken();
                    featureGroup.setOnlineStoreConfig(OnlineStoreConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OfflineStoreConfig", targetDepth)) {
                    context.nextToken();
                    featureGroup.setOfflineStoreConfig(OfflineStoreConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    featureGroup.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FeatureGroupStatus", targetDepth)) {
                    context.nextToken();
                    featureGroup.setFeatureGroupStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OfflineStoreStatus", targetDepth)) {
                    context.nextToken();
                    featureGroup.setOfflineStoreStatus(OfflineStoreStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    featureGroup.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    featureGroup.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    featureGroup.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return featureGroup;
    }

    private static FeatureGroupJsonUnmarshaller instance;

    public static FeatureGroupJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FeatureGroupJsonUnmarshaller();
        return instance;
    }
}
