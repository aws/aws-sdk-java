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
 * AwsCloudFormationStackDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsCloudFormationStackDetailsMarshaller {

    private static final MarshallingInfo<List> CAPABILITIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Capabilities").build();
    private static final MarshallingInfo<String> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<Boolean> DISABLEROLLBACK_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisableRollback").build();
    private static final MarshallingInfo<StructuredPojo> DRIFTINFORMATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DriftInformation").build();
    private static final MarshallingInfo<Boolean> ENABLETERMINATIONPROTECTION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableTerminationProtection").build();
    private static final MarshallingInfo<String> LASTUPDATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdatedTime").build();
    private static final MarshallingInfo<List> NOTIFICATIONARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotificationArns").build();
    private static final MarshallingInfo<List> OUTPUTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Outputs").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();
    private static final MarshallingInfo<String> STACKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StackId").build();
    private static final MarshallingInfo<String> STACKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StackName").build();
    private static final MarshallingInfo<String> STACKSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StackStatus").build();
    private static final MarshallingInfo<String> STACKSTATUSREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StackStatusReason").build();
    private static final MarshallingInfo<Integer> TIMEOUTINMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeoutInMinutes").build();

    private static final AwsCloudFormationStackDetailsMarshaller instance = new AwsCloudFormationStackDetailsMarshaller();

    public static AwsCloudFormationStackDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsCloudFormationStackDetails awsCloudFormationStackDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsCloudFormationStackDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsCloudFormationStackDetails.getCapabilities(), CAPABILITIES_BINDING);
            protocolMarshaller.marshall(awsCloudFormationStackDetails.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(awsCloudFormationStackDetails.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(awsCloudFormationStackDetails.getDisableRollback(), DISABLEROLLBACK_BINDING);
            protocolMarshaller.marshall(awsCloudFormationStackDetails.getDriftInformation(), DRIFTINFORMATION_BINDING);
            protocolMarshaller.marshall(awsCloudFormationStackDetails.getEnableTerminationProtection(), ENABLETERMINATIONPROTECTION_BINDING);
            protocolMarshaller.marshall(awsCloudFormationStackDetails.getLastUpdatedTime(), LASTUPDATEDTIME_BINDING);
            protocolMarshaller.marshall(awsCloudFormationStackDetails.getNotificationArns(), NOTIFICATIONARNS_BINDING);
            protocolMarshaller.marshall(awsCloudFormationStackDetails.getOutputs(), OUTPUTS_BINDING);
            protocolMarshaller.marshall(awsCloudFormationStackDetails.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(awsCloudFormationStackDetails.getStackId(), STACKID_BINDING);
            protocolMarshaller.marshall(awsCloudFormationStackDetails.getStackName(), STACKNAME_BINDING);
            protocolMarshaller.marshall(awsCloudFormationStackDetails.getStackStatus(), STACKSTATUS_BINDING);
            protocolMarshaller.marshall(awsCloudFormationStackDetails.getStackStatusReason(), STACKSTATUSREASON_BINDING);
            protocolMarshaller.marshall(awsCloudFormationStackDetails.getTimeoutInMinutes(), TIMEOUTINMINUTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
