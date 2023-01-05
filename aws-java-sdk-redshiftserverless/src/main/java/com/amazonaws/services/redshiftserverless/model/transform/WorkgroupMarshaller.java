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
 * WorkgroupMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WorkgroupMarshaller {

    private static final MarshallingInfo<Integer> BASECAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("baseCapacity").build();
    private static final MarshallingInfo<List> CONFIGPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configParameters").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationDate").timestampFormat("iso8601").build();
    private static final MarshallingInfo<StructuredPojo> ENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endpoint").build();
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
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<List> SUBNETIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("subnetIds").build();
    private static final MarshallingInfo<String> WORKGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workgroupArn").build();
    private static final MarshallingInfo<String> WORKGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workgroupId").build();
    private static final MarshallingInfo<String> WORKGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workgroupName").build();

    private static final WorkgroupMarshaller instance = new WorkgroupMarshaller();

    public static WorkgroupMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Workgroup workgroup, ProtocolMarshaller protocolMarshaller) {

        if (workgroup == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(workgroup.getBaseCapacity(), BASECAPACITY_BINDING);
            protocolMarshaller.marshall(workgroup.getConfigParameters(), CONFIGPARAMETERS_BINDING);
            protocolMarshaller.marshall(workgroup.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(workgroup.getEndpoint(), ENDPOINT_BINDING);
            protocolMarshaller.marshall(workgroup.getEnhancedVpcRouting(), ENHANCEDVPCROUTING_BINDING);
            protocolMarshaller.marshall(workgroup.getNamespaceName(), NAMESPACENAME_BINDING);
            protocolMarshaller.marshall(workgroup.getPort(), PORT_BINDING);
            protocolMarshaller.marshall(workgroup.getPubliclyAccessible(), PUBLICLYACCESSIBLE_BINDING);
            protocolMarshaller.marshall(workgroup.getSecurityGroupIds(), SECURITYGROUPIDS_BINDING);
            protocolMarshaller.marshall(workgroup.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(workgroup.getSubnetIds(), SUBNETIDS_BINDING);
            protocolMarshaller.marshall(workgroup.getWorkgroupArn(), WORKGROUPARN_BINDING);
            protocolMarshaller.marshall(workgroup.getWorkgroupId(), WORKGROUPID_BINDING);
            protocolMarshaller.marshall(workgroup.getWorkgroupName(), WORKGROUPNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
