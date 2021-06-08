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
package com.amazonaws.services.mgn.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mgn.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JobLogEventDataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JobLogEventDataMarshaller {

    private static final MarshallingInfo<String> CONVERSIONSERVERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("conversionServerID").build();
    private static final MarshallingInfo<String> RAWERROR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("rawError").build();
    private static final MarshallingInfo<String> SOURCESERVERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceServerID").build();
    private static final MarshallingInfo<String> TARGETINSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetInstanceID").build();

    private static final JobLogEventDataMarshaller instance = new JobLogEventDataMarshaller();

    public static JobLogEventDataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JobLogEventData jobLogEventData, ProtocolMarshaller protocolMarshaller) {

        if (jobLogEventData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(jobLogEventData.getConversionServerID(), CONVERSIONSERVERID_BINDING);
            protocolMarshaller.marshall(jobLogEventData.getRawError(), RAWERROR_BINDING);
            protocolMarshaller.marshall(jobLogEventData.getSourceServerID(), SOURCESERVERID_BINDING);
            protocolMarshaller.marshall(jobLogEventData.getTargetInstanceID(), TARGETINSTANCEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
