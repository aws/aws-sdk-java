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
package com.amazonaws.services.opensearchserverless.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opensearchserverless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SamlConfigOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SamlConfigOptionsMarshaller {

    private static final MarshallingInfo<String> GROUPATTRIBUTE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("groupAttribute").build();
    private static final MarshallingInfo<String> METADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("metadata").build();
    private static final MarshallingInfo<Integer> SESSIONTIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sessionTimeout").build();
    private static final MarshallingInfo<String> USERATTRIBUTE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userAttribute").build();

    private static final SamlConfigOptionsMarshaller instance = new SamlConfigOptionsMarshaller();

    public static SamlConfigOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SamlConfigOptions samlConfigOptions, ProtocolMarshaller protocolMarshaller) {

        if (samlConfigOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(samlConfigOptions.getGroupAttribute(), GROUPATTRIBUTE_BINDING);
            protocolMarshaller.marshall(samlConfigOptions.getMetadata(), METADATA_BINDING);
            protocolMarshaller.marshall(samlConfigOptions.getSessionTimeout(), SESSIONTIMEOUT_BINDING);
            protocolMarshaller.marshall(samlConfigOptions.getUserAttribute(), USERATTRIBUTE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
