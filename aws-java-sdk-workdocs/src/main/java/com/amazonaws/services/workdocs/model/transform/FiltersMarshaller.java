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
package com.amazonaws.services.workdocs.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workdocs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FiltersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FiltersMarshaller {

    private static final MarshallingInfo<List> TEXTLOCALES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TextLocales").build();
    private static final MarshallingInfo<List> CONTENTCATEGORIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContentCategories").build();
    private static final MarshallingInfo<List> RESOURCETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ResourceTypes").build();
    private static final MarshallingInfo<List> LABELS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Labels").build();
    private static final MarshallingInfo<List> PRINCIPALS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Principals").build();
    private static final MarshallingInfo<List> ANCESTORIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AncestorIds").build();
    private static final MarshallingInfo<List> SEARCHCOLLECTIONTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SearchCollectionTypes").build();
    private static final MarshallingInfo<StructuredPojo> SIZERANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SizeRange").build();
    private static final MarshallingInfo<StructuredPojo> CREATEDRANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedRange").build();
    private static final MarshallingInfo<StructuredPojo> MODIFIEDRANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModifiedRange").build();

    private static final FiltersMarshaller instance = new FiltersMarshaller();

    public static FiltersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Filters filters, ProtocolMarshaller protocolMarshaller) {

        if (filters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(filters.getTextLocales(), TEXTLOCALES_BINDING);
            protocolMarshaller.marshall(filters.getContentCategories(), CONTENTCATEGORIES_BINDING);
            protocolMarshaller.marshall(filters.getResourceTypes(), RESOURCETYPES_BINDING);
            protocolMarshaller.marshall(filters.getLabels(), LABELS_BINDING);
            protocolMarshaller.marshall(filters.getPrincipals(), PRINCIPALS_BINDING);
            protocolMarshaller.marshall(filters.getAncestorIds(), ANCESTORIDS_BINDING);
            protocolMarshaller.marshall(filters.getSearchCollectionTypes(), SEARCHCOLLECTIONTYPES_BINDING);
            protocolMarshaller.marshall(filters.getSizeRange(), SIZERANGE_BINDING);
            protocolMarshaller.marshall(filters.getCreatedRange(), CREATEDRANGE_BINDING);
            protocolMarshaller.marshall(filters.getModifiedRange(), MODIFIEDRANGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
