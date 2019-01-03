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
package com.amazonaws.services.kinesisanalytics.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisanalytics.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ApplicationDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationDetailJsonUnmarshaller implements Unmarshaller<ApplicationDetail, JsonUnmarshallerContext> {

    public ApplicationDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        ApplicationDetail applicationDetail = new ApplicationDetail();

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
                if (context.testExpression("ApplicationName", targetDepth)) {
                    context.nextToken();
                    applicationDetail.setApplicationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ApplicationDescription", targetDepth)) {
                    context.nextToken();
                    applicationDetail.setApplicationDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ApplicationARN", targetDepth)) {
                    context.nextToken();
                    applicationDetail.setApplicationARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ApplicationStatus", targetDepth)) {
                    context.nextToken();
                    applicationDetail.setApplicationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreateTimestamp", targetDepth)) {
                    context.nextToken();
                    applicationDetail.setCreateTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdateTimestamp", targetDepth)) {
                    context.nextToken();
                    applicationDetail.setLastUpdateTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("InputDescriptions", targetDepth)) {
                    context.nextToken();
                    applicationDetail.setInputDescriptions(new ListUnmarshaller<InputDescription>(InputDescriptionJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("OutputDescriptions", targetDepth)) {
                    context.nextToken();
                    applicationDetail.setOutputDescriptions(new ListUnmarshaller<OutputDescription>(OutputDescriptionJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ReferenceDataSourceDescriptions", targetDepth)) {
                    context.nextToken();
                    applicationDetail.setReferenceDataSourceDescriptions(new ListUnmarshaller<ReferenceDataSourceDescription>(
                            ReferenceDataSourceDescriptionJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("CloudWatchLoggingOptionDescriptions", targetDepth)) {
                    context.nextToken();
                    applicationDetail.setCloudWatchLoggingOptionDescriptions(new ListUnmarshaller<CloudWatchLoggingOptionDescription>(
                            CloudWatchLoggingOptionDescriptionJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ApplicationCode", targetDepth)) {
                    context.nextToken();
                    applicationDetail.setApplicationCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ApplicationVersionId", targetDepth)) {
                    context.nextToken();
                    applicationDetail.setApplicationVersionId(context.getUnmarshaller(Long.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return applicationDetail;
    }

    private static ApplicationDetailJsonUnmarshaller instance;

    public static ApplicationDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ApplicationDetailJsonUnmarshaller();
        return instance;
    }
}
