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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OpsItemRelatedItemSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OpsItemRelatedItemSummaryMarshaller {

    private static final MarshallingInfo<String> OPSITEMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OpsItemId").build();
    private static final MarshallingInfo<String> ASSOCIATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociationId").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceType").build();
    private static final MarshallingInfo<String> ASSOCIATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociationType").build();
    private static final MarshallingInfo<String> RESOURCEURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceUri").build();
    private static final MarshallingInfo<StructuredPojo> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedBy").build();
    private static final MarshallingInfo<java.util.Date> CREATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> LASTMODIFIEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedBy").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedTime").timestampFormat("unixTimestamp").build();

    private static final OpsItemRelatedItemSummaryMarshaller instance = new OpsItemRelatedItemSummaryMarshaller();

    public static OpsItemRelatedItemSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OpsItemRelatedItemSummary opsItemRelatedItemSummary, ProtocolMarshaller protocolMarshaller) {

        if (opsItemRelatedItemSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(opsItemRelatedItemSummary.getOpsItemId(), OPSITEMID_BINDING);
            protocolMarshaller.marshall(opsItemRelatedItemSummary.getAssociationId(), ASSOCIATIONID_BINDING);
            protocolMarshaller.marshall(opsItemRelatedItemSummary.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(opsItemRelatedItemSummary.getAssociationType(), ASSOCIATIONTYPE_BINDING);
            protocolMarshaller.marshall(opsItemRelatedItemSummary.getResourceUri(), RESOURCEURI_BINDING);
            protocolMarshaller.marshall(opsItemRelatedItemSummary.getCreatedBy(), CREATEDBY_BINDING);
            protocolMarshaller.marshall(opsItemRelatedItemSummary.getCreatedTime(), CREATEDTIME_BINDING);
            protocolMarshaller.marshall(opsItemRelatedItemSummary.getLastModifiedBy(), LASTMODIFIEDBY_BINDING);
            protocolMarshaller.marshall(opsItemRelatedItemSummary.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
