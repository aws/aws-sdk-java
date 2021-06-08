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
package com.amazonaws.services.glue.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetColumnStatisticsForPartitionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetColumnStatisticsForPartitionRequestMarshaller {

    private static final MarshallingInfo<String> CATALOGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CatalogId").build();
    private static final MarshallingInfo<String> DATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseName").build();
    private static final MarshallingInfo<String> TABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TableName").build();
    private static final MarshallingInfo<List> PARTITIONVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PartitionValues").build();
    private static final MarshallingInfo<List> COLUMNNAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ColumnNames").build();

    private static final GetColumnStatisticsForPartitionRequestMarshaller instance = new GetColumnStatisticsForPartitionRequestMarshaller();

    public static GetColumnStatisticsForPartitionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetColumnStatisticsForPartitionRequest getColumnStatisticsForPartitionRequest, ProtocolMarshaller protocolMarshaller) {

        if (getColumnStatisticsForPartitionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getColumnStatisticsForPartitionRequest.getCatalogId(), CATALOGID_BINDING);
            protocolMarshaller.marshall(getColumnStatisticsForPartitionRequest.getDatabaseName(), DATABASENAME_BINDING);
            protocolMarshaller.marshall(getColumnStatisticsForPartitionRequest.getTableName(), TABLENAME_BINDING);
            protocolMarshaller.marshall(getColumnStatisticsForPartitionRequest.getPartitionValues(), PARTITIONVALUES_BINDING);
            protocolMarshaller.marshall(getColumnStatisticsForPartitionRequest.getColumnNames(), COLUMNNAMES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
