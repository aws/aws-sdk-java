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
package com.amazonaws.services.route53resolver.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.route53resolver.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ResolverQueryLogConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ResolverQueryLogConfigMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> OWNERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OwnerId").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> SHARESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ShareStatus").build();
    private static final MarshallingInfo<Integer> ASSOCIATIONCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociationCount").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESTINATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationArn").build();
    private static final MarshallingInfo<String> CREATORREQUESTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatorRequestId").build();
    private static final MarshallingInfo<String> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").build();

    private static final ResolverQueryLogConfigMarshaller instance = new ResolverQueryLogConfigMarshaller();

    public static ResolverQueryLogConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ResolverQueryLogConfig resolverQueryLogConfig, ProtocolMarshaller protocolMarshaller) {

        if (resolverQueryLogConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(resolverQueryLogConfig.getId(), ID_BINDING);
            protocolMarshaller.marshall(resolverQueryLogConfig.getOwnerId(), OWNERID_BINDING);
            protocolMarshaller.marshall(resolverQueryLogConfig.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(resolverQueryLogConfig.getShareStatus(), SHARESTATUS_BINDING);
            protocolMarshaller.marshall(resolverQueryLogConfig.getAssociationCount(), ASSOCIATIONCOUNT_BINDING);
            protocolMarshaller.marshall(resolverQueryLogConfig.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(resolverQueryLogConfig.getName(), NAME_BINDING);
            protocolMarshaller.marshall(resolverQueryLogConfig.getDestinationArn(), DESTINATIONARN_BINDING);
            protocolMarshaller.marshall(resolverQueryLogConfig.getCreatorRequestId(), CREATORREQUESTID_BINDING);
            protocolMarshaller.marshall(resolverQueryLogConfig.getCreationTime(), CREATIONTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
