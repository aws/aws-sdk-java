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
 * AuthenticationResultTypeMarshaller
 */
public class AuthenticationResultTypeJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(AuthenticationResultType authenticationResultType, StructuredJsonGenerator jsonGenerator) {

        if (authenticationResultType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (authenticationResultType.getAccessToken() != null) {
                jsonGenerator.writeFieldName("AccessToken").writeValue(authenticationResultType.getAccessToken());
            }
            if (authenticationResultType.getExpiresIn() != null) {
                jsonGenerator.writeFieldName("ExpiresIn").writeValue(authenticationResultType.getExpiresIn());
            }
            if (authenticationResultType.getTokenType() != null) {
                jsonGenerator.writeFieldName("TokenType").writeValue(authenticationResultType.getTokenType());
            }
            if (authenticationResultType.getRefreshToken() != null) {
                jsonGenerator.writeFieldName("RefreshToken").writeValue(authenticationResultType.getRefreshToken());
            }
            if (authenticationResultType.getIdToken() != null) {
                jsonGenerator.writeFieldName("IdToken").writeValue(authenticationResultType.getIdToken());
            }
            if (authenticationResultType.getNewDeviceMetadata() != null) {
                jsonGenerator.writeFieldName("NewDeviceMetadata");
                NewDeviceMetadataTypeJsonMarshaller.getInstance().marshall(authenticationResultType.getNewDeviceMetadata(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AuthenticationResultTypeJsonMarshaller instance;

    public static AuthenticationResultTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AuthenticationResultTypeJsonMarshaller();
        return instance;
    }

}
