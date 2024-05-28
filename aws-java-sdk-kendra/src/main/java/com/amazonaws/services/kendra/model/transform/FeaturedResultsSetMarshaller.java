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
package com.amazonaws.services.kendra.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kendra.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FeaturedResultsSetMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FeaturedResultsSetMarshaller {

    private static final MarshallingInfo<String> FEATUREDRESULTSSETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FeaturedResultsSetId").build();
    private static final MarshallingInfo<String> FEATUREDRESULTSSETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FeaturedResultsSetName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<List> QUERYTEXTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("QueryTexts").build();
    private static final MarshallingInfo<List> FEATUREDDOCUMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FeaturedDocuments").build();
    private static final MarshallingInfo<Long> LASTUPDATEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdatedTimestamp").build();
    private static final MarshallingInfo<Long> CREATIONTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTimestamp").build();

    private static final FeaturedResultsSetMarshaller instance = new FeaturedResultsSetMarshaller();

    public static FeaturedResultsSetMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FeaturedResultsSet featuredResultsSet, ProtocolMarshaller protocolMarshaller) {

        if (featuredResultsSet == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(featuredResultsSet.getFeaturedResultsSetId(), FEATUREDRESULTSSETID_BINDING);
            protocolMarshaller.marshall(featuredResultsSet.getFeaturedResultsSetName(), FEATUREDRESULTSSETNAME_BINDING);
            protocolMarshaller.marshall(featuredResultsSet.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(featuredResultsSet.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(featuredResultsSet.getQueryTexts(), QUERYTEXTS_BINDING);
            protocolMarshaller.marshall(featuredResultsSet.getFeaturedDocuments(), FEATUREDDOCUMENTS_BINDING);
            protocolMarshaller.marshall(featuredResultsSet.getLastUpdatedTimestamp(), LASTUPDATEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(featuredResultsSet.getCreationTimestamp(), CREATIONTIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
