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
package com.amazonaws.services.workmail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.workmail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeUserResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeUserResultJsonUnmarshaller implements Unmarshaller<DescribeUserResult, JsonUnmarshallerContext> {

    public DescribeUserResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeUserResult describeUserResult = new DescribeUserResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeUserResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("UserId", targetDepth)) {
                    context.nextToken();
                    describeUserResult.setUserId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    describeUserResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Email", targetDepth)) {
                    context.nextToken();
                    describeUserResult.setEmail(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisplayName", targetDepth)) {
                    context.nextToken();
                    describeUserResult.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    describeUserResult.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserRole", targetDepth)) {
                    context.nextToken();
                    describeUserResult.setUserRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EnabledDate", targetDepth)) {
                    context.nextToken();
                    describeUserResult.setEnabledDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DisabledDate", targetDepth)) {
                    context.nextToken();
                    describeUserResult.setDisabledDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("MailboxProvisionedDate", targetDepth)) {
                    context.nextToken();
                    describeUserResult.setMailboxProvisionedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("MailboxDeprovisionedDate", targetDepth)) {
                    context.nextToken();
                    describeUserResult.setMailboxDeprovisionedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FirstName", targetDepth)) {
                    context.nextToken();
                    describeUserResult.setFirstName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastName", targetDepth)) {
                    context.nextToken();
                    describeUserResult.setLastName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HiddenFromGlobalAddressList", targetDepth)) {
                    context.nextToken();
                    describeUserResult.setHiddenFromGlobalAddressList(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Initials", targetDepth)) {
                    context.nextToken();
                    describeUserResult.setInitials(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Telephone", targetDepth)) {
                    context.nextToken();
                    describeUserResult.setTelephone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Street", targetDepth)) {
                    context.nextToken();
                    describeUserResult.setStreet(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobTitle", targetDepth)) {
                    context.nextToken();
                    describeUserResult.setJobTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("City", targetDepth)) {
                    context.nextToken();
                    describeUserResult.setCity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Company", targetDepth)) {
                    context.nextToken();
                    describeUserResult.setCompany(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ZipCode", targetDepth)) {
                    context.nextToken();
                    describeUserResult.setZipCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Department", targetDepth)) {
                    context.nextToken();
                    describeUserResult.setDepartment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Country", targetDepth)) {
                    context.nextToken();
                    describeUserResult.setCountry(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Office", targetDepth)) {
                    context.nextToken();
                    describeUserResult.setOffice(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeUserResult;
    }

    private static DescribeUserResultJsonUnmarshaller instance;

    public static DescribeUserResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeUserResultJsonUnmarshaller();
        return instance;
    }
}
