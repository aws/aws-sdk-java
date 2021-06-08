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
package com.amazonaws.services.amplifybackend.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.amplifybackend.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BackendAPIResourceConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BackendAPIResourceConfigMarshaller {

    private static final MarshallingInfo<List> ADDITIONALAUTHTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("additionalAuthTypes").build();
    private static final MarshallingInfo<String> APINAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("apiName").build();
    private static final MarshallingInfo<StructuredPojo> CONFLICTRESOLUTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("conflictResolution").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTAUTHTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultAuthType").build();
    private static final MarshallingInfo<String> SERVICE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("service").build();
    private static final MarshallingInfo<String> TRANSFORMSCHEMA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transformSchema").build();

    private static final BackendAPIResourceConfigMarshaller instance = new BackendAPIResourceConfigMarshaller();

    public static BackendAPIResourceConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BackendAPIResourceConfig backendAPIResourceConfig, ProtocolMarshaller protocolMarshaller) {

        if (backendAPIResourceConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(backendAPIResourceConfig.getAdditionalAuthTypes(), ADDITIONALAUTHTYPES_BINDING);
            protocolMarshaller.marshall(backendAPIResourceConfig.getApiName(), APINAME_BINDING);
            protocolMarshaller.marshall(backendAPIResourceConfig.getConflictResolution(), CONFLICTRESOLUTION_BINDING);
            protocolMarshaller.marshall(backendAPIResourceConfig.getDefaultAuthType(), DEFAULTAUTHTYPE_BINDING);
            protocolMarshaller.marshall(backendAPIResourceConfig.getService(), SERVICE_BINDING);
            protocolMarshaller.marshall(backendAPIResourceConfig.getTransformSchema(), TRANSFORMSCHEMA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
