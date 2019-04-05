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
package com.amazonaws.services.guardduty.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.guardduty.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InstanceDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InstanceDetailsMarshaller {

    private static final MarshallingInfo<String> AVAILABILITYZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("availabilityZone").build();
    private static final MarshallingInfo<StructuredPojo> IAMINSTANCEPROFILE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("iamInstanceProfile").build();
    private static final MarshallingInfo<String> IMAGEDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imageDescription").build();
    private static final MarshallingInfo<String> IMAGEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("imageId").build();
    private static final MarshallingInfo<String> INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceId").build();
    private static final MarshallingInfo<String> INSTANCESTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceState").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceType").build();
    private static final MarshallingInfo<String> LAUNCHTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("launchTime").build();
    private static final MarshallingInfo<List> NETWORKINTERFACES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkInterfaces").build();
    private static final MarshallingInfo<String> PLATFORM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("platform").build();
    private static final MarshallingInfo<List> PRODUCTCODES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("productCodes").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final InstanceDetailsMarshaller instance = new InstanceDetailsMarshaller();

    public static InstanceDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InstanceDetails instanceDetails, ProtocolMarshaller protocolMarshaller) {

        if (instanceDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(instanceDetails.getAvailabilityZone(), AVAILABILITYZONE_BINDING);
            protocolMarshaller.marshall(instanceDetails.getIamInstanceProfile(), IAMINSTANCEPROFILE_BINDING);
            protocolMarshaller.marshall(instanceDetails.getImageDescription(), IMAGEDESCRIPTION_BINDING);
            protocolMarshaller.marshall(instanceDetails.getImageId(), IMAGEID_BINDING);
            protocolMarshaller.marshall(instanceDetails.getInstanceId(), INSTANCEID_BINDING);
            protocolMarshaller.marshall(instanceDetails.getInstanceState(), INSTANCESTATE_BINDING);
            protocolMarshaller.marshall(instanceDetails.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(instanceDetails.getLaunchTime(), LAUNCHTIME_BINDING);
            protocolMarshaller.marshall(instanceDetails.getNetworkInterfaces(), NETWORKINTERFACES_BINDING);
            protocolMarshaller.marshall(instanceDetails.getPlatform(), PLATFORM_BINDING);
            protocolMarshaller.marshall(instanceDetails.getProductCodes(), PRODUCTCODES_BINDING);
            protocolMarshaller.marshall(instanceDetails.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
