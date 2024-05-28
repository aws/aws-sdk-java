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
 * KxDataviewSegmentConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class KxDataviewSegmentConfigurationMarshaller {

    private static final MarshallingInfo<List> DBPATHS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("dbPaths").build();
    private static final MarshallingInfo<String> VOLUMENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("volumeName").build();
    private static final MarshallingInfo<Boolean> ONDEMAND_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("onDemand").build();

    private static final KxDataviewSegmentConfigurationMarshaller instance = new KxDataviewSegmentConfigurationMarshaller();

    public static KxDataviewSegmentConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(KxDataviewSegmentConfiguration kxDataviewSegmentConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (kxDataviewSegmentConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(kxDataviewSegmentConfiguration.getDbPaths(), DBPATHS_BINDING);
            protocolMarshaller.marshall(kxDataviewSegmentConfiguration.getVolumeName(), VOLUMENAME_BINDING);
            protocolMarshaller.marshall(kxDataviewSegmentConfiguration.getOnDemand(), ONDEMAND_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
