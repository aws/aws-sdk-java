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
package com.amazonaws.services.location.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.location.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BatchEvaluateGeofencesErrorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchEvaluateGeofencesErrorMarshaller {

    private static final MarshallingInfo<String> DEVICEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DeviceId").build();
    private static final MarshallingInfo<StructuredPojo> ERROR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Error").build();
    private static final MarshallingInfo<java.util.Date> SAMPLETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SampleTime").timestampFormat("iso8601").build();

    private static final BatchEvaluateGeofencesErrorMarshaller instance = new BatchEvaluateGeofencesErrorMarshaller();

    public static BatchEvaluateGeofencesErrorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchEvaluateGeofencesError batchEvaluateGeofencesError, ProtocolMarshaller protocolMarshaller) {

        if (batchEvaluateGeofencesError == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchEvaluateGeofencesError.getDeviceId(), DEVICEID_BINDING);
            protocolMarshaller.marshall(batchEvaluateGeofencesError.getError(), ERROR_BINDING);
            protocolMarshaller.marshall(batchEvaluateGeofencesError.getSampleTime(), SAMPLETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
