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
 * GetUnfilteredTableMetadataRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetUnfilteredTableMetadataRequestMarshaller {

    private static final MarshallingInfo<String> CATALOGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CatalogId").build();
    private static final MarshallingInfo<String> DATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseName").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<StructuredPojo> AUDITCONTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuditContext").build();
    private static final MarshallingInfo<List> SUPPORTEDPERMISSIONTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportedPermissionTypes").build();

    private static final GetUnfilteredTableMetadataRequestMarshaller instance = new GetUnfilteredTableMetadataRequestMarshaller();

    public static GetUnfilteredTableMetadataRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetUnfilteredTableMetadataRequest getUnfilteredTableMetadataRequest, ProtocolMarshaller protocolMarshaller) {

        if (getUnfilteredTableMetadataRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getUnfilteredTableMetadataRequest.getCatalogId(), CATALOGID_BINDING);
            protocolMarshaller.marshall(getUnfilteredTableMetadataRequest.getDatabaseName(), DATABASENAME_BINDING);
            protocolMarshaller.marshall(getUnfilteredTableMetadataRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(getUnfilteredTableMetadataRequest.getAuditContext(), AUDITCONTEXT_BINDING);
            protocolMarshaller.marshall(getUnfilteredTableMetadataRequest.getSupportedPermissionTypes(), SUPPORTEDPERMISSIONTYPES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
