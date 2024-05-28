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
 * SnaplockConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SnaplockConfigurationMarshaller {

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

    private static final SnaplockConfigurationMarshaller instance = new SnaplockConfigurationMarshaller();

    public static SnaplockConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SnaplockConfiguration snaplockConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (snaplockConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(snaplockConfiguration.getAuditLogVolume(), AUDITLOGVOLUME_BINDING);
            protocolMarshaller.marshall(snaplockConfiguration.getAutocommitPeriod(), AUTOCOMMITPERIOD_BINDING);
            protocolMarshaller.marshall(snaplockConfiguration.getPrivilegedDelete(), PRIVILEGEDDELETE_BINDING);
            protocolMarshaller.marshall(snaplockConfiguration.getRetentionPeriod(), RETENTIONPERIOD_BINDING);
            protocolMarshaller.marshall(snaplockConfiguration.getSnaplockType(), SNAPLOCKTYPE_BINDING);
            protocolMarshaller.marshall(snaplockConfiguration.getVolumeAppendModeEnabled(), VOLUMEAPPENDMODEENABLED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
