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
package com.amazonaws.services.redshiftserverless.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.redshiftserverless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateWorkgroupRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateWorkgroupRequestMarshaller {

    private static final MarshallingInfo<Integer> BASECAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("baseCapacity").build();
    private static final MarshallingInfo<List> CONFIGPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configParameters").build();
    private static final MarshallingInfo<Boolean> ENHANCEDVPCROUTING_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enhancedVpcRouting").build();
    private static final MarshallingInfo<String> NAMESPACENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("namespaceName").build();
    private static final MarshallingInfo<Integer> PORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("port").build();
    private static final MarshallingInfo<Boolean> PUBLICLYACCESSIBLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("publiclyAccessible").build();
    private static final MarshallingInfo<List> SECURITYGROUPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("securityGroupIds").build();
    private static final MarshallingInfo<List> SUBNETIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("subnetIds").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> WORKGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workgroupName").build();

    private static final CreateWorkgroupRequestMarshaller instance = new CreateWorkgroupRequestMarshaller();

    public static CreateWorkgroupRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateWorkgroupRequest createWorkgroupRequest, ProtocolMarshaller protocolMarshaller) {

        if (createWorkgroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createWorkgroupRequest.getBaseCapacity(), BASECAPACITY_BINDING);
            protocolMarshaller.marshall(createWorkgroupRequest.getConfigParameters(), CONFIGPARAMETERS_BINDING);
            protocolMarshaller.marshall(createWorkgroupRequest.getEnhancedVpcRouting(), ENHANCEDVPCROUTING_BINDING);
            protocolMarshaller.marshall(createWorkgroupRequest.getNamespaceName(), NAMESPACENAME_BINDING);
            protocolMarshaller.marshall(createWorkgroupRequest.getPort(), PORT_BINDING);
            protocolMarshaller.marshall(createWorkgroupRequest.getPubliclyAccessible(), PUBLICLYACCESSIBLE_BINDING);
            protocolMarshaller.marshall(createWorkgroupRequest.getSecurityGroupIds(), SECURITYGROUPIDS_BINDING);
            protocolMarshaller.marshall(createWorkgroupRequest.getSubnetIds(), SUBNETIDS_BINDING);
            protocolMarshaller.marshall(createWorkgroupRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createWorkgroupRequest.getWorkgroupName(), WORKGROUPNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
