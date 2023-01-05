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
package com.amazonaws.services.panorama.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.panorama.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateJobForDevicesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateJobForDevicesRequestMarshaller {

    private static final MarshallingInfo<List> DEVICEIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DeviceIds").build();
    private static final MarshallingInfo<StructuredPojo> DEVICEJOBCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceJobConfig").build();
    private static final MarshallingInfo<String> JOBTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobType").build();

    private static final CreateJobForDevicesRequestMarshaller instance = new CreateJobForDevicesRequestMarshaller();

    public static CreateJobForDevicesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateJobForDevicesRequest createJobForDevicesRequest, ProtocolMarshaller protocolMarshaller) {

        if (createJobForDevicesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createJobForDevicesRequest.getDeviceIds(), DEVICEIDS_BINDING);
            protocolMarshaller.marshall(createJobForDevicesRequest.getDeviceJobConfig(), DEVICEJOBCONFIG_BINDING);
            protocolMarshaller.marshall(createJobForDevicesRequest.getJobType(), JOBTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
