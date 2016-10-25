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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ActivationMarshaller
 */
public class ActivationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Activation activation, StructuredJsonGenerator jsonGenerator) {

        if (activation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (activation.getActivationId() != null) {
                jsonGenerator.writeFieldName("ActivationId").writeValue(activation.getActivationId());
            }
            if (activation.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(activation.getDescription());
            }
            if (activation.getDefaultInstanceName() != null) {
                jsonGenerator.writeFieldName("DefaultInstanceName").writeValue(activation.getDefaultInstanceName());
            }
            if (activation.getIamRole() != null) {
                jsonGenerator.writeFieldName("IamRole").writeValue(activation.getIamRole());
            }
            if (activation.getRegistrationLimit() != null) {
                jsonGenerator.writeFieldName("RegistrationLimit").writeValue(activation.getRegistrationLimit());
            }
            if (activation.getRegistrationsCount() != null) {
                jsonGenerator.writeFieldName("RegistrationsCount").writeValue(activation.getRegistrationsCount());
            }
            if (activation.getExpirationDate() != null) {
                jsonGenerator.writeFieldName("ExpirationDate").writeValue(activation.getExpirationDate());
            }
            if (activation.getExpired() != null) {
                jsonGenerator.writeFieldName("Expired").writeValue(activation.getExpired());
            }
            if (activation.getCreatedDate() != null) {
                jsonGenerator.writeFieldName("CreatedDate").writeValue(activation.getCreatedDate());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ActivationJsonMarshaller instance;

    public static ActivationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ActivationJsonMarshaller();
        return instance;
    }

}
