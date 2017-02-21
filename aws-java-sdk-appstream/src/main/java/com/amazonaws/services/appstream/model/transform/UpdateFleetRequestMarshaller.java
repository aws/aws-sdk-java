/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appstream.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appstream.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateFleetRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateFleetRequestMarshaller {

    private static final MarshallingInfo<String> IMAGENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ImageName").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceType").build();
    private static final MarshallingInfo<StructuredPojo> COMPUTECAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComputeCapacity").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcConfig").build();
    private static final MarshallingInfo<Integer> MAXUSERDURATIONINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxUserDurationInSeconds").build();
    private static final MarshallingInfo<Integer> DISCONNECTTIMEOUTINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisconnectTimeoutInSeconds").build();
    private static final MarshallingInfo<Boolean> DELETEVPCCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeleteVpcConfig").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> DISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisplayName").build();

    private static final UpdateFleetRequestMarshaller instance = new UpdateFleetRequestMarshaller();

    public static UpdateFleetRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateFleetRequest updateFleetRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateFleetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateFleetRequest.getImageName(), IMAGENAME_BINDING);
            protocolMarshaller.marshall(updateFleetRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateFleetRequest.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(updateFleetRequest.getComputeCapacity(), COMPUTECAPACITY_BINDING);
            protocolMarshaller.marshall(updateFleetRequest.getVpcConfig(), VPCCONFIG_BINDING);
            protocolMarshaller.marshall(updateFleetRequest.getMaxUserDurationInSeconds(), MAXUSERDURATIONINSECONDS_BINDING);
            protocolMarshaller.marshall(updateFleetRequest.getDisconnectTimeoutInSeconds(), DISCONNECTTIMEOUTINSECONDS_BINDING);
            protocolMarshaller.marshall(updateFleetRequest.getDeleteVpcConfig(), DELETEVPCCONFIG_BINDING);
            protocolMarshaller.marshall(updateFleetRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateFleetRequest.getDisplayName(), DISPLAYNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
