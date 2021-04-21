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
package com.amazonaws.services.groundstation.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.groundstation.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConfigDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConfigDetailsMarshaller {

    private static final MarshallingInfo<StructuredPojo> ANTENNADEMODDECODEDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("antennaDemodDecodeDetails").build();
    private static final MarshallingInfo<StructuredPojo> ENDPOINTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endpointDetails").build();
    private static final MarshallingInfo<StructuredPojo> S3RECORDINGDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3RecordingDetails").build();

    private static final ConfigDetailsMarshaller instance = new ConfigDetailsMarshaller();

    public static ConfigDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConfigDetails configDetails, ProtocolMarshaller protocolMarshaller) {

        if (configDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(configDetails.getAntennaDemodDecodeDetails(), ANTENNADEMODDECODEDETAILS_BINDING);
            protocolMarshaller.marshall(configDetails.getEndpointDetails(), ENDPOINTDETAILS_BINDING);
            protocolMarshaller.marshall(configDetails.getS3RecordingDetails(), S3RECORDINGDETAILS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
