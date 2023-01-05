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
package com.amazonaws.services.licensemanager.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.licensemanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetLicenseConversionTaskResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLicenseConversionTaskResultJsonUnmarshaller implements Unmarshaller<GetLicenseConversionTaskResult, JsonUnmarshallerContext> {

    public GetLicenseConversionTaskResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetLicenseConversionTaskResult getLicenseConversionTaskResult = new GetLicenseConversionTaskResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getLicenseConversionTaskResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("LicenseConversionTaskId", targetDepth)) {
                    context.nextToken();
                    getLicenseConversionTaskResult.setLicenseConversionTaskId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceArn", targetDepth)) {
                    context.nextToken();
                    getLicenseConversionTaskResult.setResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceLicenseContext", targetDepth)) {
                    context.nextToken();
                    getLicenseConversionTaskResult.setSourceLicenseContext(LicenseConversionContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DestinationLicenseContext", targetDepth)) {
                    context.nextToken();
                    getLicenseConversionTaskResult.setDestinationLicenseContext(LicenseConversionContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    context.nextToken();
                    getLicenseConversionTaskResult.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    getLicenseConversionTaskResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    getLicenseConversionTaskResult.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LicenseConversionTime", targetDepth)) {
                    context.nextToken();
                    getLicenseConversionTaskResult.setLicenseConversionTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    context.nextToken();
                    getLicenseConversionTaskResult.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getLicenseConversionTaskResult;
    }

    private static GetLicenseConversionTaskResultJsonUnmarshaller instance;

    public static GetLicenseConversionTaskResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetLicenseConversionTaskResultJsonUnmarshaller();
        return instance;
    }
}
