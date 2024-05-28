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
 * UpdateFeaturedResultsSetRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateFeaturedResultsSetRequestMarshaller {

    private static final MarshallingInfo<String> INDEXID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IndexId").build();
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

    private static final UpdateFeaturedResultsSetRequestMarshaller instance = new UpdateFeaturedResultsSetRequestMarshaller();

    public static UpdateFeaturedResultsSetRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateFeaturedResultsSetRequest updateFeaturedResultsSetRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateFeaturedResultsSetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateFeaturedResultsSetRequest.getIndexId(), INDEXID_BINDING);
            protocolMarshaller.marshall(updateFeaturedResultsSetRequest.getFeaturedResultsSetId(), FEATUREDRESULTSSETID_BINDING);
            protocolMarshaller.marshall(updateFeaturedResultsSetRequest.getFeaturedResultsSetName(), FEATUREDRESULTSSETNAME_BINDING);
            protocolMarshaller.marshall(updateFeaturedResultsSetRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateFeaturedResultsSetRequest.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(updateFeaturedResultsSetRequest.getQueryTexts(), QUERYTEXTS_BINDING);
            protocolMarshaller.marshall(updateFeaturedResultsSetRequest.getFeaturedDocuments(), FEATUREDDOCUMENTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
