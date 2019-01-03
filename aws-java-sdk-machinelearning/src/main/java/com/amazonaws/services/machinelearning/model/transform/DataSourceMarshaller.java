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
package com.amazonaws.services.machinelearning.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.machinelearning.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DataSourceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DataSourceMarshaller {

    private static final MarshallingInfo<String> DATASOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataSourceId").build();
    private static final MarshallingInfo<String> DATALOCATIONS3_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataLocationS3").build();
    private static final MarshallingInfo<String> DATAREARRANGEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataRearrangement").build();
    private static final MarshallingInfo<String> CREATEDBYIAMUSER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedByIamUser").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Long> DATASIZEINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataSizeInBytes").build();
    private static final MarshallingInfo<Long> NUMBEROFFILES_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NumberOfFiles").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> MESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Message").build();
    private static final MarshallingInfo<StructuredPojo> REDSHIFTMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RedshiftMetadata").build();
    private static final MarshallingInfo<StructuredPojo> RDSMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RDSMetadata").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleARN").build();
    private static final MarshallingInfo<Boolean> COMPUTESTATISTICS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComputeStatistics").build();
    private static final MarshallingInfo<Long> COMPUTETIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ComputeTime").build();
    private static final MarshallingInfo<java.util.Date> FINISHEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FinishedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> STARTEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartedAt").timestampFormat("unixTimestamp").build();

    private static final DataSourceMarshaller instance = new DataSourceMarshaller();

    public static DataSourceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DataSource dataSource, ProtocolMarshaller protocolMarshaller) {

        if (dataSource == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataSource.getDataSourceId(), DATASOURCEID_BINDING);
            protocolMarshaller.marshall(dataSource.getDataLocationS3(), DATALOCATIONS3_BINDING);
            protocolMarshaller.marshall(dataSource.getDataRearrangement(), DATAREARRANGEMENT_BINDING);
            protocolMarshaller.marshall(dataSource.getCreatedByIamUser(), CREATEDBYIAMUSER_BINDING);
            protocolMarshaller.marshall(dataSource.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(dataSource.getLastUpdatedAt(), LASTUPDATEDAT_BINDING);
            protocolMarshaller.marshall(dataSource.getDataSizeInBytes(), DATASIZEINBYTES_BINDING);
            protocolMarshaller.marshall(dataSource.getNumberOfFiles(), NUMBEROFFILES_BINDING);
            protocolMarshaller.marshall(dataSource.getName(), NAME_BINDING);
            protocolMarshaller.marshall(dataSource.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(dataSource.getMessage(), MESSAGE_BINDING);
            protocolMarshaller.marshall(dataSource.getRedshiftMetadata(), REDSHIFTMETADATA_BINDING);
            protocolMarshaller.marshall(dataSource.getRDSMetadata(), RDSMETADATA_BINDING);
            protocolMarshaller.marshall(dataSource.getRoleARN(), ROLEARN_BINDING);
            protocolMarshaller.marshall(dataSource.getComputeStatistics(), COMPUTESTATISTICS_BINDING);
            protocolMarshaller.marshall(dataSource.getComputeTime(), COMPUTETIME_BINDING);
            protocolMarshaller.marshall(dataSource.getFinishedAt(), FINISHEDAT_BINDING);
            protocolMarshaller.marshall(dataSource.getStartedAt(), STARTEDAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
