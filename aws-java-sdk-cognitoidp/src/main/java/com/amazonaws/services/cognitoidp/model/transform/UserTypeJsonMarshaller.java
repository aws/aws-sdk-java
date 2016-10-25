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

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidp.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * UserTypeMarshaller
 */
public class UserTypeJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(UserType userType, StructuredJsonGenerator jsonGenerator) {

        if (userType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (userType.getUsername() != null) {
                jsonGenerator.writeFieldName("Username").writeValue(userType.getUsername());
            }

            java.util.List<AttributeType> attributesList = userType.getAttributes();
            if (attributesList != null) {
                jsonGenerator.writeFieldName("Attributes");
                jsonGenerator.writeStartArray();
                for (AttributeType attributesListValue : attributesList) {
                    if (attributesListValue != null) {

                        AttributeTypeJsonMarshaller.getInstance().marshall(attributesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (userType.getUserCreateDate() != null) {
                jsonGenerator.writeFieldName("UserCreateDate").writeValue(userType.getUserCreateDate());
            }
            if (userType.getUserLastModifiedDate() != null) {
                jsonGenerator.writeFieldName("UserLastModifiedDate").writeValue(userType.getUserLastModifiedDate());
            }
            if (userType.getEnabled() != null) {
                jsonGenerator.writeFieldName("Enabled").writeValue(userType.getEnabled());
            }
            if (userType.getUserStatus() != null) {
                jsonGenerator.writeFieldName("UserStatus").writeValue(userType.getUserStatus());
            }

            java.util.List<MFAOptionType> mFAOptionsList = userType.getMFAOptions();
            if (mFAOptionsList != null) {
                jsonGenerator.writeFieldName("MFAOptions");
                jsonGenerator.writeStartArray();
                for (MFAOptionType mFAOptionsListValue : mFAOptionsList) {
                    if (mFAOptionsListValue != null) {

                        MFAOptionTypeJsonMarshaller.getInstance().marshall(mFAOptionsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static UserTypeJsonMarshaller instance;

    public static UserTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserTypeJsonMarshaller();
        return instance;
    }

}
