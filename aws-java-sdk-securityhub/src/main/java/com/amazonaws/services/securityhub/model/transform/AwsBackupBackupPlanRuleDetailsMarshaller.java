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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsBackupBackupPlanRuleDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsBackupBackupPlanRuleDetailsMarshaller {

    private static final MarshallingInfo<String> TARGETBACKUPVAULT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetBackupVault").build();
    private static final MarshallingInfo<Long> STARTWINDOWMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartWindowMinutes").build();
    private static final MarshallingInfo<String> SCHEDULEEXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScheduleExpression").build();
    private static final MarshallingInfo<String> RULENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RuleName").build();
    private static final MarshallingInfo<String> RULEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RuleId").build();
    private static final MarshallingInfo<Boolean> ENABLECONTINUOUSBACKUP_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableContinuousBackup").build();
    private static final MarshallingInfo<Long> COMPLETIONWINDOWMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompletionWindowMinutes").build();
    private static final MarshallingInfo<List> COPYACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CopyActions").build();
    private static final MarshallingInfo<StructuredPojo> LIFECYCLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Lifecycle").build();

    private static final AwsBackupBackupPlanRuleDetailsMarshaller instance = new AwsBackupBackupPlanRuleDetailsMarshaller();

    public static AwsBackupBackupPlanRuleDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsBackupBackupPlanRuleDetails awsBackupBackupPlanRuleDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsBackupBackupPlanRuleDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsBackupBackupPlanRuleDetails.getTargetBackupVault(), TARGETBACKUPVAULT_BINDING);
            protocolMarshaller.marshall(awsBackupBackupPlanRuleDetails.getStartWindowMinutes(), STARTWINDOWMINUTES_BINDING);
            protocolMarshaller.marshall(awsBackupBackupPlanRuleDetails.getScheduleExpression(), SCHEDULEEXPRESSION_BINDING);
            protocolMarshaller.marshall(awsBackupBackupPlanRuleDetails.getRuleName(), RULENAME_BINDING);
            protocolMarshaller.marshall(awsBackupBackupPlanRuleDetails.getRuleId(), RULEID_BINDING);
            protocolMarshaller.marshall(awsBackupBackupPlanRuleDetails.getEnableContinuousBackup(), ENABLECONTINUOUSBACKUP_BINDING);
            protocolMarshaller.marshall(awsBackupBackupPlanRuleDetails.getCompletionWindowMinutes(), COMPLETIONWINDOWMINUTES_BINDING);
            protocolMarshaller.marshall(awsBackupBackupPlanRuleDetails.getCopyActions(), COPYACTIONS_BINDING);
            protocolMarshaller.marshall(awsBackupBackupPlanRuleDetails.getLifecycle(), LIFECYCLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
