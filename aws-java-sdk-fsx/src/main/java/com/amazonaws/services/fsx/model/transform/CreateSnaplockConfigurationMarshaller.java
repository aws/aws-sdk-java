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
package com.amazonaws.services.fsx.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fsx.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateSnaplockConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateSnaplockConfigurationMarshaller {

    private static final MarshallingInfo<Boolean> AUDITLOGVOLUME_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuditLogVolume").build();
    private static final MarshallingInfo<StructuredPojo> AUTOCOMMITPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutocommitPeriod").build();
    private static final MarshallingInfo<String> PRIVILEGEDDELETE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrivilegedDelete").build();
    private static final MarshallingInfo<StructuredPojo> RETENTIONPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetentionPeriod").build();
    private static final MarshallingInfo<String> SNAPLOCKTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnaplockType").build();
    private static final MarshallingInfo<Boolean> VOLUMEAPPENDMODEENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VolumeAppendModeEnabled").build();

    private static final CreateSnaplockConfigurationMarshaller instance = new CreateSnaplockConfigurationMarshaller();

    public static CreateSnaplockConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateSnaplockConfiguration createSnaplockConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (createSnaplockConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createSnaplockConfiguration.getAuditLogVolume(), AUDITLOGVOLUME_BINDING);
            protocolMarshaller.marshall(createSnaplockConfiguration.getAutocommitPeriod(), AUTOCOMMITPERIOD_BINDING);
            protocolMarshaller.marshall(createSnaplockConfiguration.getPrivilegedDelete(), PRIVILEGEDDELETE_BINDING);
            protocolMarshaller.marshall(createSnaplockConfiguration.getRetentionPeriod(), RETENTIONPERIOD_BINDING);
            protocolMarshaller.marshall(createSnaplockConfiguration.getSnaplockType(), SNAPLOCKTYPE_BINDING);
            protocolMarshaller.marshall(createSnaplockConfiguration.getVolumeAppendModeEnabled(), VOLUMEAPPENDMODEENABLED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
