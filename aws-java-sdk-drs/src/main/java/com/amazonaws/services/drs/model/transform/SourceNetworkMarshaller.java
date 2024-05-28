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
package com.amazonaws.services.drs.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.drs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SourceNetworkMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SourceNetworkMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> CFNSTACKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cfnStackName").build();
    private static final MarshallingInfo<StructuredPojo> LASTRECOVERY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastRecovery").build();
    private static final MarshallingInfo<String> LAUNCHEDVPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("launchedVpcID").build();
    private static final MarshallingInfo<String> REPLICATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("replicationStatus").build();
    private static final MarshallingInfo<String> REPLICATIONSTATUSDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("replicationStatusDetails").build();
    private static final MarshallingInfo<String> SOURCEACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceAccountID").build();
    private static final MarshallingInfo<String> SOURCENETWORKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceNetworkID").build();
    private static final MarshallingInfo<String> SOURCEREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceRegion").build();
    private static final MarshallingInfo<String> SOURCEVPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceVpcID").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final SourceNetworkMarshaller instance = new SourceNetworkMarshaller();

    public static SourceNetworkMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SourceNetwork sourceNetwork, ProtocolMarshaller protocolMarshaller) {

        if (sourceNetwork == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sourceNetwork.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(sourceNetwork.getCfnStackName(), CFNSTACKNAME_BINDING);
            protocolMarshaller.marshall(sourceNetwork.getLastRecovery(), LASTRECOVERY_BINDING);
            protocolMarshaller.marshall(sourceNetwork.getLaunchedVpcID(), LAUNCHEDVPCID_BINDING);
            protocolMarshaller.marshall(sourceNetwork.getReplicationStatus(), REPLICATIONSTATUS_BINDING);
            protocolMarshaller.marshall(sourceNetwork.getReplicationStatusDetails(), REPLICATIONSTATUSDETAILS_BINDING);
            protocolMarshaller.marshall(sourceNetwork.getSourceAccountID(), SOURCEACCOUNTID_BINDING);
            protocolMarshaller.marshall(sourceNetwork.getSourceNetworkID(), SOURCENETWORKID_BINDING);
            protocolMarshaller.marshall(sourceNetwork.getSourceRegion(), SOURCEREGION_BINDING);
            protocolMarshaller.marshall(sourceNetwork.getSourceVpcID(), SOURCEVPCID_BINDING);
            protocolMarshaller.marshall(sourceNetwork.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
