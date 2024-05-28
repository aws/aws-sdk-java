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
package com.amazonaws.services.networkfirewall.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.networkfirewall.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateTLSInspectionConfigurationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateTLSInspectionConfigurationRequestMarshaller {

    private static final MarshallingInfo<String> TLSINSPECTIONCONFIGURATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TLSInspectionConfigurationArn").build();
    private static final MarshallingInfo<String> TLSINSPECTIONCONFIGURATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TLSInspectionConfigurationName").build();
    private static final MarshallingInfo<StructuredPojo> TLSINSPECTIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TLSInspectionConfiguration").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionConfiguration").build();
    private static final MarshallingInfo<String> UPDATETOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdateToken").build();

    private static final UpdateTLSInspectionConfigurationRequestMarshaller instance = new UpdateTLSInspectionConfigurationRequestMarshaller();

    public static UpdateTLSInspectionConfigurationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateTLSInspectionConfigurationRequest updateTLSInspectionConfigurationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateTLSInspectionConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateTLSInspectionConfigurationRequest.getTLSInspectionConfigurationArn(), TLSINSPECTIONCONFIGURATIONARN_BINDING);
            protocolMarshaller.marshall(updateTLSInspectionConfigurationRequest.getTLSInspectionConfigurationName(), TLSINSPECTIONCONFIGURATIONNAME_BINDING);
            protocolMarshaller.marshall(updateTLSInspectionConfigurationRequest.getTLSInspectionConfiguration(), TLSINSPECTIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateTLSInspectionConfigurationRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateTLSInspectionConfigurationRequest.getEncryptionConfiguration(), ENCRYPTIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateTLSInspectionConfigurationRequest.getUpdateToken(), UPDATETOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
