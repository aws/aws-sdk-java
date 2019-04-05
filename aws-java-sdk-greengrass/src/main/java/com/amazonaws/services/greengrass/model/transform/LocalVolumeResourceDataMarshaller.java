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
package com.amazonaws.services.greengrass.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.greengrass.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LocalVolumeResourceDataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LocalVolumeResourceDataMarshaller {

    private static final MarshallingInfo<String> DESTINATIONPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationPath").build();
    private static final MarshallingInfo<StructuredPojo> GROUPOWNERSETTING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GroupOwnerSetting").build();
    private static final MarshallingInfo<String> SOURCEPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourcePath").build();

    private static final LocalVolumeResourceDataMarshaller instance = new LocalVolumeResourceDataMarshaller();

    public static LocalVolumeResourceDataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LocalVolumeResourceData localVolumeResourceData, ProtocolMarshaller protocolMarshaller) {

        if (localVolumeResourceData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(localVolumeResourceData.getDestinationPath(), DESTINATIONPATH_BINDING);
            protocolMarshaller.marshall(localVolumeResourceData.getGroupOwnerSetting(), GROUPOWNERSETTING_BINDING);
            protocolMarshaller.marshall(localVolumeResourceData.getSourcePath(), SOURCEPATH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
