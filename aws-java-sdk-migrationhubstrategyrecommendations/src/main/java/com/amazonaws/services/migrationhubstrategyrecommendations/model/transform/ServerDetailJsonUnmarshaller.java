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
package com.amazonaws.services.migrationhubstrategyrecommendations.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.migrationhubstrategyrecommendations.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ServerDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerDetailJsonUnmarshaller implements Unmarshaller<ServerDetail, JsonUnmarshallerContext> {

    public ServerDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        ServerDetail serverDetail = new ServerDetail();

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
                if (context.testExpression("antipatternReportS3Object", targetDepth)) {
                    context.nextToken();
                    serverDetail.setAntipatternReportS3Object(S3ObjectJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("antipatternReportStatus", targetDepth)) {
                    context.nextToken();
                    serverDetail.setAntipatternReportStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("antipatternReportStatusMessage", targetDepth)) {
                    context.nextToken();
                    serverDetail.setAntipatternReportStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("applicationComponentStrategySummary", targetDepth)) {
                    context.nextToken();
                    serverDetail.setApplicationComponentStrategySummary(new ListUnmarshaller<StrategySummary>(StrategySummaryJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("dataCollectionStatus", targetDepth)) {
                    context.nextToken();
                    serverDetail.setDataCollectionStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    serverDetail.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastAnalyzedTimestamp", targetDepth)) {
                    context.nextToken();
                    serverDetail.setLastAnalyzedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("listAntipatternSeveritySummary", targetDepth)) {
                    context.nextToken();
                    serverDetail.setListAntipatternSeveritySummary(new ListUnmarshaller<AntipatternSeveritySummary>(AntipatternSeveritySummaryJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    serverDetail.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("recommendationSet", targetDepth)) {
                    context.nextToken();
                    serverDetail.setRecommendationSet(RecommendationSetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("serverError", targetDepth)) {
                    context.nextToken();
                    serverDetail.setServerError(ServerErrorJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("serverType", targetDepth)) {
                    context.nextToken();
                    serverDetail.setServerType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusMessage", targetDepth)) {
                    context.nextToken();
                    serverDetail.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("systemInfo", targetDepth)) {
                    context.nextToken();
                    serverDetail.setSystemInfo(SystemInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return serverDetail;
    }

    private static ServerDetailJsonUnmarshaller instance;

    public static ServerDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServerDetailJsonUnmarshaller();
        return instance;
    }
}
