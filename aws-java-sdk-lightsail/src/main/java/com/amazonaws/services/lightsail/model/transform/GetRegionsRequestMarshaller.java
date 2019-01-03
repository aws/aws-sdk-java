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
package com.amazonaws.services.lightsail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetRegionsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetRegionsRequestMarshaller {

    private static final MarshallingInfo<Boolean> INCLUDEAVAILABILITYZONES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("includeAvailabilityZones").build();
    private static final MarshallingInfo<Boolean> INCLUDERELATIONALDATABASEAVAILABILITYZONES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("includeRelationalDatabaseAvailabilityZones").build();

    private static final GetRegionsRequestMarshaller instance = new GetRegionsRequestMarshaller();

    public static GetRegionsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetRegionsRequest getRegionsRequest, ProtocolMarshaller protocolMarshaller) {

        if (getRegionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getRegionsRequest.getIncludeAvailabilityZones(), INCLUDEAVAILABILITYZONES_BINDING);
            protocolMarshaller.marshall(getRegionsRequest.getIncludeRelationalDatabaseAvailabilityZones(), INCLUDERELATIONALDATABASEAVAILABILITYZONES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
