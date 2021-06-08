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
package com.amazonaws.services.dataexchange.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dataexchange.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RevisionDestinationEntryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RevisionDestinationEntryMarshaller {

    private static final MarshallingInfo<String> BUCKET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Bucket").build();
    private static final MarshallingInfo<String> KEYPATTERN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyPattern").build();
    private static final MarshallingInfo<String> REVISIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RevisionId").build();

    private static final RevisionDestinationEntryMarshaller instance = new RevisionDestinationEntryMarshaller();

    public static RevisionDestinationEntryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RevisionDestinationEntry revisionDestinationEntry, ProtocolMarshaller protocolMarshaller) {

        if (revisionDestinationEntry == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(revisionDestinationEntry.getBucket(), BUCKET_BINDING);
            protocolMarshaller.marshall(revisionDestinationEntry.getKeyPattern(), KEYPATTERN_BINDING);
            protocolMarshaller.marshall(revisionDestinationEntry.getRevisionId(), REVISIONID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
