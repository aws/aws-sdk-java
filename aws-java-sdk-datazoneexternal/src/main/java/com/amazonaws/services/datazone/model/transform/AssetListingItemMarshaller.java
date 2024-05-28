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
 * AssetListingItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AssetListingItemMarshaller {

    private static final MarshallingInfo<StructuredPojo> ADDITIONALATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("additionalAttributes").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> ENTITYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("entityId").build();
    private static final MarshallingInfo<String> ENTITYREVISION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("entityRevision").build();
    private static final MarshallingInfo<String> ENTITYTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("entityType").build();
    private static final MarshallingInfo<List> GLOSSARYTERMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("glossaryTerms").build();
    private static final MarshallingInfo<String> LISTINGCREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("listingCreatedBy").build();
    private static final MarshallingInfo<String> LISTINGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("listingId").build();
    private static final MarshallingInfo<String> LISTINGREVISION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("listingRevision").build();
    private static final MarshallingInfo<String> LISTINGUPDATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("listingUpdatedBy").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> OWNINGPROJECTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("owningProjectId").build();

    private static final AssetListingItemMarshaller instance = new AssetListingItemMarshaller();

    public static AssetListingItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AssetListingItem assetListingItem, ProtocolMarshaller protocolMarshaller) {

        if (assetListingItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(assetListingItem.getAdditionalAttributes(), ADDITIONALATTRIBUTES_BINDING);
            protocolMarshaller.marshall(assetListingItem.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(assetListingItem.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(assetListingItem.getEntityId(), ENTITYID_BINDING);
            protocolMarshaller.marshall(assetListingItem.getEntityRevision(), ENTITYREVISION_BINDING);
            protocolMarshaller.marshall(assetListingItem.getEntityType(), ENTITYTYPE_BINDING);
            protocolMarshaller.marshall(assetListingItem.getGlossaryTerms(), GLOSSARYTERMS_BINDING);
            protocolMarshaller.marshall(assetListingItem.getListingCreatedBy(), LISTINGCREATEDBY_BINDING);
            protocolMarshaller.marshall(assetListingItem.getListingId(), LISTINGID_BINDING);
            protocolMarshaller.marshall(assetListingItem.getListingRevision(), LISTINGREVISION_BINDING);
            protocolMarshaller.marshall(assetListingItem.getListingUpdatedBy(), LISTINGUPDATEDBY_BINDING);
            protocolMarshaller.marshall(assetListingItem.getName(), NAME_BINDING);
            protocolMarshaller.marshall(assetListingItem.getOwningProjectId(), OWNINGPROJECTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
