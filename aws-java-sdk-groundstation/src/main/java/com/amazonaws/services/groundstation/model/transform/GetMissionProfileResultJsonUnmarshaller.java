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
package com.amazonaws.services.groundstation.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.groundstation.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetMissionProfileResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMissionProfileResultJsonUnmarshaller implements Unmarshaller<GetMissionProfileResult, JsonUnmarshallerContext> {

    public GetMissionProfileResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetMissionProfileResult getMissionProfileResult = new GetMissionProfileResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getMissionProfileResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("contactPostPassDurationSeconds", targetDepth)) {
                    context.nextToken();
                    getMissionProfileResult.setContactPostPassDurationSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("contactPrePassDurationSeconds", targetDepth)) {
                    context.nextToken();
                    getMissionProfileResult.setContactPrePassDurationSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("dataflowEdges", targetDepth)) {
                    context.nextToken();
                    getMissionProfileResult.setDataflowEdges(new ListUnmarshaller<java.util.List<String>>(new ListUnmarshaller<String>(context
                            .getUnmarshaller(String.class))).unmarshall(context));
                }
                if (context.testExpression("minimumViableContactDurationSeconds", targetDepth)) {
                    context.nextToken();
                    getMissionProfileResult.setMinimumViableContactDurationSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("missionProfileArn", targetDepth)) {
                    context.nextToken();
                    getMissionProfileResult.setMissionProfileArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("missionProfileId", targetDepth)) {
                    context.nextToken();
                    getMissionProfileResult.setMissionProfileId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    getMissionProfileResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("region", targetDepth)) {
                    context.nextToken();
                    getMissionProfileResult.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    getMissionProfileResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("trackingConfigArn", targetDepth)) {
                    context.nextToken();
                    getMissionProfileResult.setTrackingConfigArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getMissionProfileResult;
    }

    private static GetMissionProfileResultJsonUnmarshaller instance;

    public static GetMissionProfileResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetMissionProfileResultJsonUnmarshaller();
        return instance;
    }
}
