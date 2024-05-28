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
package com.amazonaws.services.finspace.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.finspace.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetKxVolumeResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetKxVolumeResultJsonUnmarshaller implements Unmarshaller<GetKxVolumeResult, JsonUnmarshallerContext> {

    public GetKxVolumeResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetKxVolumeResult getKxVolumeResult = new GetKxVolumeResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getKxVolumeResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("environmentId", targetDepth)) {
                    context.nextToken();
                    getKxVolumeResult.setEnvironmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("volumeName", targetDepth)) {
                    context.nextToken();
                    getKxVolumeResult.setVolumeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("volumeType", targetDepth)) {
                    context.nextToken();
                    getKxVolumeResult.setVolumeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("volumeArn", targetDepth)) {
                    context.nextToken();
                    getKxVolumeResult.setVolumeArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nas1Configuration", targetDepth)) {
                    context.nextToken();
                    getKxVolumeResult.setNas1Configuration(KxNAS1ConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getKxVolumeResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusReason", targetDepth)) {
                    context.nextToken();
                    getKxVolumeResult.setStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdTimestamp", targetDepth)) {
                    context.nextToken();
                    getKxVolumeResult.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    getKxVolumeResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("azMode", targetDepth)) {
                    context.nextToken();
                    getKxVolumeResult.setAzMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("availabilityZoneIds", targetDepth)) {
                    context.nextToken();
                    getKxVolumeResult.setAvailabilityZoneIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("lastModifiedTimestamp", targetDepth)) {
                    context.nextToken();
                    getKxVolumeResult.setLastModifiedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("attachedClusters", targetDepth)) {
                    context.nextToken();
                    getKxVolumeResult.setAttachedClusters(new ListUnmarshaller<KxAttachedCluster>(KxAttachedClusterJsonUnmarshaller.getInstance())

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

        return getKxVolumeResult;
    }

    private static GetKxVolumeResultJsonUnmarshaller instance;

    public static GetKxVolumeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetKxVolumeResultJsonUnmarshaller();
        return instance;
    }
}
