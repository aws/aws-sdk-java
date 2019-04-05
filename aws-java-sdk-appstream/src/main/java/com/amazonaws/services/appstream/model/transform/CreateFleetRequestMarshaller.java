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
package com.amazonaws.services.appstream.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appstream.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateFleetRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateFleetRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> IMAGENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ImageName").build();
    private static final MarshallingInfo<String> IMAGEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ImageArn").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceType").build();
    private static final MarshallingInfo<String> FLEETTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FleetType").build();
    private static final MarshallingInfo<StructuredPojo> COMPUTECAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComputeCapacity").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcConfig").build();
    private static final MarshallingInfo<Integer> MAXUSERDURATIONINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxUserDurationInSeconds").build();
    private static final MarshallingInfo<Integer> DISCONNECTTIMEOUTINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisconnectTimeoutInSeconds").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> DISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisplayName").build();
    private static final MarshallingInfo<Boolean> ENABLEDEFAULTINTERNETACCESS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableDefaultInternetAccess").build();
    private static final MarshallingInfo<StructuredPojo> DOMAINJOININFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainJoinInfo").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateFleetRequestMarshaller instance = new CreateFleetRequestMarshaller();

    public static CreateFleetRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateFleetRequest createFleetRequest, ProtocolMarshaller protocolMarshaller) {

        if (createFleetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createFleetRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createFleetRequest.getImageName(), IMAGENAME_BINDING);
            protocolMarshaller.marshall(createFleetRequest.getImageArn(), IMAGEARN_BINDING);
            protocolMarshaller.marshall(createFleetRequest.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(createFleetRequest.getFleetType(), FLEETTYPE_BINDING);
            protocolMarshaller.marshall(createFleetRequest.getComputeCapacity(), COMPUTECAPACITY_BINDING);
            protocolMarshaller.marshall(createFleetRequest.getVpcConfig(), VPCCONFIG_BINDING);
            protocolMarshaller.marshall(createFleetRequest.getMaxUserDurationInSeconds(), MAXUSERDURATIONINSECONDS_BINDING);
            protocolMarshaller.marshall(createFleetRequest.getDisconnectTimeoutInSeconds(), DISCONNECTTIMEOUTINSECONDS_BINDING);
            protocolMarshaller.marshall(createFleetRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createFleetRequest.getDisplayName(), DISPLAYNAME_BINDING);
            protocolMarshaller.marshall(createFleetRequest.getEnableDefaultInternetAccess(), ENABLEDEFAULTINTERNETACCESS_BINDING);
            protocolMarshaller.marshall(createFleetRequest.getDomainJoinInfo(), DOMAINJOININFO_BINDING);
            protocolMarshaller.marshall(createFleetRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
