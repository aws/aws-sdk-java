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
package com.amazonaws.services.sagemakergeospatial.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemakergeospatial.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CloudRemovalConfigInputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CloudRemovalConfigInputMarshaller {

    private static final MarshallingInfo<String> ALGORITHMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlgorithmName").build();
    private static final MarshallingInfo<String> INTERPOLATIONVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InterpolationValue").build();
    private static final MarshallingInfo<List> TARGETBANDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TargetBands").build();

    private static final CloudRemovalConfigInputMarshaller instance = new CloudRemovalConfigInputMarshaller();

    public static CloudRemovalConfigInputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CloudRemovalConfigInput cloudRemovalConfigInput, ProtocolMarshaller protocolMarshaller) {

        if (cloudRemovalConfigInput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cloudRemovalConfigInput.getAlgorithmName(), ALGORITHMNAME_BINDING);
            protocolMarshaller.marshall(cloudRemovalConfigInput.getInterpolationValue(), INTERPOLATIONVALUE_BINDING);
            protocolMarshaller.marshall(cloudRemovalConfigInput.getTargetBands(), TARGETBANDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
