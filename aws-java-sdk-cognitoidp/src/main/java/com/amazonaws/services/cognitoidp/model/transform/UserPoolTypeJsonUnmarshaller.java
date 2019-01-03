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
package com.amazonaws.services.cognitoidp.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cognitoidp.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UserPoolType JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserPoolTypeJsonUnmarshaller implements Unmarshaller<UserPoolType, JsonUnmarshallerContext> {

    public UserPoolType unmarshall(JsonUnmarshallerContext context) throws Exception {
        UserPoolType userPoolType = new UserPoolType();

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
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    userPoolType.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    userPoolType.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Policies", targetDepth)) {
                    context.nextToken();
                    userPoolType.setPolicies(UserPoolPolicyTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LambdaConfig", targetDepth)) {
                    context.nextToken();
                    userPoolType.setLambdaConfig(LambdaConfigTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    userPoolType.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedDate", targetDepth)) {
                    context.nextToken();
                    userPoolType.setLastModifiedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    context.nextToken();
                    userPoolType.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("SchemaAttributes", targetDepth)) {
                    context.nextToken();
                    userPoolType.setSchemaAttributes(new ListUnmarshaller<SchemaAttributeType>(SchemaAttributeTypeJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("AutoVerifiedAttributes", targetDepth)) {
                    context.nextToken();
                    userPoolType.setAutoVerifiedAttributes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("AliasAttributes", targetDepth)) {
                    context.nextToken();
                    userPoolType.setAliasAttributes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("UsernameAttributes", targetDepth)) {
                    context.nextToken();
                    userPoolType.setUsernameAttributes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("SmsVerificationMessage", targetDepth)) {
                    context.nextToken();
                    userPoolType.setSmsVerificationMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EmailVerificationMessage", targetDepth)) {
                    context.nextToken();
                    userPoolType.setEmailVerificationMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EmailVerificationSubject", targetDepth)) {
                    context.nextToken();
                    userPoolType.setEmailVerificationSubject(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VerificationMessageTemplate", targetDepth)) {
                    context.nextToken();
                    userPoolType.setVerificationMessageTemplate(VerificationMessageTemplateTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SmsAuthenticationMessage", targetDepth)) {
                    context.nextToken();
                    userPoolType.setSmsAuthenticationMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MfaConfiguration", targetDepth)) {
                    context.nextToken();
                    userPoolType.setMfaConfiguration(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceConfiguration", targetDepth)) {
                    context.nextToken();
                    userPoolType.setDeviceConfiguration(DeviceConfigurationTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EstimatedNumberOfUsers", targetDepth)) {
                    context.nextToken();
                    userPoolType.setEstimatedNumberOfUsers(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("EmailConfiguration", targetDepth)) {
                    context.nextToken();
                    userPoolType.setEmailConfiguration(EmailConfigurationTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SmsConfiguration", targetDepth)) {
                    context.nextToken();
                    userPoolType.setSmsConfiguration(SmsConfigurationTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("UserPoolTags", targetDepth)) {
                    context.nextToken();
                    userPoolType.setUserPoolTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("SmsConfigurationFailure", targetDepth)) {
                    context.nextToken();
                    userPoolType.setSmsConfigurationFailure(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EmailConfigurationFailure", targetDepth)) {
                    context.nextToken();
                    userPoolType.setEmailConfigurationFailure(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Domain", targetDepth)) {
                    context.nextToken();
                    userPoolType.setDomain(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CustomDomain", targetDepth)) {
                    context.nextToken();
                    userPoolType.setCustomDomain(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AdminCreateUserConfig", targetDepth)) {
                    context.nextToken();
                    userPoolType.setAdminCreateUserConfig(AdminCreateUserConfigTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("UserPoolAddOns", targetDepth)) {
                    context.nextToken();
                    userPoolType.setUserPoolAddOns(UserPoolAddOnsTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    userPoolType.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return userPoolType;
    }

    private static UserPoolTypeJsonUnmarshaller instance;

    public static UserPoolTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UserPoolTypeJsonUnmarshaller();
        return instance;
    }
}
