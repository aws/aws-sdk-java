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
package com.amazonaws.services.datazone.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datazone.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AssetListingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AssetListingMarshaller {

    private static final MarshallingInfo<String> ASSETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("assetId").build();
    private static final MarshallingInfo<String> ASSETREVISION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assetRevision").build();
    private static final MarshallingInfo<String> ASSETTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("assetType").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> FORMS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("forms").build();
    private static final MarshallingInfo<List> GLOSSARYTERMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("glossaryTerms").build();
    private static final MarshallingInfo<List> LATESTTIMESERIESDATAPOINTFORMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("latestTimeSeriesDataPointForms").build();
    private static final MarshallingInfo<String> OWNINGPROJECTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("owningProjectId").build();

    private static final AssetListingMarshaller instance = new AssetListingMarshaller();

    public static AssetListingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AssetListing assetListing, ProtocolMarshaller protocolMarshaller) {

        if (assetListing == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(assetListing.getAssetId(), ASSETID_BINDING);
            protocolMarshaller.marshall(assetListing.getAssetRevision(), ASSETREVISION_BINDING);
            protocolMarshaller.marshall(assetListing.getAssetType(), ASSETTYPE_BINDING);
            protocolMarshaller.marshall(assetListing.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(assetListing.getForms(), FORMS_BINDING);
            protocolMarshaller.marshall(assetListing.getGlossaryTerms(), GLOSSARYTERMS_BINDING);
            protocolMarshaller.marshall(assetListing.getLatestTimeSeriesDataPointForms(), LATESTTIMESERIESDATAPOINTFORMS_BINDING);
            protocolMarshaller.marshall(assetListing.getOwningProjectId(), OWNINGPROJECTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
