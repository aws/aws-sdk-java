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
package com.amazonaws.services.kendra.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kendra.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutPrincipalMappingRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutPrincipalMappingRequestMarshaller {

    private static final MarshallingInfo<String> INDEXID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IndexId").build();
    private static final MarshallingInfo<String> DATASOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataSourceId").build();
    private static final MarshallingInfo<String> GROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GroupId").build();
    private static final MarshallingInfo<StructuredPojo> GROUPMEMBERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GroupMembers").build();
    private static final MarshallingInfo<Long> ORDERINGID_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OrderingId").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();

    private static final PutPrincipalMappingRequestMarshaller instance = new PutPrincipalMappingRequestMarshaller();

    public static PutPrincipalMappingRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutPrincipalMappingRequest putPrincipalMappingRequest, ProtocolMarshaller protocolMarshaller) {

        if (putPrincipalMappingRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putPrincipalMappingRequest.getIndexId(), INDEXID_BINDING);
            protocolMarshaller.marshall(putPrincipalMappingRequest.getDataSourceId(), DATASOURCEID_BINDING);
            protocolMarshaller.marshall(putPrincipalMappingRequest.getGroupId(), GROUPID_BINDING);
            protocolMarshaller.marshall(putPrincipalMappingRequest.getGroupMembers(), GROUPMEMBERS_BINDING);
            protocolMarshaller.marshall(putPrincipalMappingRequest.getOrderingId(), ORDERINGID_BINDING);
            protocolMarshaller.marshall(putPrincipalMappingRequest.getRoleArn(), ROLEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
