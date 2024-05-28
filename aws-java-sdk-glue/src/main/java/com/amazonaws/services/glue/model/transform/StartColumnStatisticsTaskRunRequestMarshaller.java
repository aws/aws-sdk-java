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
package com.amazonaws.services.glue.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartColumnStatisticsTaskRunRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartColumnStatisticsTaskRunRequestMarshaller {

    private static final MarshallingInfo<String> DATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseName").build();
    private static final MarshallingInfo<String> TABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TableName").build();
    private static final MarshallingInfo<List> COLUMNNAMELIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ColumnNameList").build();
    private static final MarshallingInfo<String> ROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Role").build();
    private static final MarshallingInfo<Double> SAMPLESIZE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SampleSize").build();
    private static final MarshallingInfo<String> CATALOGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CatalogID").build();
    private static final MarshallingInfo<String> SECURITYCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityConfiguration").build();

    private static final StartColumnStatisticsTaskRunRequestMarshaller instance = new StartColumnStatisticsTaskRunRequestMarshaller();

    public static StartColumnStatisticsTaskRunRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartColumnStatisticsTaskRunRequest startColumnStatisticsTaskRunRequest, ProtocolMarshaller protocolMarshaller) {

        if (startColumnStatisticsTaskRunRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startColumnStatisticsTaskRunRequest.getDatabaseName(), DATABASENAME_BINDING);
            protocolMarshaller.marshall(startColumnStatisticsTaskRunRequest.getTableName(), TABLENAME_BINDING);
            protocolMarshaller.marshall(startColumnStatisticsTaskRunRequest.getColumnNameList(), COLUMNNAMELIST_BINDING);
            protocolMarshaller.marshall(startColumnStatisticsTaskRunRequest.getRole(), ROLE_BINDING);
            protocolMarshaller.marshall(startColumnStatisticsTaskRunRequest.getSampleSize(), SAMPLESIZE_BINDING);
            protocolMarshaller.marshall(startColumnStatisticsTaskRunRequest.getCatalogID(), CATALOGID_BINDING);
            protocolMarshaller.marshall(startColumnStatisticsTaskRunRequest.getSecurityConfiguration(), SECURITYCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
