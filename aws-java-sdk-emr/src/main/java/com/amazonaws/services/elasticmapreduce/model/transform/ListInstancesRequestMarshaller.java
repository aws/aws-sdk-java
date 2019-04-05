/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListInstancesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListInstancesRequestMarshaller {

    private static final MarshallingInfo<String> CLUSTERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ClusterId").build();
    private static final MarshallingInfo<String> INSTANCEGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceGroupId").build();
    private static final MarshallingInfo<List> INSTANCEGROUPTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceGroupTypes").build();
    private static final MarshallingInfo<String> INSTANCEFLEETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceFleetId").build();
    private static final MarshallingInfo<String> INSTANCEFLEETTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceFleetType").build();
    private static final MarshallingInfo<List> INSTANCESTATES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceStates").build();
    private static final MarshallingInfo<String> MARKER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Marker").build();

    private static final ListInstancesRequestMarshaller instance = new ListInstancesRequestMarshaller();

    public static ListInstancesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListInstancesRequest listInstancesRequest, ProtocolMarshaller protocolMarshaller) {

        if (listInstancesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listInstancesRequest.getClusterId(), CLUSTERID_BINDING);
            protocolMarshaller.marshall(listInstancesRequest.getInstanceGroupId(), INSTANCEGROUPID_BINDING);
            protocolMarshaller.marshall(listInstancesRequest.getInstanceGroupTypes(), INSTANCEGROUPTYPES_BINDING);
            protocolMarshaller.marshall(listInstancesRequest.getInstanceFleetId(), INSTANCEFLEETID_BINDING);
            protocolMarshaller.marshall(listInstancesRequest.getInstanceFleetType(), INSTANCEFLEETTYPE_BINDING);
            protocolMarshaller.marshall(listInstancesRequest.getInstanceStates(), INSTANCESTATES_BINDING);
            protocolMarshaller.marshall(listInstancesRequest.getMarker(), MARKER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
