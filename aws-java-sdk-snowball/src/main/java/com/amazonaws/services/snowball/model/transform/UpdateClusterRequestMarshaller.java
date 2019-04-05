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
package com.amazonaws.services.snowball.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.snowball.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateClusterRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateClusterRequestMarshaller {

    private static final MarshallingInfo<String> CLUSTERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ClusterId").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleARN").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Resources").build();
    private static final MarshallingInfo<String> ADDRESSID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AddressId").build();
    private static final MarshallingInfo<String> SHIPPINGOPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ShippingOption").build();
    private static final MarshallingInfo<StructuredPojo> NOTIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Notification").build();
    private static final MarshallingInfo<String> FORWARDINGADDRESSID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ForwardingAddressId").build();

    private static final UpdateClusterRequestMarshaller instance = new UpdateClusterRequestMarshaller();

    public static UpdateClusterRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateClusterRequest updateClusterRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateClusterRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateClusterRequest.getClusterId(), CLUSTERID_BINDING);
            protocolMarshaller.marshall(updateClusterRequest.getRoleARN(), ROLEARN_BINDING);
            protocolMarshaller.marshall(updateClusterRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateClusterRequest.getResources(), RESOURCES_BINDING);
            protocolMarshaller.marshall(updateClusterRequest.getAddressId(), ADDRESSID_BINDING);
            protocolMarshaller.marshall(updateClusterRequest.getShippingOption(), SHIPPINGOPTION_BINDING);
            protocolMarshaller.marshall(updateClusterRequest.getNotification(), NOTIFICATION_BINDING);
            protocolMarshaller.marshall(updateClusterRequest.getForwardingAddressId(), FORWARDINGADDRESSID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
