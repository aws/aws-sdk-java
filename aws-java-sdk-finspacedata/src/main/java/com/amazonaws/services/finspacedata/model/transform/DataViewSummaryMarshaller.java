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
package com.amazonaws.services.finspacedata.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.finspacedata.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DataViewSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DataViewSummaryMarshaller {

    private static final MarshallingInfo<String> DATAVIEWID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataViewId").build();
    private static final MarshallingInfo<String> DATAVIEWARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataViewArn").build();
    private static final MarshallingInfo<String> DATASETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("datasetId").build();
    private static final MarshallingInfo<Long> ASOFTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("asOfTimestamp").build();
    private static final MarshallingInfo<List> PARTITIONCOLUMNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("partitionColumns").build();
    private static final MarshallingInfo<List> SORTCOLUMNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sortColumns").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<StructuredPojo> ERRORINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("errorInfo").build();
    private static final MarshallingInfo<StructuredPojo> DESTINATIONTYPEPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destinationTypeProperties").build();
    private static final MarshallingInfo<Boolean> AUTOUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("autoUpdate").build();
    private static final MarshallingInfo<Long> CREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("createTime").build();
    private static final MarshallingInfo<Long> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastModifiedTime").build();

    private static final DataViewSummaryMarshaller instance = new DataViewSummaryMarshaller();

    public static DataViewSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DataViewSummary dataViewSummary, ProtocolMarshaller protocolMarshaller) {

        if (dataViewSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataViewSummary.getDataViewId(), DATAVIEWID_BINDING);
            protocolMarshaller.marshall(dataViewSummary.getDataViewArn(), DATAVIEWARN_BINDING);
            protocolMarshaller.marshall(dataViewSummary.getDatasetId(), DATASETID_BINDING);
            protocolMarshaller.marshall(dataViewSummary.getAsOfTimestamp(), ASOFTIMESTAMP_BINDING);
            protocolMarshaller.marshall(dataViewSummary.getPartitionColumns(), PARTITIONCOLUMNS_BINDING);
            protocolMarshaller.marshall(dataViewSummary.getSortColumns(), SORTCOLUMNS_BINDING);
            protocolMarshaller.marshall(dataViewSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(dataViewSummary.getErrorInfo(), ERRORINFO_BINDING);
            protocolMarshaller.marshall(dataViewSummary.getDestinationTypeProperties(), DESTINATIONTYPEPROPERTIES_BINDING);
            protocolMarshaller.marshall(dataViewSummary.getAutoUpdate(), AUTOUPDATE_BINDING);
            protocolMarshaller.marshall(dataViewSummary.getCreateTime(), CREATETIME_BINDING);
            protocolMarshaller.marshall(dataViewSummary.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
