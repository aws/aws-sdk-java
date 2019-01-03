/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servicecatalog.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RecordDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RecordDetailMarshaller {

    private static final MarshallingInfo<String> RECORDID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RecordId").build();
    private static final MarshallingInfo<String> PROVISIONEDPRODUCTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisionedProductName").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<java.util.Date> CREATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdatedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> PROVISIONEDPRODUCTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisionedProductType").build();
    private static final MarshallingInfo<String> RECORDTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecordType").build();
    private static final MarshallingInfo<String> PROVISIONEDPRODUCTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisionedProductId").build();
    private static final MarshallingInfo<String> PRODUCTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ProductId").build();
    private static final MarshallingInfo<String> PROVISIONINGARTIFACTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisioningArtifactId").build();
    private static final MarshallingInfo<String> PATHID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PathId").build();
    private static final MarshallingInfo<List> RECORDERRORS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RecordErrors").build();
    private static final MarshallingInfo<List> RECORDTAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RecordTags").build();

    private static final RecordDetailMarshaller instance = new RecordDetailMarshaller();

    public static RecordDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RecordDetail recordDetail, ProtocolMarshaller protocolMarshaller) {

        if (recordDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(recordDetail.getRecordId(), RECORDID_BINDING);
            protocolMarshaller.marshall(recordDetail.getProvisionedProductName(), PROVISIONEDPRODUCTNAME_BINDING);
            protocolMarshaller.marshall(recordDetail.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(recordDetail.getCreatedTime(), CREATEDTIME_BINDING);
            protocolMarshaller.marshall(recordDetail.getUpdatedTime(), UPDATEDTIME_BINDING);
            protocolMarshaller.marshall(recordDetail.getProvisionedProductType(), PROVISIONEDPRODUCTTYPE_BINDING);
            protocolMarshaller.marshall(recordDetail.getRecordType(), RECORDTYPE_BINDING);
            protocolMarshaller.marshall(recordDetail.getProvisionedProductId(), PROVISIONEDPRODUCTID_BINDING);
            protocolMarshaller.marshall(recordDetail.getProductId(), PRODUCTID_BINDING);
            protocolMarshaller.marshall(recordDetail.getProvisioningArtifactId(), PROVISIONINGARTIFACTID_BINDING);
            protocolMarshaller.marshall(recordDetail.getPathId(), PATHID_BINDING);
            protocolMarshaller.marshall(recordDetail.getRecordErrors(), RECORDERRORS_BINDING);
            protocolMarshaller.marshall(recordDetail.getRecordTags(), RECORDTAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
