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
package com.amazonaws.services.timestreamwrite.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.timestreamwrite.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateBatchLoadTaskRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateBatchLoadTaskRequestMarshaller {

    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<StructuredPojo> DATAMODELCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataModelConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> DATASOURCECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataSourceConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> REPORTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReportConfiguration").build();
    private static final MarshallingInfo<String> TARGETDATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetDatabaseName").build();
    private static final MarshallingInfo<String> TARGETTABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetTableName").build();
    private static final MarshallingInfo<Long> RECORDVERSION_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RecordVersion").build();

    private static final CreateBatchLoadTaskRequestMarshaller instance = new CreateBatchLoadTaskRequestMarshaller();

    public static CreateBatchLoadTaskRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateBatchLoadTaskRequest createBatchLoadTaskRequest, ProtocolMarshaller protocolMarshaller) {

        if (createBatchLoadTaskRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createBatchLoadTaskRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createBatchLoadTaskRequest.getDataModelConfiguration(), DATAMODELCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createBatchLoadTaskRequest.getDataSourceConfiguration(), DATASOURCECONFIGURATION_BINDING);
            protocolMarshaller.marshall(createBatchLoadTaskRequest.getReportConfiguration(), REPORTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createBatchLoadTaskRequest.getTargetDatabaseName(), TARGETDATABASENAME_BINDING);
            protocolMarshaller.marshall(createBatchLoadTaskRequest.getTargetTableName(), TARGETTABLENAME_BINDING);
            protocolMarshaller.marshall(createBatchLoadTaskRequest.getRecordVersion(), RECORDVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
