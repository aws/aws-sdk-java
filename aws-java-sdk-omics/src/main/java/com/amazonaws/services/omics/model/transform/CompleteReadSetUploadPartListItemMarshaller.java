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
package com.amazonaws.services.omics.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.omics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CompleteReadSetUploadPartListItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CompleteReadSetUploadPartListItemMarshaller {

    private static final MarshallingInfo<Integer> PARTNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("partNumber").build();
    private static final MarshallingInfo<String> PARTSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("partSource").build();
    private static final MarshallingInfo<String> CHECKSUM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("checksum").build();

    private static final CompleteReadSetUploadPartListItemMarshaller instance = new CompleteReadSetUploadPartListItemMarshaller();

    public static CompleteReadSetUploadPartListItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CompleteReadSetUploadPartListItem completeReadSetUploadPartListItem, ProtocolMarshaller protocolMarshaller) {

        if (completeReadSetUploadPartListItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(completeReadSetUploadPartListItem.getPartNumber(), PARTNUMBER_BINDING);
            protocolMarshaller.marshall(completeReadSetUploadPartListItem.getPartSource(), PARTSOURCE_BINDING);
            protocolMarshaller.marshall(completeReadSetUploadPartListItem.getChecksum(), CHECKSUM_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
