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
 * SourceServerMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SourceServerMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<StructuredPojo> DATAREPLICATIONINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataReplicationInfo").build();
    private static final MarshallingInfo<String> LASTLAUNCHRESULT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastLaunchResult").build();
    private static final MarshallingInfo<StructuredPojo> LIFECYCLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lifeCycle").build();
    private static final MarshallingInfo<String> RECOVERYINSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recoveryInstanceId").build();
    private static final MarshallingInfo<String> REPLICATIONDIRECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("replicationDirection").build();
    private static final MarshallingInfo<String> REVERSEDDIRECTIONSOURCESERVERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("reversedDirectionSourceServerArn").build();
    private static final MarshallingInfo<StructuredPojo> SOURCECLOUDPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceCloudProperties").build();
    private static final MarshallingInfo<StructuredPojo> SOURCEPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceProperties").build();
    private static final MarshallingInfo<String> SOURCESERVERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceServerID").build();
    private static final MarshallingInfo<StructuredPojo> STAGINGAREA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stagingArea").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final SourceServerMarshaller instance = new SourceServerMarshaller();

    public static SourceServerMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SourceServer sourceServer, ProtocolMarshaller protocolMarshaller) {

        if (sourceServer == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sourceServer.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(sourceServer.getDataReplicationInfo(), DATAREPLICATIONINFO_BINDING);
            protocolMarshaller.marshall(sourceServer.getLastLaunchResult(), LASTLAUNCHRESULT_BINDING);
            protocolMarshaller.marshall(sourceServer.getLifeCycle(), LIFECYCLE_BINDING);
            protocolMarshaller.marshall(sourceServer.getRecoveryInstanceId(), RECOVERYINSTANCEID_BINDING);
            protocolMarshaller.marshall(sourceServer.getReplicationDirection(), REPLICATIONDIRECTION_BINDING);
            protocolMarshaller.marshall(sourceServer.getReversedDirectionSourceServerArn(), REVERSEDDIRECTIONSOURCESERVERARN_BINDING);
            protocolMarshaller.marshall(sourceServer.getSourceCloudProperties(), SOURCECLOUDPROPERTIES_BINDING);
            protocolMarshaller.marshall(sourceServer.getSourceProperties(), SOURCEPROPERTIES_BINDING);
            protocolMarshaller.marshall(sourceServer.getSourceServerID(), SOURCESERVERID_BINDING);
            protocolMarshaller.marshall(sourceServer.getStagingArea(), STAGINGAREA_BINDING);
            protocolMarshaller.marshall(sourceServer.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
