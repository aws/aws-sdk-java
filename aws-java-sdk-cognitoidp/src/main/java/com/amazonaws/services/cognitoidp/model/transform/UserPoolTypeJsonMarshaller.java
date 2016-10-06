/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.cognitoidp.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * UserPoolTypeMarshaller
 */
public class UserPoolTypeJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(UserPoolType userPoolType, StructuredJsonGenerator jsonGenerator) {

        if (userPoolType == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (userPoolType.getId() != null) {
                jsonGenerator.writeFieldName("Id").writeValue(userPoolType.getId());
            }
            if (userPoolType.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(userPoolType.getName());
            }
            if (userPoolType.getPolicies() != null) {
                jsonGenerator.writeFieldName("Policies");
                UserPoolPolicyTypeJsonMarshaller.getInstance().marshall(userPoolType.getPolicies(), jsonGenerator);
            }
            if (userPoolType.getLambdaConfig() != null) {
                jsonGenerator.writeFieldName("LambdaConfig");
                LambdaConfigTypeJsonMarshaller.getInstance().marshall(userPoolType.getLambdaConfig(), jsonGenerator);
            }
            if (userPoolType.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(userPoolType.getStatus());
            }
            if (userPoolType.getLastModifiedDate() != null) {
                jsonGenerator.writeFieldName("LastModifiedDate").writeValue(userPoolType.getLastModifiedDate());
            }
            if (userPoolType.getCreationDate() != null) {
                jsonGenerator.writeFieldName("CreationDate").writeValue(userPoolType.getCreationDate());
            }

            java.util.List<SchemaAttributeType> schemaAttributesList = userPoolType.getSchemaAttributes();
            if (schemaAttributesList != null) {
                jsonGenerator.writeFieldName("SchemaAttributes");
                jsonGenerator.writeStartArray();
                for (SchemaAttributeType schemaAttributesListValue : schemaAttributesList) {
                    if (schemaAttributesListValue != null) {

                        SchemaAttributeTypeJsonMarshaller.getInstance().marshall(schemaAttributesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> autoVerifiedAttributesList = userPoolType.getAutoVerifiedAttributes();
            if (autoVerifiedAttributesList != null) {
                jsonGenerator.writeFieldName("AutoVerifiedAttributes");
                jsonGenerator.writeStartArray();
                for (String autoVerifiedAttributesListValue : autoVerifiedAttributesList) {
                    if (autoVerifiedAttributesListValue != null) {
                        jsonGenerator.writeValue(autoVerifiedAttributesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> aliasAttributesList = userPoolType.getAliasAttributes();
            if (aliasAttributesList != null) {
                jsonGenerator.writeFieldName("AliasAttributes");
                jsonGenerator.writeStartArray();
                for (String aliasAttributesListValue : aliasAttributesList) {
                    if (aliasAttributesListValue != null) {
                        jsonGenerator.writeValue(aliasAttributesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (userPoolType.getSmsVerificationMessage() != null) {
                jsonGenerator.writeFieldName("SmsVerificationMessage").writeValue(userPoolType.getSmsVerificationMessage());
            }
            if (userPoolType.getEmailVerificationMessage() != null) {
                jsonGenerator.writeFieldName("EmailVerificationMessage").writeValue(userPoolType.getEmailVerificationMessage());
            }
            if (userPoolType.getEmailVerificationSubject() != null) {
                jsonGenerator.writeFieldName("EmailVerificationSubject").writeValue(userPoolType.getEmailVerificationSubject());
            }
            if (userPoolType.getSmsAuthenticationMessage() != null) {
                jsonGenerator.writeFieldName("SmsAuthenticationMessage").writeValue(userPoolType.getSmsAuthenticationMessage());
            }
            if (userPoolType.getMfaConfiguration() != null) {
                jsonGenerator.writeFieldName("MfaConfiguration").writeValue(userPoolType.getMfaConfiguration());
            }
            if (userPoolType.getDeviceConfiguration() != null) {
                jsonGenerator.writeFieldName("DeviceConfiguration");
                DeviceConfigurationTypeJsonMarshaller.getInstance().marshall(userPoolType.getDeviceConfiguration(), jsonGenerator);
            }
            if (userPoolType.getEstimatedNumberOfUsers() != null) {
                jsonGenerator.writeFieldName("EstimatedNumberOfUsers").writeValue(userPoolType.getEstimatedNumberOfUsers());
            }
            if (userPoolType.getEmailConfiguration() != null) {
                jsonGenerator.writeFieldName("EmailConfiguration");
                EmailConfigurationTypeJsonMarshaller.getInstance().marshall(userPoolType.getEmailConfiguration(), jsonGenerator);
            }
            if (userPoolType.getSmsConfiguration() != null) {
                jsonGenerator.writeFieldName("SmsConfiguration");
                SmsConfigurationTypeJsonMarshaller.getInstance().marshall(userPoolType.getSmsConfiguration(), jsonGenerator);
            }
            if (userPoolType.getSmsConfigurationFailure() != null) {
                jsonGenerator.writeFieldName("SmsConfigurationFailure").writeValue(userPoolType.getSmsConfigurationFailure());
            }
            if (userPoolType.getEmailConfigurationFailure() != null) {
                jsonGenerator.writeFieldName("EmailConfigurationFailure").writeValue(userPoolType.getEmailConfigurationFailure());
            }
            if (userPoolType.getAdminCreateUserConfig() != null) {
                jsonGenerator.writeFieldName("AdminCreateUserConfig");
                AdminCreateUserConfigTypeJsonMarshaller.getInstance().marshall(userPoolType.getAdminCreateUserConfig(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static UserPoolTypeJsonMarshaller instance;

    public static UserPoolTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserPoolTypeJsonMarshaller();
        return instance;
    }

}
