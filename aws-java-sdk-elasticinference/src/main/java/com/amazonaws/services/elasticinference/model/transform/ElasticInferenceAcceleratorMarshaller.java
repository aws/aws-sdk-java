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
package com.amazonaws.services.elasticinference.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticinference.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ElasticInferenceAcceleratorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ElasticInferenceAcceleratorMarshaller {

    private static final MarshallingInfo<StructuredPojo> ACCELERATORHEALTH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("acceleratorHealth").build();
    private static final MarshallingInfo<String> ACCELERATORTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("acceleratorType").build();
    private static final MarshallingInfo<String> ACCELERATORID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("acceleratorId").build();
    private static final MarshallingInfo<String> AVAILABILITYZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("availabilityZone").build();
    private static final MarshallingInfo<String> ATTACHEDRESOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("attachedResource").build();

    private static final ElasticInferenceAcceleratorMarshaller instance = new ElasticInferenceAcceleratorMarshaller();

    public static ElasticInferenceAcceleratorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ElasticInferenceAccelerator elasticInferenceAccelerator, ProtocolMarshaller protocolMarshaller) {

        if (elasticInferenceAccelerator == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(elasticInferenceAccelerator.getAcceleratorHealth(), ACCELERATORHEALTH_BINDING);
            protocolMarshaller.marshall(elasticInferenceAccelerator.getAcceleratorType(), ACCELERATORTYPE_BINDING);
            protocolMarshaller.marshall(elasticInferenceAccelerator.getAcceleratorId(), ACCELERATORID_BINDING);
            protocolMarshaller.marshall(elasticInferenceAccelerator.getAvailabilityZone(), AVAILABILITYZONE_BINDING);
            protocolMarshaller.marshall(elasticInferenceAccelerator.getAttachedResource(), ATTACHEDRESOURCE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
