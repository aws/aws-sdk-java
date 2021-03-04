/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.eventbridge.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.eventbridge.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateConnectionApiKeyAuthRequestParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateConnectionApiKeyAuthRequestParametersMarshaller {

    private static final MarshallingInfo<String> APIKEYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApiKeyName").build();
    private static final MarshallingInfo<String> APIKEYVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApiKeyValue").build();

    private static final UpdateConnectionApiKeyAuthRequestParametersMarshaller instance = new UpdateConnectionApiKeyAuthRequestParametersMarshaller();

    public static UpdateConnectionApiKeyAuthRequestParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateConnectionApiKeyAuthRequestParameters updateConnectionApiKeyAuthRequestParameters, ProtocolMarshaller protocolMarshaller) {

        if (updateConnectionApiKeyAuthRequestParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateConnectionApiKeyAuthRequestParameters.getApiKeyName(), APIKEYNAME_BINDING);
            protocolMarshaller.marshall(updateConnectionApiKeyAuthRequestParameters.getApiKeyValue(), APIKEYVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
