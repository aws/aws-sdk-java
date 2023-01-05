/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetUnfilteredPartitionsMetadataRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetUnfilteredPartitionsMetadataRequestMarshaller {

    private static final MarshallingInfo<String> CATALOGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CatalogId").build();
    private static final MarshallingInfo<String> DATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseName").build();
    private static final MarshallingInfo<String> TABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TableName").build();
    private static final MarshallingInfo<String> EXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Expression").build();
    private static final MarshallingInfo<StructuredPojo> AUDITCONTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuditContext").build();
    private static final MarshallingInfo<List> SUPPORTEDPERMISSIONTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportedPermissionTypes").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();
    private static final MarshallingInfo<StructuredPojo> SEGMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Segment").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();

    private static final GetUnfilteredPartitionsMetadataRequestMarshaller instance = new GetUnfilteredPartitionsMetadataRequestMarshaller();

    public static GetUnfilteredPartitionsMetadataRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetUnfilteredPartitionsMetadataRequest getUnfilteredPartitionsMetadataRequest, ProtocolMarshaller protocolMarshaller) {

        if (getUnfilteredPartitionsMetadataRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getUnfilteredPartitionsMetadataRequest.getCatalogId(), CATALOGID_BINDING);
            protocolMarshaller.marshall(getUnfilteredPartitionsMetadataRequest.getDatabaseName(), DATABASENAME_BINDING);
            protocolMarshaller.marshall(getUnfilteredPartitionsMetadataRequest.getTableName(), TABLENAME_BINDING);
            protocolMarshaller.marshall(getUnfilteredPartitionsMetadataRequest.getExpression(), EXPRESSION_BINDING);
            protocolMarshaller.marshall(getUnfilteredPartitionsMetadataRequest.getAuditContext(), AUDITCONTEXT_BINDING);
            protocolMarshaller.marshall(getUnfilteredPartitionsMetadataRequest.getSupportedPermissionTypes(), SUPPORTEDPERMISSIONTYPES_BINDING);
            protocolMarshaller.marshall(getUnfilteredPartitionsMetadataRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(getUnfilteredPartitionsMetadataRequest.getSegment(), SEGMENT_BINDING);
            protocolMarshaller.marshall(getUnfilteredPartitionsMetadataRequest.getMaxResults(), MAXRESULTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
