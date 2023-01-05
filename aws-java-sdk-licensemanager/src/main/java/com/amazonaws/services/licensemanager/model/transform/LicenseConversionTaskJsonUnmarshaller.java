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
 * LicenseConversionTask JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LicenseConversionTaskJsonUnmarshaller implements Unmarshaller<LicenseConversionTask, JsonUnmarshallerContext> {

    public LicenseConversionTask unmarshall(JsonUnmarshallerContext context) throws Exception {
        LicenseConversionTask licenseConversionTask = new LicenseConversionTask();

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
                if (context.testExpression("LicenseConversionTaskId", targetDepth)) {
                    context.nextToken();
                    licenseConversionTask.setLicenseConversionTaskId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceArn", targetDepth)) {
                    context.nextToken();
                    licenseConversionTask.setResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceLicenseContext", targetDepth)) {
                    context.nextToken();
                    licenseConversionTask.setSourceLicenseContext(LicenseConversionContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DestinationLicenseContext", targetDepth)) {
                    context.nextToken();
                    licenseConversionTask.setDestinationLicenseContext(LicenseConversionContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    licenseConversionTask.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    context.nextToken();
                    licenseConversionTask.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    licenseConversionTask.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LicenseConversionTime", targetDepth)) {
                    context.nextToken();
                    licenseConversionTask.setLicenseConversionTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    context.nextToken();
                    licenseConversionTask.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return licenseConversionTask;
    }

    private static LicenseConversionTaskJsonUnmarshaller instance;

    public static LicenseConversionTaskJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LicenseConversionTaskJsonUnmarshaller();
        return instance;
    }
}
