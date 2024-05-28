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
package com.amazonaws.services.iottwinmaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iottwinmaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MetadataTransferJobProgressMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MetadataTransferJobProgressMarshaller {

    private static final MarshallingInfo<Integer> TOTALCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalCount").build();
    private static final MarshallingInfo<Integer> SUCCEEDEDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("succeededCount").build();
    private static final MarshallingInfo<Integer> SKIPPEDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("skippedCount").build();
    private static final MarshallingInfo<Integer> FAILEDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failedCount").build();

    private static final MetadataTransferJobProgressMarshaller instance = new MetadataTransferJobProgressMarshaller();

    public static MetadataTransferJobProgressMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MetadataTransferJobProgress metadataTransferJobProgress, ProtocolMarshaller protocolMarshaller) {

        if (metadataTransferJobProgress == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(metadataTransferJobProgress.getTotalCount(), TOTALCOUNT_BINDING);
            protocolMarshaller.marshall(metadataTransferJobProgress.getSucceededCount(), SUCCEEDEDCOUNT_BINDING);
            protocolMarshaller.marshall(metadataTransferJobProgress.getSkippedCount(), SKIPPEDCOUNT_BINDING);
            protocolMarshaller.marshall(metadataTransferJobProgress.getFailedCount(), FAILEDCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
