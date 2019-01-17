/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.backup.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.backup.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BackupPlanTemplatesListMemberMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BackupPlanTemplatesListMemberMarshaller {

    private static final MarshallingInfo<String> BACKUPPLANTEMPLATEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupPlanTemplateId").build();
    private static final MarshallingInfo<String> BACKUPPLANTEMPLATENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupPlanTemplateName").build();

    private static final BackupPlanTemplatesListMemberMarshaller instance = new BackupPlanTemplatesListMemberMarshaller();

    public static BackupPlanTemplatesListMemberMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BackupPlanTemplatesListMember backupPlanTemplatesListMember, ProtocolMarshaller protocolMarshaller) {

        if (backupPlanTemplatesListMember == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(backupPlanTemplatesListMember.getBackupPlanTemplateId(), BACKUPPLANTEMPLATEID_BINDING);
            protocolMarshaller.marshall(backupPlanTemplatesListMember.getBackupPlanTemplateName(), BACKUPPLANTEMPLATENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
