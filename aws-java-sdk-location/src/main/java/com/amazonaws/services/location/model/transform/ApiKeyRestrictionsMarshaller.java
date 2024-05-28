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
package com.amazonaws.services.location.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.location.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ApiKeyRestrictionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ApiKeyRestrictionsMarshaller {

    private static final MarshallingInfo<List> ALLOWACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AllowActions").build();
    private static final MarshallingInfo<List> ALLOWREFERERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AllowReferers").build();
    private static final MarshallingInfo<List> ALLOWRESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllowResources").build();

    private static final ApiKeyRestrictionsMarshaller instance = new ApiKeyRestrictionsMarshaller();

    public static ApiKeyRestrictionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ApiKeyRestrictions apiKeyRestrictions, ProtocolMarshaller protocolMarshaller) {

        if (apiKeyRestrictions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(apiKeyRestrictions.getAllowActions(), ALLOWACTIONS_BINDING);
            protocolMarshaller.marshall(apiKeyRestrictions.getAllowReferers(), ALLOWREFERERS_BINDING);
            protocolMarshaller.marshall(apiKeyRestrictions.getAllowResources(), ALLOWRESOURCES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
