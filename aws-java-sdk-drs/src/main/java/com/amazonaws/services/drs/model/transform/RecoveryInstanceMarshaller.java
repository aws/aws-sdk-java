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
package com.amazonaws.services.drs.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.drs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RecoveryInstanceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RecoveryInstanceMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<StructuredPojo> DATAREPLICATIONINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataReplicationInfo").build();
    private static final MarshallingInfo<String> EC2INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ec2InstanceID").build();
    private static final MarshallingInfo<String> EC2INSTANCESTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ec2InstanceState").build();
    private static final MarshallingInfo<StructuredPojo> FAILBACK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failback").build();
    private static final MarshallingInfo<Boolean> ISDRILL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("isDrill").build();
    private static final MarshallingInfo<String> JOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobID").build();
    private static final MarshallingInfo<String> ORIGINENVIRONMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("originEnvironment").build();
    private static final MarshallingInfo<String> POINTINTIMESNAPSHOTDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pointInTimeSnapshotDateTime").build();
    private static final MarshallingInfo<String> RECOVERYINSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recoveryInstanceID").build();
    private static final MarshallingInfo<StructuredPojo> RECOVERYINSTANCEPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recoveryInstanceProperties").build();
    private static final MarshallingInfo<String> SOURCESERVERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceServerID").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final RecoveryInstanceMarshaller instance = new RecoveryInstanceMarshaller();

    public static RecoveryInstanceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RecoveryInstance recoveryInstance, ProtocolMarshaller protocolMarshaller) {

        if (recoveryInstance == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(recoveryInstance.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(recoveryInstance.getDataReplicationInfo(), DATAREPLICATIONINFO_BINDING);
            protocolMarshaller.marshall(recoveryInstance.getEc2InstanceID(), EC2INSTANCEID_BINDING);
            protocolMarshaller.marshall(recoveryInstance.getEc2InstanceState(), EC2INSTANCESTATE_BINDING);
            protocolMarshaller.marshall(recoveryInstance.getFailback(), FAILBACK_BINDING);
            protocolMarshaller.marshall(recoveryInstance.getIsDrill(), ISDRILL_BINDING);
            protocolMarshaller.marshall(recoveryInstance.getJobID(), JOBID_BINDING);
            protocolMarshaller.marshall(recoveryInstance.getOriginEnvironment(), ORIGINENVIRONMENT_BINDING);
            protocolMarshaller.marshall(recoveryInstance.getPointInTimeSnapshotDateTime(), POINTINTIMESNAPSHOTDATETIME_BINDING);
            protocolMarshaller.marshall(recoveryInstance.getRecoveryInstanceID(), RECOVERYINSTANCEID_BINDING);
            protocolMarshaller.marshall(recoveryInstance.getRecoveryInstanceProperties(), RECOVERYINSTANCEPROPERTIES_BINDING);
            protocolMarshaller.marshall(recoveryInstance.getSourceServerID(), SOURCESERVERID_BINDING);
            protocolMarshaller.marshall(recoveryInstance.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
