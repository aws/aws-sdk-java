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
package com.amazonaws.services.securityhub.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsBackupBackupPlanAdvancedBackupSettingsDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsBackupBackupPlanAdvancedBackupSettingsDetailsMarshaller {

    private static final MarshallingInfo<Map> BACKUPOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BackupOptions").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceType").build();

    private static final AwsBackupBackupPlanAdvancedBackupSettingsDetailsMarshaller instance = new AwsBackupBackupPlanAdvancedBackupSettingsDetailsMarshaller();

    public static AwsBackupBackupPlanAdvancedBackupSettingsDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsBackupBackupPlanAdvancedBackupSettingsDetails awsBackupBackupPlanAdvancedBackupSettingsDetails,
            ProtocolMarshaller protocolMarshaller) {

        if (awsBackupBackupPlanAdvancedBackupSettingsDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsBackupBackupPlanAdvancedBackupSettingsDetails.getBackupOptions(), BACKUPOPTIONS_BINDING);
            protocolMarshaller.marshall(awsBackupBackupPlanAdvancedBackupSettingsDetails.getResourceType(), RESOURCETYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
