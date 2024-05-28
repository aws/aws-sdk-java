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
package com.amazonaws.services.datazone.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datazone.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DataSourceRunActivityMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DataSourceRunActivityMarshaller {

    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> DATAASSETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataAssetId").build();
    private static final MarshallingInfo<String> DATAASSETSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataAssetStatus").build();
    private static final MarshallingInfo<String> DATASOURCERUNID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataSourceRunId").build();
    private static final MarshallingInfo<String> DATABASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("database").build();
    private static final MarshallingInfo<StructuredPojo> ERRORMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("errorMessage").build();
    private static final MarshallingInfo<String> PROJECTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("projectId").build();
    private static final MarshallingInfo<String> TECHNICALDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("technicalDescription").build();
    private static final MarshallingInfo<String> TECHNICALNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("technicalName").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedAt").timestampFormat("iso8601").build();

    private static final DataSourceRunActivityMarshaller instance = new DataSourceRunActivityMarshaller();

    public static DataSourceRunActivityMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DataSourceRunActivity dataSourceRunActivity, ProtocolMarshaller protocolMarshaller) {

        if (dataSourceRunActivity == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataSourceRunActivity.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(dataSourceRunActivity.getDataAssetId(), DATAASSETID_BINDING);
            protocolMarshaller.marshall(dataSourceRunActivity.getDataAssetStatus(), DATAASSETSTATUS_BINDING);
            protocolMarshaller.marshall(dataSourceRunActivity.getDataSourceRunId(), DATASOURCERUNID_BINDING);
            protocolMarshaller.marshall(dataSourceRunActivity.getDatabase(), DATABASE_BINDING);
            protocolMarshaller.marshall(dataSourceRunActivity.getErrorMessage(), ERRORMESSAGE_BINDING);
            protocolMarshaller.marshall(dataSourceRunActivity.getProjectId(), PROJECTID_BINDING);
            protocolMarshaller.marshall(dataSourceRunActivity.getTechnicalDescription(), TECHNICALDESCRIPTION_BINDING);
            protocolMarshaller.marshall(dataSourceRunActivity.getTechnicalName(), TECHNICALNAME_BINDING);
            protocolMarshaller.marshall(dataSourceRunActivity.getUpdatedAt(), UPDATEDAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
