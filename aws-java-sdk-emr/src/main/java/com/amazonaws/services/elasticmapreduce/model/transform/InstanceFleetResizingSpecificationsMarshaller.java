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
package com.amazonaws.services.elasticmapreduce.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InstanceFleetResizingSpecificationsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InstanceFleetResizingSpecificationsMarshaller {

    private static final MarshallingInfo<StructuredPojo> SPOTRESIZESPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SpotResizeSpecification").build();
    private static final MarshallingInfo<StructuredPojo> ONDEMANDRESIZESPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OnDemandResizeSpecification").build();

    private static final InstanceFleetResizingSpecificationsMarshaller instance = new InstanceFleetResizingSpecificationsMarshaller();

    public static InstanceFleetResizingSpecificationsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InstanceFleetResizingSpecifications instanceFleetResizingSpecifications, ProtocolMarshaller protocolMarshaller) {

        if (instanceFleetResizingSpecifications == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(instanceFleetResizingSpecifications.getSpotResizeSpecification(), SPOTRESIZESPECIFICATION_BINDING);
            protocolMarshaller.marshall(instanceFleetResizingSpecifications.getOnDemandResizeSpecification(), ONDEMANDRESIZESPECIFICATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
