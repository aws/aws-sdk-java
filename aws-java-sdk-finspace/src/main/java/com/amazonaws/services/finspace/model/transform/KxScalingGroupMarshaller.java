/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.finspace.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.finspace.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * KxScalingGroupMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class KxScalingGroupMarshaller {

    private static final MarshallingInfo<String> SCALINGGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scalingGroupName").build();
    private static final MarshallingInfo<String> HOSTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("hostType").build();
    private static final MarshallingInfo<List> CLUSTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("clusters").build();
    private static final MarshallingInfo<String> AVAILABILITYZONEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("availabilityZoneId").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> STATUSREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusReason").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastModifiedTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> CREATEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdTimestamp").timestampFormat("unixTimestamp").build();

    private static final KxScalingGroupMarshaller instance = new KxScalingGroupMarshaller();

    public static KxScalingGroupMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(KxScalingGroup kxScalingGroup, ProtocolMarshaller protocolMarshaller) {

        if (kxScalingGroup == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(kxScalingGroup.getScalingGroupName(), SCALINGGROUPNAME_BINDING);
            protocolMarshaller.marshall(kxScalingGroup.getHostType(), HOSTTYPE_BINDING);
            protocolMarshaller.marshall(kxScalingGroup.getClusters(), CLUSTERS_BINDING);
            protocolMarshaller.marshall(kxScalingGroup.getAvailabilityZoneId(), AVAILABILITYZONEID_BINDING);
            protocolMarshaller.marshall(kxScalingGroup.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(kxScalingGroup.getStatusReason(), STATUSREASON_BINDING);
            protocolMarshaller.marshall(kxScalingGroup.getLastModifiedTimestamp(), LASTMODIFIEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(kxScalingGroup.getCreatedTimestamp(), CREATEDTIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
