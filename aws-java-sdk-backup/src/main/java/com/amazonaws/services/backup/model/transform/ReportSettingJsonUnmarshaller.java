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
package com.amazonaws.services.backup.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.backup.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ReportSetting JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportSettingJsonUnmarshaller implements Unmarshaller<ReportSetting, JsonUnmarshallerContext> {

    public ReportSetting unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReportSetting reportSetting = new ReportSetting();

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
                if (context.testExpression("ReportTemplate", targetDepth)) {
                    context.nextToken();
                    reportSetting.setReportTemplate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FrameworkArns", targetDepth)) {
                    context.nextToken();
                    reportSetting.setFrameworkArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("NumberOfFrameworks", targetDepth)) {
                    context.nextToken();
                    reportSetting.setNumberOfFrameworks(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Accounts", targetDepth)) {
                    context.nextToken();
                    reportSetting.setAccounts(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("OrganizationUnits", targetDepth)) {
                    context.nextToken();
                    reportSetting.setOrganizationUnits(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Regions", targetDepth)) {
                    context.nextToken();
                    reportSetting.setRegions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return reportSetting;
    }

    private static ReportSettingJsonUnmarshaller instance;

    public static ReportSettingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReportSettingJsonUnmarshaller();
        return instance;
    }
}
