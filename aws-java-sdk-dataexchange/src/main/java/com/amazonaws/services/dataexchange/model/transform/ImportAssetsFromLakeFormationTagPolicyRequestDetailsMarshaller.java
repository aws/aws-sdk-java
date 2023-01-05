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
package com.amazonaws.services.dataexchange.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dataexchange.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ImportAssetsFromLakeFormationTagPolicyRequestDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ImportAssetsFromLakeFormationTagPolicyRequestDetailsMarshaller {

    private static final MarshallingInfo<String> CATALOGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CatalogId").build();
    private static final MarshallingInfo<StructuredPojo> DATABASE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Database").build();
    private static final MarshallingInfo<StructuredPojo> TABLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Table").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();
    private static final MarshallingInfo<String> DATASETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DataSetId").build();
    private static final MarshallingInfo<String> REVISIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RevisionId").build();

    private static final ImportAssetsFromLakeFormationTagPolicyRequestDetailsMarshaller instance = new ImportAssetsFromLakeFormationTagPolicyRequestDetailsMarshaller();

    public static ImportAssetsFromLakeFormationTagPolicyRequestDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ImportAssetsFromLakeFormationTagPolicyRequestDetails importAssetsFromLakeFormationTagPolicyRequestDetails,
            ProtocolMarshaller protocolMarshaller) {

        if (importAssetsFromLakeFormationTagPolicyRequestDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(importAssetsFromLakeFormationTagPolicyRequestDetails.getCatalogId(), CATALOGID_BINDING);
            protocolMarshaller.marshall(importAssetsFromLakeFormationTagPolicyRequestDetails.getDatabase(), DATABASE_BINDING);
            protocolMarshaller.marshall(importAssetsFromLakeFormationTagPolicyRequestDetails.getTable(), TABLE_BINDING);
            protocolMarshaller.marshall(importAssetsFromLakeFormationTagPolicyRequestDetails.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(importAssetsFromLakeFormationTagPolicyRequestDetails.getDataSetId(), DATASETID_BINDING);
            protocolMarshaller.marshall(importAssetsFromLakeFormationTagPolicyRequestDetails.getRevisionId(), REVISIONID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
