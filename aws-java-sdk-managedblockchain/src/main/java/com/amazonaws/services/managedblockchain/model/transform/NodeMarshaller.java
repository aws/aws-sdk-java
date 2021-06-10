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
package com.amazonaws.services.managedblockchain.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.managedblockchain.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NodeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NodeMarshaller {

    private static final MarshallingInfo<String> NETWORKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NetworkId").build();
    private static final MarshallingInfo<String> MEMBERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MemberId").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceType").build();
    private static final MarshallingInfo<String> AVAILABILITYZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailabilityZone").build();
    private static final MarshallingInfo<StructuredPojo> FRAMEWORKATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FrameworkAttributes").build();
    private static final MarshallingInfo<StructuredPojo> LOGPUBLISHINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LogPublishingConfiguration").build();
    private static final MarshallingInfo<String> STATEDB_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StateDB").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationDate").timestampFormat("iso8601").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> KMSKEYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyArn").build();

    private static final NodeMarshaller instance = new NodeMarshaller();

    public static NodeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Node node, ProtocolMarshaller protocolMarshaller) {

        if (node == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(node.getNetworkId(), NETWORKID_BINDING);
            protocolMarshaller.marshall(node.getMemberId(), MEMBERID_BINDING);
            protocolMarshaller.marshall(node.getId(), ID_BINDING);
            protocolMarshaller.marshall(node.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(node.getAvailabilityZone(), AVAILABILITYZONE_BINDING);
            protocolMarshaller.marshall(node.getFrameworkAttributes(), FRAMEWORKATTRIBUTES_BINDING);
            protocolMarshaller.marshall(node.getLogPublishingConfiguration(), LOGPUBLISHINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(node.getStateDB(), STATEDB_BINDING);
            protocolMarshaller.marshall(node.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(node.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(node.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(node.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(node.getKmsKeyArn(), KMSKEYARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
