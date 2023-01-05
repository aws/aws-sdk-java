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
package com.amazonaws.services.lakeformation.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lakeformation.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DataCellsFilterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DataCellsFilterMarshaller {

    private static final MarshallingInfo<String> TABLECATALOGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TableCatalogId").build();
    private static final MarshallingInfo<String> DATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseName").build();
    private static final MarshallingInfo<String> TABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TableName").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<StructuredPojo> ROWFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RowFilter").build();
    private static final MarshallingInfo<List> COLUMNNAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ColumnNames").build();
    private static final MarshallingInfo<StructuredPojo> COLUMNWILDCARD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ColumnWildcard").build();

    private static final DataCellsFilterMarshaller instance = new DataCellsFilterMarshaller();

    public static DataCellsFilterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DataCellsFilter dataCellsFilter, ProtocolMarshaller protocolMarshaller) {

        if (dataCellsFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataCellsFilter.getTableCatalogId(), TABLECATALOGID_BINDING);
            protocolMarshaller.marshall(dataCellsFilter.getDatabaseName(), DATABASENAME_BINDING);
            protocolMarshaller.marshall(dataCellsFilter.getTableName(), TABLENAME_BINDING);
            protocolMarshaller.marshall(dataCellsFilter.getName(), NAME_BINDING);
            protocolMarshaller.marshall(dataCellsFilter.getRowFilter(), ROWFILTER_BINDING);
            protocolMarshaller.marshall(dataCellsFilter.getColumnNames(), COLUMNNAMES_BINDING);
            protocolMarshaller.marshall(dataCellsFilter.getColumnWildcard(), COLUMNWILDCARD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
