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
package com.amazonaws.services.fsx.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fsx.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * WindowsAuditLogConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WindowsAuditLogConfigurationMarshaller {

    private static final MarshallingInfo<String> FILEACCESSAUDITLOGLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FileAccessAuditLogLevel").build();
    private static final MarshallingInfo<String> FILESHAREACCESSAUDITLOGLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FileShareAccessAuditLogLevel").build();
    private static final MarshallingInfo<String> AUDITLOGDESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuditLogDestination").build();

    private static final WindowsAuditLogConfigurationMarshaller instance = new WindowsAuditLogConfigurationMarshaller();

    public static WindowsAuditLogConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WindowsAuditLogConfiguration windowsAuditLogConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (windowsAuditLogConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(windowsAuditLogConfiguration.getFileAccessAuditLogLevel(), FILEACCESSAUDITLOGLEVEL_BINDING);
            protocolMarshaller.marshall(windowsAuditLogConfiguration.getFileShareAccessAuditLogLevel(), FILESHAREACCESSAUDITLOGLEVEL_BINDING);
            protocolMarshaller.marshall(windowsAuditLogConfiguration.getAuditLogDestination(), AUDITLOGDESTINATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
